package primitives;

import com.codingshadows.primitives.MatrixSumAndProduct;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixSumAndProductTest {
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;

    @BeforeAll
    public static void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testMain() {
        testWithMatrixSize(2,
                "1 2" + System.lineSeparator() +
                        "3 4" + System.lineSeparator() +
                        "5 6" + System.lineSeparator() +
                        "7 8" + System.lineSeparator(),
                "Sum Matrix:" + System.lineSeparator() +
                        "6 8 " + System.lineSeparator() +
                        "10 12 " + System.lineSeparator() +
                        "Product Matrix:" + System.lineSeparator() +
                        "19 22 " + System.lineSeparator() +
                        "43 50 " + System.lineSeparator());

        testWithMatrixSize(3,
                "1 2 3" + System.lineSeparator() +
                        "4 5 6" + System.lineSeparator() +
                        "7 8 9" + System.lineSeparator() +
                        "10 11 12" + System.lineSeparator() +
                        "13 14 15" + System.lineSeparator() +
                        "16 17 18" + System.lineSeparator(),
                "Sum Matrix:" + System.lineSeparator() +
                        "11 13 15 " + System.lineSeparator() +
                        "17 19 21 " + System.lineSeparator() +
                        "23 25 27 " + System.lineSeparator() +
                        "Product Matrix:" + System.lineSeparator() +
                        "84 90 96 " + System.lineSeparator() +
                        "201 216 231 " + System.lineSeparator() +
                        "318 342 366 " + System.lineSeparator());

        // Add more test cases for other matrix sizes (4, 5, 6, 7) here
        // Fill in the expected results for each case.

        testWithMatrixSize(4,
                "1 2 3 4" + System.lineSeparator() +
                        "5 6 7 8" + System.lineSeparator() +
                        "9 10 11 12" + System.lineSeparator() +
                        "13 14 15 16" + System.lineSeparator() +
                        "17 18 19 20" + System.lineSeparator() +
                        "21 22 23 24" + System.lineSeparator() +
                        "25 26 27 28" + System.lineSeparator() +
                        "29 30 31 32" + System.lineSeparator(),
                "Sum Matrix:" + System.lineSeparator() +
                        "18 20 22 24 " + System.lineSeparator() +
                        "26 28 30 32 " + System.lineSeparator() +
                        "34 36 38 40 " + System.lineSeparator() +
                        "42 44 46 48 " + System.lineSeparator() +
                        "Product Matrix:" + System.lineSeparator() +
                        "250 260 270 280 " + System.lineSeparator() +
                        "618 644 670 696 " + System.lineSeparator() +
                        "986 1028 1070 1112 " + System.lineSeparator() +
                        "1354 1412 1470 1528 " + System.lineSeparator());

        testWithMatrixSize(5,
                "1 2 3 4 5" + System.lineSeparator() +
                        "6 7 8 9 10" + System.lineSeparator() +
                        "11 12 13 14 15" + System.lineSeparator() +
                        "16 17 18 19 20" + System.lineSeparator() +
                        "21 22 23 24 25" + System.lineSeparator() +
                        "26 27 28 29 30" + System.lineSeparator() +
                        "31 32 33 34 35" + System.lineSeparator() +
                        "36 37 38 39 40" + System.lineSeparator() +
                        "41 42 43 44 45" + System.lineSeparator() +
                        "46 47 48 49 50" + System.lineSeparator(),
                "Sum Matrix:" + System.lineSeparator() +
                        "27 29 31 33 35 " + System.lineSeparator() +
                        "37 39 41 43 45 " + System.lineSeparator() +
                        "47 49 51 53 55 " + System.lineSeparator() +
                        "57 59 61 63 65 " + System.lineSeparator() +
                        "67 69 71 73 75 " + System.lineSeparator() +
                        "Product Matrix:" + System.lineSeparator() +
                        "590 605 620 635 650 " + System.lineSeparator() +
                        "1490 1530 1570 1610 1650 " + System.lineSeparator() +
                        "2390 2455 2520 2585 2650 " + System.lineSeparator() +
                        "3290 3380 3470 3560 3650 " + System.lineSeparator() +
                        "4190 4305 4420 4535 4650 " + System.lineSeparator());

        testWithMatrixSize(6,
                "1 2 3 4 5 6" + System.lineSeparator() +
                        "7 8 9 10 11 12" + System.lineSeparator() +
                        "13 14 15 16 17 18" + System.lineSeparator() +
                        "19 20 21 22 23 24" + System.lineSeparator() +
                        "25 26 27 28 29 30" + System.lineSeparator() +
                        "31 32 33 34 35 36" + System.lineSeparator() +
                        "37 38 39 40 41 42" + System.lineSeparator() +
                        "43 44 45 46 47 48" + System.lineSeparator() +
                        "49 50 51 52 53 54" + System.lineSeparator() +
                        "55 56 57 58 59 60" + System.lineSeparator() +
                        "61 62 63 64 65 66" + System.lineSeparator() +
                        "67 68 69 70 71 72" + System.lineSeparator(),
                "Sum Matrix:" + System.lineSeparator() +
                        "38 40 42 44 46 48 " + System.lineSeparator() +
                        "50 52 54 56 58 60 " + System.lineSeparator() +
                        "62 64 66 68 70 72 " + System.lineSeparator() +
                        "74 76 78 80 82 84 " + System.lineSeparator() +
                        "86 88 90 92 94 96 " + System.lineSeparator() +
                        "98 100 102 104 106 108 " + System.lineSeparator() +
                        "Product Matrix:" + System.lineSeparator() +
                        "1197 1218 1239 1260 1281 1302 " + System.lineSeparator() +
                        "3069 3126 3183 3240 3297 3354 " + System.lineSeparator() +
                        "4941 5034 5127 5220 5313 5406 " + System.lineSeparator() +
                        "6813 6942 7071 7200 7329 7458 " + System.lineSeparator() +
                        "8685 8850 9015 9180 9345 9510 " + System.lineSeparator() +
                        "10557 10758 10959 11160 11361 11562 " + System.lineSeparator());

        testWithMatrixSize(7,
                "1 2 3 4 5 6 7" + System.lineSeparator() +
                        "8 9 10 11 12 13 14" + System.lineSeparator() +
                        "15 16 17 18 19 20 21" + System.lineSeparator() +
                        "22 23 24 25 26 27 28" + System.lineSeparator() +
                        "29 30 31 32 33 34 35" + System.lineSeparator() +
                        "36 37 38 39 40 41 42" + System.lineSeparator() +
                        "43 44 45 46 47 48 49" + System.lineSeparator() +
                        "50 51 52 53 54 55 56" + System.lineSeparator() +
                        "57 58 59 60 61 62 63" + System.lineSeparator() +
                        "64 65 66 67 68 69 70" + System.lineSeparator() +
                        "71 72 73 74 75 76 77" + System.lineSeparator() +
                        "78 79 80 81 82 83 84" + System.lineSeparator() +
                        "85 86 87 88 89 90 91" + System.lineSeparator() +
                        "92 93 94 95 96 97 98" + System.lineSeparator(),
                "Sum Matrix:" + System.lineSeparator() +
                        "51 53 55 57 59 61 63 " + System.lineSeparator() +
                        "65 67 69 71 73 75 77 " + System.lineSeparator() +
                        "79 81 83 85 87 89 91 " + System.lineSeparator() +
                        "93 95 97 99 101 103 105 " + System.lineSeparator() +
                        "107 109 111 113 115 117 119 " + System.lineSeparator() +
                        "121 123 125 127 129 131 133 " + System.lineSeparator() +
                        "135 137 139 141 143 145 147 " + System.lineSeparator() +
                        "Product Matrix:" + System.lineSeparator() +
                        "2184 2212 2240 2268 2296 2324 2352 " + System.lineSeparator() +
                        "5663 5740 5817 5894 5971 6048 6125 " + System.lineSeparator() +
                        "9142 9268 9394 9520 9646 9772 9898 " + System.lineSeparator() +
                        "12621 12796 12971 13146 13321 13496 13671 " + System.lineSeparator() +
                        "16100 16324 16548 16772 16996 17220 17444 " + System.lineSeparator() +
                        "19579 19852 20125 20398 20671 20944 21217 " + System.lineSeparator() +
                        "23058 23380 23702 24024 24346 24668 24990 " + System.lineSeparator());
    }

    private void testWithMatrixSize(int size, String inputMatrix, String expectedOutput) {
        String input = size + System.lineSeparator() + inputMatrix;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        MatrixSumAndProduct.main(new String[]{});

        assertEquals(expectedOutput, outContent.toString());
        outContent.reset();
    }

    @AfterAll
    public static void restoreStreams() {
        System.setOut(originalOut);
    }
}

