package game;
import java.util.Scanner;

import fixtures.Room;

public class Main {
	private static RoomManager roomManager = new RoomManager(4);
	
		
	public static void main(String[] args) {
		System.out.println("Hello welcome to Text Adventure Warhammer™");
	roomManager.init();
	Player player = new Player();
	System.out.println("Congratulations on becoming the newly elected Emperor of Man. Take a "
			+ "tour of your new palace\nin Altdorf.\n"
			+ "Type travel + n, e, s, or w to travel around the Palace");
	player.setCurrentRoom(roomManager.getStartingRoom());
	int x=1;
	while(x==1) {
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
		
		if (action == "travel") {
			System.out.println("The Emperor travels: " + details);
			Room travel = player.getCurrentRoom().getExit(details);
			player.setCurrentRoom(travel);
		}
	}
}
