package question1;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/* couple formation */
public class calculation {
    public static void calculation(Ladka[] b,Ladki[] g,int i) throws IOException
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
        int h,l;
         for(h=0;h<i;h++){//loop for ladke
            for(l=0;l<i;l++){//loop for ladki          
                if(b[h].aman(b[h].aaukat,g[l].exp,b[h].minimum_sundar,g[l].attr)){//check conditions
                    if(g[l].dibbi(b[h].aaukat,g[l].exp)){
                        if( g[l].status==0  && b[h].status == 0){
                            b[h].pehlapyar = g[l].naam;
                            g[l].pehlapyar = b[h].naam;
                            b[h].status = 1;
                            g[l].status = 1;
                            logger.info(b[h].naam+"------"+g[l].naam);
                        }
                    }
                }  
            }
         }
    }
}
