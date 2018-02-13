import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 * This method take int[] array 'a' and return first duplicate element. If this array don't have
 * any duplicate elements, return -1.
 */
public class firstDuplicate {

    public static void main(String[] args) {

    }

    private int findFirstDuplicate(int[] myArray) {
        Set<Integer> mySet = new HashSet<Integer>();
        for (int singleElement : myArray) {
            int currentSetSize = mySet.size();
            mySet.add(singleElement);
            if (currentSetSize == mySet.size()) {
                return singleElement;
            }
        }
        return -1;
    }
}
