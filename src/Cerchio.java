public class Cerchio implements Forma {
    private double centroX;
    private double centroY;
    private double raggio;
    private char carattere; // da stampare
    
    public Cerchio(double centroX, double centroY, double raggio, char carattere) {
        this.centroX = centroX;
        this.centroY = centroY;
        this.raggio = raggio;
        this.carattere = carattere;
    }

    @Override
    public boolean contiene(double x, double y) {
        double distanza = Math.sqrt(Math.pow(x-this.centroX, 2)+Math.pow(y-this.centroY, 2));
        if (distanza<=raggio) return true;
        else return false;
    }
    @Override
    public char getCarattere() {
        char a='a';
        return a;
    }
    
}