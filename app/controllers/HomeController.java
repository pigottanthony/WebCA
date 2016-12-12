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
	public Result prod(Long cat){

		List<Product> productsList = new ArrayList<Product>();
		List<Category> categoriesList = Category.findAll();

		if(cat == 0){
			productsList = Product.findAll();
		}
		else{
			productsList = Category.find.ref(cat).getProducts();
		}
		return ok(prod.render(productsList, categoriesList));
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
		Product p = newProductForm.get();
		if(p.getId() == null){
			p.save();
		}
		else if(p.getId() != null){
			p.update();
		}
        newProduct.save();
        flash("success", "Product " + newProduct.getName() + " has been created!");
        return redirect(controllers.routes.HomeController.prod(0));
    }
    public Result deleteProduct(Long id){
        Product.find.ref(id).delete();
        flash("success","Product has been deleted");
        return redirect(routes.HomeController.prod(0));
    }
    @Transactional
	public Result updateProduct(Long id){
		Product p;
		Form<Product> productForm;
		try{
			p = Product.find.byId(id);
			productForm = formFactory.form(Product.class).fill(p);
		}catch (Exception ex){
			return badRequest("error");
		}
		return ok(addProduct.render(productForm));
	}
}
