import java.util.Scanner;
public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,ch;
		System.out.println("Enter the numbers= ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		switch(ch) {
		case 1:
			c=a+b;
			break;
		case 2:
			c=a-b;
			break;
		case 3:
			c=a*b;
			break;
		case 4:
			c=a/b;
			break;
		default:
			System.out.println("invalid choice");
		}
		
		
		

	}

}
