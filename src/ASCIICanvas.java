public class ASCIICanvas {
    private Forma[] forme;
    private int numeroForme;
    private int larghezza; // Numero di "colonne"
    private int altezza; // Numero di "righe"

    
    public ASCIICanvas(int numeroForme, int larghezza, int altezza, Forma[] forme) {
        this.numeroForme = numeroForme;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.forme = new Forma[numeroForme];
    }
    public void aggiungiForma(Forma f) {
        for (int i=0; i<forme.length; i++) {
            if (forme[i]==null) {
                forme[i]=f;
                break;
            }
        }
    }
    public void rimuoviForma(int indice) {
        forme[indice]=null;
    }
    public void disegna() {
        for (int y=0; y<altezza; y++) {
            for (int x=0; x<larghezza; x++) {
                char carattereDaStampare = ' ';
                for (int i=0; i<forme.length; i++) {
                    if (forme[i]!=null && forme[i].contiene(x, y)) {
                        carattereDaStampare = forme[i].getCarattere();
                    }
                }
                System.out.print(carattereDaStampare);
            }
            System.out.println();
        }
    }
}