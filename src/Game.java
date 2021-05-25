import java.sql.Time;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Game {
	private ArrayList<Player> players;
	Scanner scan = new Scanner(System.in);
	
	private void showWinner() 
	{
		int rank = 1;
		players.sort(new Comparator<Player>() 
		{
			@Override
			public int compare(Player o1, Player o2) {
				return o2.getPosition() - o1.getPosition();
			}
		});
		for (int i = 0; i < players.size(); i++) {
			if(i > 0 && players.get(i).getPosition() == players.get(i - 1).getPosition()) {
					rank--;
			}
			System.out.println("Rank " + rank + " : " + players.get(i).getName());
			rank ++;
		}
	}
	
	private void printHeader() 
	{
		System.out.printf("| %5s |", "Round");
		for (Player p : players) {
			System.out.printf(" %-16s |", p.getName());
		}
		System.out.printf("\n");
		System.out.printf("| %5s |", "     ");
		for (Player p : players) {
			System.out.printf(" %3s | %4s | %3s |", "Old", "Roll", "New");
		}
		
		System.out.printf("\n");
		System.out.print("|-------|");
		for (Player p : players) {
			System.out.print("------------------|");
		}
		System.out.println();
	}
	
	private Player checkWinner(int round)
	{
		for(Player p : players) {
			if(p.getPosition() == 100 ) {
				return p;
			}
		}
		return null;
	}
	
	public int dice()
	{
		Random rand = new Random();
		return rand.nextInt(6) + 1;
	}
	
	public void letsplay()
	{
		Player winner = null;
		int round = 1;
		
		printHeader();
		
		do 
		{
			System.out.printf("| %5d |", round);
			for(Player p : players) 
			{
				int ol = p.getPosition();
				int roll = dice();
				p.addPosition(roll);
				int ne = p.getPosition();
				System.out.printf(" %-3d | %-4d | %-3d |", ol, roll, ne);
			}
			
			scan.nextLine();
			
			winner = checkWinner(round);
			round++;
		}
		while(winner == null && round <= 25);
		showWinner();
	}
	
	public Game(ArrayList<Player> players) {
		this.players = players;
		letsplay();
	}

}
