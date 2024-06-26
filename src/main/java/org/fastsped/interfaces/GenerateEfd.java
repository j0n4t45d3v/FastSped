package org.fastsped.interfaces;

import org.fastsped.model.EfdIcmsIpi;

import java.io.File;

/**
 * Interface para geração do arquivo EFD (Escrituração Fiscal Digital).
 * Implementações desta interface são responsáveis por gerar arquivos EFD a partir de objetos EfdIcmsIpi.
 * <p>
 * Exemplo de uso:
 * <pre>{@code
 * GenerateEfd generator = new ImplementacaoGenerateEfd();
 * EfdIcmsIpi efdData = new EfdIcmsIpi(); // Objeto com os dados para gerar o EFD
 * byte[] efdBytes = generator.generateEfd(efdData);
 * String efdString = generator.generateEfdString(efdData);
 * generator.generateEfdToFile(efdData, "/caminho/para/salvar/efd.txt");
 * generator.generateEfdFileInDirectory(efdData, "/diretorio/para/salvar/");
 * }</pre>
 * </p>
 * @author Jonatas de Lima
 */
public interface GenerateEfd {

    /**
     * Gera um arquivo EFD em formato de array de bytes.
     *
     * @param efdIcmsIpi Objeto contendo os dados para gerar o EFD
     * @return Array de bytes representando o arquivo EFD gerado
     */
    byte[] generateEfd(EfdIcmsIpi efdIcmsIpi);

    /**
     * Gera um arquivo EFD em formato de String.
     *
     * @param efdIcmsIpi Objeto contendo os dados para gerar o EFD
     * @return String representando o arquivo EFD gerado
     */
    String generateEfdString(EfdIcmsIpi efdIcmsIpi);

    /**
     * Gera um arquivo EFD e salva-o em um caminho específico.
     *
     * @param efdIcmsIpi Objeto contendo os dados para gerar o EFD
     * @param path       Caminho onde o arquivo EFD será salvo
     * @return Objeto File representando o arquivo EFD gerado
     */
    File generateEfdToFile(EfdIcmsIpi efdIcmsIpi,  String path);

    /**
     * Gera um arquivo EFD e salva-o em um diretório específico.
     *
     * @param efdIcmsIpi Objeto contendo os dados para gerar o EFD
     * @param path       Diretório onde o arquivo EFD será salvo
     */
    void generateEfdFileInDirectory(EfdIcmsIpi efdIcmsIpi, String path);

}
