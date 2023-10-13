/*
* ITESS-TICS-TI502-ASYSC
* Agosto-Diciembre 2023
* U1. Introduccion
* Descrpcion Analicis complejo Test
*by FJMP
*29/09/2023
*/
package tools;

import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class ComplexNumber {
    private float a;
    private float b;
    
    public ComplexNumber(float a, float b){
        this.a = a;
        this.b = b;
        
    }
    public ComplexNumber add(ComplexNumber z){
        return new ComplexNumber(a + z.a, b + z.b);
    }
    public ComplexNumber sube(ComplexNumber z){
        return new ComplexNumber(a - z.a, b - z.b);
    }
    public ComplexNumber mult(ComplexNumber z){
        return new ComplexNumber(a * z.a - b * z.b, a*z.b+b*z.a);
    }
    public ComplexNumber div(ComplexNumber z){
        return new ComplexNumber((a * z.a + b) / (z.a*z.a+z.b*z.b),
                                (b * z.a - a*z.b) / (z.a * z.a + z.b * z.b))    ;
    }
    public ComplexNumber conj(){
        return new ComplexNumber(a, -b);
    }
     public float mod(){
        return (float) (Math.sqrt(a*a + b*b));
    }
     public float angle(){
        return (float) (Math.atan2(b, a));
    }
     
     public ComplexNumber toN(int n){
         float m = mod();
         float th = angle();
         return new ComplexNumber(
            (float)(Math.pow(m, n) * Math.cos(n*th)),
            (float)(Math.pow(m, n) * Math.sin(n*th)));
         
     }
     public ArrayList<ComplexNumber> rootaN(int n){
         float m = mod();
         float th = angle();
         
         
        ArrayList<ComplexNumber> roots = new ArrayList<>();
         for (int k = 0; k < n; k++) {
             float rN= (float) Math.pow(m, 1.0/n);
             float thk = (float)(th + 2*Math.PI*k)/n;
             
             
             roots.add(new ComplexNumber(
             (float) (rN*Math.cos(thk)),
             (float) (rN*Math.cos(thk)) )
             
             );
         }
         return roots;
     }
     public String toCIS(){
         float m = mod();
         float th = angle();
         
         
         return m + " CIS " + (float)(th* 180);
     }

    @Override
    public String toString(){
        return "ComplexNumber(";
    }
}
