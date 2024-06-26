package org.fastsped.blocks.efdIcmsIpi.registers.blockZero;

import org.fastsped.commons.enums.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;
import org.fastsped.model.EfdIcmsIpi;
import org.fastsped.model.data.Accountant;
import org.fastsped.model.data.CompanyComplement;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementação da interface {@link RegisterFactory} para geração dos registros do bloco 0 do EFD ICMS IPI.
 * Esta classe gera os registros 0000, 0001, 0002, 0005, 0100 e o registro 0990, que são os registros obrigatórios do bloco 0.
 */
public class ZeroRegisters implements RegisterFactory {

    private final EfdIcmsIpi efdIcmsIpi;
    private int quantity;
    private final Map<String, Integer> quantityPerRegister;

    /**
     * Construtor da classe {@code ZeroRegisters}.
     *
     * @param efdIcmsIpi Objeto que contém todos os dados necessários para gerar o EFD ICMS IPI.
     */
    public ZeroRegisters(EfdIcmsIpi efdIcmsIpi) {
        this.efdIcmsIpi = efdIcmsIpi;
        this.quantity = 0;
        this.quantityPerRegister = new HashMap<>();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRegisters(String[] registers) {
        String registersGenerates = this.generateRegister0000();
        registersGenerates += this.generateRegister0001();
        registersGenerates += this.generateRegister0002(registers);
        registersGenerates += this.generateRegister0005();
        registersGenerates += this.generateRegister0100();
        registersGenerates += this.closeRegister("0", this.quantity);
        RegisterUtil.addQuantityRegs("0990", this.quantityPerRegister);
        return registersGenerates;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String, Integer> getQuantityPerRegister() {
        return  this.quantityPerRegister;
    }

    /**
     * Gera o registro 0000 do bloco 0 com base nos dados fornecidos.
     *
     * @return Uma string contendo o registro 0000 gerado.
     */
    private String generateRegister0000() {
        Register register = new Register0000(this.efdIcmsIpi);
        this.quantity += register.getQuantityLines();
        RegisterUtil.addQuantityRegs("0000", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }

    /**
     * Gera o registro 0001 do bloco 0 com base no índice indicando conteúdo.
     *
     * @return Uma string contendo o registro 0001 gerado.
     */
    private String generateRegister0001() {
        Register register = new Register0001(Index.CONTENT);
        this.quantity += register.getQuantityLines();
        RegisterUtil.addQuantityRegs("0001", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }

    /**
     * Gera o registro 0002 do bloco 0, se necessário, com base nos registros fornecidos.
     *
     * @param registers Array de strings contendo os registros disponíveis.
     * @return Uma string contendo o registro 0002 gerado, ou vazio se já estiver presente nos registros.
     */
    private String generateRegister0002(String[] registers) {
        if(RegisterUtil.containRegister(registers, "0002")) {
            return "";
        }
        Register register = new Register0002("1");
        this.quantity += register.getQuantityLines();
        RegisterUtil.addQuantityRegs("0002", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }

    /**
     * Gera o registro 0005 do bloco 0 com base nos complementos da empresa.
     *
     * @return Uma string contendo o registro 0005 gerado.
     */
    private String generateRegister0005() {
        CompanyComplement companyComplement = this.efdIcmsIpi.getCompanyComplement();
        Register register = new Register0005(companyComplement);
        this.quantity += register.getQuantityLines();
        RegisterUtil.addQuantityRegs("0005", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }

    /**
     * Gera o registro 0100 do bloco 0 com base no contador associado.
     *
     * @return Uma string contendo o registro 0100 gerado.
     */
    private String generateRegister0100() {
        Accountant accountant = this.efdIcmsIpi.getAccountant();
        Register register = new Register0100(accountant);
        this.quantity += register.getQuantityLines();
        RegisterUtil.addQuantityRegs("0100", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }
}
