/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenda;

import view.TelaAgenda;
//Ativando o FlatLaf
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatDarculaLaf;
import java.awt.Color;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ativa o tema moderno FlatLat(claro)
        //Deve vir ANTES de criar a tela
        FlatDarculaLaf.setup();
        //FlatDarkLaf.setup();
        //FlatLightLaf.setup();
        //Cantos arredondados e componentes em geral
        UIManager.put("Button.arc", 12);
        UIManager.put("Component.arc", 12);
        UIManager.put("TextComponent.arc", 12);
        //Cor de destaque (foco,seleção):azul SENAC
        UIManager.put("Component.focusColor", new Color(0, 76, 148));
        //Tabela:linhas mais altas e cabecalho azul com texto branco
        UIManager.put("Table.rowHeight", 28);
        UIManager.put("TableHeader.background", new Color(0, 76, 148));
        UIManager.put("TableHeader.foreground", Color.WHITE);
        UIManager.put("Table.selectionBackground", new Color(214, 230, 245));
        UIManager.put("Table.selectionForeground", Color.BLACK);
        //TODO code application logic here
        TelaAgenda tela = new TelaAgenda();
        tela.setVisible(true);

    }

}
