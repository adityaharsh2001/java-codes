import java.io.*;
class piglatinword
{
    public static void main (String args[]) throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader y = new BufferedReader(in);

String s,s1=" ",s2=" ";char p;int i,l;
System.out.println("enter a word");
s = y.readLine();
l = s.length();


 for(i=0;i<l;i++)
 {
 p= s.charAt(i);
 if( p=='A'||p=='a'|| p=='E'||p=='e'|| p=='I'||p=='o'|| p=='O'|| p=='U'||p=='u') 
break;
}

 s1 = s.substring(0,i);
 s2 = s.substring(i);

{
System.out.println(s2+s1+"AY");
}
}
}
 }
 
