package game;

import fixtures.Room;

public class RoomManager {
	private Room startingRoom;
	private Room[] rooms;

	
	public RoomManager(int roomCount) {
		super();
		rooms = new Room[roomCount];
	}

	public void init() {
	    Room Volkshalle = new Room(
			"The Volkshalle",
			"a meeting chamber",
			" It is here that the electors meet to elect the Emperor and here that the\n "
			+ "newly-elected emperor is crowned. The Reikland Council and Reikland Diet\n "
			+ "also meet in the Volkshalle—in the Wilhelm Chamber and Holzkrug Chamber"
			+ " respectively");
			this.rooms[0] = Volkshalle;
	        
	   Room Imperial_Map_Room = new Room(
			   "Map Room",
			   "a room containing maps",
			   "A room containing mosaic mappa mundi of the Empire, called the Great Chart, "
			   + "inlaid onto the floor.\nVarious geographical features are represented by "
			   + "opulent materials. The boundaries of the Imperial\nmprovinces are depicted with rosewood, "
			   + "limewood, copper, and brass."
			   );
	   this.rooms[1]=Imperial_Map_Room;
	   
	   Room Imperial_Zoo = new Room(
			   "Imperial Zoo",
			   "home to some of the most dangerous monsters of the Old World",
			   "This menagerie contains all manner of grotesque monstrosities, such as the "
			   + "Abomination of Stirland,\nthe Drakwald Gibberbeast and many more. In "
			   + "addition to being one of the wonders of the Old World,\nthe Imperial Zoo"
			   + " also has a practical function, stabling the Emperors' more dangerous and\n"
			   + "bizarre mounts"
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
			   + "the event of a siege"
			   );
	   this.rooms[3]=Portcullis;
       this.setStartingRoom(Portcullis);
	   
	   Room[] room3Exits = {Volkshalle,Imperial_Map_Room,Imperial_Zoo,null};
	   Portcullis.setExits(room3Exits);
	   
	   Room[] room2Exits = {Volkshalle,null,Imperial_Map_Room,Portcullis};
	   Imperial_Zoo.setExits(room2Exits);
	   
	   Room[] room1Exits = {Volkshalle,Imperial_Zoo,null,Portcullis};
	   Imperial_Map_Room.setExits(room1Exits);
	   
	   Room[] room0Exits = {null,Imperial_Zoo,Imperial_Map_Room,Portcullis};
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
