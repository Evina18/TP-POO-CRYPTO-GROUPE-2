public class Dessin {
    private Rectangle[] rectangles; // Tableau de rectangles
    private int nombre; // Nombre actuel de rectangles dans le dessin

    // Constructeur : fixe la taille du tableau
    public Dessin(int taille) {
        if (taille <= 0) {
            throw new IllegalArgumentException("La taille du dessin doit être positive.");
        }
        this.rectangles = new Rectangle[taille];
        this.nombre = 0; // Aucun rectangle au départ
    }

    // Méthode pour ajouter un rectangle
    public void add(Rectangle rectangle) {
        if (nombre >= rectangles.length) {
            throw new IllegalStateException("Le dessin est plein, impossible d'ajouter un rectangle.");
        }
        rectangles[nombre] = rectangle;
        nombre++;
    }
    // Méthode pour calculer la surface totale des rectangles
    public int surface() {
        int totalSurface = 0;
        for (int i = 0; i < nombre; i++) {
            totalSurface += rectangles[i].getSurface();
        }
        return totalSurface;
    }

    // Méthode pour translater tous les rectangles du dessin
    public void translate(int dx, int dy) {
        for (int i = 0; i < count; i++) {
            rectangles[i].translate(dx, dy);
        }
    }



}



