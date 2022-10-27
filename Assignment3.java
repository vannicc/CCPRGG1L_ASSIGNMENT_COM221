public class Assignment3 {
    public static void main(String[] args) {
        int [][] mdArray = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

    // PATTERN 1
    int sum = 0;
    for (int i = 0; i < mdArray.length; i++) {
       sum += mdArray[0][i];
        }

        System.out.println("1. SUM OF PATTERN 1 is " + sum);

    // PATTERN 2
    int sum1 = 0;
    for (int i = 0; i < mdArray.length; i++) {
       sum1 += mdArray[i][0];
        }

        System.out.println(" ");
        System.out.println("2. SUM OF PATTERN 2 is " + sum1);

    // PATTERN 3
    int sum2 = 0;
    for (int row = 0; row < mdArray.length; row++) {
        for (int column = 0; column < mdArray.length; column++) {
            if (row == 0 || column == 0) {
                sum2 += mdArray[row][column];
                }
            }
        }

        System.out.println(" ");
        System.out.println("3. SUM OF PATTERN 3 is " + sum2);

    // PATTERN 4
    int sum3 = 0;
    for (int row = 0; row < mdArray.length; row++) {
        for (int column = 0; column < mdArray.length; column++) {
            if (row == 0 && column == 0 || (row == 3 && column == 3) || 
                row == 3 && column == 0 || (row == 0 && column == 3)) {
                    sum3 += mdArray[row][column];
                }
            }
        }

        System.out.println(" ");
        System.out.println("4. SUM OF PATTERN 4 is " + sum3);

    // PATTERN 5
    int sum4 = 0;
    for (int row = 0; row < mdArray.length; row++) {
        for (int column = 0; column < mdArray.length; column++) {
            if (row == 1 && (column > 0 && column < 3) || (row == 2 && (column > 0 && column < 3))) {
                    sum4 += mdArray[row][column];
                }
            }
        }

        System.out.println(" ");
        System.out.println("5. SUM OF PATTERN 5 is " + sum4);

    // PATTERN 6
    int sum5 = 0;
    for (int row = 0; row < mdArray.length; row++) {
        for (int column = 0; column < mdArray.length; column++) {
            if (row == 0 && column == 0 || (row == 3 && column == 3) || row == 3 && column == 0 || (row == 0 && column == 3) || 
            (row == 1 && (column > 0 && column < 3) || (row == 2 && (column > 0 && column < 3)))) {
                    sum5 += mdArray[row][column];
                }
            }
        }

        System.out.println(" ");
        System.out.println("6. SUM OF PATTERN 6 is " + sum5);

    }

}
