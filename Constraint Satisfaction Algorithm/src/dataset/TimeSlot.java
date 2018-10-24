/*
 * This class provides a Structure for the Date & Time with following data:
 * 1. id = Unique TimeSlot id
 * 2. slotFrom = Starting time of the Slot
 * 3. slotTo = End time of the Slot
 * 4. time = Defines time slot in string format
 * 5. day = Defines week Day
 */
package dataset;

public class TimeSlot {
    private String id;
    private String time;
    private String day;
    private int slotFrom;
    private int slotTo;
    public TimeSlot(String id,int slotForm, int slotTo,String day){
        this.id = id;
        this.slotFrom = slotForm;
        this.slotTo = slotTo;
        this.time = createStringTime(slotForm,slotTo);
        this.day = day;
    }
    
    public String getId(){ return id; }
    public int getSlotFrom(){ return slotFrom; }
    public int getSlotTo(){ return slotTo; }
    public String getTime(){ return time; }
    public String getDay(){ return day; }
    @Override
    public String toString(){ return day + " : " + time; }
    
    public String createStringTime(int from,int to){
        String time = "";
        if(from < 12)
            time += from + ":00 AM";
        else
            time += from + ":00 PM";
        
        time += " - ";
        if(to < 12)
            time += to + ":00 AM";
        else
            time += to + ":00 PM";
        return time;
    }
}
