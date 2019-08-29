import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class yatzyTest {
    @Test
    void checkIfFour() { assertEquals(4, 2+2);}

    @Test
    void shouldCalculateForOnes() {
        assertEquals(0, score("ONES", new int[] { 2, 3, 4, 5, 6 }));
        assertEquals(3, score("ONES", new int[] { 2, 1, 4, 1, 1 }));
        assertEquals(5, score("ONES", new int[] { 1, 1, 1, 1, 1 }));
    }

    private int score(String ones, int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 1) {
                sum += 1;
            }
        }
        return sum;
    }
}
