from cryptography.hazmat.primitives.asymmetric import rsa, ec, padding
from cryptography.hazmat.primitives import hashes

def setup_modern_tls():
    # [Medium] x25519 (RFC8422), x448
    # [Medium] rsa_pss_rsae_sha256
    my_rsa = rsa.generate_private_key(65537, 3072)
    
    # 使用 SHA-512 與 SHA-384
    h384 = hashes.SHA384()
    h512 = hashes.SHA512()
    
    # 模擬 TLS 1.3 常用組合
    print("Enabling x25519 with rsa_pss_rsae_sha256")
    return "Modern-TLS-Config"
