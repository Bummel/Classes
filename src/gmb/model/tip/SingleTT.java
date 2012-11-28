package gmb.model.tip;

import gmb.model.user.Customer;

public abstract class SingleTT extends TipTicket
{
	protected SingleTip tip = null;

	//CONSTRUCTORS
	@Deprecated
	protected SingleTT(){}
	
	public SingleTT(Customer owner)
	{
		super(owner);
	}
	
	public boolean removeTip(SingleTip tip)
	{
		if(this.tip.equals(tip))
		{
			this.tip = null;
			return true;
		}
		else
		return false;
	}
	
	//GET METHODS
	public SingleTip getTip(){ return tip; }
	
	//SET METHODS
	public abstract void setTip(SingleTip tip);
}
