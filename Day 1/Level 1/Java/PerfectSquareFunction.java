import java.util.ArrayList;
public class PerfectSquareFunction {

    public static void main(String[] args) {

        int[] numbers = {4, 7, 9, 10, 16, 18};

        System.out.println(findPerfectSquares(numbers));
    }

    public static ArrayList<Integer> findPerfectSquares(int[] numbers) {

        ArrayList<Integer> perfectSquares = new ArrayList<>();

        for(int index = 0; index < numbers.length; index++) {

            double squareRoot = Math.sqrt(numbers[index]);

            if(squareRoot == (int)squareRoot) {

                perfectSquares.add(numbers[index]);
            }
        }

        return perfectSquares;
    }
}
