package forArithmeticOperations;

import java.util.Scanner;

public class FourArithmeticOperations {
	/**
	 * @param args
	 */
	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		char Symbol[] = {'+','-','*','/'};
		int index=(int) (Math.random()*4);
		//System.out.println(Symbol[index]);
		Integer a=new Integer((int)(1+Math.random()*100));
		Integer b=new Integer((int)(1+Math.random()*100));
		String string=a.toString()+Symbol[index]+b.toString()+"=";
		String result="";
		switch (Symbol[index]) {
		case '+':
			result =new Integer(a+b).toString();
			break;
		case '-':
			result = new Integer(a-b).toString();
			break;
		case '*':
			result = new Integer(a*b).toString();
			break;
		case '/':
			if(a%b!=0) {
				result = a.toString()+'/'+b.toString();
			}
			else {
				result = new Double(a/b).toString();
			}
		default:
			break;
		}
		System.out.print(string);
		Scanner scan = new Scanner(System.in);
		String answer="";
		answer=scan.nextLine();
		if(answer.equals(result))
		{
			System.out.println("ConGratulations! You answer is right!");
		}
		else {
			System.out.println("Sorry");
		}
		
	}

}
