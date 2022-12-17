import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

class Pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number Of Rows");
        int R = s.nextInt();
        System.out.println("Enter Number Of Coloumns");
        int C = s.nextInt();

        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                if((j==i&&j<=R/2)||(j==(C+1)/2)||(j==C+1-i&&j>(R+1)/2)){
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}