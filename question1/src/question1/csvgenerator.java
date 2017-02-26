package question1;
import java.io.*;
import java.util.*;
public class csvgenerator {
    void csv(){
        try{
            FileWriter t = new FileWriter("by.csv");
            FileWriter r = new FileWriter("grl.csv");
            int j;
            Random a = new Random();
            Random h = new Random();
            for(j=0;j<=7;j++){
		t.write("Devdas"+j+","+a.nextInt(5)+","+a.nextInt(6)+","+a.nextInt(8)+","+0+"\n");
            }
            for(j=0;j<=7;j++){
		r.write("Paro"+j+","+h.nextInt(3)+","+h.nextInt(10)+","+h.nextInt(2)+","+0+"\n");
            }
            t.close();
            r.close();
	}
        catch(IOException e){		
	}
    }	    
}