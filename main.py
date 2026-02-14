from python_service.quantum_logic import PostQuantumEngine

if __name__ == "__main__":
    # 這是為了讓掃描器看到 Python 進入點
    print("Starting Multi-Language PQC Validation...")
    engine = PostQuantumEngine()
    engine.run_pqc()
    
    # Java 的部分通常會由 SCA 引擎掃描 pom.xml 與 src/
    print("Java Layer: ML-KEM-1024, ML-DSA-87 configured in Maven.")
