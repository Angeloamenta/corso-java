// array ridimensionabili accettano solamente reference type e non primitive

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[]args) {

        ArrayList<String> persone = new ArrayList<String>();

        // aggiungere elementi

        persone.add("Mario");
        persone.add("Luigi");
        persone.add("Peach");

        System.out.println(persone.get(0));
        
        for(int i = 0; i < persone.size(); i++) {
            System.out.println(persone.get(i));
        }


        // modificare elementi

        persone.set(0, "Wario");

        // rimuovere elementi

        persone.remove(1);

        // rimuovere tutti gli elementi

        persone.clear();

        
    }
}
