import java.util.Scanner;

public class LoginView {
	
	String username;
	String password;
	
	public void authType()
	{
		
	}
	public void userType()
	{
		int choice=0;
		do{
			
			
		}while(choice!=4);
	}
	
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username:");
		username=sc.nextLine();
		System.out.println("Enter Password:");
		password=sc.nextLine();
		
	}
	public void sendData(String data)
	{
		System.out.println(data);
	}

}
