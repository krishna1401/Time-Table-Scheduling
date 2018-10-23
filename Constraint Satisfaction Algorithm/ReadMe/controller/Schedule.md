> This java script creates a Schedule for each Course based on Constraint Satisfaction

## Constraints
1. Course Strength should be less than or equal to Room Capacity
2. Same Teacher should not be allocated two Classes at same Time Slot
3. Two courses should not have class in same Room at same Time Slot

## Getter Functions
1. **getTimeTable()**: Returns *Array List* of all Time Tables created
2. **getClasses()**: Returns *Array List* of all Classes assigned
3. **getSchedule()**: Finds possibility of Schedule and Returns **true** or **false** *(Total Time Duration of All Subjects <= Total Available Time)*

## Other Functions
1. **Schedule(...)**: Constructor to initialize Time Tables
2. **roomAvailability(...)**: Returns Room for a Course at particular Time Slot *(if any)* by Constraint 1
3. **getRoomById(...)**: Returns Room instance based on the Id specified *(if any)*
4. **subjectAvailability(...)**: Returns Subject to be taught to the Course at particular Time Slot *(if any)* by Constraint 3
5. **teacherAvailability()**: Validates Constraint 2 for before assigning a Subject

## constraintSatisfaction()
This function is responsible for creating a schedule for all the courses. The basic Constraint Satisfaction Algorithm is:
1. for each Time Slots:
2. for each courses:
3. Find a Room, Subject & Teacher *based of Constraints* for the Course in a given Time Slot
4. if not found: place *NoClass* for the Course in a given Time Slot
5. Add Class details to the Time Table of the Course
6. end for
7. end for 