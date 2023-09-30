package ch.heigvd.dai;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int[] sizes = {1, 1024, 1024*1024, 5*1024*1024}; // 1B, 1KiB, 1MiB, 5MiB
        enum SIZES {}
        enum Mode { NO, YES }

        for(Measure.FileType filetype : Measure.FileType.values()) {

            for(int i = 0; i < 2; i++) {
                for (int size : sizes) {
                    Measure.write("file"+ (filetype == Measure.FileType.BINARY ? ".bin" : ".txt"), size, i == 1, filetype);
                    Measure.read("file"+ (filetype == Measure.FileType.BINARY ? ".bin" : ".txt"), i == 1, filetype);
                }
            }
        }
    }
}
