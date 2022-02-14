import java.util.ArrayList;
import java.util.Collections;

public class OTPGenerator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        int otp = list.get(0) * 1000 + list.get(1) * 100 + list.get(2) * 10 + list.get(3) ;
        System.out.println("Your OTP is: "+ otp);
    }
}
