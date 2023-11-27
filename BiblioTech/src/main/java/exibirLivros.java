/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ramos
 */
public class exibirLivros extends javax.swing.JFrame {

    /**
     * Creates new form exibirLivrosNovo
     */
    public exibirLivros(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        listaInicial();
        
    }
    private Usuario usuario;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generoComboBox = new javax.swing.JComboBox<>();
        procurarTextField = new javax.swing.JTextField();
        procurarButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        voltarButton = new javax.swing.JButton();
        tituloTextField = new javax.swing.JTextField();
        autorTextField = new javax.swing.JTextField();
        notaSlider = new javax.swing.JSlider();
        label = new javax.swing.JLabel();
        avaliarButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        generoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Ficção", "Romance", "Técnico" }));
        generoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoComboBoxActionPerformed(evt);
            }
        });




        procurarButton.setText("Procurar");
        procurarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Título", "Autor", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        tituloTextField.setEditable(false);
        tituloTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tituloTextField.setToolTipText("");

        autorTextField.setEditable(false);
        autorTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        autorTextField.setToolTipText("");

        notaSlider.setMajorTickSpacing(10);
        notaSlider.setMinorTickSpacing(5);
        notaSlider.setPaintTicks(true);
        notaSlider.setSnapToTicks(true);
        notaSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        notaSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                notaSliderStateChanged(evt);
            }
        });

        label.setText("Nota: 5.0");

        avaliarButton1.setText("Avaliar");
        avaliarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaliarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(procurarTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tituloTextField)
                                    .addComponent(autorTextField)
                                    .addComponent(procurarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(voltarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(notaSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(avaliarButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(generoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(procurarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(procurarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tituloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(autorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notaSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(avaliarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void procurarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarButtonActionPerformed
        listaPorNome();
        generoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos","Ficção", "Romance", "Técnico" }));

    }//GEN-LAST:event_procurarButtonActionPerformed

    private void generoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoComboBoxActionPerformed
        listaPorGenero();
        procurarTextField.setText("");
    }//GEN-LAST:event_generoComboBoxActionPerformed


    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        this.dispose();
        new TelaUsuario(usuario).setVisible(true);
        
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void notaSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_notaSliderStateChanged
        double dbl = (double) notaSlider.getValue();
        label.setText("Nota: " + dbl/10 );
    }//GEN-LAST:event_notaSliderStateChanged

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        String titulo = (String) jTable1.getValueAt(jTable1.getSelectedRow() , 0);
        String autor = (String) jTable1.getValueAt(jTable1.getSelectedRow() , 1);

        tituloTextField.setText(titulo);
        autorTextField.setText(autor);

        System.out.println(titulo +" - "+ autor);
    }//GEN-LAST:event_jTable1MousePressed

    private void avaliarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaliarButtonActionPerformed
        LivroDAO livroDAO = new LivroDAO();
        double dbl = (double) notaSlider.getValue();
        try {
            Livro livro = livroDAO.getLivro(tituloTextField.getText(), autorTextField.getText());
            Avaliacao av = new Avaliacao(dbl/10, livro.getId(), usuario.getId());

            AvaliacaoDAO avDAO = new AvaliacaoDAO();

            avDAO.cadastrar(av);

        }
        catch (Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_avaliarButtonActionPerformed

    public void listaInicial() {

        DefaultTableModel model = new javax.swing.table.DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String[] colunas = { "Título", "Autor", "Nota" };

        model.setColumnIdentifiers(colunas);

        String titulo = "";
        String autor = "";
        Double nota = 0.0;

        jTable1.setModel(model);

        String sql = "SELECT * FROM tb_livro ORDER BY notaMedia DESC, titulo ASC";

        try (Connection c = ConnectionFactory.obtemConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            int i = 0;
            while (rs.next()) {
                titulo = rs.getString("titulo");
                autor = rs.getString("autor");
                nota = rs.getDouble("notaMedia");

                model.addRow(new Object[] { titulo, autor, nota });
                i++;
            }
            if (i < 1) {
                JOptionPane.showMessageDialog(null, "Nenhum livro encontrado", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            c.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }

    public void listaPorNome() {

        DefaultTableModel model = new javax.swing.table.DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] colunas = { "Título", "Autor", "Nota" };
        model.setColumnIdentifiers(colunas);

        String titulo = "";
        String autor = "";
        Double nota = 0.0;

        jTable1.setModel(model);

        var pesquisarString = "%";
        pesquisarString += procurarTextField.getText();
        pesquisarString += "%";

        String sql = "SELECT * FROM tb_livro WHERE titulo LIKE ? ORDER BY notaMedia DESC, titulo ASC";

        try (Connection c = ConnectionFactory.obtemConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, pesquisarString);
            ResultSet rs = ps.executeQuery();

            int i = 0;
            while (rs.next()) {
                titulo = rs.getString("titulo");
                autor = rs.getString("autor");
                nota = rs.getDouble("notaMedia");

                model.addRow(new Object[] { titulo, autor, nota });
                i++;
            }
            if (i < 1) {
                JOptionPane.showMessageDialog(null, "Nenhum livro encontrado", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            c.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }

    public void listaPorGenero() {

        DefaultTableModel model = new javax.swing.table.DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String[] colunas = { "Título", "Autor", "Nota" };
        model.setColumnIdentifiers(colunas);

        String titulo = "";
        String autor = "";
        Double nota = 0.0;

        jTable1.setModel(model);

        var generoString = (String) generoComboBox.getSelectedItem();

        if (generoString == "Todos") {
            String sql = "SELECT * FROM tb_livro ORDER BY notaMedia DESC, titulo ASC";

            try (Connection c = ConnectionFactory.obtemConexao()) {

                PreparedStatement ps = c.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();

                int i = 0;
                while (rs.next()) {
                    titulo = rs.getString("titulo");
                    autor = rs.getString("autor");
                    nota = rs.getDouble("notaMedia");

                    model.addRow(new Object[] { titulo, autor, nota });
                    i++;
                }
                if (i < 1) {
                    JOptionPane.showMessageDialog(null, "Nenhum livro encontrado", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

                c.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else {

            String sql = "SELECT * FROM tb_livro WHERE genero = ? ORDER BY notaMedia DESC, titulo ASC";

            try (Connection c = ConnectionFactory.obtemConexao()) {

                PreparedStatement ps = c.prepareStatement(sql);
                ps.setString(1, generoString);
                ResultSet rs = ps.executeQuery();

                int i = 0;
                while (rs.next()) {
                    titulo = rs.getString("titulo");
                    autor = rs.getString("autor");
                    nota = rs.getDouble("notaMedia");

                    model.addRow(new Object[] { titulo, autor, nota });
                    i++;
                }
                if (i < 1) {
                    JOptionPane.showMessageDialog(null, "Nenhum livro encontrado", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

                c.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(exibirLivros.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exibirLivros.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exibirLivros.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exibirLivros.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        // java.awt.EventQueue.invokeLater(new Runnable() {
        //     public void run() {
        //         new exibirLivrosNovo().setVisible(true);
        //     }
        // });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autorTextField;
    private javax.swing.JButton avaliarButton1;
    private javax.swing.JComboBox<String> generoComboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label;
    private javax.swing.JSlider notaSlider;
    private javax.swing.JButton procurarButton;
    private javax.swing.JTextField procurarTextField;
    private javax.swing.JTextField tituloTextField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}