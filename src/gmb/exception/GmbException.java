package gmb.exception;

@SuppressWarnings("serial")
public class GmbException extends Exception 
{
	String message = "";
	public GmbException(String message)
	{
		this.message = message;
	}
	
	public GmbException(){}
	
	public void printStackTrace()
	{
		super.printStackTrace();
		System.out.println(message);
	}
}
