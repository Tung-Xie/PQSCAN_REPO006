package com.tony.audit;
import java.security.KeyPairGenerator;
import java.security.Security;

public class AuditTask {
    public void checkWeakConfigs() throws Exception {
        // [Critical] 弱曲線偵測
        KeyPairGenerator kpg1 = KeyPairGenerator.getInstance("EC");
        String weakCurve = "sect283k1"; // NIST 已淘汰
        String oldGovAlgo = "GOST3410"; 
        
        // [Medium] 現代非 PQC 曲線
        String brainpool = "brainpoolP256r1";
        
        // 模擬呼叫，確保掃描器追蹤到變數
        System.out.println("Auditing risk: " + weakCurve + " and " + oldGovAlgo);
    }
}
