# UML

- [ ] Corrigir multiplicidade de pessoa -> endereço



# Finalizar básico
- [ ] Criar variável dedução e criar lugar na janela e por para receber teclado
- [ ] Alterar Conta Bancária, Título e Boleto para receber teclado
- [ ] Usar variáveis locais em janela
- [ ] criar campos com função KeyRealeased para armazenar essas variveis

## UF

- [ ] Armazenar UF
- [x] Utilizar combobox no lugar de textfield para escolher ufs
- [ ] Imune a inserção de ufs inexistentes
- [x] Inicialmente deixar selecionado em "Escolha estado"
- [ ] Ver se o usuário escolheu ou não

## Data

- [ ] Armazenar data
- [ ] Utilizar combobox para datas
- [ ] Bloquear criação de boletos com datas que já passaram   
- [ ] Tratar exceções de datas inválidas  
- [ ] Bloquear criação de boletos com data de vencimento antes da data de emissão ( o Bopepo já faz isso sozinho? Testar )  

## Bancos

- [ ] Escolha de Bancos
- [ ] Colocar ComboBox ou RadioButton para escolher os bancos
- [ ] Arquivo bancos suportados possui as macros
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

## Inserção
- [ ] As variáveis doubles só podem ser positivas? 
- [ ] IllegalArgumentException em inteiros e doubles

# Melhorar:
- [ ] Colocar exemplo no campo ainda não-inseridos
- [ ] Melhorar Alinhamento
- [ ] Fazer um ítem "sobre" no menu
- [x] O que fazer com o ítem file do menu?   
- [ ] Configurar o menu file para receber arquivo