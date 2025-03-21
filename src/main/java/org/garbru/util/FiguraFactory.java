package org.garbru.util;

import org.garbru.model.figura1.*;
import org.garbru.model.figura2.Escaleno;
import org.garbru.model.figura2.Isosceles;

public class FiguraFactory
{

    public static Figura getFiguraByFiguraEnum(FiguraEnum figuraEnum )
    {
        switch (figuraEnum)
        {
            case CUADRADO:
                return new Cuadrado( );
            case ESCALENO:
                return new Escaleno( );
            case ISOSCELES:
                return new Isosceles( );
            case EQUILATERO:
                return new Equilatero( );
            case RECTANGULO:
                return new Rectangulo();
            case ROMBIODE:
                return new Romboide( );
            case ROMBO:
                return new Rombo( );
            case TRAPECIO:
                return new Trapecio( );
            case OPCION_ERRONEA:
            case SALIR:
            default:
                return null;
        }
    }
}
