import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
class raju
{
	public static void main(String args[]) throws IOException
	{      

        String fileInput = "C://Users//shivam//Desktop//abc.txt";
        String fileoutput = "C://Users//shivam//Desktop//xyz.txt";
  
            FileReader fr=new FileReader(fileInput);
            FileWriter fw=new FileWriter(fileoutput);
            
            int c;
            while((c=fr.read())!=-1) 
			{
                fw.write(c);
            }
	        fw.close();
            FileReader f3=new FileReader(fileoutput);
            int character;
            while ((character = f3.read()) != -1) 
			{
                System.out.print((char)character);
			}

            fr.close();
            f3.close();
           
     }
}