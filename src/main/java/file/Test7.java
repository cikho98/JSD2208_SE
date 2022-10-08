package file;

import java.io.*;

public class Test7 {
    public static void main(String[] args) throws IOException {
        File dirs = new File("./src/main/java");
        for (File dir :dirs.listFiles()){
            if (dir.isDirectory()){
                for (File file : dir.listFiles(f->f.getName().endsWith(".java"))){
                    FileInputStream fis = new FileInputStream(file);
                    InputStreamReader isr = new InputStreamReader(fis);
                    BufferedReader br = new BufferedReader(isr);
                    String line;
                    System.out.println(file.getName()+":_______");
                    while((line=br.readLine())!=null){
                        System.out.println(line);
                    }
                    System.out.println("");
                    br.close();
                }
            }
        }
    }
}
