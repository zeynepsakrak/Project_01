package Projects_01;

import java.util.Scanner;

public class P05_Sevil {

            /*
        Write a program to find the factorial value of any number entered through the scanner class.

        Example:
        number:7
        factorial:1*2*3*4*5*6*7=5040
        output should be == 5040

        number:6
        factorial:1*2*3*4*5*6=720
        output should be == 720

       */

        /*
        Scanner class aracılığıyla girilen herhangi bir sayının faktöriyel değerini bulmak için bir program yazın.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720


         */
        //      code start here  use int number
        //      kodu burdan başlatın ve int number kullanın
        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            int faktoriyel =1;
            System.out.println("bir sayi giriniz:");
            int sayi= scan.nextInt();
            for (int i = 1; i <=sayi ; i++) {
                faktoriyel *=i;
            }
            System.out.println(sayi + "!= " + faktoriyel);


        }

    }


