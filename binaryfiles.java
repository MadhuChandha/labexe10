/
package labex10;

//importing package
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

//main class


public class binaryfiles{

    
    public static void main(String[] args) throws Exception {
        
        //program using character stream for binary files
         FileReader fio=null;
        FileWriter fou=null;
        fio=new FileReader("flower.jpg");
        fou=new FileWriter("veg.jpg");
        int i;
        while((i=fio.read())!= -1)
        fou.write(i);
        
        //program using byte stream for binary files
        FileInputStream fi =null;
        FileOutputStream fo =null;
        fi=new FileInputStream("flower.jpg");
        fo=new FileOutputStream("veg.jpg");
        int j;
        while((j=fi.read())!=-1)
        {
            fo.write(j);
        }
        
    }
    
}
