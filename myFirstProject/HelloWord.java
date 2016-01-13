package myFirstProject;

import java.util.*;
import java.math.*;

public class HelloWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello Word!");
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.delete(3, 4);
		System.out.println(sb);
		
		Scanner in = new Scanner(System.in);
		System.out.println("What is you name?");
		
		String name = in.nextLine();
		System.out.println("Hello " + name);
		
		BigDecimal bd = BigDecimal.valueOf(10);
		BigDecimal bd1 = BigDecimal.valueOf(10,2);
		System.out.println(bd + "_" + bd1);		
	}
}
