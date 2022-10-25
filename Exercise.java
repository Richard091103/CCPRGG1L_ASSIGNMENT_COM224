public class App {
    public static void main(String[] args) throws Exception {
  
        char [][] mdArray = {{'P','R','E','Y'}, 
                             {'L','A','V', 'A'}, 
                             {'O','V','E', 'R'}, 
                             {'T', 'E', 'N', 'D'}};
    
  
        // WORD 1
        System.out.println("1. WORD 1");
        
        //Outer loop
        for (int row = 0; row < 1; row++) {
          //Inner loop
          for (int col = 0; col < 4; col++) {
              System.out.print(mdArray[row][col]);
          }
        }
  
        // WORD 2
        System.out.println("");
        System.out.println("2. WORD 2");
        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (row == 2) {
                  System.out.print(mdArray[row][col]);
                } else
                  System.out.print("");  
            }
        }
  
        // WORD 3
        System.out.println("");
        System.out.println("3. WORD 3");
        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (row == 3) {
                  System.out.print(mdArray[row][col]);
                } else
                  System.out.print("");  
            }
        }
        
        // WORD 4
        System.out.println("");
        System.out.println("4. WORD 4");
        
        //Outer loop
        for (int row = 3; row < 4; row++) {
          //Inner loop
          for (int col = 0; col < 4; col++) {
              System.out.print(mdArray[row][col]);
          }
        }
        
        // WORD 5
        System.out.println("");
        System.out.println("5. WORD 5");
        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (col == 0) {
                  System.out.println(mdArray[row][col]);
                } else
                  System.out.print("");  
            }
        }
      
        // WORD 6
        System.out.println("");
        System.out.println("6. WORD 6");
        
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (col == 1) {
                  System.out.println(mdArray[row][col]);
                } else
                  System.out.print("");  
            }
        }
        
        // WORD 7
        System.out.println("");
        System.out.println("7. WORD 7");
  
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (col == 2) {
                  System.out.println(mdArray[row][col]);
                } else
                  System.out.print("");  
            }
        }
        // WORD 8
        System.out.println("");
        System.out.println("8. WORD 8");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (col == 3) {
                  System.out.println(mdArray[row][col]);
                } else
                  System.out.print("");  
            }
        }

        // WORD 9
        System.out.println("");
        System.out.println("9. WORD 9");
        for (int row = 0; row < 4 ; row++) {
            System.out.println(" ");
            // inner loop
            for (int col = 0; col < 4; col++) {
                if (row == 1 && (col == 1 || col == 2)){
                    System.out.print(" ");
                } else if (row == 2 && (col == 1 || col == 2)){
                    System.out.print(" ");
                } else {
                    System.out.print(mdArray[row] [col] );
                }
            }
        }

        // WORD 10
        System.out.println("");
        System.out.println("10. WORD 10");
        for (int row = 0; row < 4 ; row++) {
            System.out.println(" ");
            // inner loop
            for (int col = 0; col < 4; col++) {
                if (row == 0 && (col == 1 || col == 2)){
                    System.out.print(" ");
                } else if (row == 1 && (col == 0 || col == 3)){
                    System.out.print(" ");
                } else if (row == 2 && (col == 0 || col == 3)){
                    System.out.print(" ");
                } else if (row == 3 && (col == 1 || col == 2)){
                    System.out.print(" ");
                } else {
                    System.out.print(mdArray[row][col]);
                }
            }
        }
    }
}
