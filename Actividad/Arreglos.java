import java.util.*;

public class Arreglos{
    int sumarFilas;
    double promedio;
    int matriz[] = new int [10];

    public static void main(String[] args){
        
         Scanner entrada = new Scanner(System.in);
         
         char letra;
           
        Arreglos matriz = new Arreglos();
            
        do{   
        matriz.cargarValores();
        System.out.println("Desea continuar? Si lo desea escriba 's'");
        letra = entrada.next().charAt(0);
        }
       
        while(letra == 's');
    }

    public void cargarValores(){
        int opcion;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Promedio positivos y negativos ");
        System.out.println("2.- Promedio de los espacios pares del array ");
        System.out.println("3.- Calificaciones ");
        System.out.println("4.- Matriz A+B=S ");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
            positivos();
                break;

            case 2:
            pares();
                break;

            case 3:
            calificaciones();
                break;

            case 4:
            matriz();
                break;
            
            default:
            System.out.println("Veo que has elegido el camino de la repeticion");  
        }
    }
    
    public void matrizPrincipal(){
        int n = 0;
        Scanner entrada = new Scanner(System.in);
        for(int i=0; i<matriz.length; i++){
         n = n+1;
        System.out.println("Ingrese el valor " + n + " de " +matriz.length+ " para realizar las operaciones:");
                matriz[i] = entrada.nextInt();
       } 
    }
    
    //En esta parte del promedio de positivos y negativos no puede realizar 
    //la suma de los numeros para promediarlos
    
    public void positivos(){
        int fin1=0 ; 
        int fin2=0 ;
        double promedio1;
        int suma1 = 0;
        int suma2 = 0;
        int j,k;
        
        System.out.println("Aqui deberas digitar numeros enteros positivos y negativos para el mejorar el funcionamiento");
        matrizPrincipal();
        for(int i = 0; i<matriz.length; i++){
            if(matriz[i]>0){
                fin1 ++;
            }
            else{
                fin2 ++;
            }
        }
        int positivo[] = new int [fin1];
        int negativo[] = new int [fin2];

        j = 0;
        k = 0;
        for(int i = 0; i<matriz.length; i++){
            if(matriz[i]>0){
                positivo[j] = matriz[i];
                j++;
            }
            else{
                negativo[k] = matriz[i];
                k++;
            }
        }
        for(j = 0; j<fin1; j++){
            suma1 = suma1 + matriz[j];    
        }
        for(k = 0; k<fin2; k++){
            suma2 += matriz[k];    
        }
        promedio = suma1/fin1;
        System.out.println(" El promedio de los numeros positivos es: "+promedio);
        promedio1 = suma2/fin2;
        System.out.println(" El promedio de los numeros negativos es: "+promedio1);
        
    }
    public void pares(){
        matrizPrincipal();
        for(int i = 0; i<matriz.length; i+=2){
                sumarFilas += matriz[i];
        }
        promedio = sumarFilas/5;
        System.out.println("El promedio de los espacios pares del array es :"+promedio);  
    }
    public void calificaciones(){
        matrizPrincipal();
        int mayor, menor,p,a,r;

        for(int i = 0; i<matriz.length; i++){
           System.out.println("La calificacion "+(i+1)+" es "+matriz[i]);
        }
        for(int i = 0; i<matriz.length; i++){
            sumarFilas += matriz[i];   
        } 
        promedio = sumarFilas/10;
                System.out.println("El promedio de las calificaciones es "+promedio);
        mayor = menor = matriz[0];
        for(int i = 0; i<matriz.length; i++){
            if(matriz[i] > mayor) {
                mayor = matriz[i];
            }
            if(matriz[i]<menor) {
                menor = matriz[i];
            }
        }
        System.out.println("La calificacion mayor es: "+mayor);
        System.out.println("La calificacion menor es: "+menor);
        p = 0;
        for(int i = 0; i<matriz.length; i++){
            if(matriz[i] >= promedio){
                p ++;
            }
        }
        System.out.println("El numero de calificaciones mayores o iguales al promedio es "+p);
        a = 0;
        r = 0;
        for(int i = 0; i<matriz.length; i++){
            if(matriz[i]>=6){
                a = a+1;
            }
        }
        r=10-a;
        System.out.println("El numero de alumnos aprobados es "+a);
        System.out.println("El numero de alumnos reprobados es "+r);

    }
    public void matriz(){
        Scanner entrada = new Scanner(System.in);

        int matriz_uno[][] = new int[3][3];
        int matriz_dos[][] = new int[3][3];
        int matriz_resultante[][] = new int[3][3];

        for(int i=0; i<matriz_uno.length; i++){
            for(int j=0; j<matriz_uno.length; j++){
                System.out.println("Ingresa el numero de la fila "
                + i + " columna " + j + " de la matriz 1 : ");
                matriz_uno[i][j] = entrada.nextInt();
            }
        }
        for(int i=0; i<matriz_dos.length; i++){
            for(int j=0; j<matriz_dos.length; j++){
                System.out.println("Ingresa el numero de la fila "
                + i + " columna " + j + " de la matriz 2 : ");
                matriz_dos[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_dos.length; j++) {
                matriz_resultante[i][j] = matriz_uno[i][j] + matriz_dos[i][j];
            }
        }

        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno.length; j++) {
                System.out.print("[ " + matriz_uno[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  +   ");
            } else {
                System.out.print("      ");
            }                        
            for (int j = 0; j < matriz_dos.length; j++) {
                System.out.print("[ " + matriz_dos[i][j] + " ]");
            }
            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }
            for (int j = 0; j < matriz_resultante.length; j++) {
                System.out.print("[ " + matriz_resultante[i][j] + " ]");
            }
            System.out.println("");
        }

    }
    
}