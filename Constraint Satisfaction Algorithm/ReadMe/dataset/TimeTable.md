> This java script provides Structure to store information about the Time Table of a particular Course

## Structure Information
| S.No | Var. Name | Data Type | Use |
| ---- | --------- | --------- | --- |
|  1.  | 	id     |  String   | Unique Time Table Identification |
|  2.  |   course  |  Course   | Course for the Time Table |
|  3.  |   classes |   Class   | *Array List* of Class in the Time Table |

## Getter Functions
1. **getId()**: Returns Id of the Time Table
2. **getCourse()**: Returns Course Information for the Time Table
3. **getClasses()**: Returns *Array List* of all Classes in the Time Table

## Other Functions
1. **TimeTable(...)**: Constructor to set Id & Course for the Time Table
2. **addClass(...)**: Add Class in the Time Table  