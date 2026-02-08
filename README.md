# PQSCAN_REPO006: Quantum-Safe Enterprise Hybrid

## 📌 專案簡介
這是本展示序列中的**最高等級標竿**。專案整合了 NIST 最新標準的 **抗量子加密演算法 (Post-Quantum Cryptography)**，並包含 IaC (Infrastructure as Code) 設定檔。

## 🔍 CBOM 掃描亮點 (需偵測項目)
- **NIST PQC 標準**: 
  - `ML-KEM-1024`: 最強抗量子密鑰交換。
  - `ML-DSA-87`: 最強抗量子數位簽章。
  - `SLH-DSA`: 無狀態雜湊簽章。
  - `BIKE`: 備用 PQC KEM 機制。
- **IaC 安全政策**: `configs/security/policy.yaml` (包含 SLH-DSA 設定)。

## 🛠️ 技術棧
- Language: Python, Java, YAML
- Security Level: **Maximum (Quantum-Resistant)**
