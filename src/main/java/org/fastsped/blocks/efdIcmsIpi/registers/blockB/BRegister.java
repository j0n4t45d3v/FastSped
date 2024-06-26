package org.fastsped.blocks.efdIcmsIpi.registers.blockB;

import org.fastsped.commons.enums.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;

import java.util.HashMap;
import java.util.Map;

import static org.fastsped.commons.enums.Index.CONTENT;
import static org.fastsped.commons.enums.Index.NOT_CONTENT;

public class BRegister implements RegisterFactory {
    private int quantity;
    private final Map<String, Integer> quantityPerRegister;

    public BRegister() {
        this.quantity = 0;
        this.quantityPerRegister = new HashMap<>();
    }

    @Override
    public String getRegisters(String[] registers) {
        StringBuilder registersGenerated = new StringBuilder();
        registersGenerated.append(this.generateRegisterB001(true));
        registersGenerated.append(this.closeRegister("B", this.quantity));
        RegisterUtil.addQuantityRegs("B990", this.quantityPerRegister);
        return registersGenerated.toString();
    }

    private String generateRegisterB001(boolean blockIsEmpty) {
        Index index = blockIsEmpty ? NOT_CONTENT: CONTENT;
        Register register = new RegisterB001(index);
        this.quantity ++;
        RegisterUtil.addQuantityRegs("B001", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }

    @Override
    public Map<String, Integer> getQuantityPerRegister() {
        return this.quantityPerRegister;
    }
}
