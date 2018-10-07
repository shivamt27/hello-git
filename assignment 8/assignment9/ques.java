import java.io.*;
import java.io.FileReader;
class file
{
	public static void main(String[] args) throws IOException 
	{
		File mydir=new File("my folder/text/filehandling");
		mydir.mkdirs();
		File f1=new File(mydir,"file.txt");
		boolean result=f1.createNewFile();
		System.out.println("Is Created?:"+((result)?"Yes":"No"));
		FileReader reader = new FileReader("my folder/text/filehandling/file.txt");
		int ch;
		while ((ch = reader.read()) != -1) 
		{
                System.out.print((char) ch);
		}
        System.out.print("\n");
		reader.close();
		System.out.println("FileAbsolutepath:"+f1.getAbsolutePath());
	}
}