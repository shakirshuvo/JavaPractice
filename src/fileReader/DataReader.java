package fileReader;

import java.io.*;

public class DataReader {
    public static void main(String[] args) {
        String path ="C:\\Shakir\\HelloPNT.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(path));
        }catch (FileNotFoundException e) {
            System.out.println("Not a valid file path.");
        }

        String data = "";
        while (true){
            try {
                if (!((data = br.readLine()) !=null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(data);
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
