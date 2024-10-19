package org.fastsped.blocks.efdIcmsIpi.registers.blockNine;

import org.fastsped.commons.enums.Index;
import org.fastsped.commons.RegisterUtil;
import org.fastsped.interfaces.Register;
import org.fastsped.interfaces.RegisterFactory;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import static org.fastsped.commons.enums.Index.CONTENT;
import static org.fastsped.commons.enums.Index.NOT_CONTENT;

public class NineRegister implements RegisterFactory {

    private int quantity;
    private final Map<String, Integer> quantityRegs;

        public NineRegister(Map<String, Integer> quantityRegs) {
        this.quantityRegs = quantityRegs;
        this.quantity = 0;
    }

    @Override
    public String getRegisters(String[] registers) {
        StringBuilder registersGenerated = new StringBuilder();
        registersGenerated.append(this.generateRegister9001(false));

        Comparator<String> comparator = this.mapOrder();

        Map<String, Integer> orderMap = new TreeMap<>(comparator);
        orderMap.putAll(this.quantityRegs);
        int quantityLinesInFile = 0;
        for(Map.Entry<String, Integer> entry : orderMap.entrySet()) {
            registersGenerated.append(this.generateRegister9900(entry.getKey(), entry.getValue()));
            quantityLinesInFile += entry.getValue();
        }

        String reg9001Quantity = this.generateRegister9900("9001", 1);
        String reg9900Quantity = this.generateRegister9900("9900", this.quantityRegs.get("9900") + 3);
        String reg9990Quantity = this.generateRegister9900("9990", 1);
        String reg9999Quantity = this.generateRegister9900("9999", 1);
        registersGenerated.append(reg9001Quantity);
        registersGenerated.append(reg9900Quantity);
        registersGenerated.append(reg9990Quantity);
        registersGenerated.append(reg9999Quantity);
        registersGenerated.append(this.closeRegister("9", this.quantity + 1));
        this.quantity += quantityLinesInFile;
        registersGenerated.append(this.generateRegister9999());
        return registersGenerated.toString();
    }

    @Override
    public Map<String, Integer> getQuantityPerRegister() {
        return Collections.emptyMap();
    }

        private String generateRegister9001(boolean blockIsEmpty) {
        Index index = blockIsEmpty ? NOT_CONTENT: CONTENT;
        Register register = new Register9001(index);
        this.quantity ++;
        return RegisterUtil.generateRegister(register);
    }

        private String generateRegister9900(String reg, int quantity) {
        Register register = new Register9900(reg, quantity);
        this.quantity ++;
        RegisterUtil.addQuantityRegs("9900", this.quantityRegs);
        return RegisterUtil.generateRegister(register);
    }

        private String generateRegister9999() {
        Register register = new Register9999(this.quantity + 1);
        return RegisterUtil.generateRegister(register);
    }

        private Comparator<String> mapOrder() {
        return (s1, s2) -> {
            // Coloca o bloco 0 no inicio
            if (s1.startsWith("0") && s2.startsWith("0"))
                return s1.compareTo(s2);
            else if (s1.startsWith("0"))
                return -1;
            else if (s2.startsWith("0"))
                return 1;

            // Coloca o bloco 1 no final
            if (s1.startsWith("1") || s2.startsWith("1"))
                return compareFinallyBlocks(s1, s2, '1');

            // Coloca o bloco 9 no final
            if (s1.startsWith("9") || s2.startsWith("9"))
                return compareFinallyBlocks(s1, s2, '9');

            return s1.compareTo(s2);
        };
    }

        private int compareFinallyBlocks(String s1, String s2, char charBlockFinals) {
        String blockFinals = String.valueOf(charBlockFinals);
        if (s1.startsWith(blockFinals) && s2.startsWith(blockFinals))
            return s1.compareTo(s2);
        else if (s1.startsWith(blockFinals))
            return 1;
        else if (s2.startsWith(blockFinals))
            return -1;

        return s1.compareTo(s2);
    }
}
