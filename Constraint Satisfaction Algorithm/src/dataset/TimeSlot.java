/*
 * This class provides a Structure for the Date & Time with following data:
 * id = Unique TimeSlot id
 * time = Defines time slot in string
 * day = Defines week Day
 */
package dataset;

public class TimeSlot {
    private String id;
    private String time;
    private String day;
    public TimeSlot(String id,String time,String day){
        this.id = id;
        this.time = time;
        this.day = day;
    }
    
    public String getId(){ return id; }
    public String getTime(){ return time; }
    public String getDay(){ return day; }
    @Override
    public String toString(){ return day + " : " + time; }
}
