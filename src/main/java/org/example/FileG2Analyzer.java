package org.example;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileG2Analyzer {

    public static void main(String[] args) throws IOException {
        int g2Counter = 0;
        int g3Counter = 0;

        List<String> strings = FileUtils.readLines(new File("C:\\Users\\Asus\\Downloads\\PFM-1_Color.gcode"));
        for (int i = 0; i < strings.size(); i++) {
            String line = strings.get(i);
            if (line.contains("G2")) {
                g2Counter++;
            } else if (line.contains("G3")) {
                g3Counter++;
            }
        }

        System.out.println("G2 count: " + g2Counter + ", G3 count: " + g3Counter);
    }
}
