/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listazakupow;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Michał_pc
 */
public class listazakupow extends javax.swing.JFrame {

    /**
     * Creates new form listazakupow
     */
    public listazakupow() {
        initComponents();
        addKeyListenerTojTextFieldWpisz();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jTabbedPaneMain = new javax.swing.JTabbedPane();
        jToolBarWprowadzanie = new javax.swing.JToolBar();
        jPanelWprowadzanie = new javax.swing.JPanel();
        jLabelWpisz = new javax.swing.JLabel();
        jTextFieldWpisz = new javax.swing.JTextField();
        jLabelWartosc = new javax.swing.JLabel();
        jTextFieldWartosc = new javax.swing.JTextField();
        jComboBoxTowar = new javax.swing.JComboBox<>();
        jLabelTowar = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        jButtonZapisz = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jTextAreaZakupy = new javax.swing.JTextArea();
        jLabelTextArea = new javax.swing.JLabel();
        jLabelDzisiaj = new javax.swing.JLabel();
        jLabelTydzien = new javax.swing.JLabel();
        jTextFieldDzisiaj = new javax.swing.JTextField();
        jTextFieldTydzien = new javax.swing.JTextField();
        jToolBarLista = new javax.swing.JToolBar();
        jPanelLista = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBarWprowadzanie.setFloatable(false);
        jToolBarWprowadzanie.setRollover(true);

        jLabelWpisz.setText("Wpisz co kupiłeś");

        jLabelWartosc.setText("Podaj wartosc");

        jComboBoxTowar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelTowar.setText("Typ zakupionego towaru");

        jLabelData.setText("Data zakupu");

        jButtonZapisz.setText("ZAPISZ");

        jTextAreaZakupy.setColumns(20);
        jTextAreaZakupy.setRows(5);
        jScrollPane.setViewportView(jTextAreaZakupy);

        jLabelTextArea.setText("Dzisiejsze zakupy");

        jLabelDzisiaj.setText("Wydatki z dzisiaj");

        jLabelTydzien.setText("Wydatki z tygodnia");

        javax.swing.GroupLayout jPanelWprowadzanieLayout = new javax.swing.GroupLayout(jPanelWprowadzanie);
        jPanelWprowadzanie.setLayout(jPanelWprowadzanieLayout);
        jPanelWprowadzanieLayout.setHorizontalGroup(
            jPanelWprowadzanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWprowadzanieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWprowadzanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelWprowadzanieLayout.createSequentialGroup()
                        .addGroup(jPanelWprowadzanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldWpisz, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelWpisz))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelWprowadzanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldWartosc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelWartosc)))
                    .addGroup(jPanelWprowadzanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelTextArea)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanelWprowadzanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelWprowadzanieLayout.createSequentialGroup()
                        .addGroup(jPanelWprowadzanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxTowar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTowar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelWprowadzanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelData)
                            .addComponent(jTextFieldData)
                            .addComponent(jButtonZapisz, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
                    .addGroup(jPanelWprowadzanieLayout.createSequentialGroup()
                        .addComponent(jLabelDzisiaj)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDzisiaj))
                    .addGroup(jPanelWprowadzanieLayout.createSequentialGroup()
                        .addComponent(jLabelTydzien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTydzien)))
                .addGap(0, 38, Short.MAX_VALUE))
        );
        jPanelWprowadzanieLayout.setVerticalGroup(
            jPanelWprowadzanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWprowadzanieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWprowadzanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWpisz)
                    .addComponent(jLabelWartosc)
                    .addComponent(jLabelTowar)
                    .addComponent(jLabelData))
                .addGap(18, 18, 18)
                .addGroup(jPanelWprowadzanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldWpisz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldWartosc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTowar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelWprowadzanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelWprowadzanieLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButtonZapisz, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWprowadzanieLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTextArea)
                        .addGap(18, 18, 18)))
                .addGroup(jPanelWprowadzanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addGroup(jPanelWprowadzanieLayout.createSequentialGroup()
                        .addGroup(jPanelWprowadzanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDzisiaj)
                            .addComponent(jTextFieldDzisiaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelWprowadzanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTydzien)
                            .addComponent(jTextFieldTydzien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jToolBarWprowadzanie.add(jPanelWprowadzanie);

        jTabbedPaneMain.addTab("Wprowadz zakupy", jToolBarWprowadzanie);

        jToolBarLista.setFloatable(false);
        jToolBarLista.setRollover(true);

        javax.swing.GroupLayout jPanelListaLayout = new javax.swing.GroupLayout(jPanelLista);
        jPanelLista.setLayout(jPanelListaLayout);
        jPanelListaLayout.setHorizontalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );
        jPanelListaLayout.setVerticalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );

        jToolBarLista.add(jPanelLista);

        jTabbedPaneMain.addTab("Lista zakupow", jToolBarLista);

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneMain)
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneMain)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(listazakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listazakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listazakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listazakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listazakupow().setVisible(true);
            }
        });
    }
    
    private void addKeyListenerTojTextFieldWpisz(){
        jTextFieldWpisz.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //System.out.println("1 keyTyped"+e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
               //System.out.println("2 keyPressed"+e.getKeyChar()); 
            }

            @Override
            public void keyReleased(KeyEvent e) {
               //System.out.println("3 keyReleased"+e.getKeyChar()); 
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonZapisz;
    private javax.swing.JComboBox<String> jComboBoxTowar;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelDzisiaj;
    private javax.swing.JLabel jLabelTextArea;
    private javax.swing.JLabel jLabelTowar;
    private javax.swing.JLabel jLabelTydzien;
    private javax.swing.JLabel jLabelWartosc;
    private javax.swing.JLabel jLabelWpisz;
    private javax.swing.JPanel jPanelLista;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelWprowadzanie;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTabbedPane jTabbedPaneMain;
    private javax.swing.JTextArea jTextAreaZakupy;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldDzisiaj;
    private javax.swing.JTextField jTextFieldTydzien;
    private javax.swing.JTextField jTextFieldWartosc;
    private javax.swing.JTextField jTextFieldWpisz;
    private javax.swing.JToolBar jToolBarLista;
    private javax.swing.JToolBar jToolBarWprowadzanie;
    // End of variables declaration//GEN-END:variables

    private void addKeyListenerTojTextFieldWpisz() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
