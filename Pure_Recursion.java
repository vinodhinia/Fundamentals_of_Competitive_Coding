/*
*  Homework 09 - Pure Recursion
*
*  Problem: Lattice Paths
*
*  Prompt:  Count the number of unique paths to travel from the top left
*           corder to the bottom right corner of a lattice of M x N squares.
*
*           When moving through the lattice, one can only travel to the adjacent
*           corner on the right or down.
*
*  Input:   m {Integer} - rows of squares
*  Input:   n {Integer} - column of squares
*  Output:  {Integer}
*
*  Example: input: (2, 3)
*
*           (2 x 3 lattice of squares)
*            __ __ __
*           |__|__|__|
*           |__|__|__|
*
*           output: 10 (number of unique paths from top left corner to bottom right)
*
*  Resource: https://projecteuler.net/problem=15
*
*/

// Time Complexity:
// Auxiliary Space Complexity:
class LatticePaths {
  public static int compute(int m, int n) {
    // YOUR WORK HERE
    return computeHelper(m,n,0,0);
  }
  
  public static int computeHelper(int m, int n, int currX,int currY) {
    if(currX ==m-1 && currY==n-1)
      return 1;
    if(currX == m || currY == n)
          return 0;

    return computeHelper(m,n,currX+1,currY) + computeHelper(m,n,currX,currY+1);
  }
}


////////////////////////////////////////////////////////////
///////////////  DO NOT TOUCH TEST BELOW!!!  ///////////////
////////////////////////////////////////////////////////////

// use the Main class to run the test cases
class Main {
  private int[] testCount;

  // an interface to perform tests
  public interface Test {
    public boolean execute();
  }

  public static void main(String[] args) {

    // instantiate the testing of each module by resetting count and printing title of module
    int[] testCount = {0, 0};
    System.out.println("Lattice Paths Tests");

    // tests are in the form as shown
    assertTest(testCount, "should work on example case", new Test() {
      public boolean execute() {
        LatticePaths example = new LatticePaths();
        return example.compute(2, 3) == 10;
      }
    });

    assertTest(testCount, "should return 1 for 0 x 0 lattice", new Test() {
      public boolean execute() {
        LatticePaths example = new LatticePaths();
        return example.compute(0, 0) == 1;
      }
    });

    assertTest(testCount, "should return 2496144 for 13 x 11 lattice", new Test() {
      public boolean execute() {
        LatticePaths example = new LatticePaths();
        return example.compute(13, 11) == 2496144;
      }
    });


    System.out.println("PASSED: " + testCount[0] + " / " + testCount[1] + "\n\n");

  }


  private static void assertTest(int[] count, String name, Test test) {
    String pass = "false";
    count[1]++;

    try {
      if (test.execute()) {
        pass = " true";
        count[0]++;
      }
    } catch(Exception e) {}
    String result = "  " + (count[1] + ")   ").substring(0, 5) + pass + " : " + name;
    System.out.println(result);
  }
}
