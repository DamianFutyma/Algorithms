import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
/**
 * This method takes two int arrays and integer 'targetValue'.If sum of any two elements
 * ,one from each array, equals targetValue return true. In different situation, return false.
 */
class SumOfTwo {

    SumOfTwo(int[] firstArray, int[] secondArray, int targeValue) {

    }

    boolean sumEqualsTarget(int[] firstArray, int[] secondArray, int v) {
        if (firstArray.length == 0 || secondArray.length == 0) {
            return false;
        }
        Set<Integer> mySet = Arrays.stream(secondArray).boxed().collect(Collectors.toSet());
        int searchingNumber;
        for (int arrayElement : firstArray) {
            searchingNumber = v - arrayElement;
            if (mySet.contains(searchingNumber)) {
                return true;
            }
        }
        return false;
    }
}
