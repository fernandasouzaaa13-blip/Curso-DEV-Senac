/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lanchonete;
//Importa a classe TelaLanchonete do pacote view,
//permitindo acessar e utilizar a tela principal da lanchonete
import  view.TelaLanchonete;
//	Tema claro
import com.formdev.flatlaf.FlatLightLaf;
//Tema escuro
import com.formdev.flatlaf.FlatDarkLaf;
//Tema Darcula
import com.formdev.flatlaf.FlatDarculaLaf;
//	Definir cores
import java.awt.Color;
//	Executar ações da interface com segurança
import javax.swing.SwingUtilities;
//Configurar aparência dos componentes Swing
import javax.swing.UIManager;


public class Lanchonete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Ativa o tema moderno FlatLat(claro)
     // Personaliza a aparência dos componentes, arredondamento dos botões, cores de destaque e estilo da tabela.
     //Deve vir ANTES de criar a tela
        FlatDarculaLaf.setup();
        //FlatDarkLaf.setup();
        //FlatLightLaf.setup();
        //Cantos arredondados e componentes em geral
        UIManager.put("Button.arc", 15);// Define o arredondamento dos botões
        //UIManager.put("Component.arc", 15);// Define o arredondamento dos componente
        //UIManager.put("TextComponent.arc", 15); // Define o arredondamento dos campos de texto
        UIManager.put("Component.focusColor", new Color(255,204,51));// Define a cor amarelo do foco dos componentes
        UIManager.put("Table.rowHeight", 28); // Define a altura das linhas da tabela
        UIManager.put("TableHeader.background", new Color(102,51,0));// Define a cor de fundo do cabeçalho da tabela
        UIManager.put("TableHeader.foreground", Color.WHITE);// Define a cor do texto do cabeçalho
        UIManager.put("Table.selectionBackground", new Color(255,204,51));// Define a cor de fundo da linha selecionada
        UIManager.put("Table.selectionForeground", Color.BLACK);// Define a cor do texto da linha selecionada
        //TODO code application logic here
        TelaLanchonete tela = new TelaLanchonete();
        tela.setVisible(true);
    }
    
}
