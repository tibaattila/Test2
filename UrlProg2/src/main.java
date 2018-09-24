
import java.util.concurrent.ExecutionException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tiba
 */
public class main {
    public static void main(String[] args) {
       /*
       try{ 
     //   System.out.println(3/0);
        
        int [] t = new int[3];
        for(int i=0;i<25;i++)
         t[i]=i;
       }catch(ArrayIndexOutOfBoundsException e1)
       {
       e1.printStackTrace();
       
       }catch(ArithmeticException e2)
       {
       e2.printStackTrace();
       }catch(Exception e)
       {
       e.printStackTrace();
       
       }finally
       {
           System.out.println("Bármi történik én");
       
       }
        */
        
        
        try{
        URLcim ur= new URLcim("http://");
            System.out.println(ur);
        }catch(URLcímExeption e)
        {
        System.out.println("A keletkezett hiba kódja: "+e.getHibakód());
        e.printStackTrace();
        }
        
    
    }
}
