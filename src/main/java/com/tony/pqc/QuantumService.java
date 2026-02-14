package com.tony.pqc;

import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKeyPairGenerator;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumKeyPairGenerator;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;

public class QuantumService {
    /**
     * NIST FIPS 203 & 204 Standard Implementation
     * Targets: ML-KEM-1024 (Kyber) and ML-DSA-87 (Dilithium)
     */
    public void initializePQC() {
        // ML-KEM-1024 Initialization
        KyberKeyPairGenerator kemGen = new KyberKeyPairGenerator();
        kemGen.init(KyberParameters.kyber1024.getGenerateParameters());

        // ML-DSA-87 Initialization
        DilithiumKeyPairGenerator dsaGen = new DilithiumKeyPairGenerator();
        dsaGen.init(DilithiumParameters.dilithium5.getGenerateParameters());
        
        System.out.println("NIST Standard PQC Suite Loaded.");
    }
}
