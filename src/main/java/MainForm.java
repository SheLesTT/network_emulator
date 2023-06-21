/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author lovse
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */

    IpGenerator gen = IpGenerator.genGenrator();
    Network net = new Network();
    Creator creator = new Creator(net, gen);
    int amout_of_routers;
//    Router router =creator.createRouter(25);
//    Router rout1 = creator.createRouter(26);
//    Router rout2 =creator.createRouter(24);
//    Router rout3= creator.createRouter(27);
    public MainForm() {

        initComponents();
//        router.addPorts(creator);
////        RouterPort port = (RouterPort) net.all_nodes.get(router.ports.get(0));
////        System.out.println(port.giveIp());
////        System.out.println("given ip "+ port.giveIp());
////        System.out.println(port.giveIp());
////        router.Print();
//        rout1.addPorts(creator);
////        rout1.Print();
//        rout2.addPorts(creator);
//        rout3.addPorts(creator);
////        System.out.println(" size of ports " + rout2.ports.size());
////        rout2.Print();
//        net.addRouter(router);
//        net.addRouter(rout1);
//        net.addRouter(rout2);
//        net.addRouter(rout3);
//        net.connectNetwork();
//        RouterPort port = (RouterPort)net.getNodeByID(rout1.ports.get(0));
//        port.Print();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        set_mask_length_group = new javax.swing.ButtonGroup();
        show_network_frame = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        show_network_tree = new javax.swing.JTree();
        open_find_pass_panel_but = new javax.swing.JButton();
        save_network_button = new javax.swing.JButton();
        add_sleep_button = new javax.swing.JButton();
        ip_to_be_replaced_field = new javax.swing.JTextField();
        ip_ro_replace_field = new javax.swing.JTextField();
        change_ip_button = new javax.swing.JToggleButton();
        find_path_frame = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        select_starting_node_comboBox = new JComboBox<Nodeble>();
        Select_starting_node_label = new javax.swing.JLabel();
        select_final_node_label = new javax.swing.JLabel();
        select_final_node_comboBox = new JComboBox<Nodeble>();
        back_to_tree_view_button = new javax.swing.JButton();
        find_path_buttom = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Path_text_area = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        create_network = new javax.swing.JButton();
        routers_amount_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        set_amount_of_routers_but = new javax.swing.JButton();
        radio_but_mask_length_26 = new javax.swing.JRadioButton();
        radio_but_mask_length_28 = new javax.swing.JRadioButton();
        radio_but_mask_length_27 = new javax.swing.JRadioButton();
        radio_but_mask_length_25 = new javax.swing.JRadioButton();
        radio_but_mask_length_24 = new javax.swing.JRadioButton();
        create_router_with_chousen_mask = new javax.swing.JButton();
        load_network_button = new javax.swing.JButton();

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        show_network_tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane3.setViewportView(show_network_tree);

        open_find_pass_panel_but.setText("find path");
        open_find_pass_panel_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_find_pass_panel_butActionPerformed(evt);
            }
        });

        save_network_button.setText("save network");
        save_network_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    save_network_buttonActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        add_sleep_button.setText("обновить статус");
        add_sleep_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_sleep_buttonActionPerformed(evt);
            }
        });

        change_ip_button.setText("change_ip_hello");
        change_ip_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_ip_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(136, Short.MAX_VALUE)
                        .addComponent(add_sleep_button)
                        .addGap(80, 80, 80))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(open_find_pass_panel_but)
                                    .addComponent(save_network_button)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(ip_to_be_replaced_field, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(ip_ro_replace_field, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(change_ip_button, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ip_to_be_replaced_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ip_ro_replace_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(change_ip_button, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(open_find_pass_panel_but)
                        .addGap(10, 10, 10)
                        .addComponent(add_sleep_button)
                        .addGap(48, 48, 48)
                        .addComponent(save_network_button)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout show_network_frameLayout = new javax.swing.GroupLayout(show_network_frame.getContentPane());
        show_network_frame.getContentPane().setLayout(show_network_frameLayout);
        show_network_frameLayout.setHorizontalGroup(
            show_network_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        show_network_frameLayout.setVerticalGroup(
            show_network_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Select_starting_node_label.setText("Select a starting node");

        select_final_node_label.setText("select final node ");

        back_to_tree_view_button.setText("go back");
        back_to_tree_view_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_tree_view_buttonActionPerformed(evt);
            }
        });

        find_path_buttom.setText("find_path");
        find_path_buttom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                find_path_buttomActionPerformed(evt);
            }
        });

        Path_text_area.setColumns(20);
        Path_text_area.setRows(5);
        jScrollPane2.setViewportView(Path_text_area);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(select_starting_node_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(select_final_node_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(Select_starting_node_label, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(select_final_node_label, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_to_tree_view_button)
                .addGap(56, 56, 56))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(find_path_buttom))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Select_starting_node_label)
                    .addComponent(select_final_node_label))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_starting_node_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_final_node_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(find_path_buttom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(back_to_tree_view_button)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout find_path_frameLayout = new javax.swing.GroupLayout(find_path_frame.getContentPane());
        find_path_frame.getContentPane().setLayout(find_path_frameLayout);
        find_path_frameLayout.setHorizontalGroup(
            find_path_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(find_path_frameLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        find_path_frameLayout.setVerticalGroup(
            find_path_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(find_path_frameLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        create_network.setText("Create network");
        create_network.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_networkActionPerformed(evt);
            }
        });

        routers_amount_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routers_amount_fieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter amout of routers in a network");

        set_amount_of_routers_but.setText("set amount of routers ");
        set_amount_of_routers_but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                set_amount_of_routers_butActionPerformed(evt);
            }
        });

        set_mask_length_group.add(radio_but_mask_length_26);
        radio_but_mask_length_26.setText("26");
        radio_but_mask_length_26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_but_mask_length_26ActionPerformed(evt);
            }
        });

        set_mask_length_group.add(radio_but_mask_length_28);
        radio_but_mask_length_28.setText("28");

        set_mask_length_group.add(radio_but_mask_length_27);
        radio_but_mask_length_27.setText("27");
        radio_but_mask_length_27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_but_mask_length_27ActionPerformed(evt);
            }
        });

        set_mask_length_group.add(radio_but_mask_length_25);
        radio_but_mask_length_25.setText("25");

        set_mask_length_group.add(radio_but_mask_length_24);
        radio_but_mask_length_24.setText("24");

        create_router_with_chousen_mask.setText("create router with cousen mask");
        create_router_with_chousen_mask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_router_with_chousen_maskActionPerformed(evt);
            }
        });

        load_network_button.setText("load_network");
        load_network_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    load_network_buttonActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio_but_mask_length_24, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio_but_mask_length_25, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(routers_amount_field, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio_but_mask_length_28, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio_but_mask_length_27, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio_but_mask_length_26, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(250, 250, 250))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(load_network_button, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(create_network, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(set_amount_of_routers_but)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(create_router_with_chousen_mask)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(radio_but_mask_length_24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio_but_mask_length_25)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(radio_but_mask_length_26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radio_but_mask_length_27)
                            .addComponent(routers_amount_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio_but_mask_length_28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(create_router_with_chousen_mask, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(create_network, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(load_network_button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(set_amount_of_routers_but)))
                        .addGap(0, 76, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static class CustomTreeCellRenderer extends DefaultTreeCellRenderer {
        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
            super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
           String str_leaf = (String) ((DefaultMutableTreeNode)value).getUserObject();

            if(str_leaf.startsWith("p")){

                    setForeground(Color.GRAY);

            }
            // Customize color for specific node
//            if (value.toString().equals("Node 1")) {
//                component.setForeground(Color.RED);
//            } else if (value.toString().equals("Node 2")) {
//                component.setForeground(Color.BLUE);
//            }

            return this;
        }
    }
    private void create_networkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_networkActionPerformed
//       network_tree.setModel(new DefaultTreeModel( net.addInfoToGui()));
       net.connectNetwork();
       show_network_tree.setCellRenderer(new CustomTreeCellRenderer());
        show_network_tree.setModel(new DefaultTreeModel(net.addInfoToGui()));

       show_network_frame.setVisible(true);
        show_network_frame.setSize(700, 700);

    }//GEN-LAST:event_create_networkActionPerformed

    private void routers_amount_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routers_amount_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routers_amount_fieldActionPerformed

    private void radio_but_mask_length_26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_but_mask_length_26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_but_mask_length_26ActionPerformed

    private void radio_but_mask_length_27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_but_mask_length_27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_but_mask_length_27ActionPerformed

    private  class NodebleListCellRender extends DefaultListCellRenderer{
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus){
            if(value instanceof Nodeble){
                value = ((Nodeble) value).getName();

            }
            return super.getListCellRendererComponent(list,value, index, isSelected,cellHasFocus);
        }

    }
    private void create_router_with_chousen_maskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_router_with_chousen_maskActionPerformed

        if(amout_of_routers == 0) {
            JOptionPane.showMessageDialog(this, "All routers mask set, create network now",
                    "all set", JOptionPane.INFORMATION_MESSAGE);
        }else{
            radio_but_mask_length_24.setActionCommand("24");
            radio_but_mask_length_25.setActionCommand("25");
            radio_but_mask_length_26.setActionCommand("26");
            radio_but_mask_length_27.setActionCommand("27");
            radio_but_mask_length_28.setActionCommand("28");
            ButtonModel model = set_mask_length_group.getSelection();

            String mask =  model.getActionCommand();

            int mask_int = Integer.parseInt(mask);

            Router router =creator.createRouter(mask_int);
            router.addPorts(creator);
            net.addRouter(router);
            amout_of_routers--;
        }
    }//GEN-LAST:event_create_router_with_chousen_maskActionPerformed

    private void set_amount_of_routers_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_set_amount_of_routers_butActionPerformed

        try {
            int amout= Integer.parseInt(routers_amount_field.getText());

            if(amout >0 & amout< 257){
                amout_of_routers = amout;
            }else {
                JOptionPane.showMessageDialog(this, "Amount of routers should be more than 0 and  less than 256 \n Choose  again",
                        "Not valid amount", JOptionPane.WARNING_MESSAGE);
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Amount of routers should be an integer \n Choose  again",
                    "Not valid amount", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_set_amount_of_routers_butActionPerformed

    private void open_find_pass_panel_butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_find_pass_panel_butActionPerformed
        show_network_frame.dispose();
        DefaultComboBoxModel<Nodeble> startComboBoxModel = new DefaultComboBoxModel<>();
        DefaultComboBoxModel<Nodeble> endComboBoxModel = new DefaultComboBoxModel<>();

        ArrayList<Nodeble> node_list = new ArrayList<>();
        for (String key: net.all_nodes.keySet()){
            IpTable node = net.getNodeByID(key);
            if(node instanceof Nodeble){
                node_list.add((Nodeble) node);
//                select_starting_node_comboBox.addItem();
//                startComboBoxModel.addElement((Nodeble) node);
//                endComboBoxModel.addElement((Nodeble) node);
            }

        }

        node_list.sort(new Comparator<Nodeble>() {
            @Override
            public int compare(Nodeble node1, Nodeble node2) {
                return node1.getName().compareTo(node2.getName());
            }
        });

        for(Nodeble nodeble: node_list){
            System.out.println(nodeble.getName());
            startComboBoxModel.addElement((Nodeble) nodeble);
            endComboBoxModel.addElement((Nodeble) nodeble);
        }
        select_starting_node_comboBox.setModel(startComboBoxModel);
        select_starting_node_comboBox.setRenderer(new NodebleListCellRender());
        select_final_node_comboBox.setRenderer(new NodebleListCellRender());
        select_final_node_comboBox.setModel(endComboBoxModel);


        find_path_frame.setVisible(true);
        find_path_frame.setSize(700, 700);

    }//GEN-LAST:event_open_find_pass_panel_butActionPerformed

    private void back_to_tree_view_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_tree_view_buttonActionPerformed
        find_path_frame.dispose();
        show_network_frame.setVisible(true);
        show_network_frame.setSize(700, 700);
    }//GEN-LAST:event_back_to_tree_view_buttonActionPerformed

    private void find_path_buttomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_path_buttomActionPerformed
       IpTable start_node = (IpTable)select_starting_node_comboBox.getSelectedItem();
       System.out.println(start_node.getIp());
       IpTable end_node = (IpTable)select_final_node_comboBox.getSelectedItem();
       System.out.println(end_node.getIp());

       if(((Nodeble)end_node).getSleep()){
           JOptionPane.showMessageDialog(this, "Узел не доступен",
                   "Node is not available", JOptionPane.INFORMATION_MESSAGE);
       }else {

           PathFinder finder = new PathFinder(net);
           String startingNode = start_node.getIp();
           String nodeToFind = end_node.getIp();
           String path_str = finder.BFS(startingNode, nodeToFind);
           Path_text_area.setText(path_str);
       }
//       System.out.println(select_final_node_comboBox.getSelectedItem());
    }//GEN-LAST:event_find_path_buttomActionPerformed

    private void save_network_buttonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_save_network_buttonActionPerformed

        net.prepareForWriting();
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        // delete in a final version
        String data = mapper.writeValueAsString(net);
        System.out.println(data);

        mapper.writeValue(new File("output.json"), net);

    }//GEN-LAST:event_save_network_buttonActionPerformed

    private void load_network_buttonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_load_network_buttonActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));
        int response = fileChooser.showOpenDialog(null);

        String file = null;
        if(response == JFileChooser.APPROVE_OPTION){
            file = fileChooser.getSelectedFile().getAbsolutePath();
            System.out.println(file);
        }
        ObjectMapper mapper = new ObjectMapper();
        net = mapper.readValue(new File(file), Network.class);

        net.finishReading();
        net.setNetToNodes();
//        System.out.println(network.all_nodes.get("192.168.0.0").getIp());
    }//GEN-LAST:event_load_network_buttonActionPerformed

    private void add_sleep_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_sleep_buttonActionPerformed
       net.setSleep();
    }//GEN-LAST:event_add_sleep_buttonActionPerformed

    private void change_ip_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_ip_buttonActionPerformed
       String ip_to__be_replaced = ip_to_be_replaced_field.getText();
        String ip_to_replace = ip_ro_replace_field.getText();
       IpTransormator transormator = new IpTransormator();
       if((!transormator.isIpValid(ip_to_replace))&(!transormator.isIpValid(ip_to__be_replaced))){

           JOptionPane.showMessageDialog(this, "Не корректный ip",
                   "Ip s not valid", JOptionPane.INFORMATION_MESSAGE);
       }else{
           IpTable node = net.getNodeByID(ip_to__be_replaced);
           if(!node.changeIp(ip_to_replace)){

               JOptionPane.showMessageDialog(this, "Невозможно сменить ip на данный",
                       "Ip s not available", JOptionPane.ERROR_MESSAGE);
           }else{
               JOptionPane.showMessageDialog(this, "Ip изменен",
                       "Ip is changed ", JOptionPane.INFORMATION_MESSAGE);

               show_network_tree.setModel(new DefaultTreeModel(net.addInfoToGui()));
           }
        }

    }//GEN-LAST:event_change_ip_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Path_text_area;
    private javax.swing.JLabel Select_starting_node_label;
    private javax.swing.JButton add_sleep_button;
    private javax.swing.JButton back_to_tree_view_button;
    private javax.swing.JToggleButton change_ip_button;
    private javax.swing.JButton create_network;
    private javax.swing.JButton create_router_with_chousen_mask;
    private javax.swing.JButton find_path_buttom;
    private javax.swing.JFrame find_path_frame;
    private javax.swing.JTextField ip_ro_replace_field;
    private javax.swing.JTextField ip_to_be_replaced_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton load_network_button;
    private javax.swing.JButton open_find_pass_panel_but;
    private javax.swing.JRadioButton radio_but_mask_length_24;
    private javax.swing.JRadioButton radio_but_mask_length_25;
    private javax.swing.JRadioButton radio_but_mask_length_26;
    private javax.swing.JRadioButton radio_but_mask_length_27;
    private javax.swing.JRadioButton radio_but_mask_length_28;
    private javax.swing.JTextField routers_amount_field;
    private javax.swing.JButton save_network_button;
    private JComboBox<Nodeble> select_final_node_comboBox;
    private javax.swing.JLabel select_final_node_label;
    private JComboBox<Nodeble> select_starting_node_comboBox;
    private javax.swing.JButton set_amount_of_routers_but;
    private javax.swing.ButtonGroup set_mask_length_group;
    private javax.swing.JFrame show_network_frame;
    private javax.swing.JTree show_network_tree;
    // End of variables declaration//GEN-END:variables
}
