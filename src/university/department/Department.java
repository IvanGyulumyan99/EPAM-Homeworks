package university.department;

import university.department.excpetion.NoGroupException;
import university.group.Group;
import university.student.Student;
import university.student.StudentMark;
import university.subject.Subject;
import university.utility.ArrayUtils;

public class Department {

    // Properties
    private String name;

    private Group[] groups;

    // Constructors
    public Department(String name, Group[] groups) {
        validate(groups);
        this.name = name;
        this.groups = groups;
    }

    // Properties accessors
    public String getName() {
        return name;
    }

    public Group[] getGroups() {
        return groups;
    }

    public double getAvgForSubject(Subject subject) {
        double sum = 0d;
        int counter = 0;
        for (int i = 0; i < groups.length; i++) {
            Student[] groupStudents = groups[i].getStudents();
            for (int j = 0; j < groupStudents.length; j++) {
                StudentMark[] studentMarks = groupStudents[j].getMarks();
                for (int k = 0; k < studentMarks.length; k++) {
                    if (studentMarks[k].getSubject().equals(subject)) {
                        sum += studentMarks[k].getMark().getValue();
                        counter++;
                    }
                }
            }
        }
        if (counter == 0) {
            return counter;
        }
        return sum / counter;
    }

    // Utility methods
    private void validate(Group[] groups) {
        if (ArrayUtils.isEmptyArray(groups)) {
            throw new NoGroupException();
        }
    }

    public void addGroup(Group group) {
        //todo add groups
    }
}
