package view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import controller.ControladorRequerimientosReto4;
import model.vo.Requerimiento1;
import model.vo.Requerimiento2;
import model.vo.Requerimiento3;

public class PrimerVentana extends JFrame {

    private JTable tabla;
    private ControladorRequerimientosReto4 controlador;
    
    public PrimerVentana() {
        controlador = new ControladorRequerimientosReto4();
        initComponents();
        setSize(700,600);
        setLocationRelativeTo(null);
    }

    private void initComponents() { 
        setTitle("INTERFAZ RETO 5");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       
        JPanel tbd = new JPanel();
        getContentPane().add(tbd, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        tbd.add("Consulta", panel);

        JPanel panelEntrada = new JPanel();

        JButton Consulta1 = new JButton("Proyectos por Estrato");
        JButton Consulta2 = new JButton("Proyectos por Tipo");
        JButton Consulta3 = new JButton("Proyectos Apartaestudio en Quibdo");

        Consulta1.addActionListener(e -> Tabla1());
        Consulta2.addActionListener(e -> Tabla2());
        Consulta3.addActionListener(e -> Tabla3());

        panelEntrada.add(Consulta1);
        panelEntrada.add(Consulta2);
        panelEntrada.add(Consulta3);
        panel.add(panelEntrada, BorderLayout.PAGE_START);

        tabla = new JTable(); 
        panel.add(new JScrollPane(tabla), BorderLayout.CENTER);
    }


    //TABLA REQUERIMIENTO1
    private void Tabla1() {
        try {
            ArrayList<Requerimiento1> lista = controlador.consultarRequerimiento_1();
            Requerimiento1TableModel tableModel = new Requerimiento1TableModel();
            tableModel.setData(lista);
            tabla.setModel(tableModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    //TABLA REQUERIMIENTO2
    private void Tabla2() {
        try {
            ArrayList<Requerimiento2> lista = controlador.consultarRequerimiento_2();
            Requerimiento2TableModel tableModel = new Requerimiento2TableModel();
            tableModel.setData(lista);
            tabla.setModel(tableModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    //TABLA REQUERIMIENTO3
    private void Tabla3() {
        try {
            ArrayList<Requerimiento3> lista = controlador.consultarRequerimiento_3();
            Requerimiento3TableModel tableModel = new Requerimiento3TableModel();
            tableModel.setData(lista);
            tabla.setModel(tableModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    // TABLA PROYECTOS POR ESTRATO

    private class Requerimiento1TableModel extends AbstractTableModel {

        private ArrayList<Requerimiento1> data;

        public void setData(ArrayList<Requerimiento1> data) {
            this.data = data;
        }

        @Override
        public String getColumnName(int column) {
            switch (column) {
                case 0:
                    return "ID";
                case 1:
                    return "Codigo";
                case 2:
                    return "Area Maxima";
                case 3:
                    return "Estrato";
            }
            return super.getColumnName(column);
        }

        @Override
        public int getRowCount() {
            return data.size();
        }

        @Override
        public int getColumnCount() {
            return 4;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Requerimiento1 registro = data.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return registro.getIdTipo();
                case 1:
                    return registro.getCodigoTipo();
                case 2:
                    return registro.getAreaMaxima();
                case 3:
                    return registro.getEstrato();
            }
            return null;
        }

    }

    //TABLA PROYECTOS POR TIPO

    private class Requerimiento2TableModel extends AbstractTableModel {

        private ArrayList<Requerimiento2> data;

        public void setData(ArrayList<Requerimiento2> data) {
            this.data = data;
        }

        @Override
        public String getColumnName(int column) {
            switch (column) {
                case 0:
                    return "ID Proyecto";
                case 1:
                    return "Constructora";
                case 2:
                    return "Ciudad";
                case 3:
                    return "Estrato";
            }
            return super.getColumnName(column);
        }

        @Override
        public int getRowCount() {
            return data.size();
        }

        @Override
        public int getColumnCount() {
            return 4;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Requerimiento2 registro = data.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return registro.getIdProyecto();
                case 1:
                    return registro.getConstructora();
                case 2:
                    return registro.getCiudad();
                case 3:
                    return registro.getEstrato();
            }
            return null;
        }

    }


    //TABLA PROYECTOS DE TIPO APARTAESTUDIO EN QUIBDO

    private class Requerimiento3TableModel extends AbstractTableModel {

        private ArrayList<Requerimiento3> data;

        public void setData(ArrayList<Requerimiento3> data) {
            this.data = data;
        }

        @Override
        public String getColumnName(int column) {
            switch (column) {
                case 0:
                    return "ID Proyecto";
                case 1:
                    return "Constructora";
                case 2:
                    return "Porcentaje Cuota Inicial";
                case 3:
                    return "Acabados";
            }
            return super.getColumnName(column);
        }

        @Override
        public int getRowCount() {
            return data.size();
        }

        @Override
        public int getColumnCount() {
            return 4;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Requerimiento3 registro = data.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return registro.getIdProyecto();
                case 1:
                    return registro.getConstructora();
                case 2:
                    return registro.getPorcentajeCuotaInicial();
                case 3:
                    return registro.getAcabados();
            }
            return null;
        }

    }

}
