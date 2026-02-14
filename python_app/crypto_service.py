from cryptography.hazmat.primitives.asymmetric import rsa, ec
from cryptography.hazmat.primitives import hashes

# 雖然 cryptography 尚未完全正式支援 ML-KEM，
# 但我們使用它認得的「類別」與「字串常數」來測試它的掃描深度
def legacy_and_pqc_test():
    # 它絕對認得的
    key = rsa.generate_private_key(public_exponent=65537, key_size=4096)
    
    # 誘導偵測：在 cryptography 框架下標註 PQC 關鍵字
    # CBOMkit 會掃描變數名稱與註解關聯
    target_pqc_algorithm = "ML-KEM-1024" 
    target_pqc_sig = "ML-DSA-87"
    print(f"Migration to {target_pqc_algorithm} initiated.")
