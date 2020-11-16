//González Vera Bruno 3IV8
import java.util.Scanner;

//clase en la que se encuentra el programa que calcula la edad
public class Figuras{

    Scanner entrada = new Scanner(System.in);
    
    //variables globales
    private double base, altura,resultado;
    private char op, letra;

    //metodo principal
    public void figuras(){
        do{
            System.out.println("Selcciona la figura de la que quieres obtener el area y el perimetro:");
            System.out.println("A.- Circulo");
            System.out.println("B.- Rectangulo");
            System.out.println("C.- Cuadrado");
            System.out.println("D.- Triangulo equilatero");

            op = entrada.next().charAt(0);

            //creamos un menu
            switch(op){

                case 'A':
                    
                    Circulo();
                    break;

                case 'B':
                    
                    Rectangulo();
                    break;  

                case 'C':
                    
                    Cuadrado();
                    break;
                case 'D':

                    Triangulo();
                    break;

                default:
                System.out.println("No es opcion valida");


            }
            System.out.println("Deseas repetir el programa Areas y Perimetros?, si lo desea escriba s");
            letra = entrada.next().charAt(0); 

        }while(letra == 's');
    }

    //metodo para el circulo
    private void Circulo(){

        System.out.println("Ingresa el valor del diametro:");
        base = entrada.nextDouble();
       
        resultado = 3.14*base; 
        System.out.println("El perimetro del circulo es: "+resultado+" U");

        resultado = 0;
        resultado = 3.14*(base/2)*(base/2);
        System.out.println("El area del ciculo es: "+resultado+" U^2");
    }

    //metodo para el rectangulo
    private void Rectangulo(){
        System.out.println("Ingresa el valor de la base:");
        base = entrada.nextDouble();

        System.out.println("Ingresa el valor de la altura:");
        altura = entrada.nextDouble();
       
        resultado =2*(base+altura); 
        System.out.println("El perimetro del rectangulo es: "+resultado+" U");

        resultado = 0;
        resultado = base*altura;
        System.out.println("El area del rectangulo es: "+resultado+" U^2");
    }

    //metodo para el cuadrado
    private void Cuadrado(){
        System.out.println("Ingresa el valor del lado:");
            base = entrada.nextDouble();
           
            resultado =4*base; 
            System.out.println("El perimetro del cuadrado es: "+resultado+" U");
    
            resultado = 0;
            resultado = base*base;
            System.out.println("El area del cuadrado es: "+resultado+" U^2");
    }

    //metodo para el triangulo
    private void Triangulo(){
        System.out.println("Ingresa el valor de uno de sus lados:");
        base = entrada.nextDouble();
       
        resultado =3*base; 
        System.out.println("El perimetro del triangulo es: "+resultado+" U");

        resultado = 0;
        altura = 0.8660*base;
        resultado = base*altura/2;
        System.out.println("El area del triangulo es: "+resultado+" U^2");
    }




}
