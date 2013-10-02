/*
 * Copyright (c) Mirth Corporation. All rights reserved.
 * 
 * http://www.mirthcorp.com
 * 
 * The software in this package is published under the terms of the MPL license a copy of which has
 * been included with this distribution in the LICENSE.txt file.
 */

package com.mirth.connect.client.ui.editors;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.mirth.connect.client.ui.DataTypePropertiesContainer;
import com.mirth.connect.client.ui.LoadedExtensions;
import com.mirth.connect.client.ui.PlatformUI;
import com.mirth.connect.client.ui.TransformerType;
import com.mirth.connect.model.datatype.DataTypeProperties;

public class DataTypePropertiesDialog extends javax.swing.JDialog {
	
	private boolean revert = true;
	private DataTypeProperties dataTypeProperties;
	private TransformerType transformerType;

    /**
     * Creates new form DataTypePropertiesDialog
     */
    public DataTypePropertiesDialog(boolean inbound, final String displayName, DataTypeProperties dataTypeProperties, TransformerType transformerType) {
        super(PlatformUI.MIRTH_FRAME, true);
        initComponents();
        
		setTitle((inbound ? "Inbound" : "Outbound") + " Properties");

		this.dataTypeProperties = dataTypeProperties;
		this.setTransformerType(transformerType);
		
        dataTypePropertiesPanel.setInbound(inbound);
        dataTypePropertiesPanel.setUseTitleBorder(false);
        dataTypePropertiesPanel.getDataTypeComboBox().setVisible(false);
        dataTypePropertiesPanel.setDataTypeProperties(displayName, new DataTypePropertiesContainer(dataTypeProperties, transformerType));
        dataTypePropertiesPanel.getDefaultButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String dataType = PlatformUI.MIRTH_FRAME.displayNameToDataType.get(displayName);
				
				DataTypeProperties defaultProperties = LoadedExtensions.getInstance().getDataTypePlugins().get(dataType).getDefaultProperties();
				
				setDataTypeProperties(defaultProperties);
				dataTypePropertiesPanel.setDataTypeProperties(displayName, new DataTypePropertiesContainer(defaultProperties, getTransformerType()));
			}
    	});
        
        this.setLocationRelativeTo(PlatformUI.MIRTH_FRAME);
        
        setVisible(true);
    }
    
    public boolean isRevert() {
    	return revert;
    }
    
    public void setDataTypeProperties(DataTypeProperties dataTypeProperties) {
    	this.dataTypeProperties = dataTypeProperties;
    }
    
    public DataTypeProperties getDataTypeProperties() {
    	return dataTypeProperties;
    }

    public TransformerType getTransformerType() {
        return transformerType;
    }

    public void setTransformerType(TransformerType transformerType) {
        this.transformerType = transformerType;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        dataTypePropertiesPanel = new com.mirth.connect.client.ui.DataTypePropertiesPanel();
        okButton2 = new javax.swing.JButton();
        closeButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Properties");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(425, 530));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        okButton2.setText("OK");
        okButton2.setMaximumSize(new java.awt.Dimension(48, 21));
        okButton2.setMinimumSize(new java.awt.Dimension(48, 21));
        okButton2.setPreferredSize(new java.awt.Dimension(48, 21));
        okButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButton2ActionPerformed(evt);
            }
        });

        closeButton2.setText("Cancel");
        closeButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 297, Short.MAX_VALUE)
                        .addComponent(okButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closeButton2))
                    .addComponent(dataTypePropertiesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {closeButton2, okButton2});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(dataTypePropertiesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(closeButton2)
                    .addComponent(okButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {closeButton2, okButton2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButton2ActionPerformed
        revert = false;
        this.dispose();
    }//GEN-LAST:event_okButton2ActionPerformed

    private void closeButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButton2ActionPerformed
        revert = true;
        this.dispose();
    }//GEN-LAST:event_closeButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton2;
    private com.mirth.connect.client.ui.DataTypePropertiesPanel dataTypePropertiesPanel;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton okButton2;
    // End of variables declaration//GEN-END:variables
}