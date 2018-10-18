> This java script provides Structure to store information about various Subjects need to be taught.

## Structure Information
| S.No | Var. Name | Data Type | Use |
| ---- | --------- | --------- | --- |
|  1.  |     id    |   String  | Unique Subject Identification |
|  2.  |    name   |   String  | Full Name of the Subject |
|  3.  |  teacher  |  Teacher  | Teacher allocated for the Subject |
|  4.  | timeDuration |  int   | Total Time Duration needed (in hrs/week) to complete the Subject |

## Getter Functions
1. **getId()**: Returns Id of the Subject
2. **getName()**: Returns Full Name of the Subject
3. **getTeacher()**: Returns Teacher allocated for the Subject
4. **getTimeDuration()**: Returns Time Duration of the Subject

## Other Functions
1. **Subject(...)**: Constructor to set Id, Name, Teacher & Time Duration for the Subject
2. **toString()**: Returns Full Name of the Subject