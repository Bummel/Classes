package gmb.model.tip;
import java.util.LinkedList;

import org.joda.time.DateTime;


public class TotoEvaluation extends Draw 
{
	private LinkedList<FootballGameResult> results;
	
	protected LinkedList<TotoTip> totoTips;
	protected LinkedList<TotoGroupTip> totoGroupTips;
	
	@Deprecated
	protected TotoEvaluation(){}

	protected TotoEvaluation(DateTime planedEvaluationDate)
	{
		super(planedEvaluationDate);

		totoTips = new LinkedList<TotoTip>();
		totoGroupTips = new LinkedList<TotoGroupTip>();
	}
	
	@Override
	public boolean evaluate() 
	{
		super.evaluate();//set actualEvaluationDate
		
		return false;
	}
	
	public void addResult(FootballGameResult result){ results.add(result); }
	
	public void addTip(SingleTip tip){ totoTips.add((TotoTip)tip); }
	public void addTip(GroupTip tip){ totoGroupTips.add((TotoGroupTip)tip); }
	
	public void removeTip(SingleTip tip){ totoTips.remove((TotoTip)tip); }
	public void removeTip(GroupTip tip){ totoGroupTips.remove((TotoGroupTip)tip); }
	
	public LinkedList<FootballGameResult> getResults(){ return results; }
	
	public LinkedList<TotoTip> getTotoTips(){ return totoTips; }
	public LinkedList<TotoGroupTip> getTotoGroupTips(){ return totoGroupTips; }
}
