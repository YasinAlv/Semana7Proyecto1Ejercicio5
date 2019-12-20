/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoejercicio5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yasin
 */
enum Operador{SUMA, RESTA, MULTIPLICACION, DIVISION};

public class Calculadora {
    protected int resultado;
    protected Operador operador;

    public Calculadora(){}
    
   public Calculadora (int resultado ){
        this.resultado = resultado;
    }
   //*************************************************
   //METODOS

    public int getResultado() {
       return this.resultado;
    }
    
    public void setOperador(Operador operador){
    
        this.operador=operador;
    }
    
    public String getOperador(){
    
        return this.operador.name();
    }
    
    public int Sumar(int a, int b){
        this.resultado=a+b;
        return this.resultado;
    }
    
    public int Restar(int a, int b){
        this.resultado=a-b;
        return this.resultado;
    }
    
    public int Multiplicar(int a, int b){
        this.resultado=a*b;
        return this.resultado;
    }
    
    public int Dividir(int a, int b){
        this.resultado=a/b;
        return this.resultado;
    }
}//
