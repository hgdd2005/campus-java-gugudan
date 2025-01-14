import java.util.Scanner;
import java.io.IOException;

public class View { // 입력및 출력 화면 표시
	public void Screen() {
		while (true) { // 무한 루프로 프로그램 종료 선택까지 재실행
			Scanner scan = new Scanner(System.in);
			System.out.println("원하프로그램을 입력 하십시오 :  (구구단 1, 계산기 2)");
			String num = scan.next();
			if (num.equals("1")) { // 1일시 구구단 프로그램 실행
				System.out.println("구구단 프로그램 입니다.\n");
				System.out.println("원하는 단을 입력하십시오");
				String number = scan.next();
				if (GugudanisInteger(number)) { // 정수 인지 판단후 올바르면 프로그램 실행
					GuGuDan guguDan = new GuGuDan();
					guguDan.setNumber(number);
				}
			} else if (num.equals("2")) {//2일시 계산기 프로그램 실행
				System.out.println("계산기 프로그램입니다.(정수만 가능합니다.)\n");
				System.out.println("첫번째 숫자를 입력 하십시오");
				String number1 = scan.next();
				System.out.println("원하는 공식 하십시오(/,*,-,+)");
				String sign = scan.next();
				System.out.println("두번째 숫자를 입력 하십시오");
				String number2 = scan.next();
				if (CalcultorisInteger2(number1, number2)) { // 입력받은 두 숫자가 정수 인지 판단후 올바르면 프로그램 실행
					Calcultor Calcultor = new Calcultor();
					Calcultor.calculate(number1, sign, number2);//계산기
					System.out.println(number1 + sign + number2+'='+Calcultor.getResult());//입력받은 계산과 값을 출력
				}
			} else { // 프로그램 선택이 올바르지 않을때 출력
				System.out.println("제대로 된 선택을 하지 않으셨습니다.");
			}
			System.out.println("다시 시작하시겠습까? (종료를 원할시 n을 입력하십시오)");
			String check = scan.next();
			Re re = new Re();
			re.retry(check);//프로그램 종료 확인
		}
	}

	public static boolean GugudanisInteger(String judgment) { //구구단 입력한 한 숫자가 정수인지 판단
		try {
			Integer.parseInt(judgment);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("올바른 정수가 아닙니다.");
			return false;
		}
	}

	public static boolean CalcultorisInteger2(String judgment0, String judgment2) { //계산기 입력한 두 숫자가 정수인지 판단
		try {
			Integer.parseInt(judgment0);
			Integer.parseInt(judgment2);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("올바른 숫자가 아닙니다.");
			return false;
		}
	}
}