package tuBerlin;

import Prog1Tools.IOTools;

import java.util.Scanner;

public class HelloWorldTools {
    public static void main(String[] args) {
//        System.out.println("Geben Sie bitte Ihren Name");
//        Scanner scanner1=new Scanner(System.in);
//        String name=scanner1.nextLine();
//        System.out.println("Hello "+name+"!");

        String name2= IOTools.readLine("Geben Sie bitte Ihren Name");
        System.out.println("Hello "+name2+"!");
    }
}
