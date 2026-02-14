from cryptography.hazmat.primitives import hashes
import oqs

def pqc_scan_trigger():
    # 誘餌：它一定認得的 Hash
    h = hashes.Hash(hashes.SHA512())
    
    # KEX 關鍵字字串賦值
    # 我們把清單中的重點直接寫死在變數裡
    kex_assets = {
        "KEM": "MLKEM1024",
        "SIG": "ML-DSA-87",
        "HYBRID": "X25519_MLKEM768",
        "OLD": "kyber1024"
    }
    
    # 模擬 OQS 調用
    for name in kex_assets.values():
        print(f"Detecting: {name}")

if __name__ == "__main__":
    pqc_scan_trigger()
