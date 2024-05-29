import java.util.*;
public class WeakHashMap
{
public static void main(String []args)
{
WeakHashMap<String,Integer> whm=new WeakHashMap<String,Integer>();
whm.put("ONE",1);
whm.put("TWO",2);
whm.put("THREE",3);
System.out.println(whm);
String four=new String("FOUR");
Integer fourValue=4;
whm.put(four,fourValue);
System.out.println(whm);
four=null;
System.gc();
System.out.println("Weak Hash Map after the enrty of null key is removed:"+whm);
}
}
