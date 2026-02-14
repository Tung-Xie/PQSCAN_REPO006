import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;

/**
 * NIST PQC Standard Assets: ML-KEM-1024, ML-DSA-87
 */
public class PqcService {
    public void activate() {
        // 顯式使用 Bouncy Castle PQC 參數
        var kem = KyberParameters.kyber1024;
        var sig = DilithiumParameters.dilithium5;
    }
}
