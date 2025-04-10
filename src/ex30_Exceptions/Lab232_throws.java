package ex30_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab232_throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
        String s1 = null;
        s1.trim();
        int a = 10 / 0;
        File file = new File("");
    }

    static void t() throws ArithmeticException,NullPointerException,Exception {
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
    }
}


