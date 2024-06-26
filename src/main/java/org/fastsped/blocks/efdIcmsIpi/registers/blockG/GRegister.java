package org.fastsped.blocks.efdIcmsIpi.registers.blockG;

import org.fastsped.commons.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;

import java.util.HashMap;
import java.util.Map;

import static org.fastsped.commons.Index.CONTENT;
import static org.fastsped.commons.Index.NOT_CONTENT;

public class GRegister implements RegisterFactory {

    private int quantity;
    private final Map<String, Integer> quantityPerRegister;

    public GRegister() {
        this.quantity = 0;
        this.quantityPerRegister = new HashMap<>();
    }

    @Override
    public String getRegisters(String[] registers) {
        StringBuilder registersGenerated = new StringBuilder();
        registersGenerated.append(this.generateRegisterG001(true));
        registersGenerated.append(this.closeRegister("G", this.quantity));
        RegisterUtil.addQuantityRegs("G990", this.quantityPerRegister);
        return registersGenerated.toString();
    }

    @Override
    public Map<String, Integer> getQuantityPerRegister() {
        return this.quantityPerRegister;
    }

    private String generateRegisterG001(boolean blockIsEmpty) {
        Index index = blockIsEmpty ? NOT_CONTENT : CONTENT;
        Register register = new RegisterG001(index);
        this.quantity ++;
        RegisterUtil.addQuantityRegs("G001", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }
}
