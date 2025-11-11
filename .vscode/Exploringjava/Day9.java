//parameter using the method  If, Else
public class Day9 {

    // Method with two parameters: name and grade
    static void checkGrade(String studentName, int grade) {

        if (grade >= 75) {
            System.out.println(studentName + ", you passed! Your grade is: " + grade);
        } else {
            System.out.println(studentName + ", you failed. Your grade is: " + grade);
        }

    }

    public static void main(String[] args) {
        
        checkGrade("Darb", 82);  
        checkGrade("Rey", 60);
        checkGrade("mart", 90);
        checkGrade("sup", 70);
    }
}

// public class Day9 {
//     static void myAge(int age){
//         if (age < 18) {
//             System.out.println("Access denied, you are not old enough!");
//         } else {
//             System.out.println("Access granted, you are old enough!");


//         }
//     }
//     public static void main(String[] args) {
    
//         myAge(15);
//     }
// }
    