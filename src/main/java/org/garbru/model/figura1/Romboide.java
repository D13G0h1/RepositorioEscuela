package org.garbru.model.figura1;

public class Romboide extends Rectangulo {

    public Romboide() {}

    public Romboide(double lado, double altura) {
        super(lado, altura);
    }

    @Override
    public double area() {
        return ladoA * alturaA;
    }

    @Override
    public double perimetro() {
        return ladoA*2 + alturaA*2;
    }

    @Override
    public void leeDatos() {
        super.leeDatos();
    }
}