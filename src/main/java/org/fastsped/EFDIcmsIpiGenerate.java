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

/**
 * Implementação da interface GenerateEfd para geração de arquivo EFD (Escrituração Fiscal Digital)
 * baseado em blocos específicos de informações ICMS/IPI.
 * <p>
 * Esta implementação utiliza diversos blocos para compor o arquivo EFD a partir dos dados fornecidos
 * por um objeto EfdIcmsIpi. Os blocos são gerados em sequência e escritos em um fluxo de saída, que pode
 * ser convertido em diferentes formatos (array de bytes, String ou arquivo).
 * </p>
 * <p>
 * Exemplo de uso:
 * <pre>{@code
 * EFDIcmsIpiGenerate generator = new EFDIcmsIpiGenerate();
 * EfdIcmsIpi efdData = new EfdIcmsIpi(); // Objeto com os dados para gerar o EFD
 * byte[] efdBytes = generator.generateEfd(efdData);
 * String efdString = generator.generateEfdString(efdData);
 * generator.generateEfdToFile(efdData, "/caminho/para/salvar/efd.txt");
 * generator.generateEfdFileInDirectory(efdData, "/diretorio/para/salvar/");
 * }</pre>
 * </p>
 * <p>
 * A geração dos blocos do EFD é feita sequencialmente, utilizando implementações específicas de cada bloco
 * como BlockZero, BlockB, etc. Cada bloco é responsável por gerar e escrever suas próprias informações no fluxo
 * de saída.
 * </p>
 * <p>
 * A classe lida com exceções de IO durante a geração e escrita dos blocos, convertendo-as em RuntimeExceptions
 * para simplificar o tratamento de erros.
 * </p>
 * <p>
 * Para garantir a integridade dos dados e a correta formatação do EFD, é importante que o objeto EfdIcmsIpi fornecido
 * contenha todas as informações necessárias e esteja de acordo com as regras de preenchimento de cada bloco do EFD.
 * </p>
 * <p>
 * A saída do arquivo EFD pode ser configurada para ser um array de bytes, uma String ou um arquivo físico salvo em
 * um diretório especificado.
 * </p>
 * <p>
 * A classe também oferece um método adicional, generateEfdFileInDirectory, que cria automaticamente o diretório de
 * destino, se necessário, antes de salvar o arquivo EFD.
 * </p>
 * <p>
 * Esta implementação assume que os blocos utilizados (BlockZero, BlockB, etc.) estão devidamente implementados e
 * configurados para gerar corretamente suas partes do arquivo EFD.
 * </p>
 * <p>
 * Para informações adicionais sobre o formato e regras de preenchimento do EFD, consulte a documentação oficial
 * da Receita Federal.
 * </p>
 * <p>
 * @author Jonatas
 */
public class EFDIcmsIpiGenerate implements GenerateEfd {

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] generateEfd(EfdIcmsIpi efdIcmsIpi) {
        try {
            return this.generateBlocks(efdIcmsIpi);
        } catch (IOException e) {
            throw new RuntimeException("Fail generate blocks.",e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String generateEfdString(EfdIcmsIpi efdIcmsIpi) {
        try {
            return new String(this.generateBlocks(efdIcmsIpi));
        } catch (IOException e) {
            throw new RuntimeException("Fail generate blocks.",e);
        }
    }

    /**
     * {@inheritDoc}
     */
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

    /**
     * {@inheritDoc}
     */
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

    /**
     * Método privado para gerar os blocos do EFD a partir do objeto EfdIcmsIpi fornecido.
     *
     * @param efdIcmsIpi Objeto contendo os dados para gerar o EFD
     * @return Array de bytes representando o arquivo EFD gerado
     * @throws IOException Se ocorrer um erro de IO durante a geração dos blocos
     */
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

    /**
     * Escreve os bytes do bloco fornecido no fluxo de saída e atualiza o mapa de quantidade de linhas por registros.
     *
     * @param block               Bloco a ser escrito
     * @param outputStream        Fluxo de saída onde o bloco será escrito
     * @param quantityLinesPerRegs Mapa contendo a quantidade de linhas por registros no arquivo EFD
     * @throws IOException Se ocorrer um erro de IO durante a escrita do bloco
     */
    private void writeBytesNineBlock(
            Block block,
            ByteArrayOutputStream outputStream,
            Map<String, Integer> quantityLinesPerRegs
    ) throws IOException {
        ((BlockNine)block).setQuantityRegs(quantityLinesPerRegs);
        this.writeBytes(block, outputStream, new HashMap<>());
    }

    /**
     * Escreve os bytes do bloco de nove (último bloco) no fluxo de saída e atualiza o mapa de quantidade de linhas por registros.
     *
     * @param block               Bloco a ser escrito
     * @param outputStream        Fluxo de saída onde o bloco será escrito
     * @param quantityLinesPerRegs Mapa contendo a quantidade de linhas por registros no arquivo EFD
     * @throws IOException Se ocorrer um erro de IO durante a escrita do bloco
     */
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