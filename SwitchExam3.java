import java.util.Scanner;
public class SwitchExam3{
	public static void main(String args[]){
		int a = 7;
		switch(a % 3){
		case 0: System.out.println(a + "은(는) 3의 배수입니다.");break;
		case 1:
		case 2: System.out.println(a + "은(는) 3의 배수입니다.");break;
		}
	}
}