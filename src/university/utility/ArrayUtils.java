package university.utility;

public class ArrayUtils {

    // Constructors
    private ArrayUtils() {
        //empty private constructor
    }

    // Public methods
    public static boolean isEmptyArray(Object[] array) {
        return array == null || array.length == 0;
    }

}
