/*
 * This class provides a Structure for the Rooms with following data:
 * 1. id = Unique Room Id
 * 2. capacity = Room Capacity
 */
package dataset;

public class Room {
    private String id;
    private int capacity;
    
    public Room(String id,int capacity){
        this.id = id;
        this.capacity = capacity;
    }
    
    public String getId(){ return id; }
    public int getCapacity(){ return capacity; }
}
