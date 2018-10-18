> This java script provides Structure ot store information about Time Slots in the Time Table

## Structure Information
| S.No | Var. Name | Data Type | Use |
| ---- | --------- | --------- | --- |
|  1.  |  	 id    |  String   | Unique Time Slot Identification |
|  2.  |    time   |  String   | Time in the Time Slot *(9:00 AM - 10:00 AM)* |
|  3.  |     day   |  String   | Day(in week) of the Time Slot |

## Getter Functions
1. **getId()**: Returns Id of the Time Slot
2. **getTime()**: Returns Time of the Time Slot
3. **getDay()**: Returns Day of the Time Slot

## Other Functions
1. **TimeSlot(...)**: Constructor to set Id, Time & Day of the Time Slot
2. **toString()**: Returns formatted Time Slot