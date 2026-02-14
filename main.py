from cryptography.hazmat.primitives.asymmetric import rsa
import oqs

legacy_key = rsa.generate_private_key(65537, 4096)
pqc_kem = "ML-KEM-1024"
pqc_sig = "ML-DSA-87"
print(f"PQC Test: {pqc_kem}")
