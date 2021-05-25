import java.util.Scanner;
import java.util.ArrayList;

public class Program {
	
		Scanner scan = new Scanner(System.in);
		
		
		public void play(int jml)
		{
			int i = 0;
			String name;
			ArrayList<Player> player = new ArrayList<Player>();
			while(i<jml)
			{
				System.out.print("Enter Astronout " + (i+1) + " name: ");
				name = scan.nextLine();
				
				player.add(new Player(name, 0));
				i++;
				
				System.out.println();
				System.out.println("New Astronout joined the game!");
				System.out.println();
				
			}
			new Game(player);
		}
	

	public Program() {
		// TODO Auto-generated constructor stub
		
		
		
		int choice = 0;
		do
		{
		
		
		System.out.println("Snake and Ladder: Out of Space");
		System.out.println("Can you get back to earth savely?");
		System.out.println("====================");
		System.out.println("1. 2 Player Game");
		System.out.println("2. 3 Player Game");
		System.out.println("3.Exit");
		System.out.print(">> ");
		
		choice = scan.nextInt();
		scan.nextLine();
		switch(choice)
		{
			case(1):
			{
				play(2);
				break;
			}
			
			case(2):
			{
				play(3);
				break;
			}
			
			case(3):
			{
				System.out.println();
				System.out.println();
				System.out.println("Thankyou for playing!");
				break;
			}
		}
		}
		while(choice != 3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Program();
	}

}
