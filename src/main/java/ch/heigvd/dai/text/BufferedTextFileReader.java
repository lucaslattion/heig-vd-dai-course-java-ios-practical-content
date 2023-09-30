package ch.heigvd.dai.text;

import ch.heigvd.dai.Readable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.nio.charset.StandardCharsets;

public class BufferedTextFileReader implements Readable {
    @Override
    public void read(String filename) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(filename, StandardCharsets.UTF_8));

        int c; // is -1 if end of file or char value 0-65535
        while ((c = reader.read()) != -1) {
            // do nothing
        }
        reader.close();
    }
}
