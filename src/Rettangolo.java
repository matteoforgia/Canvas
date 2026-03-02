public class Rettangolo implements Forma{
    private double a;
    private double b;
    private double c;
    private double d;
    private char carattere; // da stampare
    
    public Rettangolo(double x1, double y1, double x2, double y2, char carattere) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.carattere = carattere;
    }

    @Override
    public boolean contiene(double x, double y) {
        if (x>=x1 && x<=x2 && y>=y1 && y<=y2) return true;
        else return false;
    }
    @Override
    public char getCarattere() {
        return carattere;
    }

}
