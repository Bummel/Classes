package gmb.model.tip;

import gmb.exception.WrongParameterTypeException;
import gmb.model.user.Customer;

public class DailyLottoPTT extends PermaTT 
{
	//CONSTRUCTORS
	@Deprecated
	protected DailyLottoPTT(){}

	public DailyLottoPTT(Customer owner)
	{
		super(owner);
	}

	@Override
	public void addTip(SingleTip tip) 
	{
		try 
		{
			if(tip instanceof DailyLottoTip)
			{
				tips.add(tip);
			} 
			else
				throw new WrongParameterTypeException("WRONG TIP-TYPE GIVEN TO DailyLottoPTT!");

		} 
		catch (WrongParameterTypeException e) 
		{
			e.printStackTrace();
		}
	}
}
