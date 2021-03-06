package game;
import java.util.Scanner;

import fixtures.Room;

public class Main {
	private static RoomManager roomManager = new RoomManager(10);
	private static boolean work;
		
	public static void main(String[] args) {
		System.out.println("Hello welcome to Text Adventure Warhammer?\n");
	roomManager.init();
	Player player = new Player();
	System.out.println("Congratulations on becoming the newly elected Emperor of Man. Take a "
			+ "tour of your new palace\nin Altdorf.\n\n"
			+"Bewarned new Emperor, there are reports that nefarious ratmen have infiltrated your home\n\n"
			+ "Type travel + north, east, south, or west to travel around the Palace\n"
			+ "type kill to despose of any ratmen that may be hiding the shadows\n"
			+ "Type quit to exit the game\n");
	player.setCurrentRoom(roomManager.getStartingRoom());
	work = true;
	while(work) {
		printRoom(player);
		String[] input = collectInput();
		parse(input, player);
	}
		
	}
	
	private static void printRoom(Player player) {
		System.out.println(":::: CURRENT LOCATION ::::");
		System.out.println(player.getCurrentRoom());
		
	}

	private static String[] collectInput() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		String[] string = input.split(" ");
		return string;		

	}
	
	
	private static void parse(String[] command, Player player) {
		String action = command[0].intern();
		String details = null;
		if (command.length > 1) {
			details = command[1].intern();
		}
		
		if (action == "quit" ) {
			System.out.println("The Nation Calls!");
			work = false;
			return;
		}
		
		switch(command[0])
		{
		default:
			   System.out.println("Chaos warps the meaning of your command.");
			   break;
		case "kill":
			 player.purge();
			 break;
		case "travel":
			System.out.println("The Emperor travels: " + details);
			Room travel = player.getCurrentRoom().getExit(details);
			player.setCurrentRoom(travel);
			 break;
		}
	}
}
