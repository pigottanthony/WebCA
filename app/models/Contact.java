package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

/**
 * Created by wdd on 15/12/16.
 */
@Entity
public class Contact extends Model{

    @Id
    private Long id;

    @Constraints.Required
    private String fname;

    @Constraints.Required
    private String lname;

    @Constraints.Required
    private String email;

    @Constraints.Required
    private String subject;

    @Constraints.Required
    private String comment;

    public Contact(){

    }

    public Contact(Long id, String fname, String lname, String email, String subject, String comment){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public static Finder<Long, Contact> find = new Finder<Long, Contact>(Contact.class);

    public static List<Contact> findAll(){
        return Contact.find.all();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
