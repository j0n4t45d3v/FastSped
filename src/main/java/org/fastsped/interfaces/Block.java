package org.fastsped.interfaces;

import java.util.Map;

/**
 * Interface que define o contrato para a geração de blocos no contexto do EFD ICMS IPI.
 * <p>
 * Um bloco é uma unidade de informações específicas que compõem o arquivo EFD ICMS IPI.
 * Cada bloco deve implementar os métodos para gerar os dados do bloco em forma de bytes
 * e para fornecer informações sobre a quantidade de linhas geradas dentro do bloco.
 * </p>
 * <p>
 * Exemplo de implementação:
 * <pre>{@code
 * public class BlockZero implements Block {
 *
 *     // Implementação dos métodos da interface Block
 * }
 * }</pre>
 * </p>
 * <p>
 * O método {@code generateBlock} é responsável por gerar os dados do bloco como um array de bytes.
 * A implementação deste método deve encapsular a lógica necessária para construir os dados do bloco
 * com base nos dados fornecidos por um objeto específico, como {@code EfdIcmsIpi}.
 * </p>
 * <p>
 * O método {@code getQuantityLines} retorna um mapa que indica a quantidade de linhas por registro
 * dentro do bloco gerado. Este método é útil para relatórios ou para processamento adicional do
 * arquivo EFD ICMS IPI.
 * </p>
 * <p>
 * É essencial que as implementações desta interface forneçam a lógica necessária para gerar os
 * blocos conforme as especificações do EFD ICMS IPI, garantindo assim a integridade e conformidade
 * dos dados gerados.
 * </p>
 * <p>
 * Para mais detalhes sobre o formato e as especificações do EFD ICMS IPI, consulte a documentação
 * oficial fornecida pelas autoridades fiscais.
 * </p>
 * <p>
 * @author Jonatas
 */
public interface Block {

    /**
     * Método responsável por gerar os dados do bloco como um array de bytes.
     *
     * @return byte[] Array de bytes que representa os dados do bloco gerado.
     */
    byte[] generateBlock();

    /**
     * Retorna um mapa que indica a quantidade de linhas por registro dentro do bloco gerado.
     *
     * @return Map<String, Integer> Mapa contendo a quantidade de linhas por registro no bloco.
     */
    Map<String, Integer> getQuantityLines();

}
