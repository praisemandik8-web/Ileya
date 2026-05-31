import java.util.ArrayList;
public class EvenoddSplit{

    public static void main(String[] args) {

        int[] numbers = {45, 60, 3, 10, 9, 22};

        ArrayList<Integer> oddNumbers = new ArrayList<>();

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for(int index = 0; index < numbers.length; index++) {

            int currentNumber = numbers[index];

            if(currentNumber % 2 == 0) {

                evenNumbers.add(currentNumber);

            } 
            else {

                oddNumbers.add(currentNumber);
            }
        }

        System.out.println("Odd numbers: " + oddNumbers);

        System.out.println("Even numbers: " + evenNumbers);
    }
}
