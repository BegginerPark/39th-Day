import java.util.*;

public class DowhileExam {
    public static void main(String[] args) {
        int value = 0;
        Scanner scan = new Scanner(System.in);

        do {
            value = scan.nextInt();
            System.out.println("input number: " + value);
        } while(value != 10);
        System.out.println("end while!!");
    }    
}
