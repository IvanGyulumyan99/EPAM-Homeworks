package model;

public class ArrayUtils {

    //region Constructors
    private ArrayUtils() {
        //empty private constructor
    }
    //endregion

    //region Public methods
    public static boolean isEmptyArray(Object[] array) {
        return array == null || array.length == 0;
    }
    //endregion

}
