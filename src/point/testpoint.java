/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package point;

/**
 *
 * @author FAROUK
 */
public class testpoint {
    public static void main(String[] args) {
        Point p1= new Point(3, 5);
        System.out.println("x= "+p1.getX()+" y= "+p1.getY());
        p1.ajoute();
        System.out.println("x+2= "+p1.getX()+" y+4= "+p1.getY());
        rectangle rectangle1 = new rectangle(2, 7, 7, 5);
        rectangle rectangle2 = new rectangle(new Point(2, 7), new Point(7, 5));
        System.out.println("la longueur de rectangle 1 est: " + rectangle1.calcule_longueur());
        System.out.println("la largeur de ractangle 1 est : " + rectangle1.calcule_largeur());
        System.out.println("la longueur de rectangle 2 est: " + rectangle2.calcule_longueur());
        System.out.println("la largeur de ractangle 2 est : " + rectangle2.calcule_largeur());
        System.out.println("la surface de rectangle 2 est: " + rectangle2.calcule_surface());
         System.out.println("le nombre d'objets crees : " + rectangle.getNbr());
         dessin dessin1= new dessin(2);
         dessin1.ajouter(rectangle1);
         dessin1.ajouter(rectangle2);
         System.out.println("la somme des surfaces :"+ dessin1.somme());
    }
}
