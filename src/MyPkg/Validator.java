package MyPkg;

public class Validator {
	public Boolean Validate(String UserName, String Passwd)
	{
		if (UserName.equals("Gouri") && Passwd.equals("Sohoni"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
