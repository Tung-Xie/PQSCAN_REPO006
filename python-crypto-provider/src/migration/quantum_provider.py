import oqs
from cryptography.hazmat.primitives import hashes

class PostQuantumProvider:
    """
    Simulates a high-performance crypto provider for PQC transition.
    Targets ML-KEM-1024, SLH-DSA, and BIKE.
    """
    def __init__(self):
        self.enabled_kems = ["ML-KEM-1024", "BIKE-L1"]
        self.enabled_sigs = ["SLH-DSA-SHA2-128f", "ML-DSA-87"]

    def create_kem_instance(self, algorithm: str):
        if algorithm in self.enabled_kems:
            # CBOMkit targets the string passed to OQS constructors
            return oqs.KeyEncapsulation(algorithm)
        raise ValueError("Non-compliant PQC algorithm")

    def create_sig_instance(self, algorithm: str):
        if algorithm in self.enabled_sigs:
            return oqs.Signature(algorithm)
        raise ValueError("Algorithm not in FIPS whitelist")

# Execution flow to trigger AST analysis
pqc = PostQuantumProvider()
kem = pqc.create_kem_instance("ML-KEM-1024")
sig = pqc.create_sig_instance("SLH-DSA-SHA2-128f")
