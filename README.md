# T6-compiladores

## Integrantes

- Gabriel de Jesus Dantas
- Lucas Machado Cid

## Descrição do trabalho

O trabalho 6 (T6) da disciplina consiste em implementar um compilador completo para uma linguagem de sua escolha. Não é necessário implementar uma linguagem de programação completa (como LA, ou Alguma). Na verdade, isso não é recomendável, dado que irá tomar muito tempo. A ideia é criar uma linguagem pequena, de preferência declarativa, para alguma aplicação específica de interesse dos estudantes. O único requisito é que o compilador tenha:

- Análise léxica + sintática: em outras palavras, uma gramática;
- Análise semântica: três ou quatro (ou mais) verificações de conformidade que não são feitas pela gramática;
- Geração de código ou interpretação: algo de útil ou interessante feito com a linguagem.

## Tema escolhido pelo grupo

O tema escolhido foi um simulador de batalha entre pokemons. A nossa linguagem permite a criação de skills que possuem atributos como nome, dano, custo para utilização e tipo da skill. Além do mais, é possível criar pokemons com atributos como nome, pontos de vida, pontos de poder, skills disponíveis para uso (e quantas vezes elas podem ser utilizadas) e tipo do pokemon. Os tipos mencionados tanto nas skills quanto nos pokemons são os mesmos e devem ser consistentes.

O tema escolhido se adequa bem ao trabalho, uma vez que podem ser realizadas uma série de verificações sintáticas (como por exemplo, garantir que os tipos estejam contidos em uma lista de tipos declarada na própria gramática), semânticas (como por exemplo, garantir que um pokemon só possa ter skills de acordo com seu tipo) e uma geração de código seja feita (no caso, uma simulação de batalha é realizada gerando código em C++)

## Gramática

A gramática da linguagem pode ser encontrada [neste arquivo](https://github.com/Lucas-Cid/T6-compiladores/blob/master/src/main/antlr4/compiladores/t4/Pokemon.g4). Uma explicação de como a gramática funciona pode ser encontrada no próprio arquivo, mas, basicamente, apresenta três componentes principais

- Declaração das skills
- Declaração dos pokemons
- Batalha

Na declaração das skills, uma lista com todas as skils cadastradas no programa será criada.

Na declaração dos pokemons, será criado um pokemon com os atributos especificados. Além disso, será verificado se o tipo do pokemon é consistente com os tipos das skills que ele possui. As skills do pokemon devem ser também consistentes com as skills cadastradas no programa.

Na batalha, será realizada uma simulação de batalha entre dois pokemons. Será verificado se os pokemons possuem os atributos necessários para a batalha (como por exemplo, se possuem pontos de vida e pontos de poder). Além disso, será verificado se os pokemons possuem skills disponíveis para uso. Caso tudo esteja correto, será realizada uma simulação de batalha entre os pokemons.

## Exemplo de código

Exemplos de código podem ser encontrados no diretório [testes](https://github.com/Lucas-Cid/T6-compiladores/tree/master/testes). Esses exemplos tem como objetivo demostrar o funcionamento dos analisadores sintáticos, semânticos e gerador de código. Os arquivos estão nomeados de acordo com o erro que espera-se que a execução do programa gere. Os arquivos de teste que não geram erros são nomeados de acordo com o que o programa deve gerar como saída.

## Como executar o programa

Para compilar e executar o compilador, em uma pasta baixe todos os arquivos do github,
quanto as ferramentas utilizadas, foram java que pode ser baixado <a href = "https://www.oracle.com/java/technologies/downloads/#jdk18-linux">aqui </a>, suportada nas versões 17 ou superior por testes, e maven para empacotamento que pode ser encontrado links para download e tutoriais de instalação <a href = "https://maven.apache.org">aqui </a>, testado na versão 3.6.3.

Quanto aos passos, basta na pasta onde estão os arquivos desse github rodar o comando para empacotar o codigo para um .jar e depois com esse .jar basta executá-lo com dois argumentos, um o caminho para um arquivo onde está o texto que deve ser compilado, e outro aonde será armazenado o resultado, recomenda-se fazer isso na pasta do .jar:

```bash
mvn package
cd target
java -jar alguma-gerador-1.0-SNAPSHOT-jar-with-dependencies.jar \Caminho\Para\Entrada.txt \Caminho\Para\Saida.txt
```

Feito este processo, um arquivo de saída será gerado na pasta onde foi executado o comando, com eventuais erros de compilação. Se nenhum erro for encontrado, um arquivo de saída com extensão .cpp será criado contendo o decorrer da batalha.
