package gmb.model.tip;

import java.util.LinkedList;

import org.joda.time.DateTime;

public class DailyLottoDraw extends Draw 
{
	protected int[] result;

	protected LinkedList<DailyLottoTip> dailyLottoTips;	
	protected LinkedList<DailyLottoGroupTip> dailyLottoGroupTips;

	@Deprecated
	protected DailyLottoDraw(){}

	protected DailyLottoDraw(DateTime planedEvaluationDate)
	{
		super(planedEvaluationDate);

		dailyLottoTips = new LinkedList<DailyLottoTip>();
		dailyLottoGroupTips = new LinkedList<DailyLottoGroupTip>();
	}

	@Override
	public boolean evaluate() 
	{
		super.evaluate();//set actualEvaluationDate
		
		return false;
	}
	
	public void setResult(int[] result){ this.result = result; }
	
	public void addTip(SingleTip tip){ dailyLottoTips.add((DailyLottoTip)tip); }
	public void addTip(GroupTip tip){ dailyLottoGroupTips.add((DailyLottoGroupTip)tip); }
	
	public void removeTip(SingleTip tip){ dailyLottoTips.remove((DailyLottoTip)tip); }
	public void removeTip(GroupTip tip){ dailyLottoGroupTips.remove((DailyLottoGroupTip)tip); }
	
	public int[] getResult(){ return result; }
	
	public LinkedList<DailyLottoTip> getDailyLottoTips(){ return dailyLottoTips; }
	public LinkedList<DailyLottoGroupTip> getDailyLottoGroupTips(){ return dailyLottoGroupTips; }
}
