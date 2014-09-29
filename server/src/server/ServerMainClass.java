

package server;


import java.util.Scanner;

public class ServerMainClass {
	private void sysout() {
		Scanner input = new Scanner(System.in);
		
		int alder;
		int malder;
		int DA;
		
		System.out.println("Skriv din alder her");
		alder = input.nextInt();
		
		System.out.println("Skriv din mors alder her");
		malder = input.nextInt();
		
		DA = alder + malder;
		
		System.out.println("Jeres alder tilsammen er" + DA );
	}
}
