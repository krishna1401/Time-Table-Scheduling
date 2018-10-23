/*
 * This class provides a Structure for the Rooms with following data:
 * 1. id = Unique Room Id
 * 2. info = Basic information about the Room (if needed)
 * 3. capacity = Room Capacity
 */
package dataset;

public class Room {
    private String id;
    private String info;
    private int capacity;
    
    public Room(String id,String info,int capacity){
        this.id = id;
        this.info = info;
        this.capacity = capacity;
    }
    
    public String getId(){ return id; }
    public String getInfo(){ return info; }
    public int getCapacity(){ return capacity; }
    @Override
    public String toString(){ return info; }
}
