# boletos
## Interface Gráfica para um Sistema Gerador de Boletos Bancários

Este repositório é um trabalho final ( Projeto de Aplicação) para a disciplina de Programação Orientada a Objetos.

Trata-se de uma interface gráfica em Swing para a biblioteca geradora de boletos [Bopepo](https://github.com/jrimum/bopepo).

## Instalação

[Clique aqui para baixar a versão 1.0](https://github.com/ruanchaves/boletos/releases/tag/v1.0).

Após baixar o [último release](https://github.com/ruanchaves/boletos/releases/), execute `bash install.sh` para criar o comando `boletos` no seu **~/.bash_aliases**. Após isso, basta invocar o programa através de digitar `boletos` em seu terminal.

![](https://i.imgur.com/B5JyquM.png)

Você também pode executar o programa diretamente através de `java -jar boletos.jar` na pasta local de `boletos.jar`.

## Utilização

`boletos` permite salvar e carregar preenchimentos prontos dos campos como arquivos JSON.

Cada release acompanha um arquivo de demonstração chamado **dados.json** que pode ser carregado através do menu **Arquivos**.

![](https://i.imgur.com/aU5qwam.png)

O menu **Arquivos** também permite salvar arquivos JSON com preenchimentos de campos.

Geramos boletos a partir dos campos atualmente preenchidos na aplicação através do menu **Gerar Boleto**.

Todas estas funcionalidades também estão disponíveis através de atalhos de teclado:

* **Ctrl + L** : Carregar um preenchimento de campos a partir de um arquivo JSON
* **Ctrl + S** : Salvar o atual preenchimento de campos como um arquivo JSON
* **Ctrl + Alt + P** : Gerar um boleto ( PDF ) a partir do atual preenchimento de campos na aplicação

O boleto gerado é mostrado na tela e também é automaticamente salvo na pasta da aplicação com o nome *boleto-DD-MM-YYYY-hh-mm-ss.pdf*, representando o dia, mês, ano, hora, minuto e segundo em que o arquivo foi criado.
