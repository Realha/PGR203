import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class yatzyTest {
    @Test
    void checkIfFour() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void shouldCalculateForOnes() {
        assertEquals(0, score("ONES", new int[]{2, 3, 4, 5, 6}));
        assertEquals(3, score("ONES", new int[]{2, 1, 4, 1, 1}));
        assertEquals(5, score("ONES", new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    void shouldCalculateForTwos() {
        assertEquals(0, score("TWOS", new int[]{1, 3, 4, 5, 6}));
        assertEquals(4, score("TWOS", new int[]{2, 3, 2, 5, 6}));
        assertEquals(10, score("TWOS", new int[]{2, 2, 2, 2, 2}));
    }

    @Test
    void shouldCalculateForThrees(){
        assertEquals(3, score("THREES", new int[]{5, 6, 3, 2, 1}));
        assertEquals(9, score("THREES", new int[]{3, 3, 6, 3, 5}));
        assertEquals(6, score("THREES", new int[]{3, 6, 2, 4, 3}));
    }

    private int score(String desiredNum, int[] diceRolls) {
        int score = 0;

        for (int diceRoll : diceRolls) {
            switch (desiredNum) {
                case "ONES":
                    if (diceRoll == 1) {
                        score += 1;
                    }
                    break;
                case "TWOS":
                    if (diceRoll == 2)
                        score += 2;
            }
        }
        return score;
    }
}
