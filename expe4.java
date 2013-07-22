import java.io.*;

public class expe4
{
    /**
     * Constructor for objects of class expe4
     */
    public static void main(String[]args)throws Exception
    {
        int n=0;
        int m[]=new int[10];
        
InputStreamReader isr = new InputStreamReader(System.in); 
    
BufferedReader br = new BufferedReader(isr); 
 for(n=0;n<m.length;n++){
     System.out.println("ingrese tipo "+m[n]+1+":");
     
  
     //bf=new BufferedReader(new ImputStreamReader(System.in));

     m[n]=Integer.parseInt(br.readLine());
     if (m[n]>0&&m[n]<= 10) {
      System.out.println("plan ilimitado");
    } if (10< m[n] && m[n]<=20) {
      System.out.println("plan controlado");
    } if (20< m[n] && m[n]<=30) {
      System.out.println("plan prepago");
    } if (m[n]<=0||m[n]> 30) {
      System.out.println("planes no dentro de la compañía");
    }

    }
 }
}
