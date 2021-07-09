package fixtures;

public class Room extends Fixture {
private Room[] exits;
public Skaven currentObject;


public Room(String name, String shortDescription, String longDescription,
		 Skaven currentObj) {
	super(name, shortDescription, longDescription);
	this.exits = new Room[10]; 
    this.currentObject = currentObj;
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
	case "north":
		num = 0;
		break;
		case "east":
			num = 1;
			break;
		case "south":
			num = 2;
			break;
		case "west":
			num = 3;
			break;
	}
	return this.exits[num];
}

}
