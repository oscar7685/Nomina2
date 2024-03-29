/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.udec.vista;

import com.udec.modelo.Banco;
import com.udec.modelo.Cargo;
import com.udec.modelo.Empleado;
import java.awt.Component;
import java.awt.EventQueue;
import java.beans.Beans;
import java.util.ArrayList;

import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author Oscar
 */
public class Empleados2 extends JInternalFrame {
    
    public Empleados2() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("com.udec_nomina_jar_1.0-SNAPSHOTPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Empleado e");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        bancoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Banco b");
        bancoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bancoQuery.getResultList();
        cargoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cargo c");
        cargoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cargoQuery.getResultList();
        novedadmedicQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT n FROM Novedadmedic n");
        novedadmedicList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : novedadmedicQuery.getResultList();
        empleadoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Empleado e");
        empleadoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : empleadoQuery.getResultList();
        dateConverter1 = new com.udec.vista.DateConverter();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;   //Disallow the editing of any cell

            }};
            codigoLabel = new javax.swing.JLabel();
            cedulaLabel = new javax.swing.JLabel();
            nombreLabel = new javax.swing.JLabel();
            salarioLabel = new javax.swing.JLabel();
            tipoLabel = new javax.swing.JLabel();
            estadoLabel = new javax.swing.JLabel();
            bancoIdbancoLabel = new javax.swing.JLabel();
            numeroCuentaLabel = new javax.swing.JLabel();
            cargoCargoidLabel = new javax.swing.JLabel();
            codigoField = new javax.swing.JTextField();
            cedulaField = new javax.swing.JTextField();
            nombreField = new javax.swing.JTextField();
            salarioField = new javax.swing.JTextField();
            numeroCuentaField = new javax.swing.JTextField();
            saveButton = new javax.swing.JButton();
            refreshButton = new javax.swing.JButton();
            newButton = new javax.swing.JButton();
            jComboBox1 = new javax.swing.JComboBox();
            jComboBox2 = new javax.swing.JComboBox();
            masterScrollPane1 = new javax.swing.JScrollPane();
            masterTable2 = new javax.swing.JTable(){
                public boolean isCellEditable(int rowIndex, int colIndex) {
                    return false;   //Disallow the editing of any cell

                }};
                jLabel1 = new javax.swing.JLabel();
                jComboBox3 = new javax.swing.JComboBox();
                jComboBox4 = new javax.swing.JComboBox();

                FormListener formListener = new FormListener();

                setPreferredSize(new java.awt.Dimension(1180, 529));

                org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
                org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
                columnBinding.setColumnName("Codigo");
                columnBinding.setColumnClass(Integer.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cedula}"));
                columnBinding.setColumnName("Cedula");
                columnBinding.setColumnClass(String.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
                columnBinding.setColumnName("Nombre");
                columnBinding.setColumnClass(String.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${salario}"));
                columnBinding.setColumnName("Salario");
                columnBinding.setColumnClass(Float.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipo}"));
                columnBinding.setColumnName("Tipo de contrato");
                columnBinding.setColumnClass(String.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estado}"));
                columnBinding.setColumnName("Estado");
                columnBinding.setColumnClass(String.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bancoIdbanco.banco}"));
                columnBinding.setColumnName("Banco Idbanco");
                columnBinding.setColumnClass(String.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numeroCuenta}"));
                columnBinding.setColumnName("Numero Cuenta");
                columnBinding.setColumnClass(String.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cargoCargoid.cargo}"));
                columnBinding.setColumnName("Cargo Cargoid");
                columnBinding.setColumnClass(String.class);
                bindingGroup.addBinding(jTableBinding);
                jTableBinding.bind();
                masterScrollPane.setViewportView(masterTable);
                if (masterTable.getColumnModel().getColumnCount() > 0) {
                    masterTable.getColumnModel().getColumn(8).setResizable(false);
                }

                codigoLabel.setText("Codigo:");

                cedulaLabel.setText("Cedula:");

                nombreLabel.setText("Nombre:");

                salarioLabel.setText("Salario:");

                tipoLabel.setText("Tipo de contrato:");

                estadoLabel.setText("Estado:");

                bancoIdbancoLabel.setText("Banco:");

                numeroCuentaLabel.setText("Numero Cuenta:");

                cargoCargoidLabel.setText("Cargo:");

                org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.codigo}"), codigoField, org.jdesktop.beansbinding.BeanProperty.create("text"));
                binding.setSourceUnreadableValue("");
                bindingGroup.addBinding(binding);
                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), codigoField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
                bindingGroup.addBinding(binding);

                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cedula}"), cedulaField, org.jdesktop.beansbinding.BeanProperty.create("text"));
                binding.setSourceUnreadableValue("");
                bindingGroup.addBinding(binding);
                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), cedulaField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
                bindingGroup.addBinding(binding);

                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nombre}"), nombreField, org.jdesktop.beansbinding.BeanProperty.create("text"));
                binding.setSourceUnreadableValue("");
                bindingGroup.addBinding(binding);
                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), nombreField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
                bindingGroup.addBinding(binding);

                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.salario}"), salarioField, org.jdesktop.beansbinding.BeanProperty.create("text"));
                binding.setSourceUnreadableValue("");
                bindingGroup.addBinding(binding);
                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), salarioField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
                bindingGroup.addBinding(binding);

                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.numeroCuenta}"), numeroCuentaField, org.jdesktop.beansbinding.BeanProperty.create("text"));
                binding.setSourceUnreadableValue("");
                bindingGroup.addBinding(binding);
                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), numeroCuentaField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
                bindingGroup.addBinding(binding);

                saveButton.setText("Guardar Cambios");
                saveButton.addActionListener(formListener);

                refreshButton.setText("Actualizar");
                refreshButton.addActionListener(formListener);

                newButton.setText("Nuevo");
                newButton.addActionListener(formListener);

                jComboBox1.setRenderer(new DefaultListCellRenderer() {
                    @Override
                    public Component getListCellRendererComponent(
                        JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        if (value instanceof Banco) {
                            Banco mec = (Banco)value;
                            setText(mec.getBanco());
                        }
                        return this;
                    }
                });

                org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bancoList, jComboBox1);
                bindingGroup.addBinding(jComboBoxBinding);
                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.bancoIdbanco}"), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
                bindingGroup.addBinding(binding);

                jComboBox2.setRenderer(new DefaultListCellRenderer() {
                    @Override
                    public Component getListCellRendererComponent(
                        JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                        if (value instanceof Cargo) {
                            Cargo mec = (Cargo)value;
                            setText(mec.getCargo());
                        }
                        return this;
                    }
                });

                jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cargoList, jComboBox2);
                bindingGroup.addBinding(jComboBoxBinding);
                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cargoCargoid}"), jComboBox2, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
                bindingGroup.addBinding(binding);

                jComboBox2.addActionListener(formListener);

                org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${selectedElement.novedadmedicList}");
                jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, eLProperty, masterTable2, "novedades");
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fechaInicio}"));
                columnBinding.setColumnName("Fecha Inicio");
                columnBinding.setColumnClass(java.util.Date.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fechaFinal}"));
                columnBinding.setColumnName("Fecha Final");
                columnBinding.setColumnClass(java.util.Date.class);
                columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipo}"));
                columnBinding.setColumnName("Tipo");
                columnBinding.setColumnClass(String.class);
                bindingGroup.addBinding(jTableBinding);
                jTableBinding.bind();
                masterScrollPane1.setViewportView(masterTable2);

                jLabel1.setText("Lista de Novedades Medicas");

                jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PLANTA", "CONTRATO" }));

                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.tipo}"), jComboBox3, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
                bindingGroup.addBinding(binding);

                jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACTIVO", "INACTIVO" }));

                binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.estado}"), jComboBox4, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
                bindingGroup.addBinding(binding);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(masterScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(codigoLabel)
                                            .addComponent(nombreLabel)
                                            .addComponent(bancoIdbancoLabel))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(numeroCuentaLabel)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(nombreField, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(cedulaLabel)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(cedulaField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(estadoLabel)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(tipoLabel)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(salarioLabel)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(salarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(cargoCargoidLabel)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(numeroCuentaField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(newButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(refreshButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(saveButton)))))))))
                                .addGap(45, 45, 45))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(masterScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                );

                layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {newButton, refreshButton});

                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(masterScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigoLabel)
                            .addComponent(codigoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cedulaLabel)
                            .addComponent(cedulaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadoLabel)
                            .addComponent(salarioLabel)
                            .addComponent(salarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoLabel)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreLabel)
                            .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargoCargoidLabel)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bancoIdbancoLabel)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(saveButton)
                                        .addComponent(refreshButton)
                                        .addComponent(newButton))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(numeroCuentaLabel)
                                        .addComponent(numeroCuentaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masterScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(124, Short.MAX_VALUE))
                );

                bindingGroup.bind();
            }

            // Code for dispatching events from components to event handlers.

            private class FormListener implements java.awt.event.ActionListener {
                FormListener() {}
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    if (evt.getSource() == saveButton) {
                        Empleados2.this.saveButtonActionPerformed(evt);
                    }
                    else if (evt.getSource() == refreshButton) {
                        Empleados2.this.refreshButtonActionPerformed(evt);
                    }
                    else if (evt.getSource() == newButton) {
                        Empleados2.this.newButtonActionPerformed(evt);
                    }
                    else if (evt.getSource() == jComboBox2) {
                        Empleados2.this.jComboBox2ActionPerformed(evt);
                    }
                }
            }// </editor-fold>//GEN-END:initComponents

    

    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        com.udec.modelo.Empleado e = new com.udec.modelo.Empleado();
        entityManager.persist(e);
        list.add(e);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
    }//GEN-LAST:event_newButtonActionPerformed
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<com.udec.modelo.Empleado> merged = new ArrayList<com.udec.modelo.Empleado>(list.size());
            for (com.udec.modelo.Empleado e : list) {
                merged.add(entityManager.merge(e));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bancoIdbancoLabel;
    private java.util.List<com.udec.modelo.Banco> bancoList;
    private javax.persistence.Query bancoQuery;
    private javax.swing.JLabel cargoCargoidLabel;
    private java.util.List<com.udec.modelo.Cargo> cargoList;
    private javax.persistence.Query cargoQuery;
    private javax.swing.JTextField cedulaField;
    private javax.swing.JLabel cedulaLabel;
    private javax.swing.JTextField codigoField;
    private javax.swing.JLabel codigoLabel;
    private com.udec.vista.DateConverter dateConverter1;
    private java.util.List<com.udec.modelo.Empleado> empleadoList;
    private javax.persistence.Query empleadoQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private java.util.List<com.udec.modelo.Empleado> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JScrollPane masterScrollPane1;
    private javax.swing.JTable masterTable;
    private javax.swing.JTable masterTable2;
    private javax.swing.JButton newButton;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombreLabel;
    private java.util.List<com.udec.modelo.Novedadmedic> novedadmedicList;
    private javax.persistence.Query novedadmedicQuery;
    private javax.swing.JTextField numeroCuentaField;
    private javax.swing.JLabel numeroCuentaLabel;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField salarioField;
    private javax.swing.JLabel salarioLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel tipoLabel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
   
    
}
