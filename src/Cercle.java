public class Cercle implements IForme {
    private double rayon;
    private double aire;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double  calculerAire () {
       return this.aire = (double) (3.14 * this.rayon * this.rayon);
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
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }
}
