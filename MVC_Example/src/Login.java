
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating the object of the login view.
		LoginView view=new LoginView();
		//Creating the object of the login model
		LoginModel model=new LoginModel();
		LoginController controller=new LoginController(view,model);
		view.display();
		
		
		view.sendData(controller.getAuthentication(view.username,view.password));
	}

}
