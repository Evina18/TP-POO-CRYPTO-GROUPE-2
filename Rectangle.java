
public class Rectangle
    {
        double longueur ;
        double largeur ;
        Point downleft;
        private static int nbr = 0;
// contructeur qui definit unrectangle a partir de deux longueurs
        Rectangle( Point p1 , Point p2){
            double x1 = p1.getX();
            double y1 = p1.getY();
            double x2 = p2.getX();
            double y2= p2.getY();
            
            this.longueur = Math.abs (y2 -y1);
            this.largeur = Math.abs(x2-x1);
            this.downleft = p1;
            nbr++;

        }
// constructeur qui definit un rectangle a partir de deux longueurs et d'un point
        Rectangle(  double L ,double l,Point p1){

            this.longueur = L ;
            this.largeur= l;
            this.downleft= p1;
            nbr++;

        }
// constructeur qui definit un rectangle a partir de quatre longueur
        Rectangle(double x,double y,double L,double l){

            this.longueur=L;
            this.largeur=l;
            this.downleft=new Point(x,y);
            nbr++;

        }

//methode  qui calcule la surface d'un rectangle
        public double surface (){

            return (this.longueur * this.largeur) ;
        }
//methode qui deplace un rectangle a partir de son point bas gauche
        public void translate (double x1,double x2){
            double newX = this.downleft.getX()+x1;
            double newY = this.downleft.getY()+x2;

            this.downleft= new Point(newX,newY);
            

        }
//methode qui verifie si un point est a l'interieur du rectangle
        public boolean contain (Point p1){
            
        if ((p1.getX() >= downleft.getX()) && (p1.getX()  <= (downleft.getX() + largeur)) && (p1.getY() >= downleft.getY()) && (p1.getY() ) <= (downleft.getY() + longueur))
            return true;
        return false;

        }
// methode qui verifie si un rectangle est contenu dans un autre
        public boolean contains (Rectangle r){

        double x = r.downleft.getX() + r.largeur;
        double y = r.downleft.getY() + r.longueur;
        Point upright = new Point(x,y);

        if ((this.contain(r.downleft)) && (this.contain(upright)))
            return true;
        return false;
        }
// methode qui teste l'egalite en terme de surface  de deux rectangles  
        public boolean SameAs (Rectangle r1,Rectangle r2){

            if ((r1.downleft.getX()==r2.downleft.getx())&& (r1.downleft.getY()==r2.downleft.getY())&& (r1.longueur==r2.longueur)&&(r1.largeur==r2.largeur))
                return true;
            return false;

        }
        public static int getNbr() {
            return nbr;
        } 

        public static Rectangle hull(Rectangle[] rectangles) {
            if (rectangles == null || rectangles.length == 0) {
                throw new IllegalArgumentException("Le tableau de rectangles ne peut pas être vide.");
            }
        
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;
        
            for (Rectangle rect : rectangles) {
                minX = Math.min(minX, rect.x);
                minY = Math.min(minY, rect.y);
                maxX = Math.max(maxX, rect.x + rect.longueur);
                maxY = Math.max(maxY, rect.y + rect.largeur);
            }
        
            return new Rectangle(minX, minY, maxX - minX, maxY - minY);
        }
//La méthode toString() existe déjà dans la classe Object, qui est la classe mère de toutes les classes Java. Étant donné que Rectangle hérite indirectement de Object, cette méthode est donc une redéfinition

        @Override
public String toString() {
    return "Rectangle [x=" + x + ", y=" + y + ", longueur=" +longueur + ", largeur=" + largeur + "]";
}


    }

