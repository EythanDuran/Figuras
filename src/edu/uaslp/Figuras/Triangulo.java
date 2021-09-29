package edu.uaslp.Figuras;

public class Triangulo extends Figura implements FigureWithsides {

    public Triangulo(){
        super("Triangulo");
    }

    public void draw(){
        System.out.println("Triangulo, 3 lados iguales");
    }

    public  int getSideCount(){
        return 3;
    }
}
