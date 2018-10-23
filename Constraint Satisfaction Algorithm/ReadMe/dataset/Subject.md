> This java script provides Structure to store information about various Subjects need to be taught.

## Structure Information
| S.No | Var. Name | Data Type | Use |
| ---- | --------- | --------- | --- |
|  1.  |     id    |   String  | Unique Subject Identification |
|  2.  |    name   |   String  | Full Name of the Subject |
|  3.  |  teacher  |  Teacher  | Teacher allocated for the Subject |
|  4.  | lectureTime |   int   | Total Time for Lectures per week (in hrs) |
|  4.  | tutorialTime |   int   | Total Time for Tutorials per week (in hrs) |
|  4.  | practicalTime |   int   | Total Time for Practical Lab per week (in hrs) |
## Getter Functions
1. **getId()**: Returns Id of the Subject
2. **getName()**: Returns Full Name of the Subject
3. **getTeacher()**: Returns Teacher allocated for the Subject
4. **getLectureTime()**: Returns Lecture Time of the Subject
5. **getTutorialTime()**: Returns Tutorial Time of the Subject
6. **getPracticalTime()**: Returns Practical Lab Time of the Subject

## Other Functions
1. **Subject(...)**: Constructor to set Id, Name, Teacher & Time Duration for the Subject
2. **toString()**: Returns Full Name of the Subject
3. **decrementLectureTime**: Decreases Lecture Time by 1 hr (if room alloted)
4. **decrementTutorialTime**: Decreases Tutorial Time by 1 hr (if room alloted)
5. **decrementPracticalTime**: Decreases Practical Lab Time by 1 hr (if room alloted)