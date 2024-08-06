package sayısal_cozumleme;
import java.lang.Math;
public class Numerical_Analysis2 {
    /*double xa;
    double xu;*/
    //boolean bool;
    //float Fx = e^(-x)-sin((pi/2)*x);
    
    public static double Fx_Hesapla(double x){
        //double e = Math.exp(-xa);
        double fx = Math.exp(-x)-Math.sin((Math.PI/2)*x);
        return fx;
    }
    /*
    public static double Fxu_Hesapla(double xu){
       double fxu = Math.exp(-xu)-Math.sin((Math.PI/2)*xu);
       return fxu;
    }*/
     
    public static boolean control(double fxa, double fxu){
        boolean bool=true;
        if(fxa*fxu < 0){
            bool= false;
        }
        return bool;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        double a=0;
        double u=1;
        double ebs=0.001;
        while(true){
            double Fxa_Degeri = Fx_Hesapla(a);
            double Fxu_Degeri = Fx_Hesapla(u);
            /*boolean b = control(Fxa_Degeri, Fxu_Degeri);
            //System.out.println(b);
            if(b){
                break;
            }*/
            double y = (a+u)/2;
            //double Fxy_Degeri = Fx_Hesapla(y);
            if(Fxu_Degeri*Fxa_Degeri < 0){
                u=y;
            }
            else{
                a=y;
            }
            if(Math.abs(Fxa_Degeri-Fxu_Degeri) < ebs || Math.abs(a-u)< ebs){
                System.out.println(y);
                break;
            }
            else{
                System.out.println("simdiki y değeri " + y);
            }
            
        }
    }
}