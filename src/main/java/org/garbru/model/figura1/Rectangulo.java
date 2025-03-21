package org.garbru.model.figura1;
import org.garbru.util.ReadUtil;
import org.garbru.vista.Menu;

public class Rectangulo extends Cuadrado {

    public Rectangulo() { }

    protected double alturaA;

    public Rectangulo(double ladoA, double alturaA) {
        super(ladoA);
        this.alturaA = alturaA;    }

    public double getAlturaA() { return alturaA; }

    public void setAlturaA(double altura) {this.alturaA = altura;}

    @Override
    public double area() {
        return super.area();    }

    @Override
    public double perimetro() {
        return alturaA * ladoA;    }

    @Override
    public void leeDatos() {
        super.leeDatos();
        Menu.leeAlturaA();
        alturaA = ReadUtil.readInt();    }
}