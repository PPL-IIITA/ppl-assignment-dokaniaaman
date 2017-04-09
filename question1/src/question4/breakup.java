package question4;
import java.io.IOException;
import static java.lang.Math.abs;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import question1.Ladka;
import question1.Ladki;
public class breakup{//do breakup
     public static void breakup(Ladka[] b,Ladki[] g,int i,int k) throws IOException
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
         for(h=0;h<i;h++){//loop for ladke //calculating happiness
            for(l=0;l<i;l++){//loop for ladki 
                if(b[h].pehlapyar ==(g[l].naam)){
                    p=abs(b[h].aaukat- g[l].exp);
                    com[h][0]=p;
                    com[h][1]=h;
                } else {
                }
            }
         }
         for(h=0;h<i;h++){//sorting
               for(l=h+1;l<i;l++){
                   if(com[h][0]>com[l][0]){
                       p=com[h][0];
                       com[h][0]=com[l][0];
                       com[l][0]=p;
                       p=com[h][1];
                       com[h][1]=com[l][1];
                       com[l][1]=p;
                     }
               }
         }
         int o;
         System.out.println("-----------least_happy_jodi-------------------------");
         for(h=0;h<k;h++){//k least happy jodi
             for(l=0;l<i;l++){
                 if(b[com[h][1]].pehlapyar == (g[l].naam)){
                     b[com[h][1]].status=0;
                     g[l].status=0;
                     logger.info(b[com[h][1]].naam+"------"+g[l].naam);
                     
                     for(o=0;o<i;o++){
                          if(b[o].aman(b[o].aaukat,g[l].exp,b[o].minimum_sundar,g[l].attr)){//check conditions
                             if(g[l].dibbi(b[o].aaukat,g[l].exp)){
                                 if( g[l].status==0  && b[o].status == 0){
                                     System.out.println("xxxxxxxxx new_boyfrnd xxxxxxxxxx");//fixed new 
                                      g[l].pehlapyar = b[o].naam;
                                      b[o].status = 1;
                            g[l].status = 1;
                            logger.info(b[o].naam+"------"+g[l].naam);
                                 }
                     }
                 }
             }
         }
         
}
}
    }
}

    

