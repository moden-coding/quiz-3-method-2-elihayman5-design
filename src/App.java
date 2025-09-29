/**
 * Given:
 * A pre-written method called computePerimeter and a main method for testing.
 *
 * Note:
 * You will modify computePerimeter() over the course of this quiz. Completing task 2 may cause task 1
 * to not work any longer. That's OK! Similarly, completing task 3 might cause task 2 to no longer work.
 ##############################################################################################
 * TASK 1:
 * Modify computePerimeter() so it will find the perimeter of a rectangle with width 6 and height 4.
 * Perimeter formula: 2 * (width + height).
 *
 * We can run this like:
 * computePerimeter()
 *
 * STOP HERE FOR: 'B-'
 ##############################################################################################
 * TASK 2:
 * Modify computePerimeter() so that:
 *
 * 1. It accepts two values as parameters (width, height).
 * 2. Computes the perimeter and PRINTS the result (as an int).
 *
 * We can run this like:
 * computePerimeter(5,3)
 * with a print output of: 16 //(5+3)*2 = 16
 *
 * STOP HERE FOR: 'B'
 ##############################################################################################
 * TASK 3:
 * Modify computePerimeter() from task 2 so that:
 *
 * 1. Instead of printing the perimeter, the perimeter is RETURNED to main (as an int).
 *
 * STOP HERE FOR: 'B+'
 ##############################################################################################
 * TASK 4:
 * Modify computePerimeter() from task 3 so that:
 *
 * 1. Negative values for width or height return a value of -1
 * 2. Too large values (greater than 100) for width or height return a value of -1
 *
 * STOP HERE FOR: 'A'
 ##############################################################################################
 * TASK 5:
 * Modify computePerimeter() from task 4 so that:
 * 1. It accepts a third parameter which is a String. This parameter will describe the shape.
 * 2. If the String is "rect", compute 2*(a+b).
 * 3. If the String is "square", compute 4*a (ignore b).
 * 4. For any other string, return -1.
 
 * The method should still return -1 for negative values and for values that are too large.
 * STOP HERE FOR: 'A+'
 */

public class App {

    public static void computePerimeter() {

    }
    public static void main(String[] args) {
        // B- range
        // System.out.println("Task 1:");
        // computePerimeter(); // should PRINT 20

        // B range
        // System.out.println("Task 2:");
        // computePerimeter(5, 3);  // should PRINT 16
        // computePerimeter(10, 2); // should PRINT 24

        // B+ range
        // System.out.println("Task 3:");
        // int p1 = computePerimeter(5, 3);  // expect 16
        // int p2 = computePerimeter(10, 2); // expect 24
        // System.out.println(p1);
        // System.out.println(p2);

        // A range
        // System.out.println("Task 4:");
        // System.out.println(computePerimeter(5, -3));  // -1 (invalid)
        // System.out.println(computePerimeter(100, 100)); // 400 (valid)
        // System.out.println(computePerimeter(101, 1)); // -1 (too large)

        // A+ range
        // System.out.println("Task 5:");
        // System.out.println(computePerimeter("rect", 5, 3));   // 16
        // System.out.println(computePerimeter("square", 7, 0)); // 28
        // System.out.println(computePerimeter("hex", 2, 2));    // -1 (unknown)
        // System.out.println(computePerimeter("rect", -1, 9));  // -1 (invalid)
    }
}


