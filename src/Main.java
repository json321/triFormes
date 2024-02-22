import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<IForme> liste = new ArrayList<>();

        IForme a = new Carre(3);
        IForme b = new Cercle(5);
        IForme c = new Rectangle(2,3);
        IForme d = new Triangle(5,2);
        
        liste.add(a);
        liste.add(b);
        liste.add(c);
        liste.add(d);

        Collections.sort(liste);
        

        
    }
}