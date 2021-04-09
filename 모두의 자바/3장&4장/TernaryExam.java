import java.util.Calendar;

public class TernaryExam {
    public static void main(String[] args) {
        // int b1 = ( 5 > 4) ? 50 : 40; // true = 50 , false = 40 이 나오게 된다.
        // System.out.println(b1);

        //=============================================================

        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        String ampm;
        ampm = (hour > 12) ? "오후" :  "오전";
        System.out.println("지금 시간은  "+ hour +" 시이고, "+ ampm + " 입니다.");
    }
}

// 삼항 연사자 => if 문과 살짝 비슷하다.