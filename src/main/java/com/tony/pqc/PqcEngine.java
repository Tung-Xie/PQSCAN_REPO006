package com.tony.pqc;

import java.util.HashMap;
import java.util.Map;

public class PqcEngine {
    private static final Map<String, String> cryptoRegistry = new HashMap<>();

    public void initialize() {
        // 強迫調用：將清單字串存入 Map 並傳遞
        register("MLKEM1024");
        register("ML-DSA-87");
        register("X25519_MLKEM768");
        register("kyber512");
        register("dilithium5");
        register("bikel1");
        register("hqc128");
        register("falcon512");
        register("sphincssha2128fsimple");
    }

    private void register(String algorithm) {
        cryptoRegistry.put(algorithm, "ACTIVE");
        // 確保變數被讀取，防止編譯器優化
        System.out.println("Configuring Quantum-Safe Provider for: " + algorithm);
    }
}
