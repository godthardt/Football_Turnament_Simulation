import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;


public class Program {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Turnament turnament = new Turnament("Superliga", LocalDate.of(2020, Month.SEPTEMBER, 15), LocalDate.of(2021, Month.JUNE, 2));

		turnament.indLaesHold("hold.txt");
		System.out.println("Number of teams in turnament " + turnament.getNumberOfTeams());
		turnament.generateMatches();
		System.out.println("Number of matches in turnament " + turnament.getNumberOfMatches());
		turnament.generateRandomGoals();
		System.out.println("Number of goals in turnament " + turnament.getNumberOfGoals());
		
		turnament.listMatches();
		
		//turnament.listTeamsAlfabetecally();
		turnament.listTeamsByPoint(true);

	}
	
}
