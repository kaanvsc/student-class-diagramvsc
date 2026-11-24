# Student Class Diagram

Java implementation of the student class diagram.

## Classes
- `Person` (name, id): base class
- `Student` extends `Person` (studentNo, enrolledCourses, grades): `enroll()`, `drop()`, `setGrade()`, `calculateGPA()`
- `Course` (code, title, credits)
- `Main`: demo program

## Relationships
- `Student` inherits from `Person`
- `Student` and `Course` have a many-to-many association

## Run
```
javac *.java
java Main
```
## Class Diagram

```mermaid
classDiagram
    Person <|-- Student
    Student "*" -- "*" Course

    class Person {
        -String name
        -int id
        +getName() String
        +getId() int
    }
    class Student {
        -String studentNo
        -List~Course~ enrolledCourses
        +enroll(Course)
        +drop(Course)
        +setGrade(Course, double)
        +calculateGPA() double
    }
    class Course {
        -String code
        -String title
        -int credits
        +getCode() String
        +getTitle() String
        +getCredits() int
    }
```
