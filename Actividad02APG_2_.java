
package actividad02apg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Actividad02APG_2_ {
    
     public static void main(String[] args) throws IOException{
         
        
        int i,u = 0, opcion_APG,valor_APG,numeroasig;
        double valormax_APG = 0.0, usuarionota  = 0.0 ;
        String[][] clasesynotas_APG = new String[4][4];
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
         
        // declaramos los valores de la tabla del array bidimensional
        
            clasesynotas_APG [0][0] = "M01";
            clasesynotas_APG [0][1] = "8";
            clasesynotas_APG [0][2] = "5";
            clasesynotas_APG [0][3] = "10";
            
            clasesynotas_APG [1][0] = "M02";
            clasesynotas_APG [1][1] = "3";
            clasesynotas_APG [1][2] = "8";
            clasesynotas_APG [1][3] = "9";
            
            clasesynotas_APG [2][0] = "M03";
            clasesynotas_APG [2][1] = "9";
            clasesynotas_APG [2][2] = "7";
            clasesynotas_APG [2][3] = "6";
            
            clasesynotas_APG [3][0] = "M04";
            clasesynotas_APG [3][1] = "10";
            clasesynotas_APG [3][2] = "4";
            clasesynotas_APG [3][3] = "9";
        
         for (i=0;i<4;i++){
             for (u=0;u<4;u++){
                 System.out.print(String.format("%-8s",clasesynotas_APG[u][i]));
             }
             System.out.println("");
         }
         do {
         System.out.println("\nPROGRAMA EVALUACIÓN NOTAS:\n" + 
                 "\n1. Mostrar el nombre de todas las asignaturas \n" +
                 "2. Mostrar la puntuación mayor de cada asignatura \n" + "3. Modificar la puntuación de una asignatura \n" +
                 "4. Mostrar todos los valores del array bidimensional \n" + "0. Salir del programa \n" + "\n -----Elige una opción----- \n" );
         
         try {
                opcion_APG = Integer.parseInt(br.readLine());
            }catch (Exception e) {
                opcion_APG=-1 ;
     
            }
         
        switch (opcion_APG) {
            
            case 0 :
                
                System.out.println("Fin del programa");
            
             break;   
            
            case 1 :
                      
                 
             for (u=0;u<4;u++){
                 
                 System.out.print(String.format("%-8s ",clasesynotas_APG[u]));
             
              
             }
             break;  
             
            case 2 :
                
                for (u = 0 ; u < 4 ; u++){ // Aquí elegimos la cantidad de bloques de 0 a 4
                    
                
                 valormax_APG = Double.parseDouble(clasesynotas_APG[u][1]); // ya le damos el valor de la primera posicion de cada bloque
                
               for (i = 2 ; i < 4 ; i++){ // Arrancamos desde la posicion dos de cada bloque  porque justo en la linea de arriba tiene le asignamos el valor de la primera posicion
                       
                    if (valormax_APG < Double.parseDouble(clasesynotas_APG [u][i])){   // si el valor de la primera posicion es menor que las dos siguientes se cumple la condicion y pasamos a la linea de abajo
                     valormax_APG = Double.parseDouble(clasesynotas_APG [u][i]); } //le damos el valor que heredamos de arriba a "valormax_APG" y lo guardamos para sacarlo en pantalla (el valor mas alto de cada bloque)
                   
                   }
                    System.out.println("Valor máximo " + clasesynotas_APG[u][0] + " es: " + valormax_APG); // mostramos por pantalla el valor mas alto de cada bloque
                }
                break;
                
                
                
                
                
                
            case 3:
                
                do {
                    
                    System.out.println("Introduce el numero de asignatura entre los valores (0 y 3) de la que quieres cambiar el valor" );
                    
                    try {
                    numeroasig = Integer.parseInt(br.readLine());
                    }catch (Exception e){
                        System.out.println("No puede contener letras");
                       numeroasig = -1;
                    }
                    if ((numeroasig < 0) || (numeroasig > 3)){
                        
                        System.out.println("El valor tiene que ser entre 0 y 3");
                        
                    }
                    }  while ((numeroasig< 0) || (numeroasig > 3));
                
                
                
                
                
                do {
                    
                    System.out.println("Introduce la posición de la nota, un valor entre (1 y 3)");
                    
                   try {
                    valor_APG = Integer.parseInt(br.readLine());
                    
                   }catch (Exception e){
                  
                     
                        System.out.println("No puede contener letras");
                     
                        valor_APG = -1;
                   }
                   if ((valor_APG) < 0)  {
                   
                       System.out.println("el valor introducido no puede ser negativo");
                   }
            
                  }while ((valor_APG< 1) || (valor_APG > 3));
                           
                   
               
                     System.out.println("\nLa asignatura es : " + numeroasig + "\nY la posición de la nota es : " + valor_APG) ;
                
           
                   
                     
                     System.out.println("\nEl valor actual en la posicion " + numeroasig + " , " + valor_APG + " es; " + clasesynotas_APG [numeroasig][valor_APG]) ;
                     
                     
                     
                     do {
                    
                    System.out.println("\nIntroduce el nuevo valor de la nota entre 0 y 10");
                    
                   try {
                     usuarionota = Double.parseDouble(br.readLine()); 
                    
                   }catch (Exception e){
                  
                     
                        System.out.println("No puede contener letras");
                     
                        usuarionota = -1;
                   }
                   if ((usuarionota) < 0)  {
                   
                       System.out.println("el valor introducido no puede ser negativo");
                   }
                 
                  }while ((usuarionota< 0) || (usuarionota > 10));
                     
                  
                  
                 
                   
                        clasesynotas_APG [numeroasig][valor_APG]= String.valueOf(usuarionota);
                        
                        System.out.println("\nEl nuevo valor de la nota es : " + clasesynotas_APG [numeroasig][valor_APG]);
                
                           
               
                break;
            
                case 4:
                
                
                for (i=0;i<4;i++){
                for (u=0;u<4;u++){
                 System.out.print(String.format("%-8s",clasesynotas_APG[u][i]));
                }
                System.out.println("");
                }
                
                
                
                break;
                
                
                
        } 
        
        }while(opcion_APG !=0);
         
         
           
         
     
    }  
  
}
