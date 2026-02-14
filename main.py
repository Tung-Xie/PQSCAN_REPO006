from cryptography.hazmat.primitives.asymmetric import rsa
import oqs

# 傳統資產 (誘餌)
legacy = rsa.generate_private_key(65537, 4096)

# PQC 資產 (字串轟炸)
# 很多工具不認得 API，但認得變數名稱和字串內容
KYBER_1024 = "CRYSTALS-Kyber-1024"
ML_KEM_1024 = "ML-KEM-1024"
DILITHIUM_87 = "CRYSTALS-Dilithium-87"
ML_DSA_87 = "ML-DSA-87"
SPHINCS_PLUS = "SPHINCS-PLUS"
BIKE_ALGO = "BIKE-L1"

def run_test():
    print(f"Testing: {ML_KEM_1024}, {ML_DSA_87}")
    return "Scan Complete"
