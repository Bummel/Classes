package gmb.model.tip;

import gmb.exception.WrongParameterTypeException;
import gmb.model.user.Customer;

public class WeeklyLottoSTT extends SingleTT 
{
	//CONSTRUCTORS
	@Deprecated
	protected WeeklyLottoSTT(){}

	public WeeklyLottoSTT(Customer owner)
	{
		super(owner);
	}

	@Override
	public void setTip(SingleTip tip) 
	{
		try 
		{
			if(tip instanceof WeeklyLottoTip)
			{
				this.tip = tip;
			} 
			else
				throw new WrongParameterTypeException("WRONG TIP-TYPE GIVEN TO WeeklyLottoSTT!");

		} 
		catch (WrongParameterTypeException e) 
		{
			e.printStackTrace();
		}
	}
}