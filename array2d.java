public class array2d {
    public static void main(String[]args) {
        String[][] classi = new String[3][3];
        classi[0][0] = "Luca";
        classi[0][1] = "marco";
        classi[0][2] = "anna";

        classi[1][0] = "pippo";
        classi[1][1] = "pluto";
        classi[1][2] = "paperino";

        classi[2][0] = "topolino";
        classi[2][1] = "minnie";
        classi[2][2] = "qui";


        for (int i = 0; i < classi.length; i++) {
            System.out.println(" classe " + i);
            for (int j = 0; j < classi[i].length; j++) {
                System.out.print(classi[i][j] + " ");

                
            }
            System.out.println("");
        }


        for (String[] classe : classi) {
            System.out.println("classe" + classe);
            for (String studente : classe) {
                System.out.print(studente + " ");
            }
        }
    }
}



