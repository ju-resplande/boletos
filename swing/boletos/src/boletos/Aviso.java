package boletos;


import boletos.janela;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jubs
 */
public class Aviso {
    janela janela;
    String avisoSelecao = "";
    boolean seSelecionado;
    
    
    
    //JOptionPane.showMessageDialog(null, stringERROR_MESSAGE);
    //if ()

    public Aviso(janela janela) {
        this.janela = janela;
        
    }
    
    void EsqueceuSelecao(String oque){
        avisoSelecao += "Por favor, selecione "  + oque + "\n";
    }
    
    boolean VerificaComboBox(){
        seSelecionado = true;
        if (janela.jComboBox1.getSelectedItem() == "Selecione"){
            EsqueceuSelecao("o UF do Sacado");
            seSelecionado = false;
        }
        
        if (janela.jComboBox2.getSelectedItem() == "Selecione" && janela.jComboBox6.getSelectedItem() == "sim"){
            EsqueceuSelecao("o UF do Sacado Avalista");
            seSelecionado = false;
        }
        
        //FALTA BANCO E TIPO DOCUMENTO
        
        if (seSelecionado == false){
            JOptionPane.showMessageDialog(null, avisoSelecao,"Aviso", JOptionPane.WARNING_MESSAGE);
        }
            
        return seSelecionado;
    }
    
    public static void avisoExcecao(RuntimeException excecao, JLabel rotulo, JComponent campo){
        rotulo.setForeground(new java.awt.Color(216, 55, 55));
        rotulo.setText(excecao.getMessage());
        rotulo.setVisible(true);
        campo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 34, 34), 2, true));
    }
    
    public static void resetarAviso(JLabel rotulo, JComponent campo){
        rotulo.setVisible(false);
        campo.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
    }
}
