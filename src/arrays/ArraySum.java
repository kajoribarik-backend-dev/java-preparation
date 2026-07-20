package arrays;

public class ArraySum {

    public static void main(String[] args) {
        float [] number = {10.0f,10.0f,5.0f,2.0f,5.0f};
//        System.out.println(number.length);
        float sum = 0;

        for (int i =0;i < number.length;i++){
                sum += number[i];
        }
        System.out.println("The sum is " + sum);

    }
}
//time complexity O(n)
//space complexity O(1)