/*
* ITESS-TICS-TI502-ASYSC
* Agosto-Diciembre 2023
* U3. Series de Fourier
* Descrpcion Aproximacion Cuadratica
*by FJMP
*13/10/2023
*/
package fourier.series;

public class MmmmSerieSquared {
    private float T;
    private int nPoints;
    private float t[];
    private float s[];
    private float f;
    
    public MmmmSerieSquared(float T, int nPoints){
        this.T = T;
        this.f = 1/T;
        this.nPoints = nPoints;
    }
    public void computeTime(){
        float dt = T/nPoints;
        t = new float [nPoints];
        for (int i = 0; i < nPoints; i++) {
            t[i] = dt*i;
        }
    }
    public void computeSignal(int N){
        s = new float [nPoints]; 
        //Generar los valores de an y bn
        //Calcular la proximacion
        for (int i = 0; i < nPoints; i++) {
            float a0 = 1;
            s[i] = a0/2;
            for (int n = 1; n < N; n++) {
                float an = 0;
                float bn = 0;
                if(n%2 == 1){
                    bn = (float)(1 / (Math.PI * n));
                }
                s[i] += (float) (an * Math.cos(2 * Math.PI * f * n * t[i]) +
                         (bn * Math.sin(2 * Math.PI * f * n * t[i])));
            }
        }
    }
    public float[] getTime(){
        return t;
    }
    public float[] getSignal(){
        return s;
    }
}
