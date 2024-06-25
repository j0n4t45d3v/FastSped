package org.fastsped;

import org.fastsped.blocks.efdIcmsIpi.*;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.GenerateEfd;
import org.fastsped.model.EfdIcmsIpi;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EFDIcmsIpiGenerate implements GenerateEfd {


    @Override
    public byte[] generateEfd(EfdIcmsIpi efdIcmsIpi) {
        try {
            return this.generateBlocks(efdIcmsIpi);
        } catch (IOException e) {
            throw new RuntimeException("Fail generate blocks.",e);
        }
    }

    @Override
    public String generateEfdString(EfdIcmsIpi efdIcmsIpi) {
        try {
            return new String(this.generateBlocks(efdIcmsIpi));
        } catch (IOException e) {
            throw new RuntimeException("Fail generate blocks.",e);
        }
    }

    @Override
    public File generateEfdToFile(EfdIcmsIpi efdIcmsIpi,  String path) {
        File file = new File(path);

        try (FileWriter writer = new FileWriter(file)) {
            writer.append(new String(this.generateBlocks(efdIcmsIpi)));
            return file;
        } catch (IOException e) {
            throw new RuntimeException("Fail writing file.", e);
        }
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
            throw new RuntimeException("Fail generating file.", e);
        }
    }

    private byte[] generateBlocks(EfdIcmsIpi efdIcmsIpi) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Block blockZero = new BlockZero(efdIcmsIpi);
        Block blockB = new BlockB();
        Block blockC = new BlockC(efdIcmsIpi);
        Block blockD = new BlockD();
        Block blockE = new BlockE();
        Block blockG = new BlockG();
        Block blockH = new BlockH();
        Block blockK = new BlockK();
        Block blockOne = new BlockOne();
        Block blockNine = new BlockNine();

        this.writeBytes(blockZero, outputStream);
        this.writeBytes(blockB, outputStream);
        this.writeBytes(blockC, outputStream);
        this.writeBytes(blockD, outputStream);
        this.writeBytes(blockE, outputStream);
        this.writeBytes(blockG, outputStream);
        this.writeBytes(blockH, outputStream);
        this.writeBytes(blockK, outputStream);
        this.writeBytes(blockOne, outputStream);
        this.writeBytes(blockNine, outputStream);

        return outputStream.toByteArray();
    }

    private void writeBytes(Block block, ByteArrayOutputStream outputStream) throws IOException {
        outputStream.write(block.generateBlock());
    }
}
