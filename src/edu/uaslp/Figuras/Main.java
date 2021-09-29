package edu.uaslp.Figuras;

import java.awt.event.ItemEvent;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        Rectangulo rectangulo = new Rectangulo();
        PoligonoRegular pr = new PoligonoRegular(5);
        Circulo circulo=new Circulo();

        List<Figura> figureList = new LinkedList();

        figureList.add(cuadrado);
        figureList.add(triangulo);
        figureList.add(rectangulo);
        figureList.add(pr);
        figureList.add(circulo);

        //printItems(figureList);
        printItems2(figureList);
    }

    public static void printItems(List items) {
        for (Object item : items) {

            //((Figura)item.draw()
            if (item instanceof Cuadrado) {
                ((Cuadrado) item).draw();
            } else if (item instanceof Triangulo) {
                ((Triangulo) item).draw();
            } else if (item instanceof Rectangulo) {
                ((Rectangulo) item).draw();
            } else if (item instanceof PoligonoRegular) {
                ((PoligonoRegular) item).draw();
            }
        }
    }

    public static void printItems2(List<Figura> items){
        for(Figura item:items) {
            System.out.println(item.getName()+"----");
          item.draw();
        }
    }
}