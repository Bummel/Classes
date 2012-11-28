package gmb.model.tip;

import gmb.model.Lottery;
import gmb.model.financial.Winnings;

import java.util.LinkedList;

import org.joda.time.DateTime;


public abstract class Draw 
{
	protected boolean evaluated = false;
	protected DateTime planedEvaluationDate;	
	protected DateTime actualEvaluationDate = null;	
	
	protected LinkedList<Winnings> winnings;
	
	@Deprecated
	protected Draw(){}
	
	protected Draw(DateTime planedEvaluationDate)
	{
		this.planedEvaluationDate = planedEvaluationDate;
		winnings =  new LinkedList<Winnings>();
	}

	public boolean evaluate()
	{
		actualEvaluationDate = Lottery.getInstance().getTimer().getDateTime();
		evaluated = true;

		return true;
	}
	
	public abstract void addTip(SingleTip tip);
	public abstract void addTip(GroupTip tip);
	
	public abstract void removeTip(SingleTip tip);
	public abstract void removeTip(GroupTip tip);
	
	public boolean getEvaluated(){ return evaluated; }
	public LinkedList<Winnings> getWinnings(){ return winnings; }
	
	public DateTime getPlanedEvaluationDate(){ return planedEvaluationDate; }
	public DateTime getActualEvaluationDate(){ return actualEvaluationDate; }
}
