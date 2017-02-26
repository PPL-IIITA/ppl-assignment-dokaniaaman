package question1;
public class Ladka{
    public String naam;
    public int buddhi;
    public int attractiveness;
    public int minimum_sundar;
    public int aaukat;
    public String pehlapyar;
    public int status;  
    public boolean aman(int aaukat,int exp,int minimum_sundar,int attr){
        check_karo1 b=new check_karo1();
        return b.check(aaukat,exp,minimum_sundar,attr);
    }
}
