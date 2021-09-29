package edu.uaslp.Figuras;

public class Cuadrado extends Figura implements FigureWithsides {

    public Cuadrado(){
        super("Cuadrado");
    }

    public void draw(){
        System.out.println("Cuadrado, 4 lados iguales");
    }

    public  int getSideCount(){
        return 4;
    }
}
