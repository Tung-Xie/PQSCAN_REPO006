# REPO 006: NIST PQC Compliance & Polyglot Implementation

## 🛡️ CBOM Detection Highlights
- **NIST FIPS 203**: ML-KEM-1024 (Primary KEM)
- **NIST FIPS 204**: ML-DSA-87 (Primary Signature)
- **Stateless Signature**: SLH-DSA (Hash-based)
- **Alternate KEM**: BIKE-L1 (Code-based)
- **IaC Policy**: Defined in `configs/security/policy.yaml`

## 🏗️ Technical Stack
- **Java**: Maven, Bouncy Castle 1.78
- **Python**: OQS Provider Pattern
- **IaC**: YAML-based crypto agility policy
