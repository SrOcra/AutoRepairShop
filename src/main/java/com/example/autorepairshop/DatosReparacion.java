package com.example.autorepairshop;

public class DatosReparacion {
    String NumeroOrden;

    String NombreyApellido;
    String Mail;
    String Direccion;
    String Año;
    String Modelo;
    String Marca;
    String Patente;
    String Motor;
    String Chasis;
    String Problema;

    String Estado;
    String Solucion;
    String Documento;
    String Valor;
    public DatosReparacion(String numeroOrden, String nombreyApellido, String mail, String direccion, String año, String modelo, String marca,
                           String patente, String motor, String chasis, String problema, String estado, String solucion, String documento, String valor) {
        NumeroOrden = numeroOrden;
        NombreyApellido = nombreyApellido;
        Mail = mail;
        Direccion = direccion;
        Año = año;
        Modelo = modelo;
        Marca = marca;
        Patente = patente;
        Motor = motor;
        Chasis = chasis;
        Problema = problema;
        Estado = estado;
        Solucion = solucion;
        Documento = documento;
        Valor = valor;
    }
}
