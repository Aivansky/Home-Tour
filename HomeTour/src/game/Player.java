package game;

import fixtures.Room;

public class Player {
private Room currentRoom;



public Room getCurrentRoom() {
	return currentRoom;
}

public void setCurrentRoom(Room currentRoom) {
	this.currentRoom = currentRoom;
}

public void purge()
{
	   if (currentRoom.currentObject == null)
	   {
		   System.out.println("There are no ratmen present.");
		   return;
	   }
	   System.out.println("You smite the hidden " + currentRoom.currentObject.nameR);
	
}

}
