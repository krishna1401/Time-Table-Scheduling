> This java script provides Structure to store information about the available Courses.

## Structure Information
| S.No | Var. Name | Data Type | Use |
| ---- | --------- | --------- | --- |
|  1.  |     id    |   String  | Unique Course Identification |
|  2.  |    name   |   String  | Full Name of the Course |
|  3.  |  subjects | ArrayList<Subject> | *Array List* of Subjects taught in a particular Course |
|  4.  |  maxNumofStudents | int | Maximum Strength of Students in the Course |  

## Getter Functions
1. **getId()**: Returns Id of the Course
2. **getName()**: Returns Full Name of the Course
3. **getSubjects()**: Returns *Array List* of all Subjects in the Course
4. **getMaxNumOfStudents()**: Returns Maximum Number of Students in the Course

## Other Functions
1. **Course(...)**: Constructor to set Id, Name, Subjects & Maximum Number of Students
2. **toString()**: Returns Full Name of the Course