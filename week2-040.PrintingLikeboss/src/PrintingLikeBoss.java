public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        int j = size - 1;
        
        while (i <= size) {
            printWhitespaces(j);
            printStars(i);
            j--;
            i++;
        }
    }

    public static void xmasTree(int height) {
        int branch = 1; 
        int trunk = 0;
        int starAmount = 1;
        int spaceAmount = height - 1;
        
        while (branch <= height) {
            printWhitespaces(spaceAmount);
            printStars(starAmount);
            spaceAmount--;
            starAmount += 2;
            branch++;
        }
        while (trunk < 2) {
            printWhitespaces(height - 2);
            printStars(3);
            trunk++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
