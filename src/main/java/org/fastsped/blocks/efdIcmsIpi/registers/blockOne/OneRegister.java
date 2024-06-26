package org.fastsped.blocks.efdIcmsIpi.registers.blockOne;

import org.fastsped.commons.enums.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;

import java.util.HashMap;
import java.util.Map;

import static org.fastsped.commons.enums.Index.CONTENT;
import static org.fastsped.commons.enums.Index.NOT_CONTENT;

public class OneRegister implements RegisterFactory {

    private int quantity;
    private final Map<String, Integer> quantityPerRegister;

    public OneRegister() {
        this.quantity = 0;
        this.quantityPerRegister = new HashMap<>();
    }

    @Override
    public String getRegisters(String[] registers) {
        StringBuilder registersGenerated = new StringBuilder();
        registersGenerated.append(this.generateRegister1001(true));
        registersGenerated.append(this.closeRegister("1", this.quantity));
        RegisterUtil.addQuantityRegs("1990", this.quantityPerRegister);
        return registersGenerated.toString();
    }

    @Override
    public Map<String, Integer> getQuantityPerRegister() {
        return this.quantityPerRegister;
    }

    private String generateRegister1001(boolean blockIsEmpty) {
        Index index = blockIsEmpty ? NOT_CONTENT: CONTENT;
        Register register = new Register1001(index);
        this.quantity ++;
        RegisterUtil.addQuantityRegs("1001", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }
}
