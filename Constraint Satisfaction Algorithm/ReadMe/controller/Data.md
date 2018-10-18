> This java script uses the dataset Structures to initialize data statically and create a complete Structure to be used for Scheduling

## Structure Information
| S.No | Var. Name | Data Type | Use |
| ---- | --------- | --------- | --- |
|  1.  |   rooms   | ArrayList<Room> | *Array List* of Rooms |
|  2.  |  subjects | ArrayList<Subject> | *Array List* of Subjects |
|  3.  |  teachers | ArrayList<Teacher> | *Array List* of Teachers |
|  4.  |  courses  | ArrayList<Course> | *Array List* of Courses |
|  5.  | time_slots | ArrayList<TimeSlot> | *Array List* of TimeSlots |
|  6.  | numberOfCourse | int | Total Number of Courses |

## Getter Functions
1. **getRooms()**: Returns *Array List* of all Rooms
2. **getSubjects()**: Returns *Array List* of all Subjectsto be taught
3. **getTeachers()**: Returns *Array List* of all available Teachers
4. **getCourses()**: Returns *Array List* of all Courses
5. **getTimeSlots()**: Returns *Array List* of all Time Slots
6. **getNumberOfCourse()**: Returns total Number of Courses

## Other Functions
1. **initialize()**: Statically intialize all the above data.