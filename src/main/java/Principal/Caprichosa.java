/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Principal;

import java.util.Random;
import java.util.Scanner;

//Edicion Sergio
/**
 *
 * @author franc
 */
public class Caprichosa 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        boolean jugar = true;
        
        
        while (jugar)    
        {    
            System.out.println("1- Jugar a la ruleta");
            System.out.println("2- Jugar al black jack");
            System.out.println("3- Jugar al poker");
            System.out.println("4- Gambling");
            System.out.println("5- Ver saldo");
            System.out.println("6- Salir");
            System.out.print("Que quieres hacer: ");
            int opc = scanner.nextInt();
            
            switch (opc)
            {    
                case 1:
                    rulet();
                    break;
                case 2:
                    blackjack();
                    break;
                case 3:
                    poker();
                    break;
                case 4: 
                    gambling();
                    break;
                case 5:
                    user();
                    break;
                case 6:
                    System.out.println("Salir de la aplicacion");
                    jugar = false;
                    break;
                default:
                    System.out.println("Opción inválida, por favor selecciona una opción válida.");
            }       break;    
        } 
        scanner.close();
    }                
                    
    public static void rulet()
    {
        //Bolita
        Random rand = new Random();
        int bolita = rand.nextInt(37);
        
        boolean apuesta = true;
        int apuestaNumero = -1; // Inicializar el número de apuesta fuera del bucle
        int dineroApuesta = 0; // Inicializar el dinero de la apuesta fuera del bucle
        
        while (apuesta)
        {
            System.out.println("");
            System.out.println("Opciones de apuesta");
            System.out.println("1- Numeros");
            System.out.println("2- Red");
            System.out.println("3- Black");
            System.out.println("4- 1st. 12");
            System.out.println("5- 2nd. 12");
            System.out.println("6- 3rd. 12");
            System.out.println("7- 1 to 18");
            System.out.println("8- EVEN");
            System.out.println("9- ODD");
            System.out.println("10- 19 to 36");
            System.out.println("van de arriba a abajo");
            System.out.println("11- 2to1");
            System.out.println("12- 2to1");
            System.out.println("13- 2to1");
            System.out.print("Que tipo de apuesta desea realizar: ");
            Scanner scanner = new Scanner(System.in);
            int opcApuesta = scanner.nextInt();

            switch (opcApuesta)
            {         
                case 1:
                    System.out.println("A que numeros quieres apostar (0/36)");
                    System.out.println("|----|----|----|----|----|----|----|----|----|----|----|----|----|----|");
                    System.out.println("|    |  3 |  6 |  9 | 12 | 15 | 18 | 21 | 24 | 27 | 30 | 33 | 36 |2to1|");   	
                    System.out.println("|    |----|----|----|----|----|----|----|----|----|----|----|----|----|");
                    System.out.println("|  0 |  2 |  5 |  8 | 11 | 14 | 17 | 20 | 23 | 26 | 29 | 32 | 35 |2to1|");
                    System.out.println("|    |----|----|----|----|----|----|----|----|----|----|----|----|----|");
                    System.out.println("|    |  1 |  4 |  7 | 10 | 13 | 16 | 19 | 22 | 25 | 28 | 31 | 34 |2to1|");   	
                    System.out.println("|----|----|----|----|----|----|----|----|----|----|----|----|----|----|");
                    System.out.println("     |      1st. 12      |      2nd. 12      |      3rd. 12      |");
                    System.out.println("     |---------|---------|---------|---------|---------|---------|");
                    System.out.println("     | 1 to 18 |  EVEN   |   red   |  black  |   ODD   |19 to 36 |");
                    System.out.println("     |---------|---------|---------|---------|---------|---------|");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    boolean apuestaNum = true;
                    
                    while (apuestaNum)
                    {
                        System.out.print("A que numero quieres apostar: ");
                        apuestaNumero = scanner.nextInt();
                        //37 xq esta el 0 y 
                        if (apuestaNumero >=36 + 1 || apuestaNumero < 0)
                        {
                            System.out.println("Numero invalido");
                        }else{
                            System.out.print("Cuanto quieres apostar: ");
                           dineroApuesta = scanner.nextInt();
                            System.out.println("Has apostado " + dineroApuesta + "$ al numero " + apuestaNumero);
                        }
                        
                        System.out.print("¿Quieres realizas mas apuestas? (y/n): ");
                        char cont = scanner.next().charAt(0);
                        if (cont == 'y' || cont == 'Y')
                        {
                        rulet();
                        }else if (cont == 'n' || cont == 'N')
                        {
                        System.out.println("Fin tiempo apuesta");
                        apuestaNum = false;
                        //Ir al resultado
                        } 
                    }
                    
                    if (apuestaNumero == bolita)
                    {
                    int dineroGanado = (dineroApuesta * 36);
                    System.out.println("Has ganado " +  dineroGanado + "$");
                    rulet();
                    }else{
                    System.out.println("Has perdido la bolita a caido en " + bolita );
                    rulet();
                    }
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
            }
            
        }
                
    }
    
    public static void tablero()
    {
        System.out.println("|----|----|----|----|----|----|----|----|----|----|----|----|----|----|");
        System.out.println("|    |  3 |  6 |  9 | 12 | 15 | 18 | 21 | 24 | 27 | 30 | 33 | 36 |2to1|");   	
        System.out.println("|    |----|----|----|----|----|----|----|----|----|----|----|----|----|");
        System.out.println("|  0 |  2 |  5 |  8 | 11 | 14 | 17 | 20 | 23 | 26 | 29 | 32 | 35 |2to1|");
        System.out.println("|    |----|----|----|----|----|----|----|----|----|----|----|----|----|");
        System.out.println("|    |  1 |  4 |  7 | 10 | 13 | 16 | 19 | 22 | 25 | 28 | 31 | 34 |2to1|");   	
        System.out.println("|----|----|----|----|----|----|----|----|----|----|----|----|----|----|");
        System.out.println("     |      1st. 12      |      2nd. 12      |      3rd. 12      |");
        System.out.println("     |---------|---------|---------|---------|---------|---------|");
        System.out.println("     | 1 to 18 |  EVEN   |   red   |  black  |   ODD   |19 to 36 |");
        System.out.println("     |---------|---------|---------|---------|---------|---------|");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
    public static void blackjack()
    {
        System.out.println("Juego actualmente no disponible");      
    }
    
    public static void poker()
    {
        System.out.println("Juego actualmente no disponible");  
    }
    
    public static void gambling()
    {
        System.out.println("Todas nuestras maquinas estan ocuopadas, disculpe las molestias");
    }
    
    public static void user()
    {
        System.out.println("Menu de usuario temporalmente en mantenimiento");  
    }
             
}





