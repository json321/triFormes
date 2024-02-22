public class Carre implements IForme {
    private double cote;
    private double aire;



    public Carre(double cote) {
        this.cote = cote;
    }

    public double  calculerAire () {
        return this.aire = this.cote * this.cote;

    }

    public String speciale() {
        return "Coucou";
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
        return "Carre{" +
                "cote=" + cote +
                '}';
    }
}
