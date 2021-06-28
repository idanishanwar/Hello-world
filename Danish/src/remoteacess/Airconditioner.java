package remoteacess;

import java.util.Scanner;

public class Airconditioner {
	
	void acSwitch(int m) {
		if(m==1) {
		System.out.println("AC is turned on");
		System.out.println("Press 1 to increase temprature");
		System.out.println("Press 2 to decrease temprature");
		Scanner s= new Scanner(System.in);
		int j = s.nextInt();
			if(j==1)
				System.out.println("Temprature increased");
			else if(j==2)
				System.out.println("Temprature decreased");
	
		}
	    else if(m==2)
		    System.out.println("AC is turned off");
	}
	

}
