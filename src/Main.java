import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ASCIICanvas arr = new ASCIICanvas(5, 80, 80);
        Cerchio c = new Cerchio(12, 24, 8, '.');
        arr.aggiungiForma(c);
        arr.disegna();
        Rettangolo r = new Rettangolo(6, 12, 19, 25, '#');
        arr.aggiungiForma(r);
        arr.disegna();
    }
}
