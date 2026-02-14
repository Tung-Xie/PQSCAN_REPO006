package com.tony.pqc;

import javax.crypto.Cipher;
import java.security.KeyPairGenerator;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;

public class AllCryptoAssets {
    public void detectMe() throws Exception {
        // --- 誘餌：傳統 JCA 資產 (它 100% 要抓到) ---
        Cipher aes = Cipher.getInstance("AES/GCM/NoPadding");
        KeyPairGenerator rsa = KeyPairGenerator.getInstance("RSA");
        rsa.initialize(4096);

        // --- 目標：PQC 資產 (Bouncy Castle Light-weight) ---
        // 文件說 BC Light-weight 100% 支援，我們直接引用參數
        Object kem = KyberParameters.kyber1024; // ML-KEM
        Object sig = DilithiumParameters.dilithium5; // ML-DSA
    }
}
