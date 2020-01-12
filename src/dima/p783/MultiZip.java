package dima.p783;
import java.io.*;
import java.util.Arrays;
import java.util.zip.*;

public class MultiZip {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Archive.zip");
        CheckedOutputStream chos = new CheckedOutputStream(fos, new Adler32());
        ZipOutputStream zos = new ZipOutputStream(chos);
        BufferedOutputStream buffos = new BufferedOutputStream(zos);
        File[] files = new File("d:\\DimaD").listFiles();
        if (files!=null){
            for (File f : files){
                String filePath = f.getAbsolutePath();
                BufferedInputStream buffis = new BufferedInputStream(new FileInputStream(filePath));
                ZipEntry zipEntry = new ZipEntry(filePath);
                zos.putNextEntry(zipEntry);
                int i;
                while ((i = buffis.read()) != -1)
                    buffos.write(i);
                buffos.flush();
                buffis.close();
            }
        }
        buffos.close();
        long writeCheckSumm = chos.getChecksum().getValue();
        System.out.println(writeCheckSumm);

        FileInputStream fis = new FileInputStream("Archive.zip");
        CheckedInputStream chis = new CheckedInputStream(fis, new Adler32());
        ZipInputStream zis = new ZipInputStream(chis);
        BufferedInputStream buffis = new BufferedInputStream(zis);
        int j;
        byte count = 0;
        ZipEntry ze;
        while ((ze = zis.getNextEntry()) != null) {
            System.out.println(count++ + ") " + ze.getName() +
                    ": size= " + ze.getSize() +
                    ", compressed size: " + ze.getCompressedSize() +
                    ", created: " + ze.getCreationTime());
//            System.out.println("Reading file " + ze);
            while ((j = buffis.read()) != -1) {
                System.out.write(j);
            }
        }
        long readCheckSumm = chis.getChecksum().getValue();
        System.out.println(readCheckSumm);
        buffis.close();
        System.out.println(writeCheckSumm == readCheckSumm);
    }
}