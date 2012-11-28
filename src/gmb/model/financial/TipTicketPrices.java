package gmb.model.financial;
import java.math.BigDecimal;


public class TipTicketPrices 
{
	protected BigDecimal weeklyLottoSTTPrice;
	protected BigDecimal totoSTTPrice;
	protected BigDecimal dailyLottoSTTPrice;
	protected BigDecimal weeklyLottoPTTPrice;
	protected BigDecimal dailyLottoPTTPrice;
	
	@Deprecated
	protected TipTicketPrices(){}
	
	public TipTicketPrices(BigDecimal weeklyLottoSTTPrice, BigDecimal totoSTTPrice, BigDecimal dailyLottoSTTPrice, BigDecimal weeklyLottoPTTPrice, BigDecimal dailyLottoPTTPrice)
	{
		this.weeklyLottoSTTPrice = weeklyLottoSTTPrice;
		this.totoSTTPrice = totoSTTPrice;
		this.dailyLottoSTTPrice = dailyLottoSTTPrice;
		this.weeklyLottoPTTPrice = weeklyLottoPTTPrice;
		this.dailyLottoPTTPrice = dailyLottoPTTPrice;	
	}
	
	public void setWeeklyLottoSTTPrice(BigDecimal weeklyLottoSTTPrice){ this.weeklyLottoSTTPrice = weeklyLottoSTTPrice; }
	public void setTotoSTTPrice(BigDecimal totoSTTPrice){ this.totoSTTPrice = totoSTTPrice; }
	public void setDailyLottoSTTPrice(BigDecimal dailyLottoSTTPrice){ this.dailyLottoSTTPrice = dailyLottoSTTPrice; }
	public void setWeeklyLottoPTTPrice(BigDecimal weeklyLottoPTTPrice){ this.weeklyLottoPTTPrice = weeklyLottoPTTPrice; }
	public void setDailyLottoPTTPrice(BigDecimal dailyLottoPTTPrice){ this.dailyLottoPTTPrice = dailyLottoPTTPrice; }
	
	public BigDecimal getWeeklyLottoSTTPrice(){ return weeklyLottoSTTPrice; }
	public BigDecimal getTotoSTTPrice(){ return totoSTTPrice; }
	public BigDecimal getDailyLottoSTTPrice(){ return dailyLottoSTTPrice; }
	public BigDecimal getWeeklyLottoPTTPrice(){ return weeklyLottoPTTPrice; }
	public BigDecimal getDailyLottoPTTPrice(){ return dailyLottoPTTPrice; }
}
