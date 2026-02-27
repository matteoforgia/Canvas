public class Rettangolo implements Forma{
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private char carattere; // da stampare
    
    public Rettangolo(double x1, double y1, double x2, double y2, char carattere) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.carattere = carattere;
    }

    @Override
    public boolean contiene(double x, double y) {
        if (x>=x1 && x<=x2 && y>=y1 && y<=y2) return true;
        else return false;
    }
    @Override
    public char getCarattere() {
        char a='#';
        return a;
    }    

}
