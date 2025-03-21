package org.garbru.inicio;
//https://docs.oracle.com/javase/8/docs/api/javax/swing/JFrame.html

import org.garbru.historial.Historia;
import org.garbru.model.figura1.TipoEjecutable;
import org.garbru.util.ReadUtil;
import org.garbru.vista.Menu;
import org.gerdoc.historial.Historiales;
import org.gerdoc.vista.Ejecutable;

public class Inicio {


    public Inicio() {    }

    public static void main(String[] args)
    {
        boolean flag = true;
        int opcion = 0;
        TipoEjecutable tipoEjecutable = null;
        Historiales historiales = null;
        Ejecutable ejecutable = null;
        historiales = Historia.getInstance( );

        while( flag )
        {
            Menu.principal2( );
            Menu.seleccionaOpcion( );
            opcion = ReadUtil.readInt( );
            tipoEjecutable = TipoEjecutable.getTipoEjecutableById( opcion );
            if( TipoEjecutable.SALIR.equals( tipoEjecutable ) )
            {
                flag = false;
            }
            if( TipoEjecutable.HISTORIAL.equals( tipoEjecutable ) )
            {
                historiales.imprimir( );
            }
            if( TipoEjecutable.OPCION_ERRONEA.equals( tipoEjecutable ) )
            {
                Menu.opcionInvalida( );
            }
            if( tipoEjecutable.getEjecutable( ) != null )
            {
                ejecutable = tipoEjecutable.getEjecutable( );
                ejecutable.addHistoriales( historiales );
                ejecutable.run( );
            }
        }


    }

}