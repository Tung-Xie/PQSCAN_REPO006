from cryptography.hazmat.primitives import hashes
import oqs

def trigger():
    # 傳統
    h = hashes.Hash(hashes.SHA512())
    # PQC
    for algo in ["MLKEM1024", "ML-DSA-87", "kyber1024", "X25519_MLKEM768"]:
        try:
            oqs.KeyEncapsulation(algo)
        except:
            pass

if __name__ == "__main__":
    trigger()
