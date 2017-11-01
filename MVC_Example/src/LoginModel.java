
public class LoginModel {
	String userName="Tushar";
	String password="Deshpande";
	public String checkAuthentication(String uname,String pword)
	{
		if(userName==uname && password==pword)
		{
			return "User Authenticated!";
		}
		else
		{
			return "User is not Authenticated";
		}
	}

}
