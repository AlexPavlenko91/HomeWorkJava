package Task6;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppCopy3FilesTo4 {
    static int bytesSize = 0;

    public static void main(String[] args) {
        List<String> paths = new ArrayList<>(Arrays.asList("", "", "", ""));
        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 0; i < 4; i++) {
                paths.set(i, getPath(scan, i + 1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        String res = "";
        for (int i = 0; i < 3; i++) {
            res += getStringWithBuffer(paths.get(i));
            System.out.println("Size of " + (i + 1) + " file = " + bytesSize);
        }
        outStream(res, paths.get(3));
        System.out.println("--------------------");
        System.out.println("Final text = " + res);
        System.out.println("--------------------");
        System.out.println("Total files size = " + bytesSize);
    }

    public static String getPath(Scanner scan, int num) {
        System.out.println("Please enter the path to the " + num + " file:");
        return scan.next();
    }

    private static String getStringWithBuffer(String path) {
        String text = "";
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(path))) {
            byte[] buff = new byte[in.available()];
            int count;
            while ((count = in.read(buff)) > 0) {
                text = new String(buff, 0, count, "utf8");
            }
            bytesSize += buff.length;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    private static void outStream(String str, String path) {
        try (OutputStream out = new FileOutputStream(path)) {
            out.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
