import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = (double)sum(list) / list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        double squaredDifference = 0;
        double mean = average(list);
        for (double number : list) {
            squaredDifference +=  Math.pow((number - mean), 2);
        } 
        
        return squaredDifference / (list.size() - 1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    } 

}
