package gmb.model.tip;

import java.util.*;

public class TotoTip extends SingleTip 
{
	protected LinkedList<FootballGameResult> tips;
	
	@Deprecated
	protected TotoTip(){}

	public TotoTip(TotoSTT tipTicket, GroupTip groupTip, LinkedList<FootballGameResult> tips)
	{
		super((SingleTT)tipTicket, groupTip);

		this.tips = tips;
	}
	
	public LinkedList<FootballGameResult> getTips(){ return tips; }
}
