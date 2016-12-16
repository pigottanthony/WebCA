package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;
import models.users.*;
import models.users.User;

public class LoginController extends Controller {

    private FormFactory formFactory;

    private Environment env;

    @Inject
    public LoginController(Environment e, FormFactory f){
        this.env = e;
        this.formFactory = f;
    }

    public Result login(){

        Form<Login> loginForm = formFactory.form(Login.class);

        return ok(login.render(loginForm, User.getUserById(session().get("username"))));
    }
    public Result loginFirst(){

        Form<Login> loginForm = formFactory.form(Login.class);

        return ok(login.render(loginForm, User.getUserById(session().get("username"))));
    }

    public Result loginSubmit(){

        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        if(loginForm.hasErrors()){
            return badRequest(login.render(loginForm, User.getUserById(session().get("username"))));
        }
        else{
            session().clear();
            session("username", loginForm.get().getUsername());
        }
        return redirect(controllers.routes.HomeController.index());
    }

    public Result logout(){
        session().clear();
        flash("logout", "You've been logged out");
        return redirect(controllers.routes.HomeController.index());
    }
}
