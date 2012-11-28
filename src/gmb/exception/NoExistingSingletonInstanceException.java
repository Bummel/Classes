package gmb.exception;

@SuppressWarnings("serial")
public class NoExistingSingletonInstanceException extends GmbException 
{
	public NoExistingSingletonInstanceException(String message)
	{
		super(message);
	}
	
	public NoExistingSingletonInstanceException(){}
}
