
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class firstDuplicateTest {

    private FirstDuplicate sut;

    @Test
    public void emptyArray() {
        int[] array = {};
        sut = new FirstDuplicate(array);
        int result = sut.getDuplicate(array);
        assertEquals(-1, result);
    }

    @Test
    public void twoSameElementArray() {
        int[] array = {3, 3};
        sut = new FirstDuplicate(array);
        int result = sut.getDuplicate(array);
        assertEquals(3, result);
    }

    @Test
    public void twoDifferentElementArray() {
        int[] array = {1, 3};
        sut = new FirstDuplicate(array);
        int result = sut.getDuplicate(array);
        assertEquals(-1, result);
    }

    @Test
    public void onlyOneDuplicateArray() {
        int[] array = {1, 2, 3, 4, 7, 8, 9, 11, 3};
        sut = new FirstDuplicate(array);
        int result = sut.getDuplicate(array);
        assertEquals(3, result);
    }

    @Test
    public void twoDifferentDuplicateArray() {
        int[] array = {1, 2, 4, 3, 1, 3, 7, 9, 8};
        sut = new FirstDuplicate(array);
        int result = sut.getDuplicate(array);
        assertEquals(1, result);
    }

    @Test
    public void SameElementArray() {
        int[] array = {7, 7, 7, 7, 7, 7, 7, 7};
        sut = new FirstDuplicate(array);
        int result = sut.getDuplicate(array);
        assertEquals(7, result);
    }

    @Test
    public void noDuplicateElementArray() {
        int[] array = {1, 3, 7, 2, 77, 123, 665, 43};
        sut = new FirstDuplicate(array);
        int result = sut.getDuplicate(array);
        assertEquals(-1, result);
    }

    @Test
    public void threeDuplicateArray() {
        int[] array = {4, 3, 7, 12, 76, 2, 5, 5, 3, 4};
        sut = new FirstDuplicate(array);
        int result = sut.getDuplicate(array);
        assertEquals(5, result);
    }

}
