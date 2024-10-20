package tuBerlin;

import Prog1Tools.IOTools;

public class Wurzel {
    public static void main(String[] args) {


        int zahl= IOTools.readInt("Gib eine Zahl ein");
        if (zahl<0){
            System.out.println("Gib eine positive Zahl ein ");
        }
        else {
            System.out.println("Gegebene Zahl: "+zahl);
            System.out.println("Die Wurzel aus "+zahl+" ist "+Math.sqrt(zahl));
        }


    }
}
