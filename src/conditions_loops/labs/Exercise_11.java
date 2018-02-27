package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 11: Nested for loop
 *
 *      Use a nested for loop to generate a multiplication table for numbers 1-10.
 *      The output should look something like this:
 *
 *      1 |2 |3 |4 |5 |6 |7 |8 |9 |10 |
 *      2 |4 |6 |8 |10|12|14|16|18|20 |
 *      3 |6 |9 |12|15|18|21|24|27|30 |
 *      4 |8 |12|16|20|24|28|32|36|40 |
 *      5 |10|15|20|25|30|35|40|45|50 |
 *      6 |12|18|24|30|36|42|48|54|60 |
 *      7 |14|21|28|35|42|49|56|63|70 |
 *      8 |16|24|32|40|48|56|64|72|80 |
 *      9 |18|27|36|45|54|63|72|81|90 |
 *      10|20|30|40|50|60|70|80|90|100|
 *
 */

public class Exercise_11 {
    public static void main (String[]args){
        int a = 1;
        for(;a<=10;a++){
            System.out.print(a + " |");
            if (a==10){
                System.out.println();
            }
        }

        for(a=1;a<=20;a++){
            if(a%2==0 && a<10) {
                System.out.print(a + " |");
            }
            if (a%2==0 && a>=10 && a<20){
                System.out.print(a + "|");
            }
            if (a%2==0 && a>=20){
                System.out.println(a + " |");
            }

        }
        for(a=1;a<=30;a++){
            if(a%3==0 && a<10) {
                System.out.print(a + " |");
            }
            if (a%3==0 && a>=10 && a<30){
                System.out.print(a + "|");
            }
            if (a%3==0 && a>=30){
                System.out.println(a + " |");
            }

        }
        for(a=1;a<=40;a++){
            if(a%4==0 && a<10) {
                System.out.print(a + " |");
            }
            if (a%4==0 && a>=10 && a<40){
                System.out.print(a + "|");
            }
            if (a%4==0 && a>=40){
                System.out.println(a + " |");
            }

        }
        for(a=1;a<=50;a++){
            if(a%5==0 && a<10) {
                System.out.print(a + " |");
            }
            if (a%5==0 && a>=10 && a<50){
                System.out.print(a + "|");
            }
            if (a%5==0 && a>=50){
                System.out.println(a + " |");
            }

        }
        for(a=1;a<=60;a++){
            if(a%6==0 && a<10) {
                System.out.print(a + " |");
            }
            if (a%6==0 && a>=10 && a<60){
                System.out.print(a + "|");
            }
            if (a%6==0 && a>=60){
                System.out.println(a + " |");
            }

        }
        for(a=1;a<=70;a++){
            if(a%7==0 && a<10) {
                System.out.print(a + " |");
            }
            if (a%7==0 && a>=10 && a<70){
                System.out.print(a + "|");
            }
            if (a%7==0 && a>=70){
                System.out.println(a + " |");
            }

        }
        for(a=1;a<=80;a++){
            if(a%8==0 && a<10) {
                System.out.print(a + " |");
            }
            if (a%8==0 && a>=10 && a<80){
                System.out.print(a + "|");
            }
            if (a%8==0 && a>=80){
                System.out.println(a + " |");
            }

        }
        for(a=1;a<=90;a++){
            if(a%9==0 && a<10) {
                System.out.print(a + " |");
            }
            if (a%9==0 && a>=10 && a<90){
                System.out.print(a + "|");
            }
            if (a%9==0 && a>=90){
                System.out.println(a + " |");
            }

        }
        for(a=1;a<=100;a++){

            if (a%10==0){
                System.out.print(a + "|");
            }
        }


    }
}
