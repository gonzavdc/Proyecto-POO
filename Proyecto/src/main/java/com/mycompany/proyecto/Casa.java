/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author sebas
 */  
import java.util.ArrayList;
import java.util.Scanner;
public class Casa{
    private int cantHabitantes;
    private double consumoMaximo;
    private int necesitaContenedor;
    private String Contacto;
    private String Direccion;
    private Contenedor contenedorCasa;
            
    public Validacion validar = new Validacion();
    public Casa()
    {
        
    }
  
    public Casa(Contenedor contenedorCasa) {
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de habitantes de la casa");
        this.cantHabitantes = validar.validarEntero();
        while(cantHabitantes < 1)
        {
            this.cantHabitantes = validar.validarEntero();
        }
        System.out.println("Ingrese consumo máximo del hogar");
        this.consumoMaximo = validar.validarDouble();
        while(consumoMaximo < 1)
        {
            this.consumoMaximo = validar.validarDouble();
        }
        System.out.println("Ingrese 1 si necesita contenedor, 0 en caso contrario");
        this.necesitaContenedor = validar.validarEntero();
        while(necesitaContenedor < 1)
        {
            this.necesitaContenedor = validar.validarEntero();
        }
        System.out.println("Ingrese número de contacto");
        this.Contacto = validar.validarCadena();
        while(Contacto.equals(null))
        {
            this.Contacto = validar.validarCadena();
        }
        System.out.println("Ingrese dirección");
        this.Direccion = validar.validarCadena();
        while(Direccion.equals(null))
        {
            this.Direccion = validar.validarCadena();
        }
        this.contenedorCasa = contenedorCasa;
    }
    
    public Casa(Contenedor contenedorCasa, String direccion)
    {
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de habitantes de la casa");
        this.cantHabitantes = validar.validarEntero();
        while(cantHabitantes < 1)
        {
            this.cantHabitantes = validar.validarEntero();
        }
        System.out.println("Ingrese consumo máximo del hogar");
        this.consumoMaximo = validar.validarDouble();
        while(consumoMaximo < 1)
        {
            this.consumoMaximo = validar.validarDouble();
        }
        System.out.println("Ingrese 1 si necesita contenedor, 0 en caso contrario");
        this.necesitaContenedor = validar.validarEntero();
        while(necesitaContenedor < 1)
        {
            this.necesitaContenedor = validar.validarEntero();
        }
        System.out.println("Ingrese número de contacto");
        this.Contacto = validar.validarCadena();
        while(Contacto.equals(null))
        {
            this.Contacto = validar.validarCadena();
        }
        
        
        this.Direccion = direccion;
        this.contenedorCasa = contenedorCasa;
    }

    

    public int getCantHabitantes() {
        return cantHabitantes;
    }

    public double getConsumoMaximo() {
        return consumoMaximo;
    }

    public int isNecesitaContenedor() {
        return necesitaContenedor;
    }

    public String getContacto() {
        return Contacto;
    }

    public String getDireccion() {
        return Direccion;
    }

    public Contenedor getContenedorCasa() {
        return contenedorCasa;
    }

    public void setCantHabitantes(int cantHabitantes) {
        this.cantHabitantes = cantHabitantes;
    }

    public void setConsumoMaximo(double consumoMaximo) {
        this.consumoMaximo = consumoMaximo;
    }

    public void setNecesitaContenedor(int necesitaContenedor) {
        this.necesitaContenedor = necesitaContenedor;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setContenedorCasa(Contenedor contenedorCasa) {
        this.contenedorCasa = contenedorCasa;
    }
    
    
    public Poblacion armarPoblacion()
    {
        Poblacion poblacionAux = new Poblacion();
        Casa casaAux = new Casa();
        int cantCasas;
        ArrayList <Casa> ColeccionCasas;
        Poblacion objetoPoblacion = new Poblacion();
        ColeccionCasas = objetoPoblacion.getCasas();
        Contenedor contenedores = new Contenedor();
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de habitantes en la población");
        cantCasas = Entrada.nextInt();
        
        
        for(int i = 0;i < cantCasas; i++)
        {
           
            casaAux = new Casa(casaAux.getContenedorCasa());
            ColeccionCasas.add(casaAux);
        }
        
        poblacionAux.setCantCasas(cantCasas);
        poblacionAux.setCasas(ColeccionCasas);
        
        return poblacionAux;
    }
    
    
    
    
    
}
