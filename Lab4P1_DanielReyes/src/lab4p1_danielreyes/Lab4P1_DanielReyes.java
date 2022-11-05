package lab4p1_danielreyes;

import java.util.Scanner;

public class Lab4P1_DanielReyes {
static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
        int resp;
        do{
            System.out.println("-----Menu------");
            System.out.println("1- Sumador Binario");
            System.out.println("2- Contains");
            System.out.println("3- Alpha");
            System.out.println("4- Salir del sistema");
            System.out.println("Ingrese una opcion: ");
            resp = leer.nextInt();
           
        switch (resp){
            case 1: 
                System.out.println("Ha seleccionado la opcion 1");
                System.out.println("Ingrese la primera cadena: ");
                String cad1 = leer.next();
                System.out.println("Ingrese la segunda cadena: ");
                String cad2 = leer.next();
                binario(cad1, cad2);
                break;
                
            case 2:
                System.out.println("Ha seleccionado la opcion 2");
                System.out.println("Ingrese la cadena contenedor: ");
                String contenedor = leer.nextLine().toLowerCase();
                contenedor = leer.nextLine().toLowerCase();
                System.out.println("Ingrese la cadena contenida: ");
                String contenida = leer.next().toLowerCase();
                contains(contenedor, contenida);
                break;
                
            case 3:
                System.out.println("Ha seleccionado la opcion 3");
                System.out.println("Ingrese la cadena que desee evaluar: ");
                String cadena = leer.nextLine().toLowerCase();
                cadena = leer.nextLine().toLowerCase();
                alpha(cadena);
                break;
        }// switch
        }while (resp !=4); // fin do while
    }// main
    
    public static void binario(String cad1, String cad2){
        if (cad1.length() == cad2.length()){
        int cont = 0;
            for ( int i = 0; i < cad1.length(); i++){
            char a = cad1.charAt(i);
            switch(a){
                case '0': 
                case '1':
                    cont++;
                    break;
            }// switch para contar que sean 1s y 0s
        }// for verificar si contiene 1s y 0s
      
            if (cont == cad1.length()){
                //System.out.println ("Si entra");
                cont = 0;
                for( int j = 0; j < cad2.length(); j++){
                    char b = cad2.charAt(j);
                    switch(b){
                        case '0':
                        case '1':
                            cont++;
                            break;
                    }// switch para contar que sean 1s y 0s
                }// for verificar si cad2 contiene 0s y 1s
                if (cont == cad2.length()){
                    int x = cad1.length() - 1, y = cad2.length() - 1, contadorr = 0;
                    while (x >= 0 && y >= 0){
                        char a = cad1.charAt(x), b = cad2.charAt(y);
                    
                        if ( a == b){
                            
                            System.out.print("0");
                            if (a == '1' && b == '1'){
                                
                                
                                
                            }//if de sumar
                        }// if interior
                        else{
                            System.out.print("1");
                        } // else interior
                        x--;
                        y--;
                    }// while
                    
                    System.out.println();
                }// if sumar
                else{
                    System.out.println("La segunda cadena contiene caracteres que no son 1s o 0s");
                }// else de salida porque la cad2 contiene otros numeros
            }// if verificar cad 2
            else{
                System.out.println("La primera cadena contiene caracteres que no son 1s o 0s");
            }// else de salida porque la cad1 contiene otros numeros
        }// if si las palabras tienen mismo length
        else{
            System.out.println("Las cadenas deben tener la misma cantidad de caracteres");
        }// else no tienen el mismo length
        
    }// fin static binario
    
    public static void contains(String contenedor,String contenida){
        if (contenedor.length() >= contenida.length()){
            int contador = 0, cont2 = 0;
            for (int a = 0; a < contenida.length(); a++){
                char x = contenida.charAt(a);
                
               
                for (int b = cont2; b < contenedor.length(); b++){
                    char y = contenedor.charAt(b);
                    cont2++;
                    if (x == y ){
                        System.out.println("contador: "+ contador);
                        System.out.println("contenida: "+ cont2);
                        contador = contador + 1;
                        
                        break;
                    }// if caracter igual
                    else{
                        contador = 0;
                        
                    }// else para acumular 
                    char nuevo = contenida.charAt(0);
                    System.out.println(" nuevo "+ nuevo);
                    if (nuevo == y){
                        /*contador = contador + 1;
                        a = 0;
                        b = contenedor.length() - cont2;*/
                        
                        break;
                    }// fin if
                }// for menor
                if (contador == contenida.length()){
                    System.out.println("La cadena "+ contenedor +" contiene la cadena "+ contenida);
                    break;
                }// if resultado
            }// for mayor
            if (contador != contenida.length()){
                    System.out.println("La cadena "+ contenedor +" no contiene la cadena "+ contenida);
            }// if resultado negativo
               
        }// if validacion que la cadena 1 es mayor
        else{
            System.out.println("El tamaño de la segunda cadena no puede ser mayor que el de la primera");
        }// else validacion que la cadena 2 es mayor
        
    }// fin static contains
    
    public static void alpha(String cadena){
        int contador = 0;
        for (int i = 97; i <= 122; i++){
            for(int k = 0; k < cadena.length(); k++){
                char letra = cadena.charAt(k);
                if (i == letra){
                    contador++;
                }
            }// for interno
        }// For ASCII
        if (contador == cadena.length()){
            System.out.println("La cadena sólo contiene letras");
        }
        else{
            System.out.println("La cadena contiene caracteres que no son letras");
        }
    }// fin static alpha
    
    
    
}// fin class
