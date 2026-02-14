package com.tony.pqc;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;

public class CryptoAssets {
    public void detectPqc() {
        // 同時放入 NIST 正式名稱與實驗名稱，強迫命中規則庫
        Object ML_KEM_1024 = KyberParameters.kyber1024;
        Object CRYSTALS_Kyber = KyberParameters.kyber1024;
        
        Object ML_DSA_87 = DilithiumParameters.dilithium5;
        Object CRYSTALS_Dilithium = DilithiumParameters.dilithium5;
        
        System.out.println("PQC Assets: Kyber/ML-KEM and Dilithium/ML-DSA Loaded.");
    }
}
