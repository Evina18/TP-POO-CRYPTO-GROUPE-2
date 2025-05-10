public class MainRectangle {

public static void main(String[] arg){


    Rectangle r = new Rectangle(10,8,new Point(2,6));
            System.out.println("La surface du rectangle r est : " + r.surface());
            r.translate(2,1);
            System.out.println("Coordonnees actuel: x = " + r.downleft.getX() +"y = " + r.downleft.getY());

            Rectangle rect= new Rectangle(14,16,new Point(12,21));
            System.out.println("La surface du rectangle r est : " + rect.surface());
            Point p1 = new Point (2,1);
            boolean bol = rect.contain(p1);
            System.out.println(bol);
            System.out.println(rect.contains(rect));// 
            boolean bol1 = r.SameAs( r,rect);
       
           System.out.println(bol);// resultat du test de l'egalite de deux rectangles
           System.out.println("....................................................");
           Point p = new Point(1,2); 
            Rectangle r = new Rectangle(p, 2, 3); 
            Rectangle t = new SlantedRectangle(p, 2, 3); 
            SlantedRectangle s = new SlantedRectangle(p, 2, 3); 
            System.out.println(r.surface()); 
            r.rotate(2); 
            System.out.println(r.contains(p)); 
            System.out.println(t.surface()); 
            t.rotate(2); 
            System.out.println(t.contains(p)); 
            System.out.println(s.surface()); 
            s.rotate(2); 
            System.out.println(s.contains(p)); 
}



}

