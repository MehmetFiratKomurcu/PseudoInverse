/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pseudoinverse;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SelectMatrixType extends javax.swing.JFrame {

    /**
     * Creates new form SelectMatrixType
     */
    public SelectMatrixType() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        randomButton = new javax.swing.JButton();
        inputButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        randomButton.setText("Create a random matrix.");
        randomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomButtonActionPerformed(evt);
            }
        });

        inputButton.setText("I want to enter the values of the matrix myself.");
        inputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputButton, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(randomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(randomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void randomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomButtonActionPerformed
        // TODO add your handling code here:
        String[] numbers = { "1", "2", "3", "4", "5" };
        JFrame frame = new JFrame("Input Dialog Example 3");
        String row = (String) JOptionPane.showInputDialog(frame,
                "Please select row size:",
                "Row",
                JOptionPane.QUESTION_MESSAGE,
                null,
                numbers,
                numbers[0]);
        
        String[] numbers2 = new String[4];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(!numbers[i].equals(row)){
                numbers2[counter] = numbers[i];
                counter++;
            }
        }
        
        String column = (String) JOptionPane.showInputDialog(frame,
                "Please select column size:",
                "Column",
                JOptionPane.QUESTION_MESSAGE,
                null,
                numbers2,
                numbers2[0]);
        
        double[][] matrix = new double[Integer.parseInt(row)][Integer.parseInt(column)];
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (rand.nextInt(80) + 10) / 10.0; 
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(String.format("%4.1f    ", matrix[i][j]));
            }
            System.out.println("");
        } 
        new PseudoInverse(matrix);
        dispose();
    }//GEN-LAST:event_randomButtonActionPerformed

    private void inputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputButtonActionPerformed
        // TODO add your handling code here:
        String[] numbers = { "1", "2", "3", "4", "5" };
        JFrame frame = new JFrame("Input Dialog Example 3");
        String row = (String) JOptionPane.showInputDialog(frame,
                "Please select row size:",
                "Row",
                JOptionPane.QUESTION_MESSAGE,
                null,
                numbers,
                numbers[0]);
        
        String[] numbers2 = new String[4];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(!numbers[i].equals(row)){
                numbers2[counter] = numbers[i];
                counter++;
            }
        }
        
        String column = (String) JOptionPane.showInputDialog(frame,
                "Please select column size:",
                "Column",
                JOptionPane.QUESTION_MESSAGE,
                null,
                numbers2,
                numbers2[0]);
        dispose();
        new InputMatrix(Integer.parseInt(row), Integer.parseInt(column));
    }//GEN-LAST:event_inputButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SelectMatrixType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectMatrixType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectMatrixType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectMatrixType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectMatrixType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inputButton;
    private javax.swing.JButton randomButton;
    // End of variables declaration//GEN-END:variables
}
