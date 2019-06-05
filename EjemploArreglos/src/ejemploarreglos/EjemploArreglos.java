
package ejemploarreglos;

import java.util.Scanner;

 

public class EjemploArreglos {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
          System.out.println("Ingrese el numero de personas: ");
          int nPersona=sc.nextInt();
          
         Persona[] personas=new Persona[nPersona];
         int sumatoria=0;
         
         
         for (int i = 0; i < personas.length; i++) {
             
                System.out.println("Persona "+ (i+1)+":");
                
                sc.nextLine();
                System.out.println("Nombre");
                String nombre=sc.nextLine();
                
                
                System.out.println("Apellido");
                String apellido=sc.nextLine();
                
                System.out.println("Calificacion");
                int calificacion=sc.nextInt();
            
                
                
                personas[i]= new Persona(nombre,apellido,calificacion);
                
                sumatoria=sumatoria+calificacion;
                
                
        }
         
          System.out.println("Nombre\t\tApellido\t\tCalificacion");
         
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].getNombre()+"\t\t"+personas[i].getApellido()+"\t\t\t"+personas[i].getCalificacion());
            
            
        }
         
            System.out.println("El promedio es: "+sumatoria/nPersona);
          
//         int edades[];
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Ingrese el numero de elementos del arreglo: ");
//       
//        //Leer numero elementos arreglo
//        int numeroElementos=sc.nextInt();
//        edades = new int[numeroElementos];
//        
//        //Leer los elementos del arreglo
//        
//        for (int i = 0; i < edades.length; i++) {
//            
//            System.out.println("Ingrese el elemento "+ i +":");
//            
//            edades[i]=sc.nextInt();
//            
//        }
//        System.out.println("Los elementos del arreglos son: ");
//        
//        //imprimir los elementos de arreglo
//        for (int i = 0; i <edades.length; i++) {
//            System.out.println(edades[i]);
//            
//        }
//        
//     
//        String Apellidos[];
//        
//        System.out.println("Ingrese el numero de apellidos: ");
//        
//        //leer numero apellidos//
//        int numeroApellidos=sc.nextInt();
//        sc.nextLine();
//        Apellidos = new String[numeroApellidos];
//                
//        
//        //leer los elementos arreglos//
//         for (int i = 0; i < Apellidos.length; i++) {
//            
//            System.out.println("Ingrese el apellido "+ i +":");
//            
//            Apellidos[i]=sc.nextLine();
//            
//        }
//         
//         //imprimir elementos
//         
//            System.out.println("Los elementos del arreglos son: ");
//        
//        //imprimir los elementos de arreglo
//        for (int i = 0; i <Apellidos.length; i++) {
//            System.out.println(Apellidos[i]);
//            
//        }
        
        //imprimir arreglo;
      
        
        
        
      /*  
        for (int i = 0; i < edades.length; i++) {    
            
             System.out.println("Elemento indice "+ i+":"+edades[i]);
        } 
        

     String personas[] = {"Luis", "Diana","Pepe"};
       
           for (int i = 0; i < personas.length; i++) {    
            
             System.out.println("Elemento indice "+ i+":"+personas[i]);
        } 
   
    
        String apellidos[] = {"Suarez", "Guillen", "Perez", "Ramon","Cruz"};
        
           for (int i = 0; i < apellidos.length; i++) {
               
              
            System.out.println("Apellidos indice "+ i+":"+apellidos[i]);
               
            
        }*/
        
    }
    
}
