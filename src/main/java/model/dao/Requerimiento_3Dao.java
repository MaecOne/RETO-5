package model.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import util.JDBCUtilities;

//Encapsulamiento de los datos
import model.vo.Requerimiento3;

public class Requerimiento_3Dao {
   
    public ArrayList<Requerimiento3> requerimiento3() throws SQLException {
        //su codigo
        ArrayList<Requerimiento3> respuesta = new ArrayList<Requerimiento3>();
        Connection conexion = JDBCUtilities.getConnection();

        try {

            String consulta = "SELECT ID_Proyecto, Constructora, Porcentaje_Cuota_Inicial, Acabados " +
                            "FROM Proyecto "+
                            "WHERE Clasificacion = 'Apartaestudio' AND "+
                            "Ciudad = 'Quibdo' ; ";


            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            //Recorrer los registros en los VO específicos
            
            while (resultSet.next()) {
                Requerimiento3 proyectosQuibdoApartaestudioDao = new Requerimiento3();
                proyectosQuibdoApartaestudioDao.setIdProyecto(resultSet.getInt("Id_Proyecto"));
                proyectosQuibdoApartaestudioDao.setConstructora(resultSet.getString("Constructora"));
                proyectosQuibdoApartaestudioDao.setPorcentajeCuotaInicial(resultSet.getFloat("Porcentaje_Cuota_Inicial"));
                proyectosQuibdoApartaestudioDao.setAcabados(resultSet.getString("Acabados"));

                //Se agrega cada registro como un objeto del ArrayList que contiene la consulta
                respuesta.add(proyectosQuibdoApartaestudioDao);
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error consultando los proyectos por estrato: " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }

        //Retornar la colección de vo's
        return respuesta;
    }
        
}
