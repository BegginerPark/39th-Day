import java.util.*;

public class TernaryQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = (a == 1) ? "st" : 
                (a == 2) ? "nd" : 
                (a == 3) ? "rd" : "th";

        System.out.println("input number: ");
        System.out.println(b);
    }
}


// python 에서는 (조건) and "A" or "F"
// "A" if(조건) else "F"