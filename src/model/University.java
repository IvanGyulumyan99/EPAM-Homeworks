package model;

import model.exceptions.NoDepartmentException;

public class University {

    //region Properties
    private final String name;

    private Department[] departments;
    //endregion

    //region Constructors
    public University(final String name, final Department[] departments) {
        validate(departments);
        this.name = name;
        this.departments = departments;
    }
    //endregion

    //region Properties accessors
    public String getName() {
        return name;
    }

    public Department[] getDepartments() {
        return departments;
    }
    //endregion

    //region Public methods
    public double getAvgForSubject(Subject subject) {
        double sum = 0d;
        int counter = 0;
        for (int m = 0; m < departments.length; m++) {
            Group[] groups = departments[m].getGroups();
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
        }
        if (counter == 0) {
            return counter;
        }
        return sum / counter;
    }
    //endregion

    //region Utility methods
    private void validate(Department[] departments) {
        if (ArrayUtils.isEmptyArray(departments)) {
            throw new NoDepartmentException();
        }
    }
    //endregion

}
