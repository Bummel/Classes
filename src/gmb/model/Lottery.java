package gmb.model;

import java.math.BigDecimal;

import gmb.exception.NoExistingSingletonInstanceException;
import gmb.model.financial.FinancialManagement;
import gmb.model.financial.ReceiptsDistribution;
import gmb.model.financial.TipTicketPrices;
import gmb.model.tip.TipManagement;
import gmb.model.user.GroupManagement;
import gmb.model.user.MemberManagement;

import org.salespointframework.core.time.DefaultTime;

public class Lottery 
{
	private static Lottery INSTANCE = null;
	 
	private FinancialManagement financialManagement;
	private MemberManagement memberManagement;
	private GroupManagement groupManagement;
	private TipManagement tipManagement;
	
	private DefaultTime timer;
	
	@Deprecated
	private Lottery(){}
	
	private Lottery(FinancialManagement financialManagement, MemberManagement memberManagement, GroupManagement groupManagement, TipManagement tipManagement)
	{
		this.financialManagement = financialManagement;
		this.memberManagement = memberManagement;
		this.groupManagement = groupManagement;
		this.tipManagement = tipManagement;
		
		this.timer = new DefaultTime();
	}
	
	public void Instanciate(FinancialManagement financialManagement, MemberManagement memberManagement, GroupManagement groupManagement, TipManagement tipManagement)
	{
		if(INSTANCE != null) return;
		
		INSTANCE = new Lottery( financialManagement,  memberManagement,  groupManagement,  tipManagement);
	}

	public static Lottery getInstance()
	{
		try
		{
			if(INSTANCE != null) return INSTANCE;
			else
				throw new NoExistingSingletonInstanceException("LOTTERY INSTANCE DOES NOT EXIST!");
		}
		catch(NoExistingSingletonInstanceException e)
		{
			e.printStackTrace();
			return new Lottery(new FinancialManagement(new TipTicketPrices(new BigDecimal(9999999),new BigDecimal(9999999),new BigDecimal(9999999),new BigDecimal(9999999),new BigDecimal(9999999)), 
					new ReceiptsDistribution(50, 27, 20, 3)), new MemberManagement(), new GroupManagement(), new TipManagement(0));
		}
	}

	public FinancialManagement getFinancialManagement(){ return financialManagement; }
	public MemberManagement getMemberManagement(){ return memberManagement; }
	public GroupManagement getGroupManagement(){ return groupManagement; }
	public TipManagement getTipManagement(){ return tipManagement; }
	
	public DefaultTime getTimer(){ return timer; }
}
