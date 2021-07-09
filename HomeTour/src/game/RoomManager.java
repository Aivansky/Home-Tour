package game;

import fixtures.Skaven;
import fixtures.Room;

public class RoomManager {
	private Room startingRoom;
	private Room[] rooms;
	Skaven Skaven = new Skaven("Skaven");
	
	public RoomManager(int roomCount) {
		super();
		rooms = new Room[roomCount];
	}

	public void init() {
	    Room Volkshalle = new Room(
			"The Volkshalle",
			"a meeting chamber",
			"It is here that the electors meet to elect the Emperor and here that the\n"
			+ "newly-elected emperor is crowned. The Reikland Council and Reikland Diet\n"
			+ "also meet in the Volkshalle—in the Wilhelm Chamber and Holzkrug Chamber"
			+ " respectively", Skaven);
			this.rooms[0] = Volkshalle;
	        
	   Room Imperial_Map_Room = new Room(
			   "Map Room",
			   "a room containing maps",
			   "A room containing mosaic mappa mundi of the Empire, called the Great Chart, "
			   + "inlaid onto the floor.\nVarious geographical features are represented by "
			   + "opulent materials. The boundaries of the Imperial\nprovinces are depicted with rosewood, "
			   + "limewood, copper, and brass.", Skaven
			   );
	   this.rooms[1]=Imperial_Map_Room;
	   
	   Room Imperial_Zoo = new Room(
			   "Imperial Zoo",
			   "home to some of the most dangerous monsters of the Old World",
			   "This menagerie contains all manner of grotesque monstrosities, such as the "
			   + "Abomination of Stirland,\nthe Drakwald Gibberbeast and many more. In "
			   + "addition to being one of the wonders of the Old World,\nthe Imperial Zoo"
			   + " also has a practical function, stabling the Emperors' more dangerous and\n"
			   + "bizarre mounts", null
			   );
	   this.rooms[2]=Imperial_Zoo;
	   
	   Room Portcullis = new Room(
			   "Portcullis",
			   "Gate",
			   "The palace can be accessed by a portcullis gate from the Kaiserplatz. This"
			   + " gate is guarded by two\nReiksguard knights who wield ornate swords, and is"
			   + " staffed by a number of runners who can send\nmessages from those on the"
			   + " outside to those within. The general public cannot go through the gate."
			   + "\nAbove the gate are a series of gargoyles which can disgorge molted lead in "
			   + "the event of a siege", null
			   );
	   this.rooms[3]=Portcullis;
       this.setStartingRoom(Portcullis);
       
       Room garden = new Room(
				"Garden",
				"Behold, you new favorite room",
				"The Imperial Palace includes a medium-sized garden, which includes statues"
				+ " of the Empire's heroes, from both ancient and recent times. It also has"
				+ " a green lawn.", null);
		
		this.rooms[4] = garden;
		
	   Room Prince_Palace = new Room(
					"Prince Palace",
					"Your personal room",
					"which is situated alongside the the rest of the palace. It is ancient, "
					+ "and is dwarfed by the rest of the\npalace, just as Karl Franz's role"
					+ " as Prince of Altdorf is dwarfed by his role as Emperor."
					+ "\nOnly Ludwig Schwarzhelm can grant entry into the Emperor's Bedchamber", Skaven);
			
		this.rooms[5] = Prince_Palace;
			
		  Room gymnasium = new Room(
					"Gymnasium",
					"Place to workout",
					"The imperial gymnasium is bristling with the latest weights and machines"
					+ "that only the most pumped of imperial soldiers can handle", null);
			
			this.rooms[6] = gymnasium;
			
			  Room ballroom= new Room(
						"The great ballroom",
						"a rather long room",
						"The great ballroom, probably the longest room in the palace", Skaven);
				
				this.rooms[7] = ballroom;
				
				  Room Hall_of_Mirrors = new Room(
							"Hall of Mirrors",
							"a room containing many large mirrors",
							"one of the few locations in the Old World with mirrors of great size", null);
					
					this.rooms[8] = Hall_of_Mirrors;
					
					  Room library = new Room(
								"Library",
								"the imperial library",
								"the Emperor's private library, which houses (among other volumes) the war journal of Magnus the Pious", Skaven);
						
						this.rooms[9] = library;
						
						Room[] room9Exits = {Portcullis, Prince_Palace};
						library.setExits(room9Exits);
						
						Room[] room8Exits = {Portcullis, Prince_Palace};
						Hall_of_Mirrors.setExits(room8Exits);
						
						Room[] room7Exits = {Portcullis, Prince_Palace};
						ballroom.setExits(room7Exits);
						
						Room[] room6Exits = {Portcullis, Prince_Palace};
						gymnasium.setExits(room6Exits);
		
						Room[] room5Exits = {Portcullis, Prince_Palace};
						Prince_Palace.setExits(room5Exits);
			
						Room[] room4Exits = {Portcullis, Prince_Palace};
						garden.setExits(room4Exits);
	   
	   Room[] room3Exits = {Volkshalle,Imperial_Map_Room,Imperial_Zoo,Prince_Palace,garden};
	   Portcullis.setExits(room3Exits);
	   
	   Room[] room2Exits = {Volkshalle,Prince_Palace,Imperial_Map_Room,Portcullis,garden};
	   Imperial_Zoo.setExits(room2Exits);
	   
	   Room[] room1Exits = {Volkshalle,Imperial_Zoo,Prince_Palace,Portcullis,garden};
	   Imperial_Map_Room.setExits(room1Exits);
	   
	   Room[] room0Exits = {Prince_Palace,Imperial_Zoo,Imperial_Map_Room,Portcullis,garden};
	   Volkshalle.setExits(room0Exits);
	   
	}
	
	public Room getStartingRoom() {
		return startingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	
	public Room[] getHouse() {
		return rooms;
	}
	
	public void setHouse(Room[] rooms) {
		this.rooms = rooms;
	}
}
