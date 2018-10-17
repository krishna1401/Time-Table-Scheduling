/*
 * This class provides a Structure for the Teacher with following data:
 * 1. id = Unique Teacher Id
 * 2. name = Teacher Name
 */
package dataset;

public class Teacher {
    private String id;
    private String name;
    
    public Teacher(String id,String name){
        this.id = id;
        this.name = name;
    }
    
    public String getID(){ return id; }
    public String getName(){ return name; }
    @Override
    public String toString(){ return name; }
}
