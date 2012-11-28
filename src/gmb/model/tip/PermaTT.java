package gmb.model.tip;
import gmb.model.user.Customer;

import java.util.LinkedList;


public abstract class PermaTT extends TipTicket 
{
	protected LinkedList<SingleTip> tips;

	@Deprecated
	protected PermaTT(){}

	public PermaTT(Customer owner)
	{
		super(owner);
	}
	
	public boolean removeTip(SingleTip tip)
	{
		if(this.tips.contains(tip))
		{
			this.tips.remove(tip);
			return true;
		}
		else
		return false;
	}
	
	public abstract void addTip(SingleTip tip);
	
	public LinkedList<SingleTip> getTips(){ return tips; }	
}
