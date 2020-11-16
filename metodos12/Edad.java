//González Vera Bruno 3IV8
import java.util.Scanner;

//clase en la que se encuentra el programa que calcula la edad
public class Edad{

    //variables globales
    private int dia, dia1,d;
    private int mes,mes1,m; 
    private int anio,anio1,a;

    //metodo principal
    public void edad(){
        
        datos();
        calculo();
        System.out.println("Tu edad es de "+a+" anios "+m+" meses "+d+" dias, con un posible error de +-1 dias" );
    }

    //metodo en el que se introducen los datos
    private  void datos(){

        Scanner entrada = new Scanner(System.in);  

        System.out.println("Ingresa tu fecha de nacimiento:");
        System.out.print("Dia de nacimiento: ");
        dia = entrada.nextInt();
        System.out.print("Mes de nacimiento: ");
        mes = entrada.nextInt();
        System.out.print("Anio de nacimiento: ");
        anio = entrada.nextInt();

        System.out.println("Ingresa la fecha actual: ");
        System.out.print("Dia: ");
        dia1 = entrada.nextInt();
        System.out.print("Mes: ");
        mes1 = entrada.nextInt();
        System.out.print("Anio: ");
        anio1 = entrada.nextInt();
    }

    //metodo que calcula la edad
    private  void calculo(){
       
        if(mes1>=mes){
            if(dia1>=dia){
            a = anio1-anio;
            m = mes1-mes;
            d = dia1-dia;
            }
            else{
                a = anio1-anio;
                m = mes1-mes-1;
                d = 31+dia1-dia;
            }
        }
        else{
            if(dia1>=dia){
                a = anio1-anio-1;
                m = 12+mes1-mes;
                d = dia1-dia;
            }
            else{ 
                a = anio1-anio-1;
                m = 11+mes1-mes;
                d = 31+dia1-dia;   
            }
        }
    
    }


}
