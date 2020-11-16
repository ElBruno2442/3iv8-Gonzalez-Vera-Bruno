//González Vera Bruno
import java.util.Scanner;

//clase en la que se encuentra el programa que calcula el total de llamadas
public class Llamadas{

    Scanner entrada = new Scanner(System.in);

    //variables globales
    private String cel,cel2;
    private int creto, ingreso;
    private double loc, nac, phon, suma;
    private char op, letra;

    //metodo principal
    public void llamadas(){
        System.out.println("Para comenzar, digita tu numero telefonico:");
        cel = entrada.nextLine();
        do{
            System.out.println("Selecciona la opcion que deseas realizar:");
            System.out.println("A.- Historial de llamadas telefonicas");
            System.out.println("B.- Consultar saldo");
            System.out.println("C.- Recargar saldo");
            System.out.println("D.- Salir del progrma de llamadas");

            //creamos las opciones 
            op = entrada.next().charAt(0);

                switch(op){

                    case 'A':
                        
                        Llamada();
                        break;

                    case 'B':
                        
                        Saldo();
                        break;  

                    case 'C':
                        
                        Recarga();
                        break;

                    case 'D':
                        System.out.println("Gracias");
                        break;

                    default:
                    System.out.println("No es opcion valida");
            }
            System.out.println("Deseas salir del programa Llamadas?, si lo desea escriba n");
            letra = entrada.next().charAt(0); 
        }while(letra != 'n'); 
    }

    //metodo para las llamadas
    private void Llamada() {
        loc = ((int)Math.floor(Math.random()*50+1));
        nac = ((int)Math.floor(Math.random()*50+1));
        phon = ((int)Math.floor(Math.random()*50+1));

        System.out.println("Numero de llamadas Locales-Internacionales: "+loc);
        System.out.println("Numero de llamadas Locales-Nacionales: "+nac);       
        System.out.println("Numero de llamadas a Celular :"+phon);

        suma = (0.5*loc)+(0.6*nac)+(0.2*phon);
        System.out.println("Costo totl de las llamadas realizadas: "+suma+"$");    
    }

    //metodo para la consulta de saldo
    private void Saldo(){
        creto = ((int)Math.floor(Math.random()*150+1)) - suma;
        System.out.println("El saldo de tu telefono es : "+creto+ " $");
    }

    //metodo para las recaragas
    private void Recarga(){
        
        
        System.out.println("Cuanto deseas recargar?");
        ingreso = entrada.nextInt();
        
        creto = creto+ingreso;
        System.out.println("Tu nuevo saldo es de :"+creto+" $");
    }
}
