import oqs

def run_pqc():
    # 這裡放你要找的四個重點
    kem = oqs.KeyEncapsulation("ML-KEM-1024")
    sig = oqs.Signature("ML-DSA-87")
    slh = oqs.Signature("SLH-DSA-SHA2-128f")
    bike = oqs.KeyEncapsulation("BIKE-L1")
    return "PQC_READY"
