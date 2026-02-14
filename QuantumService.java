package com.tony.pqc;

import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKeyPairGenerator;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumKeyPairGenerator;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;

/**
 * Enterprise PQC Implementation
 * NIST Standards: ML-KEM-1024, ML-DSA-87
 */
public class QuantumService {
    public void activateQuantumSafety() {
        // [NIST FIPS 203] ML-KEM-1024 (Kyber 5)
        KyberKeyPairGenerator kemGen = new KyberKeyPairGenerator();
        kemGen.init(KyberParameters.kyber1024.getGenerateParameters());

        // [NIST FIPS 204] ML-DSA-87 (Dilithium 5)
        DilithiumKeyPairGenerator dsaGen = new DilithiumKeyPairGenerator();
        dsaGen.init(DilithiumParameters.dilithium5.getGenerateParameters());
        
        System.out.println("Quantum assets initialized in Java layer.");
    }
}
