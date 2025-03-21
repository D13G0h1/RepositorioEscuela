package org.alandoc.model.figura;

import org.alandoc.util.ReadUtil;
import org.alandoc.vista.Menu;

public class Circulo extends Figura{
    public Circulo() {
    }
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return 3.14*radio*radio;
    }

    @Override
    public double perimetro() {
        return 3.14*2*radio;
    }

    @Override
    public void leeDatos() {
        Menu.leeRadio( );
        radio = ReadUtil.readDouble();
    }
}
