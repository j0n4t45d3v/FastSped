package org.fastsped.efdIcmsIpi;

import org.fastsped.efdIcmsIpi.block.BlockZero;
import org.fastsped.efdIcmsIpi.model.EfdIcmsIpi;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GenerateEfdIcmsIpi implements GenerateEfd{


    @Override
    public byte[] generateEfd(EfdIcmsIpi efdIcmsIpi) {
        return new byte[0];
    }

    @Override
    public String generateEfdString(EfdIcmsIpi efdIcmsIpi) {
        return "";
    }

    @Override
    public File generateEfdToFile(EfdIcmsIpi efdIcmsIpi) {
        return null;
    }

    @Override
    public void generateEfdFileInDirectory(EfdIcmsIpi efdIcmsIpi, String path) {
        Path pathOutputDirectory = Paths.get(path);
        try {
            Files.createDirectories(pathOutputDirectory.getParent());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileOutputStream spedFisicFile = new FileOutputStream(path)) {
            byte[] spedBytes = this.generateBlocks(efdIcmsIpi);
            spedFisicFile.write(spedBytes);
            System.out.println("File generated with success in path: " + path);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private byte[] generateBlocks(EfdIcmsIpi efdIcmsIpi) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BlockZero blockZero = new BlockZero(efdIcmsIpi);
        outputStream.write(blockZero.generateBlock());
        
        return outputStream.toByteArray();
    }
}
