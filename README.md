![Java](https://img.shields.io/badge/Java-17-blue)
![Randoop](https://img.shields.io/badge/Randoop-4.3.3-green)
![Coverage](https://img.shields.io/badge/Coverage-61--94%25-yellow)

# Randoop Experimental repOK Source Code & Analysis

## 👨‍💻 Author
**Zirui Fang**  
*September 2025*

## 📋 Project Overview

This repository contains the experimental implementation and analysis of automated test generation using Randoop for two fundamental data structures translated from Go to Java:

- **Dynamic List** - Array-based dynamic list implementation
- **AVL Tree** - Self-balancing binary search tree

The project demonstrates the use of representation invariants (repOK methods) to enhance automated test generation and bug detection capabilities.

## 🏗️ Project Structure

Randoop-Experimental-repOK-Source-code-and-Analysis/
├── src/
│ ├── List.java
│ ├── AvlTree.java
│ ├── list_rep.java # List repOK implementation
│ └── avltree_rep.java # AVL Tree repOK implementation
├── tests/
│ ├── RegressionTest*.java # Randoop regression tests
│ └── ErrorTest.java # Error-revealing tests (if any)
├── coverage/ # Coverage reports (screenshots/data)
└── docs/
└── Randoop_Project_Report.pdf

## 🧪 Experimental Results  
- ✅ Zero-error test generation  
- ✅ High line coverage (List: 94%, AVL Tree: 61%)  
- ✅ Complete repOK implementation and validation  
- ✅ Used LLM for Go → Java code translation  

## 🛠 User Guide  
For details, see: [Appendix: Randoop repOK Debugging & Coverage Guide](./docs/Randoop_Project_Report.pdf)  

## 📊 Coverage Overview  
| Data Structure | Method Coverage | Line Coverage | Branch Coverage |  
|----------------|-----------------|---------------|-----------------|  
| List           | 100%            | 94%           | 89%             |  
| AVL Tree       | 72%             | 61%           | 51%             |  

## 🛠️ Usage Guide

### Prerequisites
- Java 17+
- Randoop 4.3.3 OR HIGHER VERSION
- IntelliJ IDEA (recommended)

### Quick Start
1. **Clone the repository**
   ```bash
   git clone https://github.com/Ray221f/Randoop-Experimental-repOK-Source-code-and-Analysis.git
2. **Set Up Randoop**
   ```bash
   # Download Randoop
   wget https://github.com/randoop/randoop/releases/download/v4.3.3/randoop-all-4.3.3.jar
4. **Generate tests**
   ```bash
   javac -cp .:randoop-all-4.3.3.jar List.java
   java -cp .:randoop-all-4.3.3.jar randoop.main.Main gentests \
     --testclass=List \
     --junit-output-dir=tests
5. **Run Coverage Analysis**
   - Use IntelliJ IDEA's coverage tool
   - Or JaCoCo for detailed reports

## 🎯 Research Contributions

Demonstrates practical methodology for cross-language data structure verification
Shows effectiveness of representation invariants in automated test generation
Provides insights into LLM-assisted code translation for software analysis
Identifies limitations in branch/condition coverage for complex data structures

## 🤝 Contributing

Contributions are welcome! Please feel free to submit pull requests or open issues for:

Improving test coverage
Enhancing repOK implementations
Adding new data structures
Optimizing the translation process

## 🔗 Related Links  
- [Randoop Official Website](https://randoop.github.io/randoop/)  
- [Original Go Code Repository](https://github.com/timtadh/data-structures)  
- [Full Project Report](./docs/Randoop_Project_Report.pdf)

## 📚 References

[1] Randoop Official Documentation: https://randoop.github.io/randoop/
[2] Randoop Manual: https://randoop.github.io/randoop/manual/index.html
[3] Randoop Releases: https://github.com/randoop/randoop/releases
[4] Original Go Data Structures: https://github.com/timtadh/data-structures
[5] Complete Project Report: Randoop_Project_Report.pdf
