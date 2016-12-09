package controllers;

import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

import models.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

	private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }
	public Result index() {return ok(index.render());}
	public Result about(){
		return ok(about.render());
	}
	public Result contact(){
		return ok(contact.render());
	}
	public Result signup(){
		return ok(signup.render());
	}
	public Result prod(){

		List<Product> productsList = Product.findAll();
		return ok(prod.render(productsList));
	}
	public Result cart(){
		return ok(cart.render());
	}
	public Result account(){
		return ok(account.render());
	}
	public Result checkout(){
		return ok(checkout.render());
	}
    public Result addProduct(){
        Form<Product> addProductForm = formFactory.form(Product.class);
        return ok(addProduct.render(addProductForm));
    }
    public Result addProductSubmit(){
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        if(newProductForm.hasErrors()){
            return badRequest(addProduct.render(newProductForm));
        }
        Product newProduct = newProductForm.get();
        newProduct.save();
        flash("success", "Product " + newProduct.getName() + " has been created!");
        return redirect(controllers.routes.HomeController.prod());
    }
}
