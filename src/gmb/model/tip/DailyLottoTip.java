package gmb.model.tip;

import gmb.exception.WrongParameterTypeException;

public class DailyLottoTip extends SingleTip 
{
	protected int[] tip;

	@Deprecated
	protected DailyLottoTip(){}

	public DailyLottoTip(DailyLottoSTT tipTicket, GroupTip groupTip, int[] tip)
	{
		super((SingleTT)tipTicket, groupTip);

		try
		{
			if(tip.length == 10)
				this.tip = tip;
			else
				throw new WrongParameterTypeException("WRONG TIP LENGTH GIVEN TO DailyLottoTip!");
		}
		catch(WrongParameterTypeException e)
		{
			e.printStackTrace();
			
			this.tip = new int[10];
			for(int i=0; i<10; ++i)
				this.tip[i] = 0;	
		}
	}

	public int[] getTip(){ return tip; }
}
