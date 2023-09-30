package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {

        // Read data from a file
        FileInputStream fis = new FileInputStream(filename);
        int b;
        while ((b = fis.read()) != -1) {
            // Do nothing
        }

        fis.close();
    }
}
