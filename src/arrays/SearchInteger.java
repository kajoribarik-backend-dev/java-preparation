package arrays;

public class SearchInteger {

    public static void main(String[] args) {
        int [] number ={2,6,9,8,3,1};
        int findNumber = 9;
        boolean result = false;
        for (int j : number) {
            if (j == findNumber) {
                result = true;
                break;
            }
        }
        if (result){
            System.out.println("Number is exit!");
        }
        else
            System.out.println("Number is not exit");
    }
}
// time complexity O(n)
//space complexity O(1)