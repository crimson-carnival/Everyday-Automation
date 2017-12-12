import java.io.*;
import java.util.*;
class Sort
{
    public static void main(String[]args)throws IOException
    {
        String s1[] = new String[80];
        String s2[] = new String[80];
        String s3[] = new String[80];

        FileReader fr = new FileReader("List.txt");
        BufferedReader br = new BufferedReader(fr);

        FileReader fr2 = new FileReader("List1.txt");
        BufferedReader br2 = new BufferedReader(fr2);

        FileReader fr3 = new FileReader("List2.txt");
        BufferedReader br3 = new BufferedReader(fr3);

        String s="";
        int a=0,b=0, c=0, i=0, j=0;
        while((s=br.readLine()) != null) s1[a++]=s;

        while((s=br2.readLine()) != null) s2[b++]=s;

        while((s=br3.readLine()) != null) s3[c++]=s;

        for(i=0;i<a;i++) for(j=0;j<b;j++) if(s1[i].equalsIgnoreCase(s2[j])) s2[j]=""; 

        for(j=0;j<b;j++) if(s2[j].length() > 0) System.out.println(s3[j]); 
    }
}