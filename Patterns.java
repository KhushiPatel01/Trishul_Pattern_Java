import java.util.Scanner;

class Patterns {
    public static void main(String[] args) {
        for (int i = 1; i <=6; i++) {
            for (int j = 1; j<=7; j++) {
                if((j==i&&j<=3)||(j==8-i&&j>4)||(j==4))
                {
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
