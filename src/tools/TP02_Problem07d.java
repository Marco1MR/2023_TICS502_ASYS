/*
* ITESS-TICS-TI502-ASYSC
* Agosto-Diciembre 2023
* U1. Introduccion
* Descrpcion: TP02_Funciones_P7 inicio d
*by FJMP
*29/09/2023
*/
package tools;

/**
 *
 * @author rodri
 */
public class TP02_Problem07d {
    private int n;
    Arraylist<ComplexNumber> z = new Arraylist<>();
    Arraylist<ComplexNumber> w = new Arraylist<>();
    
    
    public TP02_Problem07d (int n){
        this.n = n;
    }
    
    public void initZ(){
        float delta = 1.0f/this.n;
        
        for (float a = 0.0f; a <= 1.0f; a+=delta) 
            for (float b = 0.0f; b <= 1.0f; b+=delta)
                z.add(new ComplexNumber(a,b));
        
    }
    
    public void computeW(){
       /* for (ComplexNumber C:z)
            w.add(C.toN(2));*/
    }
}
