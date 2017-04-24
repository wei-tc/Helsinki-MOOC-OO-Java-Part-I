// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        int[] test2 = new int[]{5};
        int[] test = {5, 5};
        
        
        int[][] test4 = new int[][]{{1, 2}, {3, 4}};
        int[][] test5 = {{1, 2}, 
                        {3, 4}};
        
        System.out.println(Arrays.toString(test2));
        System.out.println(Arrays.toString(test4));
        System.out.println(Arrays.deepToString(test4));
    }
}
