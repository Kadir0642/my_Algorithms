package Java_Enter;

import java.util.*;

public class Main
{
    public static void main(String[]args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a first String: ");
        String s1=input.nextLine();
        System.out.println("Enter a second String: ");
        String s2=input.nextLine();

        quest q1=new quest(s1,s2);
        if(q1.compare())
        {
            System.out.println("'"+s1+"'"+" kelimesi "+"'"+s2+"'"+" kelimesinin alt kümesidir.");
        }else
        {
            System.out.println("'"+s1+"'"+ " kelimesi "+"'"+s2+"'"+" kelimesinin alt kümesi değildir.");
        }
    }
}

class quest
{
    String s,t;
    int pointerS=0,pointerT=0;

    public quest(String s1,String s2) // stringleri aldığımız constructer
    {
        this.s=s1;
        this.t=s2;
    }
    public boolean compare() // karşılaştırdığımız fonksiyon
    {
        while(pointerS< s.length() && pointerT<t.length()) // burada herhangi bir dizi bittiğinde aramayı bitirir
        {                                                  // ya harflerin hepsi bulunmuştur yada bulunamamıştır.
            if(s.charAt(pointerS) == t.charAt(pointerT))
            {
                pointerS++; // harf bulunduysa ilerler s dizisinde
            }
            pointerT++; // harf bulunsun veya bulunmasın "t" dizisi üzerinde çalıştığımızdan dizi her halükarda ilerler
        }
        return pointerS==s.length(); // hepsi sırasıyla bulunduysa  True döner( s dizisi alt kümesidir t dizisinin)
                                    // yoksa False döner ( s dizisi alt kümesi değildir t kümesinin )
    }
}
