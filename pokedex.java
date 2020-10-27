import java.util.Scanner;

class pokedex{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        char letra;
        int id, fuerza, defensa, vida;
        byte ataque1, ataque2;
        String nombrepo, nombrea1, nombrea2;


        
      do{
            System.out.println("Bienvenido a la alfa Pokedex creada por Gonzalez Vera Bruno 3IV8 ");
            System.out.println("Para comenzar selecciona una opcion");
            System.out.println("1. Datos de Charmander");
            System.out.println("2. Datos de Bulbasaur");
            System.out.println("3. Datos de Squartle");
            System.out.println("4. Batalla pokemon");
            System.out.println("5. Regrasar o salir");
      
            opcion = entrada.nextInt();
  
            switch (opcion) {
          case 1:
          System.out.println("Los datos de Charmander son:");
           id = 001;
           fuerza = 40;
           defensa = 30;
           vida = 100;
           nombrea1 = "Llamarada";
           nombrea2 = "Zarpazo";
           nombrepo = "Charmander";
           ataque1 = 35;
           ataque2 = 20;
  
   
          System.out.println("Id: "+id);
          System.out.println("Nombre: "+nombrepo);
          System.out.println("Fuerza: "+fuerza);
          System.out.println("Defensa: "+defensa);
          System.out.println("Vida: "+vida);
          System.out.println("Nombre del ataque principal: "+nombrea1);
          System.out.println("Valor del ataque principal :"+ataque1);
          System.out.println("Nombre del ataque secunddario :"+nombrea2);
          System.out.println("Valor del ataque secundario: "+ataque2);
              break;
          case 2:
          System.out.println("Los datos de Bulbasaur son:");
           id = 002;
           fuerza = 30;
           defensa = 50;
           vida = 100;
           nombrea1 = "Disparo floral";
           nombrea2 = "Latigazo";
           nombrepo = "Bulbasaur";
           ataque1 = 31;
           ataque2 = 25;
  
   
          System.out.println("Id: "+id);
          System.out.println("Nombre: "+nombrepo);
          System.out.println("Fuerza: "+fuerza);
          System.out.println("Defensa: "+defensa);
          System.out.println("Vida: "+vida);
          System.out.println("Nombre del ataque principal: "+nombrea1);
          System.out.println("Valor del ataque principal :"+ataque1);
          System.out.println("Nombre del ataque secunddario :"+nombrea2);
          System.out.println("Valor del ataque secundario: "+ataque2);
          break;
  
          case 3:
          System.out.println("Los datos de Bulbasaur son:");
           id = 003;
           fuerza = 40;
           defensa = 30;
           vida = 100;
           nombrea1 = "Disparo de agua";
           nombrea2 = "Caparazon";
           nombrepo = "Squartle";
           ataque1 = 45;
           ataque2 = 15;
  
   
          System.out.println("Id: "+id);
          System.out.println("Nombre: "+nombrepo);
          System.out.println("Fuerza: "+fuerza);
          System.out.println("Defensa: "+defensa);
          System.out.println("Vida: "+vida);
          System.out.println("Nombre del ataque principal: "+nombrea1);
          System.out.println("Valor del ataque principal :"+ataque1);
          System.out.println("Nombre del ataque secunddario :"+nombrea2);
          System.out.println("Valor del ataque secundario: "+ataque2);
              break;

          case 4:
          System.out.println("¿Que pokemon peleara?");
          System.out.println("Gano Charmander xd");
          
          

  
          default:System.out.println("¿Deseas repetir?");
          
              break;
            }
            System.out.println("¿Desea repetir?Si lo desea escriba s");
              
            letra = entrada.next().charAt(0);
      
    
      
          
         
          
        }while(letra == 's');
        

    }
    

 
 
 



        
    
}