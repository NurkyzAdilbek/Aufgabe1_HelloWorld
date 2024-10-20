package tuBerlin;

import Prog1Tools.IOTools;

public class Zeitumrechnung {
    public static void main(String[] args) {


        Long sekunden= IOTools.readLong("Geben Sie eine Zeitdauer in Sekunden ein:");
        Long jahr=sekunden/31536000;
//        System.out.println(jahr);

       Long ubrigeSek =sekunden%31536000;
        Long tag= ubrigeSek /86400;
//        System.out.println(tag);

        Long unrigeSek2 = ubrigeSek %86400;
        Long stunde= unrigeSek2 /3600;
//        System.out.println(stunde);

        Long ubrigeSek3 = unrigeSek2 %3600;
        Long minuten= ubrigeSek3 /60;
//        System.out.println(minuten);

        Long ubrigeSek4= ubrigeSek3 %60;
//        System.out.println(ubrigeSek4);


        System.out.println("Das sind: "+ jahr+ " Jahre(n), "+tag + " Tag(e), "+
                stunde+ " Stunde(n), " +minuten+ " Minuten(n), "+ ubrigeSek4+" Sekunde(n). ");
    }
}
