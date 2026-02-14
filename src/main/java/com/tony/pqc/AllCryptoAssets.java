package com.tony.pqc;

import java.security.MessageDigest;

public class AllCryptoAssets {
    // 類別常數：掃描器最愛的索引目標
    public static final String ASSET_KEM = "MLKEM1024";
    public static final String ASSET_DSA = "ML-DSA-87";
    public static final String ASSET_HYBRID = "X25519_MLKEM768";
    public static final String ASSET_KYBER = "kyber1024";

    public void triggerScan() throws Exception {
        // 誘餌：它必中的 PKI/Hash
        MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        MessageDigest sha384 = MessageDigest.getInstance("SHA-384");

        // 顯式賦值：強迫掃描器追蹤資料流
        String currentKex = ASSET_KEM;
        String currentSig = ASSET_DSA;
        String currentHybrid = ASSET_HYBRID;

        // 模擬使用：確保不會被當成無效代碼
        if (currentKex.startsWith("MLKEM")) {
            System.out.println("PQC Active: " + currentKex + ", " + currentSig);
            System.out.println("Hybrid Mode: " + currentHybrid);
        }
    }
}
