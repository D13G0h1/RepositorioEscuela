package org.alandoc.model.figura.figura2;

import org.alandoc.model.figura.Cuadrado;
import org.alandoc.util.ReadUtil;
import org.alandoc.vista.Menu;

public class Rectangulo extends Cuadrado {
    public Rectangulo()
    {}
    private double altura;

    public Rectangulo(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return lado*altura;
    }

    @Override
    public double perimetro() {
        return (2*lado)+(2*altura);
    }

    @Override
    public void leeDatos() {
        super.leeDatos();
        Menu.leeAltura( );
        altura = ReadUtil.readDouble();
    }

    @Override
    public double getLado() {
        return super.getLado();
    }

    @Override
    public void setLado(double lado) {
        super.setLado(lado);
    }
}
