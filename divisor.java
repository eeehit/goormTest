//Please don't change class name 'Main'
import java.util.Scanner;

import java.util.ArrayList;

class Main {

  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int) scan.nextInt();
		double sqrt = Math.sqrt(num);
		
		for (int i=1 ; i<sqrt ; i++) {
			if (num % i == 0) {
				System.out.print(i +  " " + num/i + " ");
			}
		}
		
		if (Math.pow((int)sqrt,2) == num)
			System.out.print((int)sqrt);
		
		return ;
  }
}
