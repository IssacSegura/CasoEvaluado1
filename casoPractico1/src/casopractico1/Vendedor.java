package casopractico1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author issac
 */
public class Vendedor {

//Atributos del vendedor 
    private String nombrev;
    private String id;
    private String codigo;
    private String sucursal;
    private String vehiculo;

    public Empresa empresa;

    public Vendedor() {
    }

    public Vendedor(String nombrev, String id, String codigo, String sucursal, String vehiculo) {
        this.nombrev = nombrev;
        this.id = id;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.vehiculo = vehiculo;
        this.empresa = empresa;
    }

    //Getters y setters
    public String getNombre() {
        return nombrev;
    }

    public void setNombre(String nombre) {
        this.nombrev = nombre;
    }

    public String getid() {
        return id;
    }

    public void setidString(String id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
}
