package remoteacess;

import java.util.Scanner;

public class RemoteMain {

	public static void main(String[] args) {
		
		while(true) {
		System.out.println("Remote: 1.BULB 2.FAN 3.AC");
		Scanner sc= new Scanner(System.in);
		int i = sc.nextInt();
		   switch(i){   
		    case 1:
		    	System.out.println("Press 1 to switch on");
		    	System.out.println("Press 2 to switch off");
		    	Scanner sc1= new Scanner(System.in);
				int j = sc1.nextInt();
		    	Bulb b = new Bulb();
		    	b.bulbSwitch(j);
		    	
		    break;  
		    case 2:
		    	System.out.println("Press 1 to switch on");
		    	System.out.println("Press 2 to switch off");
		    	Scanner sc11= new Scanner(System.in);
				int k = sc11.nextInt();
				Fan f = new Fan();
				f.fanSwitch(k);
		    break;  
		    case 3:
		    	System.out.println("Press 1 to switch on");
		    	System.out.println("Press 2 to switch off");
		    	Scanner sc2= new Scanner(System.in);
				int l = sc2.nextInt();
		    	Airconditioner ac = new Airconditioner();
		    	ac.acSwitch(l);
		    break;   
		    } 
		
		}

	}

}
