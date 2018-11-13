>This java script provides a Structure to store information about a single class in any of the Time Tables.

## Structure Information
| S.No | Var. Name | Data Type | Use |
| ---- | --------- | --------- | --- |
|  1.  | 	id     |   String  | Unique Class Identification |
|  2.  |   course  |   Course  | Course of the Class conducted |
|  3.  |   subject |  Subject  | Subject to be taught in the Class |
|  4.  |    room   |   Room    | Room alloted for the Class |
|  5.  | classType |   String  | It specifies the type of class i.e. *lecture, tutorial or lab* |
|  6.  |   teacher |  Teacher  | Teacher teaching in the Class |
|  7.  |    time   |  TimeSlot | Timing & Day of the Class |

## Getter Functions
1. **getId()**: Returns Id of the class
2. **getCourse()**: Returns Course Structure of the Class
3. **getSubject()**: Returns Subject Information of the Class
4. **getRoom()**: Returns Room Details of the Class
5. **getClassType()**: Returns the type of Class
6. **getTeacher()**: Returns Teacher Information for the Class
7. **getTimeSlot()**: Returns TimeSlot of the Class

## Setter Functions
1. **setSubject(...)**: Set the Subject to be taught in the Class
2. **setRoom(...)**: Set the Room alloted for the Class
3. **getClassType(...)**: Set the type of Class alloted
4. **setTeacher(...)**: Set Teacher Information for the Class
5. **setNoClass()**: Set empty/null Class (if no class is conducted in given Time Slot)

## Other Functions
1. **Class(...)**: Constructor to set Id, Course & TimeSlot for a Class
2. **toString()**: Returns the formatted information as a single String
3. **timeTableView()**: Returns the formatted text to be displayed in the Table.GUI