package gmb.model.tip;

import gmb.exception.WrongParameterTypeException;
import gmb.model.user.Customer;


public class TotoSTT extends SingleTT 
{
	//CONSTRUCTORS
	@Deprecated
	protected TotoSTT(){}

	public TotoSTT(Customer owner)
	{
		super(owner);
	}

	@Override
	public void setTip(SingleTip tip) 
	{
		try 
		{
			if(tip instanceof TotoTip)
			{
				this.tip = tip;
			} 
			else
				throw new WrongParameterTypeException("WRONG TIP-TYPE GIVEN TO TotoSTT!");

		} 
		catch (WrongParameterTypeException e) 
		{
			e.printStackTrace();
		}
	}
}