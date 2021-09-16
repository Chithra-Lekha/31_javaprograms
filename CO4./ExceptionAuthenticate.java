import java.util.Scanner;
class UsernameError extends Exception{
	String usernm;
	UsernameError(String u){
		usernm=u;
	}
	public String username(){
		return "UsernameError["+usernm+"]";
	}
}
class PasswordError extends Exception{
	String passwd;
	PasswordError(String p){
		passwd=p;
	}
	public String password(){
		return "PasswordError["+passwd+"]";
	} 
}
class ExceptionAuthenticate{
	static void authenticate(String u,String p) throws UsernameError,PasswordError{
		if(!u.equals("javaprograms"))
			throw new UsernameError(u);
		else if(!p.equals("java@123"))
			throw new PasswordError(p);	
		else
			System.out.println("login successfull....");
		
	}
	public static void main(String ar[]){
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Username:");
			String u=sc.nextLine();
			System.out.println("Enter your Password:");
			String p=sc.nextLine();
			authenticate(u,p);
		}catch(UsernameError e){
			System.out.println("incorrect username!!!! "+e);
		}
		catch(PasswordError e){
			System.out.println("incorrect password!!!! "+e);
		}
	}
}