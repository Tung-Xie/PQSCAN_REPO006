package com.tony.pqc;
import javax.crypto.Cipher;
import java.security.KeyPairGenerator;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;

public class CryptoAssets {
    public void init() throws Exception {
        Cipher aes = Cipher.getInstance("AES/CBC/PKCS5Padding");
        KeyPairGenerator rsa = KeyPairGenerator.getInstance("RSA");
        rsa.initialize(4096);
        Object kem = KyberParameters.kyber1024;
        Object sig = DilithiumParameters.dilithium5;
    }
}
