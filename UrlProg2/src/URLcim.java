
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tiba
 */
public class URLcim {
    String protokoll;
    String tartomány;
    String elérésiÚt;
    
    /**
     * 
     * @param cím az URL cím
     * @throws URLcímExeption  Saját kivételt dob
     */

    public URLcim(String cím) throws URLcímExeption
       {
             
       if(cím.length()<5)
           throw new URLcímExeption(1, "Rövíd a cím");
       
       if(cím.indexOf("://")!=cím.lastIndexOf("://"))
           throw new URLcímExeption(2, "Több :// található a címbne");
        
       String[] seged=cím.split("://",-1);
        if(seged[0].equals("http") || seged[0].equals("ftp") || seged[0].equals("fle") )
           this.protokoll=seged[0];
        else
            throw new URLcímExeption(3, "Hibás protokoll");
       
        
        if(!seged[1].contains("/"))
        
        {
            String[] seged2=seged[1].split("\\.", -1);
//            String[] tiba=seged[1].split("\\.");
//            System.out.println("Na most"+Arrays.toString(seged2));
//             System.out.println("Na Tiba"+Arrays.toString(tiba));
            System.out.println(seged2[0]);
        
            
        if(seged2.length!=1)
        {
        
            for(int i=0;i<seged2.length;i++)
            {
            if(seged2[i].equals(""))
              throw new URLcímExeption(4, "Van pont, de üres stzting van van köztük");   
            }
        
            if(seged2[seged2.length-1].length()<2)
                throw new URLcímExeption(4, "Van pont, de az utolsó pont után kettőnél kebesebb hossz");  
            this.tartomány=seged[1];
        }
        else {
            
         throw new URLcímExeption(4, "Nincs pont");
        
        }
        
        }else
        {
        String[] seged3=seged[1].split("/",-1);
        
           
        String[] seged4=seged3[0].split("\\.");
           
        if(seged4.length!=0)
        {
        
            for(int i=0;i<seged4.length;i++)
            {
            if(seged4[i].equals(""))
              throw new URLcímExeption(5, "Van pont, de üres stzting van van köztük");   
            }
        
            if(seged4[seged4.length-1].length()<2)
                throw new URLcímExeption(5, "Van pont, de az utolsó pont után kettőnél kebesebb hossz");  
            this.tartomány=seged3[0];
        }
        else {
            
         throw new URLcímExeption(5, "Nincs pont");
        
        }
        String  eleres="";
        for(int i=1;i<seged3.length;i++)
            if(seged3[i].equals(""))
            {      throw new URLcímExeption(5, "A per jelek között ures String van");
         
            
            }else
                 eleres+=seged3[i]+"/";
        this.elérésiÚt=eleres;
        }
      
      //  this.tartomány="mi";
     }

    public String getProtokoll() {
        return protokoll;
    }

    public String getTartomány() {
        return tartomány;
    }

    public String getElérésiÚt() {
        return elérésiÚt;
    }

    @Override
    public String toString() {
        return "URLcim{" + "protokoll= " + protokoll + ", tartom\u00e1ny= " + tartomány + ", el\u00e9r\u00e9si\u00dat= " + elérésiÚt + '}';
    }
    
}
