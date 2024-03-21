package customer.main.entity;

public class Customer 
{
	String Username;
	String Password;

	@Override
	public String toString() {
		return "Customer [Username=" + Username + ", Password=" + Password  + "]";
	}

	public String getUsername() 
	{
		return Username;
	}
	public void setUsername(String username) 
	{
		Username = username;
	}
	public String getPassword()
	{
		return Password;
	}
	public void setPassword(String password)
	{
		Password = password;
	}
}
