package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Customer extends Model{
    @Id
    private Long id;

    @Constraints.Required
    private String name;


    @Constraints.Required
    private String email;

    public Customer() {
    }

    public Customer(Long id, String name, String em) {
        this.id = id;
        this.name = name;
        this.email = em;
    }


    public static final Finder<Long, Customer> find = new Finder<>(Customer.class);
    
    public static final List<Customer> findAll() {
        return Customer.find.all();
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    
    public String getEmail(){
        return this.email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public void setEmail(String e) {
        this.email = e;
    }
}