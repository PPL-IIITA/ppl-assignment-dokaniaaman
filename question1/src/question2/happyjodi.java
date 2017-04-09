package question2;
import java.io.IOException;
import static java.lang.Math.abs;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import question1.Ladka;
import question1.Ladki;
public class happyjodi{
     public static void happyjodi(Ladka[] b,Ladki[] g,int i,int k) throws IOException
    {    
        Logger logger = Logger.getLogger("log");  
        FileHandler f;  
        try {   
            f = new FileHandler("output.txt");  
            logger.addHandler(f);
            SimpleFormatter form = new SimpleFormatter();  
            f.setFormatter(form);  
        } 
        catch (SecurityException e) { 
            e.printStackTrace();  
        } 
        catch (IOException e) {  
            e.printStackTrace();  
        }  
        int com[][]=new int[1000][2];
        int h,l,p;
         for(h=0;h<i;h++){//loop for ladke
            for(l=0;l<i;l++){//loop for ladki 
                if(b[h].pehlapyar ==(g[l].naam)){
                    p=abs(b[h].aaukat- g[l].exp);
                    com[h][0]=p;
                    com[h][1]=h;
                } else {
                }
            }
         }
         for(h=0;h<i;h++){
               for(l=h+1;l<i;l++){
                   if(com[h][0]<com[l][0]){
                       p=com[h][0];
                       com[h][0]=com[l][0];
                       com[l][0]=p;
                       p=com[h][1];
                       com[h][1]=com[l][1];
                       com[l][1]=p;
                     }
               }
         }
         System.out.println("-----------happy_jodi-------------------------");
         for(h=0;h<k;h++){
             for(l=0;l<i;l++){
                 if(b[com[h][1]].pehlapyar == (g[l].naam)){
                     logger.info(b[com[h][1]].naam+"------"+g[l].naam);
                 }
             }
         }
         
}
}

