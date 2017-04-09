package question1;
import question2.*;
import question5.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import question1.question2.compatible;
//import question1.question2.happyjodi;
import question4.*;
public class mainfunction {
 public static void main(String[] args) throws IOException{                
                int i,j;
		i=0;
		j=0;
                Ladki g[] = new Ladki[1000];
                csvgenerator c=new csvgenerator();
                c.csv();
		String csv="grl.csv";
                String line = "";
		String Split = ",";
		BufferedReader gbuff=null ;
		try{
                    gbuff = new BufferedReader(new FileReader(csv));
                    while((line = gbuff.readLine() )!= null){                
			String[] grl = line.split(Split);
			g[j] = new Ladki();
                        g[j].naam = grl[0];
                        g[j].buddhi = Integer.parseInt(grl[1]);
                        g[j].attr = Integer.parseInt(grl[2]);
			g[j].exp = Integer.parseInt(grl[3]); 
                        g[j].status = Integer.parseInt(grl[4]);
                        j++;        
                    }
		}
		catch(FileNotFoundException e){
                    e.printStackTrace();
		}
                catch(IOException e){
                    e.printStackTrace();
		}
                Ladka b[] = new Ladka[1000];
                csv="by.csv";
                String line1 = "";
		String csvsplit = ",";
		BufferedReader buff = null;
                i=0;
		try{
                    buff = new BufferedReader(new FileReader(csv));
                    while((line1 = buff.readLine() )!= null){
			String[] by = line1.split(csvsplit);
			b[i] = new Ladka();
                        b[i].naam = by[0];
                        b[i].aaukat = Integer.parseInt(by[1]);
			b[i].buddhi = Integer.parseInt(by[2]);
			b[i].minimum_sundar = Integer.parseInt(by[3]);
                        b[i].status = Integer.parseInt(by[4]);
			i++;
                    }
		}
		catch(FileNotFoundException e){
                    e.printStackTrace();
		}
                catch(IOException e){
                    e.printStackTrace();
		}
                calculation q=new calculation();
                      q.calculation(b,g,i);
                      int k;
                      k=5; // k is fixed
                compatible w= new compatible();
                   w.compatible(b,g,i,k);
                happyjodi m= new happyjodi();
                    m.happyjodi(b,g,i,k);
                breakup as=new breakup();
                as.breakup(b,g,i,k);
                onebyone sd=new onebyone();
                    sd.onebyone(b,g,i,k);
 }
 
}