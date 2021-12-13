package proyecto;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.text.*;
import javax.swing.tree.*;

public class InterfazPrincipal extends javax.swing.JFrame {

    private int posUsuario, logged, startX = -1, startY = -1;
    private Base baseSeleccionada;
    private Tabla tablaSeleccionada;
    private Usuario usuarioSeleccionado;
    private DefaultMutableTreeNode nodoSeleccionado;
    private Point ubicacion = null;

    public InterfazPrincipal() throws IOException {
        initComponents();
        cargarArbol();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("Manejador Bases de Datos");
        colorear();
        diagrama.setForeground(Color.white);
        lectorCode.setEnabled(false);
        ejecutar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdLogIn = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        liUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btIngresar = new javax.swing.JButton();
        liContraseña = new javax.swing.JPasswordField();
        jdSignUp = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        suNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        suUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        suContraseña = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        gestion = new javax.swing.JCheckBox();
        create = new javax.swing.JCheckBox();
        select = new javax.swing.JCheckBox();
        insert = new javax.swing.JCheckBox();
        delete = new javax.swing.JCheckBox();
        drop = new javax.swing.JCheckBox();
        btCrear = new javax.swing.JButton();
        popUpDatabase = new javax.swing.JPopupMenu();
        miCrear = new javax.swing.JMenuItem();
        miEliminar = new javax.swing.JMenuItem();
        popUpTable = new javax.swing.JPopupMenu();
        miMostrar = new javax.swing.JMenuItem();
        miEliminarT = new javax.swing.JMenuItem();
        popUpUser = new javax.swing.JPopupMenu();
        miPermisos = new javax.swing.JMenuItem();
        popUpPanel = new javax.swing.JPopupMenu();
        limpiar = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        btLogIn = new javax.swing.JButton();
        btSignUp = new javax.swing.JButton();
        btLogOut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        treeBases = new javax.swing.JTree();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lectorCode = new javax.swing.JTextPane();
        ejecutar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaSelect = new javax.swing.JTable();
        diagrama = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmUsuarios = new javax.swing.JMenu();
        miLogIn = new javax.swing.JMenuItem();
        miSignUp = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miLogOut = new javax.swing.JMenuItem();

        jLabel1.setFont(new java.awt.Font("Gujarati Sangam MN", 3, 18)); // NOI18N
        jLabel1.setText("Ingrese sus Datos");

        jLabel2.setText("Usuario: ");

        jLabel3.setText("Contraseña: ");

        btIngresar.setText("Ingresar");
        btIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btIngresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jdLogInLayout = new javax.swing.GroupLayout(jdLogIn.getContentPane());
        jdLogIn.getContentPane().setLayout(jdLogInLayout);
        jdLogInLayout.setHorizontalGroup(
            jdLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdLogInLayout.createSequentialGroup()
                .addGroup(jdLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdLogInLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jdLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jdLogInLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(32, 32, 32)
                                .addComponent(liUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jdLogInLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jdLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(liContraseña)))))
                    .addGroup(jdLogInLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jdLogInLayout.setVerticalGroup(
            jdLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdLogInLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(jdLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(liUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jdLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(liContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Gujarati Sangam MN", 3, 18)); // NOI18N
        jLabel4.setText("Ingrese sus Datos");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Nombre de Usuario: ");

        jLabel7.setText("Contraseña: ");

        jLabel8.setText("Permisos");

        gestion.setText("Gestión");

        create.setText("Create");

        select.setText("Select");

        insert.setText("Insert");

        delete.setText("Delete");

        drop.setText("Drop");

        btCrear.setText("Crear");
        btCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCrearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jdSignUpLayout = new javax.swing.GroupLayout(jdSignUp.getContentPane());
        jdSignUp.getContentPane().setLayout(jdSignUpLayout);
        jdSignUpLayout.setHorizontalGroup(
            jdSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdSignUpLayout.createSequentialGroup()
                .addGroup(jdSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdSignUpLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4))
                    .addGroup(jdSignUpLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jdSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdSignUpLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(suUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jdSignUpLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(suNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jdSignUpLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(suContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addGroup(jdSignUpLayout.createSequentialGroup()
                                .addGroup(jdSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gestion)
                                    .addComponent(create)
                                    .addComponent(select))
                                .addGap(18, 18, 18)
                                .addGroup(jdSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insert)
                                    .addGroup(jdSignUpLayout.createSequentialGroup()
                                        .addGroup(jdSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(drop)
                                            .addComponent(delete))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                        .addComponent(btCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(64, 64, 64))
        );
        jdSignUpLayout.setVerticalGroup(
            jdSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdSignUpLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jdSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(suNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(suUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jdSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(suContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gestion)
                    .addComponent(insert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jdSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create)
                    .addComponent(delete)
                    .addComponent(btCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jdSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select)
                    .addComponent(drop))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        miCrear.setText("Crear Tabla");
        miCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCrearActionPerformed(evt);
            }
        });
        popUpDatabase.add(miCrear);

        miEliminar.setText("Eliminar");
        miEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEliminarActionPerformed(evt);
            }
        });
        popUpDatabase.add(miEliminar);

        miMostrar.setText("Mostrar");
        miMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMostrarActionPerformed(evt);
            }
        });
        popUpTable.add(miMostrar);

        miEliminarT.setText("Eliminar");
        miEliminarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEliminarTActionPerformed(evt);
            }
        });
        popUpTable.add(miEliminarT);

        miPermisos.setText("Permisos");
        miPermisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPermisosActionPerformed(evt);
            }
        });
        popUpUser.add(miPermisos);

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        popUpPanel.add(limpiar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/IconoLogIn.png"))); // NOI18N
        btLogIn.setFocusable(false);
        btLogIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLogIn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLogInMouseClicked(evt);
            }
        });
        jToolBar1.add(btLogIn);

        btSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/IconoSignUp.png"))); // NOI18N
        btSignUp.setEnabled(false);
        btSignUp.setFocusable(false);
        btSignUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSignUp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSignUpMouseClicked(evt);
            }
        });
        jToolBar1.add(btSignUp);

        btLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/IconoLogOut.png"))); // NOI18N
        btLogOut.setEnabled(false);
        btLogOut.setFocusable(false);
        btLogOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLogOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLogOutMouseClicked(evt);
            }
        });
        jToolBar1.add(btLogOut);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Bases de Datos");
        treeBases.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeBases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treeBasesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(treeBases);

        jScrollPane3.setViewportView(lectorCode);

        ejecutar.setText("Ejecutar");
        ejecutar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ejecutarMouseClicked(evt);
            }
        });

        tablaSelect.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tablaSelect);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(576, Short.MAX_VALUE)
                .addComponent(ejecutar)
                .addGap(568, 568, 568))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ejecutar)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consola", jPanel1);

        diagrama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diagramaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout diagramaLayout = new javax.swing.GroupLayout(diagrama);
        diagrama.setLayout(diagramaLayout);
        diagramaLayout.setHorizontalGroup(
            diagramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1221, Short.MAX_VALUE)
        );
        diagramaLayout.setVerticalGroup(
            diagramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Diagramación", diagrama);

        jmUsuarios.setText("Usuarios");

        miLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/IconoLogIn.png"))); // NOI18N
        miLogIn.setText("Log In");
        miLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLogInActionPerformed(evt);
            }
        });
        jmUsuarios.add(miLogIn);

        miSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/IconoSignUp.png"))); // NOI18N
        miSignUp.setText("Sign Up");
        miSignUp.setEnabled(false);
        miSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSignUpActionPerformed(evt);
            }
        });
        jmUsuarios.add(miSignUp);
        jmUsuarios.add(jSeparator1);

        miLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/IconoLogOut.png"))); // NOI18N
        miLogOut.setText("Log Out");
        miLogOut.setEnabled(false);
        miLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLogOutActionPerformed(evt);
            }
        });
        jmUsuarios.add(miLogOut);

        jMenuBar1.add(jmUsuarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIngresarMouseClicked
        AdministrarUsuarios au = new AdministrarUsuarios("./Usuarios.jeay");
        au.cargarArchivo();
        String u = liUsuario.getText();
        String p = liContraseña.getText();
        int banderaIngreso = 0;
        for (Usuario us : au.getUsuarios()) {
            String uA = us.getNombreUsuario();
            String pA = us.getContraseña();
            if (u.equals(uA) && p.equals(pA)) {
                posUsuario = au.getUsuarios().indexOf(us);
                banderaIngreso = 1;
            }
        }
        if (banderaIngreso == 0) {
            JOptionPane.showMessageDialog(jdLogIn, "Usuario/Contraseña ingresados incorrectos");
        } else {
            jdLogIn.dispose();
            JOptionPane.showMessageDialog(jdLogIn, "Bienvenido " + au.getUsuarios().get(posUsuario).getNombre() + "!");
            liUsuario.setText("");
            liContraseña.setText("");
            miLogIn.setEnabled(false);
            btLogIn.setEnabled(false);
            miLogOut.setEnabled(true);
            btLogOut.setEnabled(true);
            if (gestion()) {
                miSignUp.setEnabled(true);
                btSignUp.setEnabled(true);
            }
            logged = 1;
            lectorCode.setEnabled(true);
            ejecutar.setEnabled(true);
        }
    }//GEN-LAST:event_btIngresarMouseClicked

    private void btLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLogInMouseClicked
        if (btLogIn.isEnabled()) {
            jdLogIn.setTitle("Log In");
            jdLogIn.setVisible(true);
            jdLogIn.pack();
            jdLogIn.setModal(true);
            jdLogIn.setLocationRelativeTo(this);
        }
    }//GEN-LAST:event_btLogInMouseClicked

    private void btCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCrearMouseClicked
        try {
            if (!validaUsuario(suUsuario.getText())) {
                ArrayList<String> permisos = new ArrayList();
                AdministrarUsuarios au = new AdministrarUsuarios("./Usuarios.jeay");
                au.cargarArchivo();
                if (gestion.isSelected()) {
                    permisos.add("GESTION");
                }
                if (create.isSelected()) {
                    permisos.add("CREATE");
                }
                if (select.isSelected()) {
                    permisos.add("SELECT");
                }
                if (insert.isSelected()) {
                    permisos.add("INSERT");
                }
                if (delete.isSelected()) {
                    permisos.add("DELETE");
                }
                if (drop.isSelected()) {
                    permisos.add("DROP");
                }
                Usuario u = new Usuario(suNombre.getText(), suUsuario.getText(), suContraseña.getText(), permisos);
                au.getUsuarios().add(u);
                au.escribirArchivo();
                jdSignUp.dispose();
                JOptionPane.showMessageDialog(jdSignUp, "Usuario creado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jdSignUp, e.getMessage());
        }
        suNombre.setText("");
        suUsuario.setText("");
        suContraseña.setText("");
    }//GEN-LAST:event_btCrearMouseClicked

    private void miSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSignUpActionPerformed
        if (miSignUp.isEnabled()) {
            jdSignUp.setTitle("Sign Up");
            jdSignUp.setVisible(true);
            jdSignUp.pack();
            jdSignUp.setModal(true);
            jdSignUp.setLocationRelativeTo(this);
        }
    }//GEN-LAST:event_miSignUpActionPerformed

    private void miLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLogInActionPerformed
        if (miLogIn.isEnabled()) {
            jdLogIn.setTitle("Log In");
            jdLogIn.setVisible(true);
            jdLogIn.pack();
            jdLogIn.setModal(true);
            jdLogIn.setLocationRelativeTo(this);
        }
    }//GEN-LAST:event_miLogInActionPerformed

    private void btSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSignUpMouseClicked
        if (btSignUp.isEnabled()) {
            jdSignUp.setTitle("Sign Up");
            jdSignUp.setVisible(true);
            jdSignUp.pack();
            jdSignUp.setModal(true);
            jdSignUp.setLocationRelativeTo(this);
        }
    }//GEN-LAST:event_btSignUpMouseClicked

    private void btLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLogOutMouseClicked
        if (btLogOut.isEnabled()) {
            btLogIn.setEnabled(true);
            miLogIn.setEnabled(true);
            miSignUp.setEnabled(false);
            btSignUp.setEnabled(false);
            btLogOut.setEnabled(false);
            miLogOut.setEnabled(false);
            lectorCode.setEnabled(false);
            ejecutar.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Salió de su cuenta correctamente");
        }
    }//GEN-LAST:event_btLogOutMouseClicked

    private void miLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLogOutActionPerformed
        if (miLogOut.isEnabled()) {
            btLogIn.setEnabled(true);
            miLogIn.setEnabled(true);
            miSignUp.setEnabled(false);
            btSignUp.setEnabled(false);
            btLogOut.setEnabled(false);
            miLogOut.setEnabled(false);
            lectorCode.setEnabled(false);
            ejecutar.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Salió de su cuenta correctamente");
        }
    }//GEN-LAST:event_miLogOutActionPerformed

    private void treeBasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treeBasesMouseClicked
        if (logged == 1) {
            if (evt.isMetaDown()) {
                int row = treeBases.getClosestRowForLocation(evt.getX(), evt.getY());
                treeBases.setSelectionRow(row);
                Object sel = treeBases.getSelectionPath().getLastPathComponent();
                nodoSeleccionado = (DefaultMutableTreeNode) sel;
                if (nodoSeleccionado.getUserObject() instanceof Base base) {
                    baseSeleccionada = base;
                    popUpDatabase.show(evt.getComponent(), evt.getX(), evt.getY());
                } else if (nodoSeleccionado.getUserObject() instanceof Tabla tabla) {
                    tablaSeleccionada = tabla;
                    popUpTable.show(evt.getComponent(), evt.getX(), evt.getY());
                } else if (nodoSeleccionado.getUserObject() instanceof Usuario usuario) {
                    usuarioSeleccionado = usuario;
                    popUpUser.show(evt.getComponent(), evt.getX(), evt.getY());
                }
            }
        }
    }//GEN-LAST:event_treeBasesMouseClicked

    private void miMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMostrarActionPerformed
        AdministrarBases ab = new AdministrarBases("./Bases.jeay");
        ab.cargarArchivo();
        Tabla t = new Tabla();
        for (Base b : ab.getBases()) {
            for (Tabla temp : b.getTablas()) {
                if (temp.getNombre().equals(tablaSeleccionada.getNombre()) && temp.getNombre().equals(tablaSeleccionada.getNombre())) {
                    t = temp;
                }
            }
        }
        DefaultTableModel modelo = new DefaultTableModel();
        ArrayList<String> atrs = t.getAtributos();
        for (String atr : atrs) {
            modelo.addColumn(atr);
        }
        ArrayList<String[]> dets = t.getDetalles();
        for (String[] det : dets) {
            modelo.addRow(det);
        }
        JTable jt = new JTable(modelo);
        JScrollPane js = new JScrollPane(jt);
        js.setBounds(40, 40, 400, 200);
        diagrama.add(js);
        setDraggable(js);
    }//GEN-LAST:event_miMostrarActionPerformed

    private void miCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCrearActionPerformed
        try {
            AdministrarUsuarios au = new AdministrarUsuarios("./Usuarios.jeay");
            AdministrarBases ab = new AdministrarBases("./Bases.jeay");
            au.cargarArchivo();
            ab.cargarArchivo();
            String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre: ");
            Date creacion = new Date();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
            Tabla t = new Tabla(nombre, au.getUsuarios().get(posUsuario).getNombre(), sd.format(creacion));
            ArrayList<String> atrs = new ArrayList();
            int cant = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la cantidad de atributos: "));
            for (int i = 0; i < cant; i++) {
                String atr = JOptionPane.showInputDialog(this, "Ingrese el valor " + (i + 1) + ":");
                atrs.add(atr);
            }
            t.setAtributos(atrs);
            int a = 0;
            for (Base base : ab.getBases()) {
                if (baseSeleccionada.getNombre().equals(base.getNombre())) {
                    a = ab.getBases().indexOf(base);
                }
            }
            ab.getBases().get(a).getTablas().add(t);
            ab.escribirArchivo();
            agregarTablasTree(t);
            actualizarArbol();
            File f = new File("./Bases de Datos/" + baseSeleccionada.getNombre() + "/" + t.getNombre() + ".txt");
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(t.generarReporte());
            bw.flush();
            fw.close();
            bw.close();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_miCrearActionPerformed

    private void miEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEliminarActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar la base seleccionada?", "Eliminar Base", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            try {
                if (dropea()) {
                    AdministrarBases ab = new AdministrarBases("./Bases.jeay");
                    ab.cargarArchivo();
                    int a = 0;
                    for (Base ba : ab.getBases()) {
                        if (ba.getNombre().equals(baseSeleccionada.getNombre())) {
                            a = ab.getBases().indexOf(ba);
                        }
                    }
                    ab.getBases().remove(a);
                    ab.escribirArchivo();
                    eliminarBaseTree(baseSeleccionada.getNombre());
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_miEliminarActionPerformed

    private void miEliminarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEliminarTActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar la tabla seleccionada?", "Eliminar Tabla", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            try {
                if (dropea()) {
                    AdministrarBases ab = new AdministrarBases("./Bases.jeay");
                    ab.cargarArchivo();
                    int a = 0, b = 0;
                    for (Base ba : ab.getBases()) {
                        if (ba.getTablas().contains(tablaSeleccionada)) {
                            a = ab.getBases().indexOf(ba);
                        }
                    }
                    for (Tabla t : ab.getBases().get(a).getTablas()) {
                        if (t.getNombre().equals(tablaSeleccionada.getNombre())) {
                            b = ab.getBases().get(a).getTablas().indexOf(t);
                        }
                    }
                    ab.getBases().get(a).getTablas().remove(b);
                    ab.escribirArchivo();
                    eliminarTablaTree(tablaSeleccionada.getNombre());
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_miEliminarTActionPerformed

    private void miPermisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPermisosActionPerformed
        String almacenar = "";
        for(String permiso : usuarioSeleccionado.getPermisos()){
            almacenar += permiso + "\n";
        }
        JOptionPane.showMessageDialog(this, "Permisos:\n" + almacenar);
    }//GEN-LAST:event_miPermisosActionPerformed

    private void diagramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagramaMouseClicked
        if (logged == 1) {
            if (evt.isMetaDown()) {
                popUpPanel.show(evt.getComponent(), evt.getX(), evt.getY());
            } else {
                Stroke stroke = new BasicStroke(3f);
                if (startX == -1 && startY == -1) {
                    startX = evt.getX();
                    startY = evt.getY();
                } else {
                    Graphics g = this.diagrama.getGraphics();
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setStroke(stroke);
                    g2d.drawLine(startX, startY, evt.getX(), evt.getY());
                    startX = -1;
                    startY = -1;
                }
            }
        }
    }//GEN-LAST:event_diagramaMouseClicked

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        diagrama.repaint();
        diagrama.removeAll();
    }//GEN-LAST:event_limpiarActionPerformed

    private void ejecutarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ejecutarMouseClicked
        validarEntradas();
        lectorCode.setText("");
    }//GEN-LAST:event_ejecutarMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterfazPrincipal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    //Verifica si tiene permiso de gestión
    private boolean gestion() {
        AdministrarUsuarios au = new AdministrarUsuarios("./Usuarios.jeay");
        au.cargarArchivo();
        return au.getUsuarios().get(posUsuario).getPermisos().contains("GESTION");
    }

    //Valida el nombre de usuario
    private boolean validaUsuario(String n) throws Exception {
        AdministrarUsuarios au = new AdministrarUsuarios("./Usuarios.jeay");
        au.cargarArchivo();
        for (Usuario u : au.getUsuarios()) {
            if (u.getNombreUsuario().equals(n)) {
                throw new Exception("Usuario con el nombre de usuario " + n + " ya existente");
            }
        }
        return false;
    }

    //Metodo para mover las tablas en el panel
    public void setDraggable(JScrollPane t) {
        t.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                ubicacion = e.getPoint();
            }
        });
        t.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Point ubicacionActual = e.getLocationOnScreen();
                t.setLocation(ubicacionActual.x - ubicacion.getLocation().x,
                        ubicacionActual.y - ubicacion.getLocation().x);
            }
        });
    }

    //Valida las entradas de la consola
    private void validarEntradas() {
        String temp = lectorCode.getText();
        String[] separado = parentesisFuera(temp);
        AdministrarUsuarios au = new AdministrarUsuarios("./Usuarios.jeay");
        AdministrarBases ab = new AdministrarBases("./Bases.jeay");
        int valida = 0;
        au.cargarArchivo();
        ab.cargarArchivo();
        try {
            for (int i = 0; i < separado.length; i++) {
                switch (separado[i]) {
                    case "CREATE", "create" -> {
                        if (crea()) {
                            if (separado[i + 1].equalsIgnoreCase("DATABASE")) {
                                if (!validarBase(separado[i + 2])) {
                                    Base bd = new Base(separado[i + 2], au.getUsuarios().get(posUsuario).getNombre());
                                    bd.getUsuarios().add(au.getUsuarios().get(posUsuario));
                                    ab.getBases().add(bd);
                                    ab.escribirArchivo();
                                    agregarBaseTree(bd);
                                    actualizarArbol();
                                    File dir = new File("./Bases de Datos/" + separado[i + 2]);
                                    dir.mkdir();
                                    valida = 1;
                                }
                            } else if (separado[i + 1].equalsIgnoreCase("TABLE")) {
                                if (hasAccess()) {
                                    if (!validarTabla(separado[i + 2])) {
                                        Date creacion = new Date();
                                        SimpleDateFormat sd = new SimpleDateFormat("yyyy/MM/dd");
                                        Tabla t = new Tabla(separado[i + 2], au.getUsuarios().get(posUsuario).getNombre(), sd.format(creacion));
                                        String datos = eliminarParentesis(obtenerDatos(temp));
                                        String[] datosA = separarDatos(datos);
                                        for (String s : datosA) {
                                            t.getAtributos().add(s);
                                        }
                                        int a = 0;
                                        for (Base base : ab.getBases()) {
                                            if (baseSeleccionada.getNombre().equals(base.getNombre())) {
                                                a = ab.getBases().indexOf(base);
                                            }
                                        }
                                        ab.getBases().get(a).getTablas().add(t);
                                        ab.escribirArchivo();
                                        agregarTablasTree(t);
                                        actualizarArbol();
                                        File f = new File("./Bases de Datos/" + baseSeleccionada.getNombre() + "/" + t.getNombre() + ".txt");
                                        try {
                                            FileWriter fw = new FileWriter(f);
                                            BufferedWriter bw = new BufferedWriter(fw);
                                            bw.write(t.generarReporte());
                                            bw.flush();
                                            fw.close();
                                            bw.close();
                                        } catch (IOException e) {
                                        }
                                        valida = 1;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    case "DROP", "drop" -> {
                        if (dropea()) {
                            if (separado[i + 1].equalsIgnoreCase("DATABASE")) {
                                Base bd = obtenerBase(separado[i + 2]);
                                if (hasAccess(bd)) {
                                    int a = 0;
                                    for (Base base : ab.getBases()) {
                                        if (bd.getNombre().equals(base.getNombre())) {
                                            a = ab.getBases().indexOf(base);
                                        }
                                    }
                                    ab.getBases().remove(a);
                                    ab.escribirArchivo();
                                    eliminarBaseTree(separado[i + 2]);
                                    valida = 1;
                                    File dir = new File("./Bases de Datos/" + bd.getNombre());
                                    dir.delete();
                                }
                            } else if (separado[i + 1].equalsIgnoreCase("TABLE")) {
                                if (hasAccess()) {
                                    Base bd = obtenerBase();
                                    int a = 0;
                                    for (Base base : ab.getBases()) {
                                        if (bd.getNombre().equals(base.getNombre())) {
                                            a = ab.getBases().indexOf(base);
                                        }
                                    }
                                    Tabla t = obtenerTabla(separado[i + 2], bd);
                                    int b = 0;
                                    for (Tabla ta : ab.getBases().get(a).getTablas()) {
                                        if (ta.getNombre().equals(t.getNombre())) {
                                            b = ab.getBases().get(a).getTablas().indexOf(ta);
                                        }
                                    }
                                    ab.getBases().get(a).getTablas().remove(b);
                                    ab.escribirArchivo();
                                    eliminarTablaTree(separado[i + 2]);
                                    actualizarArbol();
                                    valida = 1;
                                    File f = new File("./Bases de Datos/" + bd.getNombre() + "/" + t.getNombre() + ".txt");
                                    f.delete();
                                }
                            }
                        }
                        break;
                    }
                    case "GRANT", "grant" -> {
                        if (separado[i + 1].equalsIgnoreCase("DATABASE")) {
                            if (separado[i + 3].equals("TO")) {
                                Base bd = obtenerBase(separado[i + 2]);
                                int a = 0;
                                for (Base base : ab.getBases()) {
                                    if (bd.getNombre().equals(base.getNombre())) {
                                        a = ab.getBases().indexOf(base);
                                    }
                                }
                                if (hasAccess(ab.getBases().get(a))) {
                                    Usuario u = obtenerUsuario(separado[i + 4]);
                                    boolean accede = false;
                                    for (Usuario us : ab.getBases().get(a).getUsuarios()) {
                                        if (us.getNombreUsuario().equals(u.getNombreUsuario())) {
                                            accede = true;
                                        }
                                    }
                                    if (accesoBase(ab.getBases().get(a)) && !accede) {
                                        ab.getBases().get(a).getUsuarios().add(u);
                                        ab.escribirArchivo();
                                        agregarUsuarioTree(separado[i + 2], u);
                                    } else if (accede) {
                                        JOptionPane.showMessageDialog(this, "El usuario " + u.getNombre() + " ya tiene acceso a la base");
                                    }
                                }
                                actualizarArbol();
                                valida = 1;
                            }
                        }
                        break;
                    }
                    case "INSERT", "insert" -> {
                        if (inserta()) {
                            if (separado[i + 1].equalsIgnoreCase("INTO")) {
                                if (separado[i + 3].equalsIgnoreCase("VALUES")) {
                                    if (hasAccess()) {
                                        if (inserta()) {
                                            Base bd = obtenerBase();
                                            Tabla t = obtenerTabla(separado[i + 2], bd);
                                            int a = 0, b = 0;
                                            for (Base base : ab.getBases()) {
                                                if (bd.getNombre().equals(base.getNombre())) {
                                                    a = ab.getBases().indexOf(base);
                                                }
                                            }
                                            for (Tabla ta : ab.getBases().get(a).getTablas()) {
                                                if (ta.getNombre().equals(t.getNombre())) {
                                                    b = ab.getBases().get(a).getTablas().indexOf(ta);
                                                }
                                            }
                                            String datos = eliminarParentesis(obtenerDatos(temp));
                                            String[] datosA = separarDatos(datos);
                                            if (datosA.length == t.getAtributos().size()) {
                                                ab.getBases().get(a).getTablas().get(b).getDetalles().add(datosA);
                                                ab.escribirArchivo();
                                            } else {
                                                JOptionPane.showMessageDialog(this, "El detalle ingresado tiene más atributos que los establecidos en la tabla");
                                            }
                                            actualizarArbol();
                                            valida = 1;
                                            File f = new File("./Bases de Datos/" + baseSeleccionada.getNombre() + "/" + t.getNombre() + ".txt");
                                            try {
                                                FileWriter fw = new FileWriter(f);
                                                BufferedWriter bw = new BufferedWriter(fw);
                                                bw.write(ab.getBases().get(a).getTablas().get(b).generarReporte());
                                                bw.flush();
                                                fw.close();
                                                bw.close();
                                            } catch (IOException e) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                    case "SELECT", "select" -> {
                        if (selecciona()) {
                            if (separado[i + 2].equalsIgnoreCase("FROM")) {
                                if (hasAccess()) {
                                    Base bd = obtenerBase();
                                    Tabla t = obtenerTabla(separado[i + 3], bd);
                                    int a = 0, b = 0;
                                    for (Base base : ab.getBases()) {
                                        if (bd.getNombre().equals(base.getNombre())) {
                                            a = ab.getBases().indexOf(base);
                                        }
                                    }
                                    for (Tabla ta : ab.getBases().get(a).getTablas()) {
                                        if (ta.getNombre().equals(t.getNombre())) {
                                            b = ab.getBases().get(a).getTablas().indexOf(ta);
                                        }
                                    }
                                    String datos = eliminarParentesis(obtenerDatos(temp));
                                    String[] datosA = separarDatos(datos);
                                    DefaultTableModel m = new DefaultTableModel();
                                    ArrayList<String> columnas = new ArrayList();
                                    ArrayList<String[]> detalles = new ArrayList();
                                    if (separado.length == 4) {
                                        ArrayList<String> atrs = ab.getBases().get(a).getTablas().get(b).getAtributos();
                                        ArrayList<String[]> dets = ab.getBases().get(a).getTablas().get(b).getDetalles();
                                        for (int k = 0; k < dets.size(); k++) {
                                            String[] detalle = dets.get(k);
                                            String[] aux = new String[datosA.length];
                                            for (int x = 0; x < datosA.length; x++) {
                                                String seleccion = datosA[x];
                                                if (atrs.contains(seleccion)) {
                                                    int pos = atrs.indexOf(seleccion);
                                                    aux[x] = detalle[pos];
                                                }
                                            }
                                            detalles.add(aux);
                                        }
                                        for (int x = 0; x < datosA.length; x++) {
                                            String seleccion = datosA[x];
                                            columnas.add(seleccion);
                                        }
                                        for (String columna : columnas) {
                                            m.addColumn(columna);
                                        }
                                        for (String[] detalle : detalles) {
                                            m.addRow(detalle);
                                        }
                                        tablaSelect.setModel(m);
                                    } else if (separado[i + 4].equalsIgnoreCase("WHERE")) {
                                        boolean todo = false;
                                        ArrayList<String> atrs = ab.getBases().get(a).getTablas().get(b).getAtributos();
                                        ArrayList<String[]> dets = ab.getBases().get(a).getTablas().get(b).getDetalles();
                                        for (int k = 0; k < datosA.length; k++) {
                                            String seleccion = datosA[k];
                                            if (seleccion.equals("*")) {
                                                todo = true;
                                                String sel = separado[i + 5];
                                                String sym = separado[i + 6];
                                                int bandera = 0;
                                                ArrayList<String[]> entran = new ArrayList();
                                                switch (sym) {
                                                    case "=" -> {
                                                        String req = separado[i + 7];
                                                        for (int x = 0; x < atrs.size(); x++) {
                                                            if (atrs.get(x).equals(sel)) {
                                                                int pos = atrs.indexOf(atrs.get(x));
                                                                bandera = 1;
                                                                for (int y = 0; y < dets.size(); y++) {
                                                                    if (separado.length == 8) {
                                                                        String[] deta = dets.get(y);
                                                                        if (deta[pos].equals(req)) {
                                                                            entran.add(deta);
                                                                        }
                                                                    } else if (separado[i + 8].equalsIgnoreCase("AND")) {
                                                                        String sel2 = separado[i + 9];
                                                                        String sym2 = separado[i + 10];
                                                                        switch (sym2) {
                                                                            case "=" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (det[pos].equals(req) && det[pos2].equals(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case ">" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (det[pos].equals(req) && Integer.parseInt(det[pos2]) > Integer.parseInt(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case "<" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (det[pos].equals(req) && Integer.parseInt(det[pos2]) < Integer.parseInt(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    } else if (separado[i + 8].equalsIgnoreCase("OR")) {
                                                                        String sel2 = separado[i + 9];
                                                                        String sym2 = separado[i + 10];
                                                                        switch (sym2) {
                                                                            case "=" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (det[pos].equals(req) || det[pos2].equals(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case ">" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (det[pos].equals(req) || Integer.parseInt(det[pos2]) > Integer.parseInt(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case "<" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (det[pos].equals(req) || Integer.parseInt(det[pos2]) < Integer.parseInt(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (bandera == 0) {
                                                            JOptionPane.showMessageDialog(this, "El atributo " + sel + " no fue encontrado");
                                                        }
                                                        break;
                                                    }
                                                    case ">" -> {
                                                        int req = Integer.parseInt(separado[i + 7]);
                                                        for (int x = 0; x < atrs.size(); x++) {
                                                            if (atrs.get(x).equals(sel)) {
                                                                int pos = atrs.indexOf(atrs.get(x));
                                                                bandera = 1;
                                                                for (int y = 0; y < dets.size(); y++) {
                                                                    if (separado.length == 8) {
                                                                        String[] deta = dets.get(y);
                                                                        if (Integer.parseInt(deta[pos]) > req) {
                                                                            entran.add(deta);
                                                                        }
                                                                    } else if (separado[i + 8].equalsIgnoreCase("AND")) {
                                                                        String sel2 = separado[i + 9];
                                                                        String sym2 = separado[i + 10];
                                                                        switch (sym2) {
                                                                            case "=" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (Integer.parseInt(det[pos]) > req && det[pos2].equals(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case ">" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (Integer.parseInt(det[pos]) > req && Integer.parseInt(det[pos2]) > Integer.parseInt(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case "<" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (Integer.parseInt(det[pos]) > req && Integer.parseInt(det[pos2]) < Integer.parseInt(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    } else if (separado[i + 8].equalsIgnoreCase("OR")) {
                                                                        String sel2 = separado[i + 9];
                                                                        String sym2 = separado[i + 10];
                                                                        switch (sym2) {
                                                                            case "=" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (Integer.parseInt(det[pos]) > req || det[pos2].equals(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case ">" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (Integer.parseInt(det[pos]) > req || Integer.parseInt(det[pos2]) > Integer.parseInt(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case "<" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (Integer.parseInt(det[pos]) > req || Integer.parseInt(det[pos2]) < Integer.parseInt(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (bandera == 0) {
                                                            JOptionPane.showMessageDialog(this, "El atributo " + sel + " no fue encontrado");
                                                        }
                                                        break;
                                                    }
                                                    case "<" -> {
                                                        int req = Integer.parseInt(separado[i + 7]);
                                                        for (int x = 0; x < atrs.size(); x++) {
                                                            if (atrs.get(x).equals(sel)) {
                                                                int pos = atrs.indexOf(atrs.get(x));
                                                                bandera = 1;
                                                                for (int y = 0; y < dets.size(); y++) {
                                                                    if (separado.length == 8) {
                                                                        String[] deta = dets.get(y);
                                                                        if (Integer.parseInt(deta[pos]) < req) {
                                                                            entran.add(deta);
                                                                        }
                                                                    } else if (separado[i + 8].equalsIgnoreCase("AND")) {
                                                                        String sel2 = separado[i + 9];
                                                                        String sym2 = separado[i + 10];
                                                                        switch (sym2) {
                                                                            case "=" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (Integer.parseInt(det[pos]) > req && det[pos2].equals(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case ">" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (Integer.parseInt(det[pos]) > req && Integer.parseInt(det[pos2]) > Integer.parseInt(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case "<" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (Integer.parseInt(det[pos]) > req && Integer.parseInt(det[pos2]) < Integer.parseInt(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    } else if (separado[i + 8].equalsIgnoreCase("OR")) {
                                                                        String sel2 = separado[i + 9];
                                                                        String sym2 = separado[i + 10];
                                                                        switch (sym2) {
                                                                            case "=" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (Integer.parseInt(det[pos]) < req || det[pos2].equals(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case ">" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (Integer.parseInt(det[pos]) < req || Integer.parseInt(det[pos2]) > Integer.parseInt(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case "<" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(y);
                                                                                    if (Integer.parseInt(det[pos]) < req || Integer.parseInt(det[pos2]) < Integer.parseInt(req2)) {
                                                                                        entran.add(det);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }

                                                        }
                                                        if (bandera == 0) {
                                                            JOptionPane.showMessageDialog(this, "El atributo " + sel + " no fue encontrado");
                                                        }
                                                        break;
                                                    }
                                                }
                                                for (String at : atrs) {
                                                    m.addColumn(at);
                                                }
                                                for (String[] s : entran) {
                                                    m.addRow(s);
                                                }
                                                tablaSelect.setModel(m);
                                            }
                                        }
                                        if (todo == false) {
                                            for (int k = 0; k < dets.size(); k++) {
                                                String seleccion = datosA[k];
                                                columnas.add(seleccion);
                                                String[] detalle = dets.get(k);
                                                String[] aux = new String[datosA.length];
                                                String sel = separado[i + 5];
                                                String sym = separado[i + 6];
                                                switch (sym) {
                                                    case "=" -> {
                                                        String req = separado[i + 7];
                                                        for (int h = 0; h < dets.size(); h++) {
                                                            for (int x = 0; x < datosA.length; x++) {
                                                                if (atrs.contains(sel)) {
                                                                    int pos = atrs.indexOf(sel);
                                                                    if (separado.length == 8) {
                                                                        String[] deta = dets.get(x);
                                                                        if (deta[pos].equals(req)) {
                                                                            aux[x] = detalle[pos];
                                                                        }
                                                                    } else if (separado[i + 8].equalsIgnoreCase("AND")) {
                                                                        String sel2 = separado[i + 9];
                                                                        String sym2 = separado[i + 10];
                                                                        switch (sym2) {
                                                                            case "=" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(x);
                                                                                    if (det[pos].equals(req) && det[pos2].equals(req2)) {
                                                                                        aux[x] = detalle[pos];
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case ">" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(x);
                                                                                    if (det[pos].equals(req) && Integer.parseInt(det[pos2]) > Integer.parseInt(req2)) {
                                                                                        aux[x] = detalle[pos];
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case "<" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(x);
                                                                                    if (det[pos].equals(req) && Integer.parseInt(det[pos2]) < Integer.parseInt(req2)) {
                                                                                        aux[x] = detalle[pos];
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    } else if (separado[i + 8].equalsIgnoreCase("OR")) {
                                                                        String sel2 = separado[i + 9];
                                                                        String sym2 = separado[i + 10];
                                                                        switch (sym2) {
                                                                            case "=" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(x);
                                                                                    if (det[pos].equals(req) || det[pos2].equals(req2)) {
                                                                                        aux[x] = detalle[pos];
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case ">" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(x);
                                                                                    if (det[pos].equals(req) || Integer.parseInt(det[pos2]) > Integer.parseInt(req2)) {
                                                                                        aux[x] = detalle[pos];
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case "<" -> {
                                                                                String req2 = separado[i + 11];
                                                                                if (atrs.get(x).equals(sel2)) {
                                                                                    int pos2 = atrs.indexOf(atrs.get(x));
                                                                                    String[] det = dets.get(x);
                                                                                    if (det[pos].equals(req) || Integer.parseInt(det[pos2]) < Integer.parseInt(req2)) {
                                                                                        aux[x] = detalle[pos];
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            detalles.add(aux);
                                                        }
                                                        break;
                                                    }
                                                }
                                                detalles.add(aux);
                                            }
                                            for (int x = 0; x < datosA.length; x++) {
                                                String seleccion = datosA[x];
                                                columnas.add(seleccion);
                                            }
                                            for (String columna : columnas) {
                                                m.addColumn(columna);
                                            }
                                            for (String[] detalle : detalles) {
                                                m.addRow(detalle);
                                            }
                                            tablaSelect.setModel(m);
                                        }
                                    }
                                    valida = 1;
                                }
                            }
                        }
                        break;
                    }
                    case "UPDATE", "update" -> {
                        if (separado[i + 2].equalsIgnoreCase("SET")) {
                            if (separado[i + 6].equalsIgnoreCase("WHERE")) {
                                if (hasAccess()) {
                                    Base bd = obtenerBase();
                                    Tabla t = obtenerTabla(separado[i + 1], bd);
                                    int a = 0, b = 0;
                                    for (Base base : ab.getBases()) {
                                        if (bd.getNombre().equals(base.getNombre())) {
                                            a = ab.getBases().indexOf(base);
                                        }
                                    }
                                    for (Tabla ta : ab.getBases().get(a).getTablas()) {
                                        if (ta.getNombre().equals(t.getNombre())) {
                                            b = ab.getBases().get(a).getTablas().indexOf(ta);
                                        }
                                    }
                                    String atr = separado[i + 3];
                                    String valor = separado[i + 5];
                                    String atr2 = separado[i + 7];
                                    String req = separado[i + 9];
                                    if (ab.getBases().get(a).getTablas().get(b).getAtributos().contains(atr) && ab.getBases().get(a).getTablas().get(b).getAtributos().contains(atr2)) {
                                        int pos1 = ab.getBases().get(a).getTablas().get(b).getAtributos().indexOf(atr);
                                        int pos2 = ab.getBases().get(a).getTablas().get(b).getAtributos().indexOf(atr2);
                                        ArrayList<String[]> detalles = ab.getBases().get(a).getTablas().get(b).getDetalles();
                                        if (separado[i + 4].equals("=")) {
                                            for (String[] detalle : detalles) {
                                                if (detalle[pos2].equals(req)) {
                                                    detalle[pos1] = valor;
                                                }
                                            }
                                        }
                                    }
                                    ab.escribirArchivo();
                                    valida = 1;
                                    File f = new File("./Bases de Datos/" + baseSeleccionada.getNombre() + "/" + t.getNombre() + ".txt");
                                    try {
                                        FileWriter fw = new FileWriter(f);
                                        BufferedWriter bw = new BufferedWriter(fw);
                                        bw.write(ab.getBases().get(a).getTablas().get(b).generarReporte());
                                        bw.flush();
                                        fw.close();
                                        bw.close();
                                    } catch (IOException e) {
                                    }
                                }
                            }
                        }
                        break;
                    }
                    case "DELETE", "delete" -> {
                        if (borra()) {
                            if (separado[i + 1].equalsIgnoreCase("FROM")) {
                                if (separado[i + 3].equalsIgnoreCase("WHERE")) {
                                    if (hasAccess()) {
                                        Base bd = obtenerBase();
                                        Tabla t = obtenerTabla(separado[i + 2], bd);
                                        int a = 0, b = 0;
                                        for (Base base : ab.getBases()) {
                                            if (bd.getNombre().equals(base.getNombre())) {
                                                a = ab.getBases().indexOf(base);
                                            }
                                        }
                                        for (Tabla ta : ab.getBases().get(a).getTablas()) {
                                            if (ta.getNombre().equals(t.getNombre())) {
                                                b = ab.getBases().get(a).getTablas().indexOf(ta);
                                            }
                                        }
                                        String atr = separado[i + 4];
                                        String req = separado[i + 6];
                                        int pos = ab.getBases().get(a).getTablas().get(b).getAtributos().indexOf(atr);
                                        ArrayList<String[]> detalles = ab.getBases().get(a).getTablas().get(b).getDetalles();
                                        if (separado[i + 5].equals("=")) {
                                            for (String[] detalle : detalles) {
                                                if (detalle[pos].equals(req)) {
                                                    int borrar = detalles.indexOf(detalle);
                                                    detalles.remove(borrar);
                                                    break;
                                                }
                                            }
                                        }
                                        ab.getBases().get(a).getTablas().get(b).setDetalles(detalles);
                                        ab.escribirArchivo();
                                        valida = 1;
                                        File f = new File("./Bases de Datos/" + baseSeleccionada.getNombre() + "/" + t.getNombre() + ".txt");
                                        try {
                                            FileWriter fw = new FileWriter(f);
                                            BufferedWriter bw = new BufferedWriter(fw);
                                            bw.write(ab.getBases().get(a).getTablas().get(b).generarReporte());
                                            bw.flush();
                                            fw.close();
                                            bw.close();
                                        } catch (IOException e) {
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                    case "TRUNCATE", "truncate" -> {
                        if (separado[i + 1].equalsIgnoreCase("TABLE")) {
                            if (hasAccess()) {
                                Base bd = obtenerBase();
                                Tabla t = obtenerTabla(separado[i + 2], bd);
                                int a = 0, b = 0;
                                for (Base base : ab.getBases()) {
                                    if (bd.getNombre().equals(base.getNombre())) {
                                        a = ab.getBases().indexOf(base);
                                    }
                                }
                                for (Tabla tabla : ab.getBases().get(a).getTablas()) {
                                    if (t.getNombre().equals(tabla.getNombre())) {
                                        b = ab.getBases().get(a).getTablas().indexOf(tabla);
                                    }
                                }
                                ab.getBases().get(a).getTablas().get(b).setDetalles(new ArrayList());
                                ab.escribirArchivo();
                                actualizarArbol();
                                valida = 1;
                                File f = new File("./Bases de Datos/" + baseSeleccionada.getNombre() + "/" + t.getNombre() + ".txt");
                                try {
                                    FileWriter fw = new FileWriter(f);
                                    BufferedWriter bw = new BufferedWriter(fw);
                                    bw.write(ab.getBases().get(a).getTablas().get(b).generarReporte());
                                    bw.flush();
                                    fw.close();
                                    bw.close();
                                } catch (IOException e) {
                                }
                            }
                        }
                        break;
                    }
                }
            }
            if (valida != 1) {
                JOptionPane.showMessageDialog(this, "No se pudo validar correctamente");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Seleccione una base de datos para interactuar con tablas");
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "No se pudo validar correctamente");
        } catch (ClassCastException e) {
            JOptionPane.showMessageDialog(this, "El nodo selecionado no es una base de datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    /* Metodos necesarios para validar las entradas y para pintar */
    //<editor-fold>
    //Verifica si el usuario tiene permiso para crear
    private boolean crea() throws Exception {
        AdministrarUsuarios au = new AdministrarUsuarios("./Usuarios.jeay");
        au.cargarArchivo();
        if (au.getUsuarios().get(posUsuario).getPermisos().contains("CREATE")) {
            return true;
        } else {
            throw new Exception("El usuario " + au.getUsuarios().get(posUsuario).getNombre() + " no tiene permisos para crear");
        }
    }

    //Verifica si el usuario tiene permiso para seleccionar
    private boolean selecciona() throws Exception {
        AdministrarUsuarios au = new AdministrarUsuarios("./Usuarios.jeay");
        au.cargarArchivo();
        if (au.getUsuarios().get(posUsuario).getPermisos().contains("SELECT")) {
            return true;
        } else {
            throw new Exception("El usuario " + au.getUsuarios().get(posUsuario).getNombre() + " no tiene permisos para seleccionar");
        }
    }

    //Verifica si el usuario tiene permiso para insertar
    private boolean inserta() throws Exception {
        AdministrarUsuarios au = new AdministrarUsuarios("./Usuarios.jeay");
        au.cargarArchivo();
        if (au.getUsuarios().get(posUsuario).getPermisos().contains("INSERT")) {
            return true;
        } else {
            throw new Exception("El usuario " + au.getUsuarios().get(posUsuario).getNombre() + " no tiene permisos para insertar");
        }
    }

    //Verifica si el usuario tiene permiso para borrar
    private boolean borra() throws Exception {
        AdministrarUsuarios au = new AdministrarUsuarios("./Usuarios.jeay");
        au.cargarArchivo();
        if (au.getUsuarios().get(posUsuario).getPermisos().contains("DELETE")) {
            return true;
        } else {
            throw new Exception("El usuario " + au.getUsuarios().get(posUsuario).getNombre() + " no tiene permisos para borrar");
        }
    }

    //Verifica si el usuario tiene permiso para dropear
    private boolean dropea() throws Exception {
        AdministrarUsuarios au = new AdministrarUsuarios("./Usuarios.jeay");
        au.cargarArchivo();
        if (au.getUsuarios().get(posUsuario).getPermisos().contains("DROP")) {
            return true;
        } else {
            throw new Exception("El usuario " + au.getUsuarios().get(posUsuario).getNombre() + " no tiene permisos para dropear");
        }
    }

    //Elimina los parentesis
    private static String[] parentesisFuera(String temp) {
        String[] ayuda = temp.split(" ");
        String[] sin = new String[ayuda.length];
        for (int i = 0; i < ayuda.length; i++) {
            String aux = "";
            String temp2 = ayuda[i];
            for (int j = 0; j < temp2.length(); j++) {
                if (temp2.charAt(j) != '(' && temp2.charAt(j) != ')' && temp2.charAt(j) != ',') {
                    aux += temp2.charAt(j);
                } else if (temp2.charAt(j) == '(' || temp2.charAt(j) == ')' || temp2.charAt(j) == ',') {

                    break;
                }
            }
            sin[i] = aux;
        }
        return sin;
    }

    //Obtiene los datos que estan entre los parentesis
    private static String obtenerDatos(String temp) {
        String datos = "";
        int bandera = 0;
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '(' || bandera == 1) {
                datos += temp.charAt(i);
                bandera = 1;
                if (temp.charAt(i) == ')') {
                    bandera = 0;
                }
            }
        }
        return datos;
    }

    //Elimina los datos de los parentasis y los espacios
    private static String eliminarParentesis(String temp) {
        String eliminado = "";
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) != '(' && temp.charAt(i) != ')') {
                eliminado += temp.charAt(i);
            }
        }
        return eliminado;
    }

    //Separa los datos de los parentesis por comas
    private static String[] separarDatos(String a) {
        String[] separado = a.split(",");
        return separado;
    }

    private static String[] cruce(String s) {
        String[] separado = s.split(".");
        return separado;
    }

    //Valida para el nombre de la base de datos
    private boolean validarBase(String n) throws Exception {
        AdministrarBases ab = new AdministrarBases("./Bases.jeay");
        ab.cargarArchivo();
        for (Base b : ab.getBases()) {
            if (b.getNombre().equals(n)) {
                throw new Exception("Base de datos con el nombre " + n + " ya existente");
            }
        }
        return false;
    }

    //Valida para el nombre de la base de tabla
    private boolean validarTabla(String n) throws Exception {
        ArrayList<Tabla> tablas = obtenerBase().getTablas();
        for (Tabla t : tablas) {
            if (t.getNombre().equals(n)) {
                throw new Exception("Tabla con el nombre " + n + " ya existente");
            }
        }
        return false;
    }

    //Obtiene la base seleccionada
    private Base obtenerBase() {
        AdministrarBases ab = new AdministrarBases("./Bases.jeay");
        ab.cargarArchivo();
        Object sel = treeBases.getSelectionPath().getLastPathComponent();
        nodoSeleccionado = (DefaultMutableTreeNode) sel;
        baseSeleccionada = (Base) nodoSeleccionado.getUserObject();
        int a = 0;
        for (Base base : ab.getBases()) {
            if (baseSeleccionada.getNombre().equals(base.getNombre())) {
                a = ab.getBases().indexOf(base);
            }
        }
        return ab.getBases().get(a);
    }

    //Obtiene una base con un string de parametro
    private Base obtenerBase(String n) throws Exception {
        AdministrarBases ab = new AdministrarBases("./Bases.jeay");
        ab.cargarArchivo();
        for (Base bd : ab.getBases()) {
            if (bd.getNombre().equals(n)) {
                return bd;
            }
        }
        throw new Exception("Base con nombre " + n + " no encontrada");
    }

    private Tabla obtenerTabla(String n, Base bd) throws Exception {
        AdministrarBases ab = new AdministrarBases("./Bases.jeay");
        ab.cargarArchivo();
        int a = 0;
        for (Base b : ab.getBases()) {
            if (bd.getNombre().equals(b.getNombre())) {
                a = ab.getBases().indexOf(b);
            }
        }
        ArrayList<Tabla> tablas = ab.getBases().get(a).getTablas();
        for (Tabla t : tablas) {
            if (t.getNombre().equals(n)) {
                return t;
            }
        }
        throw new Exception("Tabla con nombre " + n + " no encontrada");
    }

    //Obtiene un usuario con un string de parametro
    private Usuario obtenerUsuario(String n) throws Exception {
        AdministrarUsuarios au = new AdministrarUsuarios("./Usuarios.jeay");
        au.cargarArchivo();
        for (Usuario u : au.getUsuarios()) {
            if (u.getNombreUsuario().equals(n)) {
                return u;
            }
        }
        throw new Exception("Usuario con nombre " + n + " no encontrado");
    }

    //Valida para que el usuario que da acceso, tenga acceso a la base
    private boolean accesoBase(Base bd) {
        AdministrarUsuarios au = new AdministrarUsuarios("./Usuarios.jeay");
        AdministrarBases ab = new AdministrarBases("./Bases.jeay");
        au.cargarArchivo();
        ab.cargarArchivo();
        int a = 0;
        for (Base base : ab.getBases()) {
            if (bd.getNombre().equals(base.getNombre())) {
                a = ab.getBases().indexOf(base);
            }
        }
        for (Usuario u : ab.getBases().get(a).getUsuarios()) {
            if (u.getNombreUsuario().equals(au.getUsuarios().get(posUsuario).getNombreUsuario())) {
                return true;
            }
        }
        return false;
    }

    //Valida si un usuario tiene acceso a una base
    private boolean hasAccess() throws Exception {
        Object sel = treeBases.getSelectionPath().getLastPathComponent();
        nodoSeleccionado = (DefaultMutableTreeNode) sel;
        AdministrarBases ab = new AdministrarBases("./Bases.jeay");
        AdministrarUsuarios au = new AdministrarUsuarios("./Usuarios.jeay");
        ab.cargarArchivo();
        au.cargarArchivo();
        baseSeleccionada = (Base) nodoSeleccionado.getUserObject();
        int a = 0;
        for (Base base : ab.getBases()) {
            if (baseSeleccionada.getNombre().equals(base.getNombre())) {
                a = ab.getBases().indexOf(base);
            }
        }
        for (Usuario u : ab.getBases().get(a).getUsuarios()) {
            if (u.getNombreUsuario().equals(au.getUsuarios().get(posUsuario).getNombreUsuario())) {
                return true;
            }
        }
        throw new Exception("El usuario " + au.getUsuarios().get(posUsuario) + " no tiene acceso a la base " + ab.getBases().get(a).getNombre());
    }

    //Valida si un usuarios tiene acceso a una base con parametro
    private boolean hasAccess(Base bd) throws Exception {
        AdministrarUsuarios au = new AdministrarUsuarios("./Usuarios.jeay");
        AdministrarBases ab = new AdministrarBases("./Bases.jeay");
        au.cargarArchivo();
        ab.cargarArchivo();
        int a = 0;
        for (Base base : ab.getBases()) {
            if (bd.getNombre().equals(base.getNombre())) {
                a = ab.getBases().indexOf(base);
            }
        }
        for (Usuario u : ab.getBases().get(a).getUsuarios()) {
            if (u.getNombreUsuario().equals(au.getUsuarios().get(posUsuario).getNombreUsuario())) {
                return true;
            }
        }
        throw new Exception("El usuario " + au.getUsuarios().get(posUsuario) + " no tiene acceso a la base " + bd.getNombre());
    }

    //Crea el nodo de la base
    private void agregarBaseTree(Base d) {
        DefaultTreeModel m = (DefaultTreeModel) treeBases.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
        DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(d);
        DefaultMutableTreeNode nodo1 = new DefaultMutableTreeNode("Tablas");
        DefaultMutableTreeNode nodo3 = new DefaultMutableTreeNode("Usuarios");
        raiz.add(nodo);
        nodo.add(nodo1);
        nodo.add(nodo3);
        m.reload();
        AdministrarUsuarios au = new AdministrarUsuarios("./Usuarios.jeay");
        au.cargarArchivo();
        for (int i = 0; i < nodo.getChildCount(); i++) {
            if (nodo.getChildAt(i).toString().equals("Usuarios")) {
                DefaultMutableTreeNode p = new DefaultMutableTreeNode(au.getUsuarios().get(posUsuario));
                ((DefaultMutableTreeNode) nodo.getChildAt(i)).add(p);
            }
        }
    }

    //Agrega las tablas al nodo de la base seleccionada
    private void agregarTablasTree(Tabla t) {
        DefaultTreeModel m = (DefaultTreeModel) treeBases.getModel();
        Object sel = treeBases.getSelectionPath().getLastPathComponent();
        nodoSeleccionado = (DefaultMutableTreeNode) sel;
        for (int i = 0; i < nodoSeleccionado.getChildCount(); i++) {
            if (nodoSeleccionado.getChildAt(i).toString().equals("Tablas")) {
                DefaultMutableTreeNode p = new DefaultMutableTreeNode(t);
                ((DefaultMutableTreeNode) nodoSeleccionado.getChildAt(i)).add(p);
            }
        }
        m.reload();
    }

    //Actualiza los usuarios con acceso a una base
    private void agregarUsuarioTree(String nombre, Usuario u) {
        DefaultTreeModel m = (DefaultTreeModel) treeBases.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
        for (int i = 0; i < raiz.getChildCount(); i++) {
            if (raiz.getChildAt(i).toString().equals(nombre)) {
                DefaultMutableTreeNode base = (DefaultMutableTreeNode) raiz.getChildAt(i);
                for (int j = 0; j < base.getChildCount(); j++) {
                    if (base.getChildAt(j).toString().equals("Usuarios")) {
                        DefaultMutableTreeNode p = new DefaultMutableTreeNode(u);
                        ((DefaultMutableTreeNode) base.getChildAt(j)).add(p);
                    }
                }
            }
        }
        m.reload();
    }

    //Elimina el nodo de la base
    private void eliminarBaseTree(String n) throws Exception {
        DefaultTreeModel m = (DefaultTreeModel) treeBases.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
        int bandera = 0;
        for (int i = 0; i < raiz.getChildCount(); i++) {
            if (raiz.getChildAt(i).toString().equals(n)) {
                raiz.remove((DefaultMutableTreeNode) raiz.getChildAt(i));
                bandera = 1;
            }
        }
        if (bandera == 0) {
            throw new Exception("La base " + n + " no fue encontrada");
        }
        m.reload();
    }

    //Elimina el nodo de la tabla
    private void eliminarTablaTree(String n) {
        DefaultTreeModel m = (DefaultTreeModel) treeBases.getModel();
        Object sel = treeBases.getSelectionPath().getLastPathComponent();
        nodoSeleccionado = (DefaultMutableTreeNode) sel;
        for (int i = 0; i < nodoSeleccionado.getChildCount(); i++) {
            if (nodoSeleccionado.getChildAt(i).toString().equals("Tablas")) {
                DefaultMutableTreeNode p = (DefaultMutableTreeNode) nodoSeleccionado.getChildAt(i);
                for (int j = 0; j < p.getChildCount(); j++) {
                    if (p.getChildAt(i).toString().equals(n)) {
                        p.remove((DefaultMutableTreeNode) p.getChildAt(i));
                    }
                }
            }
        }
        m.reload();
    }
    
    private void cargarArbol() {
        AdministrarBases ab = new AdministrarBases("./Bases.jeay");
        ab.cargarArchivo();
        ArrayList<Base> bases = ab.getBases();
        DefaultTreeModel model = (DefaultTreeModel) treeBases.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) model.getRoot();
        for (Base base : bases) {
            DefaultMutableTreeNode bas = new DefaultMutableTreeNode(base);
            raiz.add(bas);
            DefaultMutableTreeNode tab = new DefaultMutableTreeNode("Tablas");
            DefaultMutableTreeNode us = new DefaultMutableTreeNode("Usuarios");
            bas.add(tab);
            bas.add(us);
            ArrayList<Tabla> tablas = base.getTablas();
            for (Tabla tabla : tablas) {
                DefaultMutableTreeNode nodeT = new DefaultMutableTreeNode(tabla);
                tab.add(nodeT);
            }
            ArrayList<Usuario> usuarios = base.getUsuarios();
            for (Usuario usuario : usuarios) {
                DefaultMutableTreeNode nodeU = new DefaultMutableTreeNode(usuario);
                us.add(nodeU);
            }
        }
        model.reload();
    }

    private void actualizarArbol() {
        AdministrarBases ab = new AdministrarBases("./Bases.jeay");
        ab.cargarArchivo();
        ArrayList<Base> bases = ab.getBases();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Bases de Datos");
        DefaultTreeModel model = new DefaultTreeModel(root);
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) model.getRoot();
        for (Base base : bases) {
            DefaultMutableTreeNode bas = new DefaultMutableTreeNode(base);
            raiz.add(bas);
            DefaultMutableTreeNode tab = new DefaultMutableTreeNode("Tablas");
            DefaultMutableTreeNode us = new DefaultMutableTreeNode("Usuarios");
            bas.add(tab);
            bas.add(us);
            ArrayList<Tabla> tablas = base.getTablas();
            for (Tabla tabla : tablas) {
                DefaultMutableTreeNode nodeT = new DefaultMutableTreeNode(tabla);
                tab.add(nodeT);
            }
            ArrayList<Usuario> usuarios = base.getUsuarios();
            for (Usuario usuario : usuarios) {
                DefaultMutableTreeNode nodeU = new DefaultMutableTreeNode(usuario);
                us.add(nodeU);
            }
        }
        model.reload();
    }

    //Metodo para encontrar las primeras palabras
    private int primerasPalabras(String t, int indice) {
        while (indice < t.length()) {
            if (String.valueOf(t.charAt(indice)).matches("\\W")) {
                break;
            }
            indice++;
        }
        return indice;
    }

    //Metodo para encontrar las ultimas palabras
    private int ultimasPalabras(String t, int indice) {
        while (--indice >= 0) {
            if (String.valueOf(t.charAt(indice)).matches("\\W")) {
                break;
            }
        }
        return indice;
    }

    //Metodo para pintar palabras
    private void colorear() {
        final StyleContext cont = StyleContext.getDefaultStyleContext();

        //Colores
        final AttributeSet attcolor = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, new Color(141, 51, 255));
        final AttributeSet attblack = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLACK);

        //Estilo
        DefaultStyledDocument doc = new DefaultStyledDocument() {
            @Override
            public void insertString(int o, String str, AttributeSet a) throws BadLocationException {
                super.insertString(o, str, a);
                String text = super.getText(0, super.getLength());
                int before = ultimasPalabras(text, o);
                if (before < 0) {
                    before = 0;
                }
                int after = primerasPalabras(text, o + str.length());
                int wordL = before;
                int wordR = before;
                while (wordR <= after) {
                    if (wordR == after || String.valueOf(text.charAt(wordR)).matches("\\W")) {
                        if (text.substring(wordL, wordR).matches("(\\W)*(CREATE|DROP|SELECT|FROM|WHERE|AND|OR|GRANT|DATABASE|TO|INSERT|INTO|VALUES|TABLE|UPDATE|SET|DELETE|TRUNCATE|create|drop|select|from|where|and|or|grant|database|to|insert|into|values|table|update|set|delete|truncate)")) {
                            super.setCharacterAttributes(wordL, wordR - wordL, attcolor, false);
                        } else {
                            super.setCharacterAttributes(wordL, wordR - wordL, attblack, false);
                        }
                        wordL = wordR;
                    }
                    wordR++;
                }
            }

            @Override
            public void remove(int o, int len) throws BadLocationException {
                super.remove(o, len);
                String text = super.getText(0, super.getLength());
                int before = ultimasPalabras(text, o);
                if (before < 0) {
                    before = 0;
                }
            }
        };
        JTextPane txt = new JTextPane(doc);

        //Poner el estilo al textpane
        String temp = lectorCode.getText();
        lectorCode.setStyledDocument(txt.getStyledDocument());
        lectorCode.setText(temp);
    }

    //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCrear;
    private javax.swing.JButton btIngresar;
    private javax.swing.JButton btLogIn;
    private javax.swing.JButton btLogOut;
    private javax.swing.JButton btSignUp;
    private javax.swing.JCheckBox create;
    private javax.swing.JCheckBox delete;
    private javax.swing.JPanel diagrama;
    private javax.swing.JCheckBox drop;
    private javax.swing.JButton ejecutar;
    private javax.swing.JCheckBox gestion;
    private javax.swing.JCheckBox insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDialog jdLogIn;
    private javax.swing.JDialog jdSignUp;
    private javax.swing.JMenu jmUsuarios;
    private javax.swing.JTextPane lectorCode;
    private javax.swing.JPasswordField liContraseña;
    private javax.swing.JTextField liUsuario;
    private javax.swing.JMenuItem limpiar;
    private javax.swing.JMenuItem miCrear;
    private javax.swing.JMenuItem miEliminar;
    private javax.swing.JMenuItem miEliminarT;
    private javax.swing.JMenuItem miLogIn;
    private javax.swing.JMenuItem miLogOut;
    private javax.swing.JMenuItem miMostrar;
    private javax.swing.JMenuItem miPermisos;
    private javax.swing.JMenuItem miSignUp;
    private javax.swing.JPopupMenu popUpDatabase;
    private javax.swing.JPopupMenu popUpPanel;
    private javax.swing.JPopupMenu popUpTable;
    private javax.swing.JPopupMenu popUpUser;
    private javax.swing.JCheckBox select;
    private javax.swing.JTextField suContraseña;
    private javax.swing.JTextField suNombre;
    private javax.swing.JTextField suUsuario;
    private javax.swing.JTable tablaSelect;
    private javax.swing.JTree treeBases;
    // End of variables declaration//GEN-END:variables

}
