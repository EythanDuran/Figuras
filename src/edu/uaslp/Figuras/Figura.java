package edu.uaslp.Figuras;

public abstract class Figura {

    private String name;

    Figura(String name) {
        this.name = name;
    }
       //metodo concreto
        public  String getName() {
            return name;
        }
    //metodo abstracto
    public abstract void draw();
    }




