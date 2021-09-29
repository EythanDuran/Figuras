package edu.uaslp.Figuras;

public class PoligonoRegular extends Figura implements FigureWithsides {
    private  int sides;

    public  PoligonoRegular(int sides){
        super("Poligono Regular");
        this.sides=sides;
    }

    public void draw() {
        System.out.println("figura de" + sides + "lados iguales");
    }

    public  int getSideCount(){
        return sides;
    }
}
