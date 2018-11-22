/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletos;

/**
 *
 * @author ruan
 */
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;

import org.jrimum.bopepo.BancosSuportados;
import org.jrimum.bopepo.Boleto;
import org.jrimum.bopepo.view.BoletoViewer;
import org.jrimum.domkee.comum.pessoa.endereco.CEP;
import org.jrimum.domkee.comum.pessoa.endereco.Endereco;
import org.jrimum.domkee.comum.pessoa.endereco.UnidadeFederativa;
import org.jrimum.domkee.financeiro.banco.febraban.Agencia;
import org.jrimum.domkee.financeiro.banco.febraban.Carteira;
import org.jrimum.domkee.financeiro.banco.febraban.Cedente;
import org.jrimum.domkee.financeiro.banco.febraban.ContaBancaria;
import org.jrimum.domkee.financeiro.banco.febraban.NumeroDaConta;
import org.jrimum.domkee.financeiro.banco.febraban.Sacado;
import org.jrimum.domkee.financeiro.banco.febraban.SacadorAvalista;
import org.jrimum.domkee.financeiro.banco.febraban.TipoDeTitulo;
import org.jrimum.domkee.financeiro.banco.febraban.Titulo;

/**
 * <p>
 * Exemplo de código para geração de um boleto simples.
 * </p>
 * <p>
 * Utiliza o Banco Bradesco como exemplo, já que possui um implementação simples.
 * </p>
 * 
 * @author <a href="http://gilmatryx.googlepages.com/">Gilmar P.S.L</a>
 * @author <a href="mailto:misaelbarreto@gmail.com">Misael Barreto</a>
 * @author <a href="mailto:romulomail@gmail.com">Rômulo Augusto</a>
 * 
 * @since 0.2
 * 
 * @version 0.2
 */
public class Boletos {

        public static void main(String args[]) {
            janela janela = new janela();
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
             * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
             */
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    janela.setVisible(true);
                }
            });
    
            Cedente cedente = new Cedente(janela.nomeCedente, janela.cnpjCedente);

            /*
             * INFORMANDO DADOS SOBRE O SACADO.
             */
            Sacado sacado = new Sacado(janela.nomeSacado, janela.cpfSacado);

            // Informando o endereço do sacado.
            Endereco enderecoSac = new Endereco();
            enderecoSac.setUF(UnidadeFederativa.RN);//janela.ufSacado
            enderecoSac.setLocalidade(janela.localidadeSacado);
            enderecoSac.setCep(new CEP(janela.cepSacado));
            enderecoSac.setBairro(janela.bairroSacado);
            enderecoSac.setLogradouro(janela.logradouroSacado);
            enderecoSac.setNumero(janela.numeroSacado);
            sacado.addEndereco(enderecoSac);

            /*
             * INFORMANDO DADOS SOBRE O SACADOR AVALISTA.
             */
            SacadorAvalista sacadorAvalista = new SacadorAvalista(janela.nomeSacadoAvalista, janela.cpfSacadoAvalista);

            // Informando o endereço do sacador avalista.
            Endereco enderecoSacAval = new Endereco();
            enderecoSacAval.setUF(UnidadeFederativa.DF);//janela.ufSacadoAvalista
            enderecoSacAval.setLocalidade(janela.localidadeSacadoAvalista);
            enderecoSacAval.setCep(new CEP(janela.cepSacadoAvalista));
            enderecoSacAval.setBairro(janela.bairroSacadoAvalista);
            enderecoSacAval.setLogradouro(janela.logradouroSacadoAvalista);
            enderecoSacAval.setNumero(janela.numeroSacadoAvalista);
            sacadorAvalista.addEndereco(enderecoSacAval);

            /*
             * INFORMANDO OS DADOS SOBRE O TÍTULO.
             */

            // Informando dados sobre a conta bancária do título.
            ContaBancaria contaBancaria = new ContaBancaria(BancosSuportados.BANCO_BRADESCO.create());
            contaBancaria.setNumeroDaConta(new NumeroDaConta(123456, "0"));
            contaBancaria.setCarteira(new Carteira(30));
            contaBancaria.setAgencia(new Agencia(1234, "1"));

            Titulo titulo = new Titulo(contaBancaria, sacado, cedente, sacadorAvalista);
            titulo.setNumeroDoDocumento("123456");
            titulo.setNossoNumero("99345678912");
            titulo.setDigitoDoNossoNumero("5");
            titulo.setValor(BigDecimal.valueOf(0.23));
            titulo.setDataDoDocumento(new Date());
            titulo.setDataDoVencimento(new Date());
            titulo.setTipoDeDocumento(TipoDeTitulo.DM_DUPLICATA_MERCANTIL);
            titulo.setAceite(titulo.getAceite().A);
            titulo.setDesconto(new BigDecimal(0.05));
            titulo.setDeducao(BigDecimal.ZERO);
            titulo.setMora(BigDecimal.ZERO);
            titulo.setAcrecimo(BigDecimal.ZERO);
            titulo.setValorCobrado(BigDecimal.ZERO);

            /*
             * INFORMANDO OS DADOS SOBRE O BOLETO.
             */
            Boleto boleto = new Boleto(titulo);

            boleto.setLocalPagamento("Pagável preferencialmente na Rede X ou em " +
                            "qualquer Banco até o Vencimento.");
            boleto.setInstrucaoAoSacado("Senhor sacado, sabemos sim que o valor " +
                            "cobrado não é o esperado, aproveite o DESCONTÃO!");
            boleto.setInstrucao1("PARA PAGAMENTO 1 até Hoje não cobrar nada!");
            boleto.setInstrucao2("PARA PAGAMENTO 2 até Amanhã Não cobre!");
            boleto.setInstrucao3("PARA PAGAMENTO 3 até Depois de amanhã, OK, não cobre.");
            boleto.setInstrucao4("PARA PAGAMENTO 4 até 04/xx/xxxx de 4 dias atrás COBRAR O VALOR DE: R$ 01,00");
            boleto.setInstrucao5("PARA PAGAMENTO 5 até 05/xx/xxxx COBRAR O VALOR DE: R$ 02,00");
            boleto.setInstrucao6("PARA PAGAMENTO 6 até 06/xx/xxxx COBRAR O VALOR DE: R$ 03,00");
            boleto.setInstrucao7("PARA PAGAMENTO 7 até xx/xx/xxxx COBRAR O VALOR QUE VOCÊ QUISER!");
            boleto.setInstrucao8("APÓS o Vencimento, Pagável Somente na Rede X.");

            /*
             * GERANDO O BOLETO BANCÁRIO.
             */
            // Instanciando um objeto "BoletoViewer", classe responsável pela
            // geração do boleto bancário.
            BoletoViewer boletoViewer = new BoletoViewer(boleto);

            // Gerando o arquivo. No caso o arquivo mencionado será salvo na mesma
            // pasta do projeto. Outros exemplos:
            // WINDOWS: boletoViewer.getAsPDF("C:/Temp/MeuBoleto.pdf");
            // LINUX: boletoViewer.getAsPDF("/home/temp/MeuBoleto.pdf");
            File arquivoPdf = boletoViewer.getPdfAsFile("MeuPrimeiroBoleto.pdf");

            // Mostrando o boleto gerado na tela.
            mostreBoletoNaTela(arquivoPdf);
        }

        /**
         * Exibe o arquivo na tela.
         * 
         * @param arquivoBoleto
         */
        private static void mostreBoletoNaTela(File arquivoBoleto) {

                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
                
                try {
                        desktop.open(arquivoBoleto);
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
}
