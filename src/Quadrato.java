public class Quadrato implements Forma{
    private int lato;
    private char carattere;

    public Quadrato(int lato) {
        this.lato = lato;
    }
    @Override
    public boolean contiene(double x, double y) {
        if (x>=x1 && x<=x2 && y>=y1 && y<=y2) return true;
        else return false;
    }
    @Override
    public char getCarattere(){
        return carattere;
    }
}
