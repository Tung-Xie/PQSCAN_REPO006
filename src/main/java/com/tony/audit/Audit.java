package com.tony.audit;
import java.security.*;
public class Audit {
    public void run() throws Exception {
        // Targets: SM2, Brainpool, GOST
        KeyPairGenerator.getInstance("SM2");
        KeyPairGenerator.getInstance("BrainpoolP256r1");
        System.out.println("Global Audit Done.");
    }
}
