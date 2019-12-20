/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Yasin
 */
public class ProyectoEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numA, numB, result = 0;
        String A,B;
        boolean primeraVes = true, validacion=true;
        Scanner Teclado = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        String respuesta;
        ArrayList<String> listaCalculadora = new ArrayList<>(); //diamante

        System.out.println("Bienvenido al sistema de Calculadora");
        do {
            if (primeraVes) {
                numA=Validar();
                A=String.valueOf(numA);
                listaCalculadora.add(A);
                calculadora = elegirOperador();
                numB=Validar();
                if (null == calculadora.getOperador()) {
                    calculadora.Dividir(numA, numB);
                } else {
                    switch (calculadora.getOperador()) {
                        case "SUMA":
                            calculadora.Sumar(numA, numB);
                            listaCalculadora.add(" + ");
                            break;
                        case "RESTA":
                            calculadora.Sumar(numA, numB);
                            listaCalculadora.add(" - ");
                            break;
                        case "MULTIPLICACION":
                            calculadora.Multiplicar(numA, numB);
                            listaCalculadora.add(" * ");
                            break;
                        default:
                            calculadora.Dividir(numA, numB);
                            listaCalculadora.add(" / ");
                            break;
                    }
                }
                B=String.valueOf(numB);
                listaCalculadora.add(B);
                result = calculadora.getResultado();
                primeraVes = false;
            } else {
                calculadora = elegirOperador();
                numB = Validar();
                if (null == calculadora.getOperador()) {
                    calculadora.Dividir(result, numB);
                    listaCalculadora.add(" / ");
                } else {
                    switch (calculadora.getOperador()) {
                        case "SUMA":
                            calculadora.Sumar(result, numB);
                            listaCalculadora.add(" + ");
                            break;
                        case "RESTA":
                            calculadora.Sumar(result, numB);
                            listaCalculadora.add(" - ");
                            break;
                        case "MULTIPLICACION":
                            calculadora.Multiplicar(result, numB);
                            listaCalculadora.add(" * ");
                            break;
                        default:
                            calculadora.Dividir(result, numB);
                            listaCalculadora.add(" / ");
                            break;
                    }
                }
                result = calculadora.getResultado();
                String C = String.valueOf(numB);
                listaCalculadora.add(C);
            }
            System.out.println("Desea agregar otra operacion? (S/N)");
            respuesta = Teclado.next();
        } while (("S".equals(respuesta))||("s".equals(respuesta))||("Si".equals(respuesta))||("Sí".equals(respuesta)));
        System.out.println("El resultado de las operaciones digitadas es: " + result);
        System.out.println("Operacion digitada en el siguiente orden");
        imprimirOperacion(listaCalculadora);
        System.out.println("");
    }

    //************************************************************************
    public static Calculadora elegirOperador() {

        Scanner Teclado = new Scanner(System.in);
        int op=0;
        Calculadora calculadora = new Calculadora();
        System.out.println("Seleccion la operacion que desea realizar: ");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        do {
            if(op>4){
                System.out.println("Digite una opción valida");
            }
            op = Validar();
            switch (op) {

                case 1:
                    calculadora.setOperador(Operador.SUMA);
                    break;
                case 2:
                    calculadora.setOperador(Operador.RESTA);
                    break;
                case 3:
                    calculadora.setOperador(Operador.MULTIPLICACION);
                    break;
                case 4:
                    calculadora.setOperador(Operador.DIVISION);
                    break;
            }
        } while (op > 5);
        return calculadora;
    }

    //************************************************************************
    public static void imprimirOperacion( ArrayList<String> listaCalculadora){
    
        for (int i = 0; i < listaCalculadora.size(); i++) {
            System.out.print(listaCalculadora.get(i)); 
        }
    }
    
    //************************************************************************
    public static int Validar(){
        Scanner Teclado = new Scanner(System.in);
        boolean validacion;
        int numA=0;
    do {
                    System.out.println("Digite un numero: ");
                    String A = Teclado.next();
                    try{
                        numA=Integer.parseInt(A);
                        validacion=true;
                    }catch(NumberFormatException ex){
                    System.out.println("Favor digite un número entero");
                    validacion=false;
                    }
                } while (validacion==false);
    return numA;
    }
}//

