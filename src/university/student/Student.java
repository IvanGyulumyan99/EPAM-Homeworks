package university.student;

import university.mark.Mark;
import university.subject.Subject;
import university.utility.ArrayUtils;

public class Student implements Person {

    // Properties
    private final String firstName;

    private final String lastName;

    private StudentMark[] marks;

    // Constructors
    public Student(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Properties accessors
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public StudentMark[] getMarks() {
        return marks;
    }

    public double getAvgMark() {
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i].getMark().getValue();
        }
        return sum / marks.length;
    }

    public void applyMark(Subject subject, Mark mark) {
        mark.validate();
        if (ArrayUtils.isEmptyArray(marks)) {
            marks = new StudentMark[1];
            marks[0] = new StudentMark(subject, mark);
        } else {
            // Create new array with more capacity
            StudentMark[] tempMarks = new StudentMark[marks.length + 1];
            // Copy old marks to new temporary marks array
            System.arraycopy(marks, 0, tempMarks, 0, marks.length);
            // Insert new mark to temp array
            tempMarks[marks.length] = new StudentMark(subject, mark);
            marks = tempMarks;
        }
    }
}
