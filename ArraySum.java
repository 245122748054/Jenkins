public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;

        for (int num : numbers) {
            sum += num;  // Adding each element to sum
        }

        System.out.println("The sum of the array elements is: " + sum);
    }
}

