package point;

public class rectangle {
    Point inf_d;
    Point sup_g;
    static int nbr=0;
    rectangle(float x1, float y1, float x2, float y2){
        this.inf_d =new Point(x1, y2);
        this.sup_g =new Point(x2, y1);
        nbr++;
    }
    rectangle(Point inf_d, Point sup_g){
        this.inf_d=new Point(inf_d.getX(),sup_g.getY());
        this.sup_g=new Point(sup_g.getX(),inf_d.getY());
        nbr++;
    }
    public Point getinf_d() {
        return inf_d;
    }

    public Point getsup_g() {
        return sup_g;
    }
    public static int getNbr() {
        return nbr;
    }
    public float calcule_longueur() {
        return Math.abs(sup_g.getX() - inf_d.getX());
    }
    public float calcule_largeur() {
        return Math.abs(sup_g.getY() - inf_d.getY());
    }
    public float calcule_surface() {
        float largeur = calcule_largeur();
        float longueur = calcule_longueur();
        return largeur * longueur;
    }
}
