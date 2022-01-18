package Racunalnistvo.java.osnove;
public class sqrt2 {
    public static void main(String[] args) {
        double sum = 1.0, x = 1, y = 1, tmp, i = 0;
        do {
            tmp = x+y;
            x = y+tmp;
            y = tmp;
            sum = x/y;
            System.out.println("sqrt(2) = " + sum);
            i++;
        } while (i < 12);
        
    }
}
