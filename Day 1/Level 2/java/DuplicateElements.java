public class DuplicateElements {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 2, 4, 5, 1};
        System.out.println("Duplicate elements:");

        for(int index = 0; index < numbers.length; index++) {
            for(int count = index + 1; count < numbers.length; count++) {

                if(numbers[index] == numbers[count]) {
                    System.out.println(numbers[index]);
                }
            }
        }
    }
}
