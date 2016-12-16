package models.users;

import java.util.*;
import javax.persistence.*;
import com.avaje.ebean.Model;
import play.data.validation.*;

@Entity
public class User extends Model{

    @Id
    private String username;

    @Constraints.Required
    private String role;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String password;

    public User(){

    }


   public static Finder<String, User> getFind() {
        return find;
    }

    public static void setFind(Finder<String, User> find) {
        User.find = find;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Finder<String,User> find = new Finder<String,User>(User.class);

    public static List<User> findAll(){
        return User.getFind().all();
    }

    public static User authenticate(String username, String password){
        return find.where().eq("username", username).eq("password", password).findUnique();
    }

    public static User getUserById(String id){
        if(id == null) return null;
        else return find.byId(id);
    }


}
