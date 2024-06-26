package org.fastsped;

import org.fastsped.blocks.efdIcmsIpi.*;
import org.fastsped.interfaces.Block;
import org.fastsped.interfaces.GenerateEfd;
import org.fastsped.model.EfdIcmsIpi;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

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
        Map<String, Integer> regsAndQuantityLines = new HashMap<>();

        this.writeBytes(blockZero, outputStream, regsAndQuantityLines);
        this.writeBytes(blockB, outputStream, regsAndQuantityLines);
        this.writeBytes(blockC, outputStream, regsAndQuantityLines);
        this.writeBytes(blockD, outputStream, regsAndQuantityLines);
        this.writeBytes(blockE, outputStream, regsAndQuantityLines);
        this.writeBytes(blockG, outputStream, regsAndQuantityLines);
        this.writeBytes(blockH, outputStream, regsAndQuantityLines);
        this.writeBytes(blockK, outputStream, regsAndQuantityLines);
        this.writeBytes(blockOne, outputStream, regsAndQuantityLines);
        this.writeBytesNineBlock(blockNine, outputStream, regsAndQuantityLines);

        return outputStream.toByteArray();
    }

    private void writeBytesNineBlock(
            Block block,
            ByteArrayOutputStream outputStream,
            Map<String, Integer> quantityLinesPerRegs
    ) throws IOException {
        ((BlockNine)block).setQuantityRegs(quantityLinesPerRegs);
        this.writeBytes(block, outputStream, new HashMap<>());
    }

    private void writeBytes(
            Block block,
            ByteArrayOutputStream outputStream,
            Map<String, Integer> quantityLinesPerRegs
    ) throws IOException {
        outputStream.write(block.generateBlock());
        if(block.getQuantityLines() != null) {
            quantityLinesPerRegs.putAll(block.getQuantityLines());
        }
    }
}