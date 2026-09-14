package Exam;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class CarTest {
    public static void main(String[] args) {
        // --- 01번 문제 실행 ---
        System.out.println("=== 01번 결과 ===");
        Car myCar = new Car("그랜저");
        Car yourCar = new Car("그랜저");

       
        if (myCar.equals(yourCar)) {
            System.out.println("내 자동차는 [" + myCar.getModel() + "], 너 자동차는 [" + yourCar.getModel() + "]로 모델이 같다.");
        } else {
            System.out.println("내 자동차는 [" + myCar.getModel() + "], 너 자동차는 [" + yourCar.getModel() + "]로 모델이 다르다.");
        }
        
        System.out.println();

        // --- 02번 문제 실행 ---
        System.out.println("=== 02번 결과 ===");
        
 
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        String currentDate = sdf.format(new Date());

        String pattern = "자동차 모델이 둘 다 [{0}]로 동일하다.\n날짜: {1}, 자동차 모델=[{0}], 운전자({2})";
        String driver = "홍길동";
        
      
        String result02 = MessageFormat.format(pattern, myCar.getModel(), currentDate, driver);
        System.out.println(result02);
        
        System.out.println();

        // --- 03번 문제 실행 ---
        System.out.println("=== 03번 결과 (토큰 분할) ===");
        
        String targetStr = "날짜: " + currentDate + ", 자동차 모델=[" + myCar.getModel() + "], 운전자(" + driver + ")";
     
        StringTokenizer st = new StringTokenizer(targetStr, " ,:=[]()");
        
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}