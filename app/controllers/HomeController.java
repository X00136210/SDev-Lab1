package controllers;

import play.mvc.*;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import models.users.*;
import views.html.*;


//File upload and image editing dependencies
import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    private FormFactory formFactory;

        private Environment e;
    
        @Inject
        public HomeController(FormFactory f, Environment env) {
            this.e = env;
            this.formFactory = f;
        }
    
        public Result index(Long cat) {
            List<Product> productList = null;
            List<Category> categoryList = Category.findAll();
            if (cat == 0) {
                productList = Product.findAll();
            }
            else {
                productList = Category.find.ref(cat).getProducts();
            }
            return ok(index.render(productList, categoryList, User.getUserById(session().get("email")), e));
        }

    public Result customer() {
        List<Customer> customerList = Customer.findAll();
        return ok(customer.render(customerList,User.getUserById(session().get("email"))));
    }
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addProduct() {
        Form<Product> productForm = formFactory.form(Product.class);
        return ok(addProduct.render(productForm, User.getUserById(session().get("email"))));
    }
    public Result addProductSubmit() {
        Product newProduct;
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        if (newProductForm.hasErrors()) {
            return badRequest(addProduct.render(newProductForm, User.getUserById(session().get("email"))));
        }
        else {
            newProduct = newProductForm.get();

            if (newProduct.getId() == null) {
                newProduct.save();    
                flash("success", "Product " + newProduct.getName() + " was added");
                
            }
            else if (newProduct.getId() != null) {
                newProduct.update();
                flash("success", "Product " + newProduct.getName() + " was updated");
            }
        }
        MultipartFormData data = request().body().asMultipartFormData();
        FilePart<File> image = data.getFile("upload");
    
        String saveImageMsg = saveFile(newProduct.getId(), image);
        
        flash("success", "Product " + newProduct.getName() + " has been created/updated " + saveImageMsg);
        
        return redirect(controllers.routes.HomeController.index(0));
    }
   

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addCustomer() {
        Form<Customer> customerForm = formFactory.form(Customer.class);
        return ok(addCustomer.render(customerForm,User.getUserById(session().get("email"))));
    }

    public Result addCustomerSubmit() {
        Form<Customer> newCustomerForm = formFactory.form(Customer.class).bindFromRequest();
        

        if (newCustomerForm.hasErrors()) {
            return badRequest(addCustomer.render(newCustomerForm,User.getUserById(session().get("email"))));
            
        } 
        else {
            Customer newCustomer = newCustomerForm.get();
            
            if (newCustomer.getId() == null) {
                newCustomer.save();
                flash("success", "Customer " + newCustomer.getName() + " was added");                
            }

            else {
                newCustomer.update();
                flash("success", "Customer " + newCustomer.getName() + " was updated");                
            }



            return redirect(controllers.routes.HomeController.customer());
        }
    }
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteProduct(Long id) {
        Product.find.ref(id).delete();

        flash("success", "Product has been deleted");
        
        return redirect(routes.HomeController.index(0));
    }
    public Result deleteCustomer(Long id) {
        Customer.find.ref(id).delete();
        flash("success", "Customer has been deleted");

        return redirect(routes.HomeController.index(0));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateProduct(Long id) {
        Product p;
        Form<Product> productForm;

        try {
            p = Product.find.byId(id);
            productForm = formFactory.form(Product.class).fill(p);
        } 
        catch (Exception ex) {
            return badRequest("error");
        }
        return ok(addProduct.render(productForm,User.getUserById(session().get("email"))));
    }
    @Transactional
    public Result updateCustomer(Long id) {        
        Customer c;
        Form<Customer> customerForm;

        try {
            c = Customer.find.byId(id);
            customerForm = formFactory.form(Customer.class).fill(c);
        }
        catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addCustomer.render(customerForm,User.getUserById(session().get("email"))));
    }

    public String saveFile(Long id, FilePart<File> uploaded) {
        //make sure that the file exists
        if (uploaded != null) {
            //make sure that the content is indeed an image
            String mimeType = uploaded.getFilename();
            if(mimeType.startsWith("image/")) {
                //save the file object (created without a path, File saves
                //the content to a default location, usually the temp or tmp
                //directory)
                File file = uploaded.getFile();
                //create an ImageMagick operation - this object is used to specify
                //the required image processing
                IMOperation op =new IMOperation();
                //add the uploaded image to the operationop.addImage(file.getAbsolutePath());
                op.addImage(file.getAbsolutePath());
                //resize the image using height and width saveFileOld(Long id, FilePart<File> uploaded)
                op.resize(300, 200);
                //save the image as a jpg
                op.addImage("public/images/productImages/" + id + ".jpg");
                //create another Image Magick operation and repeat  the process above to
                //specify how a thumbnail image should be processed - size 60px
                IMOperation thumb = new IMOperation();
                thumb.addImage(file.getAbsolutePath());
                thumb.resize(60);
                thumb.addImage("public/images/productImages/thumbnails/" + id + ".jpg");
                //we just make sure that the directory for the images exists before we save it
                File dir = new File("public/images/productImages/thumbnails/");
                if (!dir.exists()) {
                    dir.mkdirs();
                }
                //now we can create an Image Magic command and execute the operators
                ConvertCmd cmd = new ConvertCmd();
                try {
                    cmd.run(op);
                    cmd.run(thumb);
                } catch(Exception e) {
                    e.printStackTrace();
                }
                return " and image saved";

            }
        }
        return "/ no file";
    }

}
