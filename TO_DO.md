# UML

- [ ] Corrigir multiplicidade de pessoa -> endereço



# Finalizar básico
- [ ] Criar variável dedução e criar lugar na janela e por para receber teclado
- [X] Alterar Conta Bancária, Título e Boleto para receber teclado
- [X] Usar variáveis locais em janela
- [X] Os campos aceitam tanto CPF como CNPJ = CRPF
- [ ] Fechar e não dar mensagem de erro
- [ ] SacadoAvalista opcional

## UF

- [X] Armazenar UF
- [x] Utilizar combobox no lugar de textfield para escolher ufs
- [X] Imune a inserção de ufs inexistentes
- [x] Inicialmente deixar selecionado em "Escolha estado"
- [ ] Ver se o usuário escolheu ou não

## Data

- [X] Armazenar data
~-[ ] Utilizar combobox para datas~
- [ ] Bloquear criação de boletos com datas que já passaram   
- [ ] Tratar exceções de formatos de inválidas 

## Bancos

- [X] Escolha de Bancos
- [X] Colocar ComboBox ou RadioButton para escolher os bancos
- [X] Arquivo bancos suportados possui as macros
- [ ] Inicialmente deixar nenhuma opção selecionada
- [ ] Ver se o usuário escolheu ou não

## etc

- [ ] Remover DialogMessage mostrando os campos inseridos

# Erros

## Verificar Campos em branco:
- [ ] Ver alguma String está como null
- [ ] Como verificar se foi inserido valores das variáveis inteiras e doubles?
- [ ] Verificar se data foi inserida
- [ ] Ver se o usuário escolheu algum uf ou banco

## Lidar com os Exceptions implantados pelo Jrimum:
- [ ] CNPJException e CPFException em AbstractCPRf
- [ ] IllegalArgumentException em AbstractCPRf
- [ ] Colocar mensagem em caixa de texto (showInputDialog) modo erro OU colocar a mensagem na própria frame do lado e deixar o campo em vermelho
- [ ] Código de Barras Exception

## Inserção
- [ ] As variáveis doubles só podem ser positivas? 
- [ ] Usar vírgula em vez de pontos?
- [ ] IllegalArgumentException em inteiros e doubles

## Melhorar:
- [ ] Colocar exemplo no campo ainda não-inseridos
- [X] Melhorar Alinhamento
- [ ] Fazer um ítem "sobre" no menu
- [x] O que fazer com o ítem file do menu?   
- [X] Configurar o menu file para receber arquivo
- [ ] Bloquear criação de boletos com data de vencimento antes da data de emissão (Fator Vencimento?) 
