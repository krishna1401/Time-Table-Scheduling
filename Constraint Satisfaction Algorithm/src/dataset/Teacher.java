/*
 * 24 Hour Format
 * This class provides a Structure for the Teacher with following data:
 * 1. id = Unique Teacher Id
 * 2. name = Teacher Name
 * 3. availableFrom = Teacher's Time of Availability From
 * 4. availableTo = Teacher's Time of Availability To
 */
package dataset;

public class Teacher {
    private String id;
    private String name;
    private int availableFrom;
    private int availableTo;
    
    public Teacher(String id,String name,int availableFrom,int availableTo){
        this.id = id;
        this.name = name;
        this.availableFrom = availableFrom;
        this.availableTo = availableTo;
    }
    public String getId(){ return id; }
    public String getName(){ return name; }
    public int getAvailableFrom(){ return availableFrom; }
    public int getAvailableTo(){ return availableTo; }
    @Override
    public String toString(){ return name; }
}
