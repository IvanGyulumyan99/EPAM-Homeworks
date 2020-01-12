package university.group;

import university.group.excpetion.NoGroupStudentsException;
import university.student.Student;
import university.student.StudentMark;
import university.subject.Subject;
import university.utility.ArrayUtils;

public class Group {

    // Properties
    private int number;

    private Student[] students;

    private Subject[] subjects;

    // Constructors
    public Group(int number, Student[] students, Subject[] subjects) {
        validate(students);
        this.students = students;
        this.number = number;
        this.subjects = subjects;
    }

    // Properties accessors
    public Student[] getStudents() {
        return students;
    }

    public int getNumber() {
        return number;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    // Public methods
    public double avgForSubject(Subject subject) {
        double sum = 0d;
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            StudentMark[] studentMarks = students[i].getMarks();
            for (int j = 0; j < studentMarks.length; j++) {
                if (studentMarks[j].getSubject().equals(subject)) {
                    count++;
                    sum += studentMarks[j].getMark().getValue();
                }
            }
        }
        if(count == 0) {
            return 0;
        }
        return sum / count;
    }

    // Utility methods
    private void validate(Student[] students) {
        if (ArrayUtils.isEmptyArray(students)) {
            throw new NoGroupStudentsException();
        }
    }
}
