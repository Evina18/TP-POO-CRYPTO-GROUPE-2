public class SlantedRectangle extends Rectangle {

    private double angle;

    // Constructeur prenant deux points et un angle
    public SlantedRectangle(Point p1, Point p2, double angle) {
        super(p1, p2);
        this.angle = angle;
    }

    // Constructeur prenant une longueur, une largeur, un point et un angle
    public SlantedRectangle(double L, double l, Point p1, double angle) {
        super(L, l, p1);
        this.angle = angle;
    }

    // Méthode rotate qui modifie l'angle
    public void rotate(double NewAngle) {
        this.angle = (this.angle + NewAngle) % 360;
    }

    // Redéfinition des méthodes en appelant celles de la classe mère
    @Override
    public double surface() {
        return super.surface();
    }

    @Override
    public boolean contain(Point p1) {
        return super.contain(p1);
    }

    @Override
    public boolean contains(Rectangle r) {
        return super.contains(r);
    }

    public boolean SameAs(Rectangle r1, Rectangle r2) {
        return super.SameAs(r1, r2)&& r1.angle == r2.angle;
        ;
    }

//si l'on veut que l'affichage inclue l'angle d'inclinaison spécifique aux rectangles inclinés. Voici une redéfinition adaptée :
@Override
public String toString() {
    return super.toString() + ", angle=" + angle + "°]";
}
 