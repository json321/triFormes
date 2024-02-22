public class Rectangle implements IForme{
    private double longeur;
    private double largeur;
    private double aire;


    public Rectangle(double longeur, double largeur) {
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public double  calculerAire () {
       return this.aire = this.longeur * this.largeur / 2;

    }
    @Override
    public int compareTo(IForme o) {
        return  (int)(this.aire - o.calculerAire());
    }

    public double getAire() {
        return aire;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longeur=" + longeur +
                ", largeur=" + largeur +
                '}';
    }
}
