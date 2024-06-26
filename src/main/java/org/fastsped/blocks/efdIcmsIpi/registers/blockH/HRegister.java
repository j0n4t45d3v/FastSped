package org.fastsped.blocks.efdIcmsIpi.registers.blockH;

import org.fastsped.commons.enums.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;

import java.util.HashMap;
import java.util.Map;

import static org.fastsped.commons.enums.Index.CONTENT;
import static org.fastsped.commons.enums.Index.NOT_CONTENT;

public class HRegister implements RegisterFactory {

    private int quantity;
    private final Map<String, Integer> quantityPerRegister;

    public HRegister() {
        this.quantity = 0;
        this.quantityPerRegister = new HashMap<>();
    }

    @Override
    public String getRegisters(String[] registers) {
        StringBuilder registersGenerated = new StringBuilder();
        registersGenerated.append(this.generateRegisterH001(true));
        registersGenerated.append(this.closeRegister("H", this.quantity));
        RegisterUtil.addQuantityRegs("H990", this.quantityPerRegister);
        return registersGenerated.toString();
    }

    @Override
    public Map<String, Integer> getQuantityPerRegister() {
        return this.quantityPerRegister;
    }

    private String generateRegisterH001(boolean blockIsEmpty) {
        Index index = blockIsEmpty ? NOT_CONTENT : CONTENT;
        Register register = new RegisterH001(index);
        this.quantity++;
        RegisterUtil.addQuantityRegs("H001", this.quantityPerRegister);
        return RegisterUtil.generateRegister(register);
    }
}
