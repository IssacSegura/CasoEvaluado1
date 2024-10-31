/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casopractico1;

import javax.swing.JOptionPane;

/**
 *
 * @author issac
 */
public class CasoPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Entrada de datos para el vendedor
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del vendedor:");
        String id = JOptionPane.showInputDialog("Ingrese la cédula del vendedor:");
        String codigo = JOptionPane.showInputDialog("Ingrese el código del vendedor:");
        String sucursal = JOptionPane.showInputDialog("Ingrese la sucursal del vendedor:");
        String vehiculo = JOptionPane.showInputDialog("¿Tiene vehículo propio? ");

        Vendedor vendedor = new Vendedor(nombre, id, codigo, sucursal, vehiculo);

        // Entrada de datos para factura
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        String idCliente = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");
        String codigoFactura = JOptionPane.showInputDialog("Ingrese el código de factura:");
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del mes:"));

        String electrico = JOptionPane.showInputDialog("¿Contiene productos eléctricos?");
        String automotriz = JOptionPane.showInputDialog("¿Contiene productos automotrices? ");
        String construccion = JOptionPane.showInputDialog("¿contiene productos de construcción?");

        Factura Factura = new Factura(nombreCliente, idCliente, codigoFactura, monto, mes, electrico, automotriz, construccion);

    }

}
