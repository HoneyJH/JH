import java.util.Calendar;

public class Calendar01 {
    public static void main(String[] args) {
        Calendar time = Calendar.getInstance();
        System.out.println(time.getTime());

        time.add(Calendar.SECOND, 120); // 2분 뒤 시간을 가져오기
        System.out.println(time.getTime());
    }
}
