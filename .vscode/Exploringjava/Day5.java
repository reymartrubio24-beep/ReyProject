
//  // if\and else statement 

// public class Day5 {
//    public static void main(String[] args) {
//       boolean israining = true;

//       if (israining) {
//             System.out.println("bring your umbrella");

      
//          } else {
//             System.out.println("don't bring your umbrella");
//          }
//             }
//    }


//Nested looops  / multiplication ang gi gamit nga arithmetic operation
 public class Day5 {

   public static void main(String[] args) {

      for (int r = 1; r <= 5; r++){ // outer loop / kanang 5 mao nay row nimo meaning mao nay base nimo 
      for (int m = 1; m <= 5; m++){ // inner loop
           System.out.print(r * m  + "\t"); // e print nimo ang iyang product
      }
        System.out.println();  // para maka add kag line each row
      }
   }
 }  



