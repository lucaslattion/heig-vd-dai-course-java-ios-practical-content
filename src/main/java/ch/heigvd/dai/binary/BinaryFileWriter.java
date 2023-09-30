package ch.heigvd.dai.binary;

import ch.heigvd.dai.Writable;

import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {

        // Write sizeInByte of data to a file
        FileOutputStream fos = new FileOutputStream(filename);
        for (int i = 0; i < sizeInBytes; i++) {
            fos.write(1);
        }

        fos.close();
    }
}
