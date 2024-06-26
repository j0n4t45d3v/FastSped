package org.fastsped.interfaces;

/**
 * Interface que define o contrato para a geração de registros utilizados no contexto do EFD (Escrituração Fiscal Digital).
 *
 * <p>
 * Esta interface define métodos para gerar o conteúdo de um registro e obter a quantidade de linhas do registro.
 * </p>
 */public interface Register {

        /**
         * Gera o conteúdo do registro como uma string formatada.
         *
         * @return O registro gerado como uma string.
         */
        String generateRegister();

        /**
         * Obtém a quantidade de linhas que compõem o registro.
         *
         * @return A quantidade de linhas do registro.
         */
        int getQuantityLines();
}
