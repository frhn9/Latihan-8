package InterfaceLatihan;

import java.util.Scanner;
public class MainNumber {
    public static void main(String[] args){
      Scanner fd = new Scanner(System.in);
        
        System.out.print("Input number : ");
        double number = fd.nextDouble();
        
        NumberType frhn = new NumberType();
        if(number%1==0){
            System.out.println((int)number+" "+frhn.methodI1());
        }
        else if(number%1!=0){
            System.out.println(number+" "+frhn.methodD1());
        }
    }
}
