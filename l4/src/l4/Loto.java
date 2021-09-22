package l4;

import java.util.Scanner;

public class Loto {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int MAX_LOTO = 90;
		final String DANISH_WORD="hoiiis";
		boolean cover[] = new boolean[MAX_LOTO + 1];
		System.out.printf("please tell me how many tickets you have bought %s\n",DANISH_WORD);
		int numberOfTickets = in.nextInt();
		for (int j = 0; j < numberOfTickets; j++) {
			for (int i = 0; i < 6; i++) {
				System.out.printf("what is the %d number in the ticket %s ?\n",i+1,DANISH_WORD);
				int newnumber=in.nextInt();
				cover[newnumber]=true;
			}
		}
		in.close();
		int total=0;
		for (int i = 0; i < cover.length; i++) {
			if(cover[i]) {
				total++;
			}
		}
		System.out.printf("we covered %d numbers out of %d\n",total,MAX_LOTO);
	}

}
