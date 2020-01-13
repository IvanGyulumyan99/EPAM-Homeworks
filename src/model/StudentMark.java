package model;

import model.Mark;
import model.Subject;

public class StudentMark {
    //region Properties
    private Subject subject;

    private Mark mark;

    //endregion

    //region Constructors
    public StudentMark(Subject subject, Mark mark) {
        this.subject = subject;
        this.mark = mark;
    }

    //endregion

    //region Properties accessors
    public Subject getSubject() {
        return subject;
    }

    public Mark getMark() {
        return mark;
    }
    //endregion

}
