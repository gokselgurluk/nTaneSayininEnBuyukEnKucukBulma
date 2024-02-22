import java.util.Scanner;


public class Main {
    public static void main (String[] args){

         int number=0,numInput ,minNumber=0,maxNumber=0,type;

         Scanner userInp = new Scanner(System.in);

         System.out.println("Kaç tane sayı gireceksiniz ?");
         numInput= userInp.nextInt();

         for(int i = 1 ; i <= numInput ;i++){

             System.out.print(i+". Sayıyı giriniz: ");
             number= userInp.nextInt();
             maxNumber=Math.max(maxNumber,number);
             minNumber=Math.min(minNumber,number);
         }


         System.out.println("En büyük sayi: "+maxNumber);
         System.out.println("En küçük sayi: "+minNumber);


     }
}
