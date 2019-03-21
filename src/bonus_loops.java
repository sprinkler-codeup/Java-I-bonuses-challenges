import java.util.Scanner;


public class bonus_loops {
    public static void main(String[] args) {

//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is little Jimmy's grade (from 0 to 100)?");
        String userString2 = scanner.next();
        int userNumber =  Integer.parseInt(userString2);
        String grade;
        if (userNumber >= 98) {
            grade = "A+";
            System.out.println(grade);
        }
        else if (userNumber >= 92 && userNumber <= 97) {
            grade = "A";
            System.out.println(grade);
        }
        else if (userNumber >= 88 && userNumber <= 91) {
            grade = "A-";
            System.out.println(grade);
        }else if (userNumber >= 86 && userNumber <= 87) {
            grade = "B+";
            System.out.println(grade);
        }else if (userNumber >= 83 && userNumber <= 85) {
            grade = "B";
            System.out.println(grade);
        }else if (userNumber >= 80 && userNumber <= 82) {
            grade = "B-";
            System.out.println(grade);
        }else if (userNumber >= 77 && userNumber <= 79) {
            grade = "C+";
            System.out.println(grade);
        }
        else if (userNumber >= 70 && userNumber <= 76) {
            grade = "C";
            System.out.println(grade);
        }
        else if (userNumber >= 67 && userNumber <= 69) {
            grade = "C-";
            System.out.println(grade);
        }
        else if (userNumber >= 60 && userNumber <= 66) {
            grade = "D";
            System.out.println(grade);
        }
        else if (userNumber >= 0 && userNumber <= 59) {
            grade = "F";
            System.out.println(grade);
        }
    }
}
