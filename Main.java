import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int min = list[0];
        int max = list[0];

        for(int i: list) {
            if(i < min) {
                min = i;
            }
            if(i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer: "+ min);
        System.out.println("Maximum Değer: "+ max);

//---------------------------------------------KÜÇÜK VE BÜYÜK EN YAKIN SAYILAR--------------------------------------------------------------------

        int[] arr = {15,12,788,1,-1,-778,2,0};
        int number;

        Arrays.sort(arr);

        int minNumber = arr[0];
        int maxNumber = arr[0];

        System.out.println(Arrays.toString(arr));

        Scanner input = new Scanner(System.in);

        System.out.print("Girilen Sayı: ");
        number = input.nextInt();

        for(int i : arr) {
            if(i < number) {
                if(i > minNumber) {
                    minNumber = i;
                }
            }
                 if(i > number) {
                    if(i > maxNumber) {
                        maxNumber = i;
                        break;
                    }
                } 
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı :"+ minNumber);   
        System.out.println("Girilen sayıdan büyük en yakın sayı :"+ maxNumber);

        
        System.out.println("Closing Scanner...");
        input.close();
        System.out.println("Scanner Closed.");
    }
}