package org.fastsped.blocks.efdIcmsIpi.registers.blockD;

import org.fastsped.commons.enums.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;

import java.util.HashMap;
import java.util.Map;

import static org.fastsped.commons.enums.Index.CONTENT;
import static org.fastsped.commons.enums.Index.NOT_CONTENT;

public class DRegister implements RegisterFactory {
    private int quantity;
    private final Map<String, Integer> quantityPerRegister;

    public DRegister() {
        this.quantityPerRegister = new HashMap<>();
        this.quantity = 0;
    }

    @Override
    public String getRegisters(String[] registers) {
        StringBuilder registersGenerated = new StringBuilder();
        registersGenerated.append(this.generateRegisterD001(true));
        registersGenerated.append(this.closeRegister("D", this.quantity));
        RegisterUtil.addQuantityRegs("D990", this.quantityPerRegister);
        return registersGenerated.toString();
    }

    @Override
    public Map<String, Integer> getQuantityPerRegister() {
        return this.quantityPerRegister;
    }

    private String generateRegisterD001(boolean blockIsEmpty) {
        Index index = blockIsEmpty ? NOT_CONTENT: CONTENT;
        Register register = new RegisterD001(index);
        this.quantity ++;
        RegisterUtil.addQuantityRegs("D001", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }
}
