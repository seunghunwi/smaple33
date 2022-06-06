import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        int i = 50000; // 화폐 단위를 저장할 변수(총 10가지)

        int sw = 0; //단위를 바꿔줄 때 사용할 변수
        int money = 0;// 계산될 금액이 저장될 변수
        int cnt; // 계산된 매수를 저장할 변수

        Scanner sc = new Scanner(System.in);
        try {

            while (true) {
                System.out.print("금액을 입렵하세요 : ");
                money = sc.nextInt();

                if (money < 10000) {
                    System.out.println("10000원 이상 입력해야 합니다.");
      z          }
                break;
            }
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력해야 합니다.");
        }
        sc.close();

        for (int j = 0; j < 10; j++) {

            cnt = money / i;

            System.out.println(i + "원 권" + cnt + "매");

            money = money - (cnt * i);

            if (sw == 0) {
                i = i / 5;
                sw = 1;

            } else {
                i = i / 2;
                sw = 0;

            }
        }
    }
}






