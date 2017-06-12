/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.gui;

import br.unipe.cc.mpl3.jacademy.fachada.FachadaTurma;
import javax.swing.table.DefaultTableModel;
import br.unipe.cc.mpl3.jacademy.modelo.Turma;
import java.util.List;

/**
 *
 * @author dan
 */
public class FormQueryTurma extends javax.swing.JFrame {

    public static void main(String[] args) {
        FormQueryTurma janela = new FormQueryTurma();
        janela.setVisible(true);
        janela.readJTTurma();
        janela.viewCBTeste();
    }

    /**
     * Creates new form FormTurma
     */
    public FormQueryTurma() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTTurma = new javax.swing.JTable();
        jBEditar = new javax.swing.JButton();
        jBIncluir = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBVoltar = new javax.swing.JButton();
        jTFTurno = new javax.swing.JTextField();
        jBPesquisa = new javax.swing.JButton();
        jTFNome = new javax.swing.JTextField();
        jCBProfessor = new javax.swing.JComboBox<>();
        jCBDisciplina = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Professor", "Diciplina", "Turno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTTurma);

        jBEditar.setText("Editar");

        jBIncluir.setText("Incluir");
        jBIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIncluirActionPerformed(evt);
            }
        });

        jBExcluir.setText("Excluir");

        jBVoltar.setText("Voltar");

        jTFTurno.setText("Turno");
        jTFTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTurnoActionPerformed(evt);
            }
        });

        jBPesquisa.setText("Pesquisar");

        jTFNome.setText("Nome");
        jTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeActionPerformed(evt);
            }
        });

        jCBProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jBPesquisa))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisa)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBIncluir)
                    .addComponent(jBExcluir)
                    .addComponent(jBEditar)
                    .addComponent(jBVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIncluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBIncluirActionPerformed

    private void jTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeActionPerformed
        //TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) jTTurma.getModel();
        String nome = jTFNome.getText();
        if (nome != null && nome != "") {
            printTTurma("SELECT * FROM turma WHERE nome = \'" + nome + "\'", tableModel);
        } else {
            System.out.println("Nulo");
        }
    }//GEN-LAST:event_jTFNomeActionPerformed

    private void jTFTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTurnoActionPerformed
        //TODO add your handling code here:
        String turno = jTFTurno.getText();
        DefaultTableModel tableModel = (DefaultTableModel) jTTurma.getModel();
        if (turno != null && turno != "") {
            printTTurma("SELECT * FROM turma WHERE turno = \'" + turno + "\'", tableModel);
        } else {
            System.out.println("Nulo");
        }
    }//GEN-LAST:event_jTFTurnoActionPerformed

    private void jCBProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBProfessorActionPerformed
    public void readJTTurma() {
        //TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) jTTurma.getModel();
        printTTurma("SELECT * FROM turma", tableModel);
    }
    
    public void viewCBTeste() {
        for (Object item : FachadaTurma.getDadoTurma("SELECT * FROM turma")) {
            jCBProfessor.addItem(item);
            System.out.println(item);
        }
    }

    public void viewCBProfessor() {
        for (Object item : FachadaTurma.getDadoTurma("SELECT nome FROM professor")) {
            jCBProfessor.addItem(item);
        }
    }

    public void viewCBDisciplina() {
        for (Object item : FachadaTurma.getDadoTurma("SELECT nome FROM disciplina")) {
            jCBDisciplina.addItem(item);
        }
    }

    public void printTTurma(String query, DefaultTableModel tableModel) {
        //TODO add your handling code here:
        while (tableModel.getRowCount() != 0) {
            tableModel.removeRow(0);
        }
        for (Object item : FachadaTurma.getDadoTurma(query)) {
            tableModel.addRow((Object[]) item);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBIncluir;
    private javax.swing.JButton jBPesquisa;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JComboBox<Object> jCBDisciplina;
    private javax.swing.JComboBox<Object> jCBProfessor;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFTurno;
    private javax.swing.JTable jTTurma;
    // End of variables declaration//GEN-END:variables
}
