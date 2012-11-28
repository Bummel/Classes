package gmb.model.tip;
import gmb.exception.WrongParameterTypeException;


public class WeeklyLottoTip extends SingleTip 
{
	protected int[] tip;

	@Deprecated
	protected WeeklyLottoTip(){}

	public WeeklyLottoTip(WeeklyLottoSTT tipTicket, GroupTip groupTip, int[] tip)
	{
		super((SingleTT)tipTicket, groupTip);

		try
		{
			if(tip.length == 9)
				this.tip = tip;
			else
				throw new WrongParameterTypeException("WRONG TIP LENGTH GIVEN TO WeeklyLottoTip!");
		}
		catch(WrongParameterTypeException e)
		{
			e.printStackTrace();
			
			this.tip = new int[9];
			for(int i=0; i<10; ++i)
				this.tip[i] = 0;	
		}
	}

	public int[] getTip(){ return tip; }
}
