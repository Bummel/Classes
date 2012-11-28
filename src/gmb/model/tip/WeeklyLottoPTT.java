package gmb.model.tip;

import gmb.exception.WrongParameterTypeException;
import gmb.model.user.Customer;

public class WeeklyLottoPTT extends PermaTT 
{
	//CONSTRUCTORS
	@Deprecated
	protected WeeklyLottoPTT(){}

	public WeeklyLottoPTT(Customer owner)
	{
		super(owner);
	}

	@Override
	public void addTip(SingleTip tip) 
	{
		try 
		{
			if(tip instanceof WeeklyLottoTip)
			{
				tips.add(tip);
			} 
			else
				throw new WrongParameterTypeException("WRONG TIP-TYPE GIVEN TO WeeklyLottoPTT!");

		} 
		catch (WrongParameterTypeException e) 
		{
			e.printStackTrace();
		}
	}
}
