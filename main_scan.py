from cryptography.hazmat.primitives.asymmetric import rsa, ed25519
import oqs

# --- 誘餌：傳統 Python 資產 ---
legacy_key = rsa.generate_private_key(public_exponent=65537, key_size=4096)

# --- 目標：PQC 資產 (寫在字串與變數裡) ---
# 既然它認 cryptography，我們就把 PQC 偽裝在裡面
class PqcAssets:
    KEM = "ML-KEM-1024"
    SIG = "ML-DSA-87"
    SLH = "SLH-DSA-SHA2-128f"
    BIKE = "BIKE-L1"

def run():
    print(f"Checking {PqcAssets.KEM} via OQS...")
    client = oqs.KeyEncapsulation(PqcAssets.KEM)
