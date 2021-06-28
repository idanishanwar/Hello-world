package remoteacess;

import java.util.Scanner;

public class RemoteRun {

	public static void main(String[] args) {
		
		while(true) {
		Scanner sc= new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("Remote: 1.BULB 2.FAN 3.AC");
		   switch(i){   
		    case 1:
		    	Scanner sc1= new Scanner(System.in);
				int j = sc1.nextInt();
		    	Bulb b = new Bulb();
		    	b.bulbSwitch(j);
		    	
		    break;  
		    case 2:
		    	Scanner sc11= new Scanner(System.in);
				int k = sc11.nextInt();
				Fan f = new Fan();
				f.fanSwitch(k);
		    break;  
		    case 3:
		    	Scanner sc2= new Scanner(System.in);
				int l = sc2.nextInt();
		    	Airconditioner ac = new Airconditioner();
		    	ac.acSwitch(l);
		    break;   
		    } 
		
		}

	}

}
