package point;

public class dessin {
    rectangle[] rectangles;
    int i;
    public dessin(int taille) {
        rectangles = new rectangle[taille];
        i = 0;
    }
    public void ajouter(rectangle r){
        if (i <= rectangles.length) {
            rectangles[i] = r;
            i++;
        }
    }
    public float somme() {
        float sommeSurfaces = 0;
        for (rectangle tmp : rectangles) {
            if (tmp != null) {
                sommeSurfaces += tmp.calcule_surface();
            }
        }
        return sommeSurfaces;
    }

}
