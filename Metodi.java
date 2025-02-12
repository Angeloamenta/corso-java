// i metodi sono delle funzioni che possono essere chiamate in qualsiasi punto del programma

public class Metodi {
    public static void main(String[]args) {
        faiPasta();
        saluta("Mario");
    }

    static void faiPasta() {
        // void signigica che il metodo non restituisce nulla
        System.out.println("Fai la pasta");
    }

    // parametri dei metodi
    // i parametri sono dei dati in entrata che il metodo può ricevere
    static void saluta(String nome) {
        System.out.println("Ciao " + nome);
    }

    // i metodi possono restituire un valore
    static int somma(int a, int b) {
        return a + b;
    }
}
