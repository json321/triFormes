public class Triangle implements IForme {
    private double base;
    private double hauteur;
    private double aire;

    public Triangle(double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public double  calculerAire () {
       return this.aire = this.base * this.hauteur / 2;
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
        return "Triangle{" +
                "base=" + base +
                ", hauteur=" + hauteur +
                '}';
    }
}
