package university.mark;

public class Mark {

    //region Properties
    private final int value;
    //endregion

    //region Constructors
    public Mark(int value) {
        this.value = value;
    }
    //endregion

    //region Properties accessors
    public int getValue() {
        return value;
    }
    //endregion

    //region Utility methods
    public void validate() {
        if(value < 0 || value > 10) {
            throw new RuntimeException("Invalid mark");
        }
    }
    //endregion

}
