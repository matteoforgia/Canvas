public class ASCIICanvas {
    private Forma[] forme;
    private int numeroForme;
    private int larghezza; // Numero di "colonne"
    private int altezza; // Numero di "righe"
    // TODO Fai il costruttore
    
    public ASCIICanvas(int numeroForme, int larghezza, int altezza, Forma[] forme) {
        this.numeroForme = numeroForme;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.forme = new Forma[numeroForme];
    }
    public void aggiungiForma(Forma f) {
    // TODO salva la forma nell'array
        
    }
    public void rimuoviForma(int indice) {
    // TODO rimuovi la forma dall'array
    }
    public void disegna() {
    // TODO implementa
    }
    }