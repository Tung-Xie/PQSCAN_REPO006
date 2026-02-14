import cryptography
from cryptography.hazmat.primitives.asymmetric import rsa

def pqc_factory(algo_name):
    # 這裡就是關鍵的「呼叫」
    print(f"Initializing cryptographic context for: {algo_name}")
    return {"algorithm": algo_name, "status": "ready"}

def run():
    # 傳統資產當對照
    rsa.generate_private_key(65537, 4096)
    
    # 依序呼叫清單中的關鍵字
    targets = [
        "MLKEM1024", 
        "ML-DSA-87", 
        "X25519_MLKEM768", 
        "frodo640aes",
        "sntrup761"
    ]
    
    for t in targets:
        pqc_factory(t)

if __name__ == "__main__":
    run()
