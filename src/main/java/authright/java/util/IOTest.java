package authright.java.util;

import java.io.*;
import java.util.List;

public class IOTest {


    public void deleteSpecificLines(List<String> apps) throws IOException {

        File f = new File("D:/myJavaProject/appIssue");
        File f2 = new File("D:/myJavaProject/appIssue2");

        BufferedWriter wr = new BufferedWriter(new FileWriter(f2));
        InputStream in = new FileInputStream(f);
        StringBuffer bf = new StringBuffer();
        BufferedReader br = new BufferedReader(new FileReader(f));

        boolean flag = true;
        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            for (String s : apps) {
                line.trim();
                if (line.contains(s)) {
                    flag = false;
                }
            }
            if (flag) {
                wr.write(line);
                wr.newLine();
                wr.flush();
                count++;
            }
            flag = true;

        }
        wr.write("lines count: " + count);
        wr.flush();
        System.out.println("Delete completed");

        br.close();
        wr.close();

    }

    public boolean comparetest(){
        return (1 > 0);
    }



}
