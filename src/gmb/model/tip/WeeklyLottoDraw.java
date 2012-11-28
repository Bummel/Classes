package gmb.model.tip;

import java.util.LinkedList;

import org.joda.time.DateTime;

public class WeeklyLottoDraw extends Draw 
{
	protected int[] result = null;
	
	protected LinkedList<WeeklyLottoTip> weeklyLottoTips;
	protected LinkedList<WeeklyLottoGroupTip> weeklyLottoGroupTips;
	
	@Deprecated
	protected WeeklyLottoDraw(){}
	
	protected WeeklyLottoDraw(DateTime planedEvaluationDate)
	{
		super(planedEvaluationDate);
		
		weeklyLottoTips = new LinkedList<WeeklyLottoTip>();
		weeklyLottoGroupTips = new LinkedList<WeeklyLottoGroupTip>();
	}
	
	@Override
	public boolean evaluate() 
	{
		super.evaluate();//set actualEvaluationDate
		
		return false;
	}
	
	public void setResult(int[] result){ this.result = result; }
	
	public void addTip(SingleTip tip){ weeklyLottoTips.add((WeeklyLottoTip)tip); }
	public void addTip(GroupTip tip){ weeklyLottoGroupTips.add((WeeklyLottoGroupTip)tip); }
	
	public void removeTip(SingleTip tip){ weeklyLottoTips.remove((WeeklyLottoTip)tip); }
	public void removeTip(GroupTip tip){ weeklyLottoGroupTips.remove((WeeklyLottoGroupTip)tip); }
	
	public int[] getResult(){ return result; }
	
	public LinkedList<WeeklyLottoTip> getWeeklyLottoTips(){ return weeklyLottoTips; }
	public LinkedList<WeeklyLottoGroupTip> getWeeklyLottoGroupTips(){ return weeklyLottoGroupTips; }
}
