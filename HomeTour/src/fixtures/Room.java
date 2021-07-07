package fixtures;

public class Room extends Fixture {
private Room[] exits;


public Room(String name, String shortDescription, String longDescription) {
	super(name, shortDescription, longDescription);
	this.exits = new Room[4]; 
}
	
public Room[] getExits() {
	return this.exits;
}

public void setExits(Room[] exits) {
	this.exits = exits;
}
	
public Room getExit(String direction) {
	int num = -1;
	switch(direction) {
	case "n":
		num = 0;
		break;
		case "e":
			num = 1;
			break;
		case "s":
			num = 2;
			break;
		case "w":
			num = 3;
			break;
	}
	return this.exits[num];
}



}
