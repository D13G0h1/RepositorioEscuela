package org.alandoc.model.figura.figura2;

import org.alandoc.util.ReadUtil;
import org.alandoc.vista.Menu;

public class Hexagono extends Pentagono{
    public Hexagono() {
    }

    public Hexagono(double apotema) {
        super(apotema);
    }

    public Hexagono(double lado, double apotema) {
        super(lado, apotema);
    }

    @Override
    public double area() {
        return ((6*lado)*apotema)/2;
    }

    @Override
    public double perimetro() {
        return lado*6;
    }

    @Override
    public void leeDatos() {
        super.leeDatos();
        Menu.leeApotema( );
        apotema = ReadUtil.readDouble();
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
