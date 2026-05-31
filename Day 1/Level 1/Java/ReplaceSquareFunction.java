public class ReplaceSquareFunction {

    public static void main(String[] args) {

        int[] numbers = {4, 7, 9, 10, 49, 6};

        replaceNonPerfectSquares(numbers);

        for(int index = 0; index < numbers.length; index++) {

            System.out.print(numbers[index] + " ");
        }
    }

    public static void replaceNonPerfectSquares(int[] numbers) {

        for(int index = 0; index < numbers.length; index++) {

            double squareRoot = Math.sqrt(numbers[index]);

            if(squareRoot != (int)squareRoot) {

                numbers[index] = -1;
            }
        }
    }
}
