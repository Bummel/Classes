package gmb.model.tip;

import gmb.exception.WrongParameterTypeException;
import gmb.model.user.Customer;

public class DailyLottoSTT extends SingleTT 
{
	//CONSTRUCTORS
	@Deprecated
	protected DailyLottoSTT(){}

	public DailyLottoSTT(Customer owner)
	{
		super(owner);
	}

	@Override
	public void setTip(SingleTip tip) 
	{
		try 
		{
			if(tip instanceof DailyLottoTip)
			{
				this.tip = tip;
			} 
			else
				throw new WrongParameterTypeException("WRONG TIP-TYPE GIVEN TO DailyLottoSTT!");

		} 
		catch (WrongParameterTypeException e) 
		{
			e.printStackTrace();
		}
	}
}
