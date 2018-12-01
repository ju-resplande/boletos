# UML

- [ ] Corrigir multiplicidade de pessoa -> endereço



# Finalizar básico
- [x] Criar variável dedução e criar lugar na janela e por para receber teclado
- [x] Alterar Conta Bancária, Título e Boleto para receber teclado
- [X ] Usar variáveis locais em janela
- [x] Os campos aceitam tanto CPF como CNPJ = CRPF
- [x] Fechar e não dar mensagem de erro

## UF

- [X] Armazenar UF
- [x] Utilizar combobox no lugar de textfield para escolher ufs
- [X] Imune a inserção de ufs inexistentes
- [x] Inicialmente deixar selecionado em "Escolha estado"
- [x] Ver se o usuário escolheu ou não

## Data

- [X] Armazenar data
~-[x] Utilizar combobox para datas~
- [ ] Bloquear criação de boletos com datas que já passaram   
- [x] Tratar exceções de formatos de inválidas 

## Bancos

- [x] Escolha de Bancos
- [x] Colocar ComboBox ou RadioButton para escolher os bancos
- [x] Arquivo bancos suportados possui as macros
- [ ] Inicialmente deixar nenhuma opção selecionada
- [ ] Ver se o usuário escolheu ou não

## etc

- [x] Remover DialogMessage mostrando os campos inseridos

# Erros

## Verificar Campos em branco:
- [x] Ver alguma String está como null
- [x] Como verificar se foi inserido valores das variáveis inteiras e doubles?
- [ ] Verificar se data foi inserida
- [ ] Ver se o usuário escolheu algum uf ou banco

## Lidar com os Exceptions implantados pelo Jrimum:
- [x] CNPJException e CPFException em AbstractCPRf
- [x] IllegalArgumentException em AbstractCPRf
- [x] Colocar mensagem em caixa de texto (showInputDialog) modo erro OU colocar a mensagem na própria frame do lado e deixar o campo em vermelho
- [x] Código de Barras Exception

## Inserção
- [ ] As variáveis doubles só podem ser positivas? 
- [ ] Usar vírgula em vez de pontos?
- [ ] IllegalArgumentException em inteiros e doubles

## Melhorar:
- [ ] Colocar exemplo no campo ainda não-inseridos
- [ ] Melhorar Alinhamento
- [ ] Fazer um ítem "sobre" no menu
- [x] O que fazer com o ítem file do menu?   
- [ ] Configurar o menu file para receber arquivo
- [ ] Bloquear criação de boletos com data de vencimento antes da data de emissão (Fator Vencimento?) 
