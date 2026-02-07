package com.tony.audit;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;

public class AuditTask {
    public void runAudit() throws Exception {
        // [Critical] 各國特規或弱曲線
        String[] auditCurves = {"brainpoolP256r1", "sect283k1", "sm2", "gost3410"};
        for(String c : auditCurves) {
            System.out.println("Auditing: " + c);
            try { KeyPairGenerator.getInstance(c); } catch(Exception e){}
        }
    }
}
