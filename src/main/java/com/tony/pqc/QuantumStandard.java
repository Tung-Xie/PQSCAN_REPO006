package com.tony.pqc;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKeyPairGenerator;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumKeyPairGenerator;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;
import java.security.SecureRandom;

public class QuantumStandard {
    public void generatePqcKeys() {
        // [ML-KEM-1024]
        KyberKeyPairGenerator kemGen = new KyberKeyPairGenerator();
        kemGen.init(KyberParameters.kyber1024.getGenerateParameters());
        AsymmetricCipherKeyPair kemPair = kemGen.generateKeyPair();

        // [ML-DSA-87]
        DilithiumKeyPairGenerator dsaGen = new DilithiumKeyPairGenerator();
        dsaGen.init(DilithiumParameters.dilithium5.getGenerateParameters());
        AsymmetricCipherKeyPair dsaPair = dsaGen.generateKeyPair();
    }
}
