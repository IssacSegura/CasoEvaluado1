package casopractico1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author issac
 */
public class Factura {

    private String nombreCliente;
    private String idCliente;
    private String codigoFactura;
    private double monto;
    private int mes;
    private String electrico;
    private String automotriz;
    private String construccion;

    //constructor
    public Factura(String nombreCliente, String idCliente, String codigoFactura, double monto, int mes,
            String electrico, String automotriz, String construccion) {
        this.nombreCliente = nombreCliente;
        this.idCliente = idCliente;
        this.codigoFactura = codigoFactura;
        this.monto = monto;
        this.electrico = electrico;
        this.automotriz = automotriz;
        this.construccion = construccion;
    }

    // Getters y setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getidCliente() {
        return idCliente;
    }

    public void setidCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getMes() {
        return mes;
    }

    public String getElectrico() {
        return electrico;
    }

    public void setElectrico(String electrico) {
        this.electrico = electrico;
    }

    public String getAutomotriz() {
        return automotriz;
    }

    public void setAutomotriz(String automotriz) {
        this.automotriz = automotriz;
    }

    public String getConstruccion() {
        return construccion;
    }

    public void setConstruccion(String construccion) {
        this.construccion = construccion;
    }

}
