/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package point;

/**
 *
 * @author FAROUK
 */

public class Point {
    private float x;
    private float y;
    public Point() {
        
    }
    
     public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
   
     public void ajoute() {
        this.x += 2;
        this.y += 4;
    }
      public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
   
    /**
     * @param args the command line arguments
     */
    
    
}
