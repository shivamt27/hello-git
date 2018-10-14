import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
class rtfile 
{

    public static void main(String[] args) throws IOException
	{      

        String fileInput = "C://Users//SHIVAM TANDON//Desktop//shivam.txt";
        FileWriter f1=new FileWriter(fileInput);
        String str=("raj,monty,shawn");
        f1.write(str);
		f1.close();
		FileReader f2=new FileReader(fileInput);
        int ch;
        while ((ch = f2.read()) != -1) 
		{
            System.out.print((char)ch);
		}

        f2.close();
           
    }
}