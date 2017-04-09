package question5;
import java.io.IOException;
import static java.lang.Math.abs;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import question1.Ladka;
import question1.Ladki;

/**
 *
 * @author AMAN DOKANIA
 */
public class onebyone{
 public static void onebyone(Ladka[] b,Ladki[] g,int i,int k) throws IOException
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
        int h,l=0;
        for(h=0;h<i;h++){//reset status
            b[h].status=0;
            g[h].status=0;
        }
        int z,o;
        int r=0;
        h=0;
        for(z=0;z<2*i;z++){//one by one commitment
            if(r==0){//girl commited
                 for(o=0;o<i;o++){
                          if(b[o].aman(b[o].aaukat,g[l].exp,b[o].minimum_sundar,g[l].attr)){//check conditions
                             if(g[l].dibbi(b[o].aaukat,g[l].exp)){
                                 if( g[l].status==0  && b[o].status == 0){
                                     //System.out.println("xxxxxxxxx new_boyfrnd xxxxxxxxxx");//fixed new 
                                      g[l].pehlapyar = b[o].naam;
                                      b[o].status = 1;
                            g[l].status = 1;
                            l++;
                            r=1;
                            logger.info(b[o].naam+"------"+g[l].naam);
                                 }
                             }
                          }
                 }
            }
            if(r==1){//boy commited
                 for(o=0;o<i;o++){
                          if(b[h].aman(b[h].aaukat,g[o].exp,b[h].minimum_sundar,g[o].attr)){//check conditions
                             if(g[l].dibbi(b[h].aaukat,g[o].exp)){
                                 if( g[o].status==0  && b[h].status == 0){
                                     //System.out.println("xxxxxxxxx new_boyfrnd xxxxxxxxxx");//fixed new 
                                      g[o].pehlapyar = b[h].naam;
                                      b[h].status = 1;
                            g[o].status = 1;
                            h++;
                            r=0;
                            logger.info(b[h].naam+"------"+g[o].naam);
                                 }
                             }
                          }
                 }
            }
        }
        int p;
        int com[][]=new int[i][2];
        for(h=0;h<i;h++){//loop for ladke
            for(l=0;l<i;l++){//loop for ladki 
                if(b[h].pehlapyar ==(g[l].naam)){
                    p=abs(b[h].aaukat- g[l].exp);//calculation for happiness
                    com[h][0]=p;
                    com[h][1]=h;
                } else {
                }
            }
         }
         for(h=0;h<i;h++){//sorting according to value of happiness
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
            
            
        
            
        
               
        

