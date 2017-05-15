package com.bozhong.document.junit;


import com.bozhong.document.task.Converter;

/**
 * Created by xiezg@317hu.com on 2017/4/26 0026.
 */
public class JacobTest {

    public static void main(String args[]) {
        System.out.println(System.getProperty("java.io.tmpdir"));
        System.out.println(System.getProperty("java.library.path"));
        String inputFile = "D:\\office\\1.doc";
        String outputFile = "D:\\office\\1.pdf";
        Converter.convert2PDF(inputFile, outputFile);
        System.out.println(System.getProperty("os.name"));
    }


}
