package gmb.model.tip;
import java.util.LinkedList;


public class TipManagement 
{
	protected LinkedList<WeeklyLottoDraw> weeklyLottoDrawings;
	protected LinkedList<DailyLottoDraw> dailyLottoDrawings;
	protected LinkedList<TotoEvaluation> totoEvaluations;
	
	@Deprecated
	protected TipManagement(){}
	
	public TipManagement(int dummy)
	{
		weeklyLottoDrawings = new LinkedList<WeeklyLottoDraw>();
		dailyLottoDrawings = new LinkedList<DailyLottoDraw>();
		totoEvaluations = new LinkedList<TotoEvaluation>();
	}
	
	public void addDraw(WeeklyLottoDraw draw){ weeklyLottoDrawings.add(draw); }
	public void addDraw(DailyLottoDraw draw){ dailyLottoDrawings.add(draw); }
	public void addDraw(TotoEvaluation draw){ totoEvaluations.add(draw); }
	
	public LinkedList<WeeklyLottoDraw> getWeeklyLottoDrawings(){ return weeklyLottoDrawings; }
	public LinkedList<DailyLottoDraw> getDailyLottoDrawings(){ return dailyLottoDrawings; }
	public LinkedList<TotoEvaluation> getTotoEvaluations(){ return totoEvaluations; }
}
