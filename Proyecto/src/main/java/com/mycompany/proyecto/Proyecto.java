/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto;

/**
 *
 * @author sebas
 */
import java.io.File;
import java.io.FileWriter; 
import java.io.IOException;
import java.io.PrintWriter; 
import java.util.Scanner;
public class Proyecto {

    public static void main(String[] args) throws IOException{
        int opcion = -1;
        int empresaCreada = 0;
        Validacion validar = new Validacion();
        Scanner Entrada = new Scanner(System.in);
        while (opcion != 0)
        {
            System.out.println("Ingrese 1 si desea agregar una empresa");
            System.out.println("Ingrese 2 si desea mostrar empresa");
            System.out.println("Ingrese 3 si desea agregar una población");
            System.out.println("Ingrese 4 si desea mostrar una población"); 
            System.out.println("Ingrese 0 para terminar el proceso");
            opcion = validar.validarEntero();
            while(opcion < 0)
            {
                opcion = validar.validarEntero();
            }
            switch(opcion)
            {

                    case 1:
                        
                        Contenedor contenedorEmpresa = new Contenedor();
                            
                        Empresa empresa = new Empresa(contenedorEmpresa); //Pide un contenedor más
                        empresa.setColeccionContenedor(empresa.crearContenedores());
                        File archivo = new File("texto1.txt");

                        FileWriter escritura = new FileWriter(archivo);
                        
                        PrintWriter escritura2 = new PrintWriter(escritura);
                        
                        escritura2.println("Nombre Empresa :" + empresa.getNombre()+ "Cantidad Contenedores disponibles : "+empresa.getContenedoresDisponibles());
                        escritura2.println("Contenedores de la empresa :");
                        for(int i = 0 ;i<empresa.getColeccionContenedor().size();i++)
                        {
                            escritura2.println("Contenedor N° " + (i+1));
                            escritura2.println("Capacidad Maxima : " + empresa.getColeccionContenedor().get(i).getCapacidadContenedor());
                            escritura2.println("Agua Restante :  " + empresa.getColeccionContenedor().get(i).getAguaRestante());
                            escritura2.println("Limite bajo nivel : " + empresa.getColeccionContenedor().get(i).getLimiteBajoNivel());
                                    
                        }
                        escritura2.close();
                        break;
                    case 2:
                        contenedorEmpresa = new Contenedor();
                        empresa = new Empresa(contenedorEmpresa);
                        empresa.crearContenedores();
                        
                        contenedorEmpresa.verContenedor();
                        empresa.verEmpresa();
                        
                        break;
                        
                    case 3:
                        Poblacion poblacion = new Poblacion();
                        Casa objetoCasa = new Casa();

                        poblacion = objetoCasa.armarPoblacion();
                    case 4:
                        poblacion = new Poblacion();
                        objetoCasa = new Casa();
                        
                        poblacion = objetoCasa.armarPoblacion();
                        
                        poblacion.verPoblacion(poblacion.getCasas());
                        archivo = new File("texto2.txt");

                        escritura = new FileWriter(archivo);
                        
                        escritura2 = new PrintWriter(escritura);
                        
                        escritura2.println("Cantidad de casas :" + poblacion.getCantCasas());
                        escritura2.println("Casas:");
                        for(int i = 0 ;i<poblacion.getCasas().size();i++)
                        {
                            escritura2.println("Casa N° " + (i+1));
                            escritura2.println("Cantidad de habitantes en casa : " + poblacion.getCasas().get(i).getCantHabitantes());
                            escritura2.println("Direccion :  " + poblacion.getCasas().get(i).getDireccion());
                            escritura2.println("Contacto : " + poblacion.getCasas().get(i).getContacto());
                                    
                        }
                        escritura2.close();
                    default:
                        System.out.println("Opcion Ingresada no existe");
                        break;
            }
            
        }
    }
}
