package com.tony.standard;
import java.security.*;
import java.security.spec.ECGenParameterSpec;

public class ModernService {
    public void initModern() throws Exception {
        // [Medium] RSA 3072 & SHA-256
        KeyPairGenerator rsa3072 = KeyPairGenerator.getInstance("RSA");
        rsa3072.initialize(3072);
        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");

        // [Medium Curves] secp256r1, brainpoolp256r1 (RFC7027)
        String[] safeCurves = {"secp256r1", "brainpoolp256r1", "secp384r1"};
        for (String curve : safeCurves) {
            KeyPairGenerator ecGen = KeyPairGenerator.getInstance("EC");
            ecGen.initialize(new ECGenParameterSpec(curve));
        }
    }
}
