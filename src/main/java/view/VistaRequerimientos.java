package view;

import controller.ControladorRequerimientosReto4;

import model.vo.Requerimiento1;
import model.vo.Requerimiento2;
import model.vo.Requerimiento3;


import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientos {
    
    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();


    //Proyectos por Estrato
    
    public static void requerimiento1(){
    
        System.out.println("*** Proyectos por Estrato ***");

        try{
            
            ArrayList<Requerimiento1> rankingProyectosPorEstratos =controlador.consultarRequerimiento_1();

            for(Requerimiento1 proyectosPorEstrato : rankingProyectosPorEstratos) {
                System.out.printf("El proyecto de ID_Tipo %d de codigo: %d de Area Maxima %d, tiene un estrato %d \n",
                proyectosPorEstrato.getIdTipo(),
                proyectosPorEstrato.getCodigoTipo(),
                proyectosPorEstrato.getAreaMaxima(),
                proyectosPorEstrato.getEstrato()
                );
            }

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    //Proyectos por Tipo

    public static void requerimiento2(){     

        System.out.println("*** Proyectos por Tipo ***");

        try{
            
            ArrayList<Requerimiento2> rankingProyectosPorTipo = controlador.consultarRequerimiento_2();

            for (Requerimiento2 proyectosPorTipo : rankingProyectosPorTipo){
                System.out.printf("El proyecto de ID_Proyecto %d de la constructora: %s de la ciudad %s, tiene un estrato asignado de %d \n",
                        proyectosPorTipo.getIdProyecto(),
                        proyectosPorTipo.getConstructora(),
                        proyectosPorTipo.getCiudad(),
                        proyectosPorTipo.getEstrato()
                );
            }

        }catch(SQLException e){
            System.err.println(e);
        }
    }


    // Proyectos de Tipo Apartaestudio en Quibdo

    public static void requerimiento3(){

        System.out.println("*** Proyectos de Tipo Apartaestudio en Quibdo ***");

        try{
              // su codigo    
            ArrayList<Requerimiento3> rankingProyectosQuibdoApartaestudio = controlador.consultarRequerimiento_3();

            for (Requerimiento3 proyectosQuibdoApartaestudio : rankingProyectosQuibdoApartaestudio){
                System.out.printf("El proyecto de ID_Proyecto %d de la constructora: %s tiene un porcentaje de cuota inicial de %.1f, y %s tiene acabados \n",
                        proyectosQuibdoApartaestudio.getIdProyecto(),
                        proyectosQuibdoApartaestudio.getConstructora(),
                        proyectosQuibdoApartaestudio.getPorcentajeCuotaInicial(),
                        proyectosQuibdoApartaestudio.getAcabados()
                );
            }    
        }catch(SQLException e){
            System.err.println(e);
        }
    }

}
