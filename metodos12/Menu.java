//González Vera Bruno 3IV8
import java.util.Scanner;

//clase en la que se encuentra el menu
public class Menu{

    Scanner entrada = new Scanner(System.in);

    //se invocan metodos a partir de la creacion de objetos
    Edad obj1 = new Edad();
    Figuras obj2 = new Figuras();
    Llamadas obj3 = new Llamadas();

    //metodo principal
    public void menu(){

        char op, letra;

        do{
            System.out.println("Gonzalez Vera Bruno 3IV8");
            System.out.println("Elije que deseas hacer:");
            System.out.println("A.- Calcular tu edad");
            System.out.println("B.- Areas y perimetros");
            System.out.println("C.- Llamadas telefonicas");
            
            //menu de opciones
            op = entrada.next().charAt(0);

            switch(op){

                case 'A':
                    obj1.edad();
                    break;

                case 'B':
                    obj2.figuras();
                    break;  

                case 'C':
                    obj3.llamadas();
                    break;
                case 'D':
                    System.out.println("Gracias por participar");    
                    break;
                default:
                    System.out.println("Opcin no valida");
           

            }
            System.out.println("Deseas repetir el programa principal?, si lo desea escriba s");
            letra = entrada.next().charAt(0); 
        }while(letra == 's');     
    }    
}