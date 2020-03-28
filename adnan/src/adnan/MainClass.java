package adnan;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=1;i<10;i++)
		{
			if(a>b)
				System.out.print(a);
			else
				System.out.println(b);
		}
	}

}
