![Java](https://img.shields.io/badge/Java-17-blue)
![Randoop](https://img.shields.io/badge/Randoop-4.3.3-green)
![Coverage](https://img.shields.io/badge/Coverage-61--94%25-yellow)
![LLM-Assisted](https://img.shields.io/badge/LLM--Assisted-Translation-orange)

# Randoop-Go-Bug-Detection: Automated Testing of Go Data Structures via Java Translation

## 👨‍💻 Author
**Zirui Fang**  
*October 2024* (Updated November 2025)

## 📋 Project Overview

This research project implements and evaluates an automated testing methodology for verifying data structure reliability through Randoop-based test generation. The study involves:

- **Go-to-Java Translation**: Using LLM-assisted translation of Go data structure implementations
- **Automated Test Generation**: Applying Randoop for systematic test generation with representation invariants
- **Coverage Analysis**: Comprehensive evaluation of test effectiveness across multiple metrics
- **Bug Detection**: Verification of implementation correctness through error-revealing tests

### Subject Data Structures
- **Dynamic List** - Generic, array-based dynamic list with automatic resizing
- **AVL Tree** - Self-balancing binary search tree with guaranteed O(log n) operations

## 🏗️ Project Structure

```
Randoop-Go-Bug-Detection-Automated-Testing-of-Go-Data-Structures-via-Java-Translation/
├── go_to_java/                    # Translated Java implementations
│   ├── List.java                  # Dynamic List implementation
│   ├── AvlTree.java              # AVL Tree implementation
│   ├── array_list.go             # Original Go List source
│   └── avltree.go                # Original Go AVL Tree source
├── repok/                        # Representation invariant implementations
│   ├── list_rep.java             # List repOK method
│   └── avltree_rep.java          # AVL Tree repOK method
├── tests/                        # Generated test suites
│   ├── RegressionTest*.java      # Randoop regression tests
│   └── ErrorTest.java            # Error-revealing tests (if any)
├── docs/
│   └── Randoop_Project_Report_V2.pdf  # Complete research report
└── README.md
```

## 🧪 Experimental Results

### Test Generation Outcomes
| Data Structure | Regression Tests | Error Tests | Flaky Methods | Invalid Tests |
|----------------|------------------|-------------|---------------|---------------|
| **List**       | 12 files         | 0           | 0             | 0             |
| **AVL Tree**   | 14 files         | 0           | 0             | 0             |

### Coverage Analysis
| Data Structure | Method Coverage | Line Coverage | Branch Coverage | Condition Coverage |
|----------------|-----------------|---------------|-----------------|-------------------|
| **List**       | 100% (3/3)      | 94% (32/34)   | 89% (104/116)   | 68% (81/118)      |
| **AVL Tree**   | 72% (16/22)     | 61% (51/100)  | 51% (34/66)     | -                 |

### Key Findings
- ✅ **Zero error-revealing tests** generated, indicating robust implementations
- ✅ **No flaky methods** detected across multiple test runs
- ✅ **High line coverage** achieved for both data structures
- ✅ **Effective repOK validation** of representation invariants
- ✅ **Successful LLM-assisted translation** from Go to Java

## 🛠️ Methodology

### 1. Code Translation Process
- Used DeepSeek LLM for Go-to-Java translation
- Manual validation and minor corrections applied
- Preservation of original semantics and behavior

### 2. Representation Invariants (repOK)
- Implemented comprehensive repOK methods for both data structures
- Verified BST properties, balance conditions, and structural integrity
- Used `@CheckRep` annotations for Randoop integration

### 3. Automated Test Generation
- Applied Randoop 4.3.3 for feedback-directed random testing
- Generated both regression and error-revealing tests
- Used systematic sequence generation and test filtering

## 🚀 Quick Start

### Prerequisites
- Java 17+
- Randoop 4.3.3
- IntelliJ IDEA (recommended)

### Installation & Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/Ray221f/Randoop-Go-Bug-Detection-Automated-Testing-of-Go-Data-Structures-via-Java-Translation.git
   cd Randoop-Go-Bug-Detection-Automated-Testing-of-Go-Data-Structures-via-Java-Translation
   ```

2. **Download and Configure Randoop**
   ```bash
   # Download Randoop JAR
   wget https://github.com/randoop/randoop/releases/download/v4.3.3/randoop-all-4.3.3.jar
   
   # Add to project dependencies (IntelliJ IDEA)
   # Project Structure → Modules → Dependencies → Add JAR (Compile scope)
   ```

3. **Generate Tests**
   ```bash
   # Compile with Randoop
   javac -cp .:randoop-all-4.3.3.jar List.java AvlTree.java
   
   # Generate tests for List
   java -cp .:randoop-all-4.3.3.jar randoop.main.Main gentests \
     --testclass=List \
     --junit-output-dir=tests
   
   # Generate tests for AVL Tree
   java -cp .:randoop-all-4.3.3.jar randoop.main.Main gentests \
     --testclass=AvlTree \
     --junit-output-dir=tests
   ```

4. **Run Coverage Analysis** (IntelliJ IDEA)
   - Right-click test files → "Run with Coverage"
   - Analyze coverage metrics in IDE coverage tool
   - Identify uncovered branches and conditions

## 📖 Detailed Guides

For comprehensive implementation details, refer to the project report:

### [Complete Project Report](./docs/Randoop_Project_Report_V2.pdf)

The report includes:
- **Randoop Setup Guide**: Step-by-step configuration instructions
- **repOK Implementation**: Technical specifications and examples
- **Debugging Methodology**: Systematic test failure analysis
- **Coverage Analysis**: Detailed metrics interpretation
- **LLM Translation Insights**: Code translation challenges and solutions

## 🎯 Research Contributions

This project demonstrates:

1. **Cross-Language Verification**: Practical methodology for verifying data structures across programming languages
2. **Representation Invariant Effectiveness**: Enhanced test generation through explicit specification of intended behavior
3. **LLM-Assisted Analysis**: Emerging applications of large language models in software engineering research
4. **Coverage Insights**: Identification of limitations in automated test generation for complex data structures

## 🔍 Key Insights

- **Translation Quality**: LLMs can effectively handle data structure translation with minor manual corrections
- **Test Effectiveness**: Randoop achieves high line coverage but struggles with complex branch conditions
- **Invariant Value**: repOK methods significantly enhance bug detection capabilities
- **Implementation Robustness**: Both translated data structures demonstrated zero defects under extensive testing

## 🤝 Contributing

Contributions are welcome in the following areas:

- Improving test coverage for complex branch conditions
- Enhancing repOK implementations for additional invariant checks
- Adding new data structures to the analysis framework
- Optimizing the LLM translation and validation pipeline
- Developing automated validation for translated code

## 🔗 Related Resources

- [Randoop Official Website](https://randoop.github.io/randoop/)
- [Randoop Manual](https://randoop.github.io/randoop/manual/index.html)
- [Randoop Releases](https://github.com/randoop/randoop/releases)
- [Original Go Data Structures Repository](https://github.com/timtadh/data-structures)

## 📚 Citation & References

If you use this work in your research, please cite:

```bibtex
@techreport{fang2024randoop,
  title={Randoop-Based Automated Testing of Go Data Structures via Java Translation},
  author={Fang, Zirui},
  year={2024},
  institution={Academic Research Project}
}
```

### References
1. Randoop: Automatic Unit Test Generation for Java - ICSE 2007
2. DeepSeek LLM: https://www.deepseek.com/
3. Go Programming Language Specification
4. Java Collections Framework Documentation

---

*This project demonstrates the practical application of automated test generation techniques to verify the reliability of fundamental software components across programming language boundaries.*
