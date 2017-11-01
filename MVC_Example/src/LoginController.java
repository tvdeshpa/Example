
public class LoginController {
	
	LoginView view;
	LoginModel model;
	public String username;
	public String password;

	public LoginController(LoginView view, LoginModel model)
	{
		this.view=view;
		this.model=model;
	}

	public String getAuthentication(String uname, String pword)
	{
		String authentication;
		authentication=model.checkAuthentication(uname, pword);
		return authentication;
	}
	
	
}
