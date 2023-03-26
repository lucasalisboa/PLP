# PLP
Repositório para disciplina de PLP. A proposição deste trabalho é implementar a coerção de tipos, também conhecida como conversão implícita, da Linguagem C para a Linguagem Imperativa 2. 

## COERÇÃO DE TIPOS
A coerção é um mecanismo de conversão implícita de tipos implementadas pelo compilador de uma linguagem. Neste tipo de conversão, ao contrário da implícita, em que o programador deve indicar qual variável será alterada, o compilador muda o tipo da variável menos abrangente para o tipo mais abrangente. Por exemplo, um tipo booleano só consegue representar dois valores (0 ou 1), enquanto o tipo inteiro consegue representar 65.535 valores (-32767 a 32767). 

### Implementações do Projeto:
- Extensão da Gramática para incluir tipo float, operação de multiplicação e operação de divisão;
- Implementação da coerção para soma, multiplicação e divisão entre um int e um float;
- Implementação da coerção para divisão entre ints;
- Implementação da coerção para soma e multiplicação entre boolean e int;
- Implementação da coerção para soma entre char e int (conversão do char via ASCII);
- Implementação da coerção para soma entre char e string;

### Equipe:
- Lucas A. Lisboa
- Augusto Terra

### Links de Apoio:
- https://www.cin.ufpe.br/~in1007/linguagens/Imperativa2/imperativa2.html
- https://www.inf.ufpr.br/cursos/ci067/Docs/NotasAula/notas-21_Mais_sobre_tipos_convers.html
- https://www.geeksforgeeks.org/type-conversion-c/
