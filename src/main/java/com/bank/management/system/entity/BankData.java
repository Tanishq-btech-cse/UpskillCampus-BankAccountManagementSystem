package com.bank.management.system.entity;
import java.util.HashMap;
import java.util.Map;

public class BankData {

    public static final Map<String, String> BANK_IFSC_MAP = new HashMap<>();

    static {
        BANK_IFSC_MAP.put("SBI", "SBIN0001234");
        BANK_IFSC_MAP.put("HDFC", "HDFC0005678");
        BANK_IFSC_MAP.put("ICICI", "ICIC0004321");
        BANK_IFSC_MAP.put("PNB", "PUNB0009876");
        BANK_IFSC_MAP.put("AXIS", "UTIB0002468");
    }

    public static boolean isValidIFSC(String ifsc) {
        return BANK_IFSC_MAP.containsValue(ifsc);
    }
}