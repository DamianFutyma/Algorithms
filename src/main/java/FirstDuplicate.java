
import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 * This method take int[] array 'a' and return first duplicate element. First duplicate number is number which second element
 * has the minimal index.
 * If this array don't have any duplicate elements, return -1.
 */
class FirstDuplicate {

    FirstDuplicate(int[] Array) {
    }

    int getDuplicate(int[] myArray) {
        Set<Integer> mySet = new HashSet<>();
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
