# PLP
Repositório para disciplina de PLP. A proposição deste trabalho é implementar a coerção de tipos, também conhecida como conversão implícita, da Linguagem C para a Linguagem Imperativa 2. 

## COERÇÃO DE TIPOS
A coerção é um mecanismo de conversão implícita de tipos implementadas pelo compilador de uma linguagem. Neste tipo de conversão, ao contrário da explícita, em que o programador deve indicar qual variável será alterada, o compilador muda o tipo da variável menos abrangente para o tipo mais abrangente. Por exemplo, um tipo booleano só consegue representar dois valores (0 ou 1), enquanto o tipo inteiro consegue representar 65.535 valores (-32767 a 32767). 

### Implementações do Projeto:
- Extensão da Gramática para incluir tipo float e tipo char, operação de multiplicação e operação de divisão;
- Implementação da coerção para soma, multiplicação e divisão entre um int e um float;
- Implementação da coerção para divisão entre ints;
- Implementação da coerção para soma, multiplicação e divisão entre boolean e int;
- Implementação da coerção para soma, multiplicação e divisão entre char e int (conversão do char via ASCII);
- Implementação da coerção para contatenação (Todos os tipos são convertidos para string);
- Implementação da Coerção na Atribuição.

## BNF
<h3>Imperativa 2</h3>

[Programa](PLP/Imperativa2/src/li2/plp/imperative2/Programa.java) ::= [Comando](PLP/Imperativa2/src/li2/plp/imperative1/command/Comando.java )

Comando ::= [Atribuicao](PLP/Imperativa2/src/li2/plp/imperative1/command/Atribuicao.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [ComandoDeclaracao](PLP/Imperativa2/src/li2/plp/imperative1/command/ComandoDeclaracao.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [While](PLP/Imperativa2/src/li2/plp/imperative1/command/While.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [IfThenElse](PLP/Imperativa2/src/li2/plp/imperative1/command/IfThenElse.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [IO](PLP/Imperativa2/src/li2/plp/imperative1/command/IO.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Comando ";" Comando](PLP/Imperativa2/src/li2/plp/imperative1/command/SequenciaComando.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Skip](PLP/Imperativa2/src/li2/plp/imperative1/command/Skip.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [ChamadaProcedimento](PLP/Imperativa2/src/li2/plp/imperative2/command/ChamadaProcedimento.java)

Skip ::= 

Atribuicao ::= [Id](PLP/Imperativa2/src/li2/plp/expressions2/expression/Id.java) ":=" [Expressao](PLP/Imperativa2/src/li2/plp/expressions2/expression/Expressao.java)

Expressao ::= [Valor](PLP/Imperativa2/src/li2/plp/expressions2/expression/Valor.java) | [ExpUnaria](PLP/Imperativa2/src/li2/plp/expressions2/expression/ExpUnaria.java) | [ExpBinaria](PLP/Imperativa2/src/li2/plp/expressions2/expression/ExpBinaria.java ) | Id

Valor ::= [ValorConcreto](PLP/Imperativa2/src/li2/plp/expressions2/expression/ValorConcreto.java)

ValorConcreto ::= [ValorInteiro](PLP/Imperativa2/src/li2/plp/expressions2/expression/ValorInteiro.java ) 
| [ValorBooleano](PLP/Imperativa2/src/li2/plp/expressions2/expression/ValorBooleano.java) 
| [ValorString](PLP/Imperativa2/src/li2/plp/expressions2/expression/ValorString.java) 
| [**ValorFloat**](PLP/Imperativa2/src/li2/plp/expressions2/expression/ValorFloat.java)
| [**ValorChar**](PLP/Imperativa2/src/li2/plp/expressions2/expression/ValorChar.java)

ExpUnaria ::= ["-" Expressao](PLP/Imperativa2/src/li2/plp/expressions2/expression/ExpMenos.java ) | ["not" Expressao](PLP/Imperativa2/src/li2/plp/expressions2/expression/ExpNot.java) | ["length" Expressao](PLP/Imperativa2/src/li2/plp/expressions2/expression/ExpLength.java)

ExpBinaria ::=  [Expressao "+" Expressao](PLP/Imperativa2/src/li2/plp/expressions2/expression/ExpSoma.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Expressao "-" Expressao](PLP/Imperativa2/src/li2/plp/expressions2/expression/ExpSub.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Expressao "and" Expressao](PLP/Imperativa2/src/li2/plp/expressions2/expression/ExpAnd.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Expressao "or" Expressao](PLP/Imperativa2/src/li2/plp/expressions2/expression/ExpOr.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Expressao "==" Expressao](PLP/Imperativa2/src/li2/plp/expressions2/expression/ExpEquals.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [Expressao "++" Expressao](PLP/Imperativa2/src/li2/plp/expressions2/expression/ExpConcat.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [**Expressao "*" Expressao**](PLP/Imperativa2/src/li2/plp/expressions2/expression/ExpMult.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [**Expressao "/" Expressao**](PLP/Imperativa2/src/li2/plp/expressions2/expression/ExpDiv.java)

ComandoDeclaracao :: = "{" [Declaracao](PLP/Imperativa2/src/li2/plp/imperative1/declaration/Declaracao.java) ";" Comando "}"

Declaracao ::= [DeclaracaoVariavel](PLP/Imperativa2/src/li2/plp/imperative1/declaration/DeclaracaoVariavel.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [DeclaracaoProcedimento](PLP/Imperativa2/src/li2/plp/imperative2/declaration/DeclaracaoProcedimento.java)

&emsp; &emsp; &emsp; &emsp;  &ensp;| [DeclaracaoComposta](PLP/Imperativa2/src/li2/plp/imperative1/declaration/DeclaracaoComposta.java)

DeclaracaoVariavel ::= "var" Id "=" Expressao 

DeclaracaoComposta ::= Declaracao "," Declaracao

DeclaracaoProcedimento ::= ["proc" Id "(" [ ListaDeclaracaoParametro ] ")" "{" Comando "}"](PLP/Imperativa2/src/li2/plp/imperative2/declaration/DeclaracaoProcedimento.java)

ListaDeclaracaoParametro ::= [Tipo Id](PLP/Imperativa2/src/li2/plp/imperative2/declaration/DeclaracaoParametro.java) | [Tipo Id "," ListaDeclaracaoParametro](PLP/Imperativa2/src/li2/plp/imperative2/declaration/ListaDeclaracaoParametro.java)

Tipo ::= "string" | "int" | "boolean" | **"float"** | **"char"**

While ::= "while" Expressao "do" Comando

IfThenElse ::= "if" Expressao "then" Comando "else" Comando

IO ::= ["write" "(" Expressao ")"](PLP/Imperativa2/src/li2/plp/imperative1/command/Write.java) | ["read" "(" Id ")"](PLP/Imperativa2/src/li2/plp/imperative1/command/Read.java)

ChamadaProcedimento ::= "call" Id "(" [[ ListaExpressao ]](PLP/Imperativa2/src/li2/plp/imperative2/command/ListaExpressao.java) ")" 

ListaExpressao ::= Expressao | Expressao, ListaExpressao

### Equipe:
- Lucas A. Lisboa

### Links de Apoio:
- https://www.cin.ufpe.br/~in1007/linguagens/Imperativa2/imperativa2.html
- https://www.inf.ufpr.br/cursos/ci067/Docs/NotasAula/notas-21_Mais_sobre_tipos_convers.html
- https://www.geeksforgeeks.org/type-conversion-c/
