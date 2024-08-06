
package sayısal_cozumleme;
import java.lang.Math;

public class Numerical_Analysis {
    
    
    public static double Fonk(double x){
        return (x*x+1)/3;
    }
    
    
    public static double Fonk2(double x){
        return -1/(x-3);
    }
    
    
    public static double Fonk3(double x){
        return Math.pow(3*x-1, 0.5);
    }
    
    // hx = yeni kökümüz
    public static void main(String[] args){
        
        double x=2;
        double e=0.01;
        double hx, hata;
        hx=Fonk2(x);
        hata=Math.abs(hx-x);
        while(hata>e){
            x=hx;
            hx=Fonk2(x);
            hata=Math.abs(hx-x);
        }
        System.out.println(hx);
        
        
    }
}
