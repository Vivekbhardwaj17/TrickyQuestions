package javainputoutput;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\dell\\Desktop\\OrganiZen\\All-in-One 12-10-2020\\Tricky Questions\\src\\javainputoutput\\abc.txt");
        Scanner sc = new Scanner(file);
        System.out.println(sc.nextLine());
        FileWriter write = new FileWriter("write.txt");
        String str ="My created file";
        while(sc.hasNext()){
            str+=sc.nextLine()+"\n";
        }
        System.out.println(str);
        write.write ("jo");
        File  fadd = new File("C:\\Users\\dell\\Desktop\\OrganiZen\\All-in-One 12-10-2020\\Tricky Questions\\src\\javainputoutput\\write.txt");
        Scanner sfg=new Scanner(fadd);
     //   System.out.println(sfg.nextLine());
    }
}
