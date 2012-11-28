package gmb.exception;

@SuppressWarnings("serial")
public class WrongParameterTypeException extends GmbException 
{
	public WrongParameterTypeException(String message)
	{
		super(message);
	}
	
	public WrongParameterTypeException(){}
}
