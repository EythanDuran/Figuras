package edu.uaslp.Figuras;

public class Rectangulo extends Figura implements FigureWithsides {

    public Rectangulo(){
        super("Rectangulo");
    }
    public void draw(){
        System.out.println("rectangulo , 4 lados ");
    }

    public  int getSideCount(){
        return 4;
    }
}
