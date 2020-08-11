/*
 * Created by JFormDesigner on Tue Aug 11 12:31:49 PDT 2020
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.*;

/**
 * @author VanHai
 *
 * GitHub code link
 * https://github.com/vanhaiung/FinalExam.git
 */
public class LoanProjection extends JFrame {
    public LoanProjection() {
        initComponents();
    }

    private void scrollPane1MouseClicked(MouseEvent e) {
        // TODO add your code here
        DefaultTableModel df = (DefaultTableModel)table1.getModel();

        int index1 = table1.getSelectedRow();

        textField1.setText(df.getValueAt(index1, 0).toString());
        textField2.setText(df.getValueAt(index1, 1).toString());
        textField3.setText(df.getValueAt(index1, 2).toString());
        textField4.setText(df.getValueAt(index1, 3).toString());
    }

    private void scrollPane2MouseClicked(MouseEvent e) {
        // TODO add your code here
        DefaultTableModel df = (DefaultTableModel)table2.getModel();

        int index1 = table2.getSelectedRow();

        textField1.setText(df.getValueAt(index1, 0).toString());
        textField2.setText(df.getValueAt(index1, 1).toString());
        textField3.setText(df.getValueAt(index1, 2).toString());
        textField4.setText(df.getValueAt(index1, 3).toString());
    }

    private void AddActionPerformed(ActionEvent e) throws ClassNotFoundException, SQLException {
        // TODO add your code here
        Business business;
        Personal personal;

        String clientNo, clientName, typeLoan;
        double loanAmount;
        int years;

        clientNo = textField1.getText();
        if (!isLetter(clientNo)) {
            JOptionPane.showMessageDialog(null, "Invalid input");
            return;
        }

        clientName = textField2.getText();
        if (!isLetter(clientName)) {
            JOptionPane.showMessageDialog(null, "Invalid input");
            return;
        }

        loanAmount = Double.parseDouble(textField3.getText());
        years = Integer.parseInt(textField4.getText());

        typeLoan = String.valueOf(comboBox1.getSelectedIndex());
        if (!isLetter(typeLoan)) {
            JOptionPane.showMessageDialog(null, "Invalid input");
            return;
        }



        PreparedStatement query;

        // load the jdbc driver
        Class.forName("com.mysql.jdbc.Driver");

        // connect to the database
        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/loan", "root", "");

        // create the sql statement that will add the data
        query = con1.prepareStatement("insert into loantable values (?, ?, ?, ?, ?)");
        query.setString(1, clientNo);
        query.setString(2, clientName);
        query.setString(3, String.valueOf(loanAmount));
        query.setString(4, String.valueOf(years));
        query.setString(5, typeLoan);

        query.executeUpdate();

        JOptionPane.showMessageDialog(null, "One record added");
    }

    private void EditActionPerformed(ActionEvent e) throws SQLException, ClassNotFoundException {
        // TODO add your code here
        String clientNo, clientName, typeLoan;
        double loanAmount;
        int years;

        clientNo = textField1.getText();
        clientName = textField2.getText();
        loanAmount = Double.parseDouble(textField3.getText());
        years = Integer.parseInt(textField4.getText());
        typeLoan = String.valueOf(comboBox1.getSelectedIndex());

        PreparedStatement query;

        // load the jdbc driver
        Class.forName("com.mysql.jdbc.Driver");

        // connect to the database
        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/loan", "root", "");

        // create the sql statement that will add the data
        query = con1.prepareStatement("update loantable set clientno = ?, clientname = ?, loanamount = ?, years = ?, loantype = ? where clientno = ? ");

        query.setString(1, clientNo);
        query.setString(2, clientName);
        query.setString(3, String.valueOf(loanAmount));
        query.setString(4, String.valueOf(years));
        query.setString(5, typeLoan);
        query.setString(6, clientNo);

        query.executeUpdate();

        JOptionPane.showMessageDialog(null, "One record updated");
    }

    private void DeleteActionPerformed(ActionEvent e) throws ClassNotFoundException, SQLException {
        // TODO add your code here
        String clientNo, clientName, typeLoan;
        double loanAmount;
        int years;

        clientNo = textField1.getText();
        clientName = textField2.getText();
        loanAmount = Double.parseDouble(textField3.getText());
        years = Integer.parseInt(textField4.getText());
        typeLoan = String.valueOf(comboBox1.getSelectedIndex());

        PreparedStatement query;

        // load the jdbc driver
        Class.forName("com.mysql.jdbc.Driver");

        // connect to the database
        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/loan", "root", "");

        query = con1.prepareStatement("delete from loantable where clientno = ?");

        query.setString(1, clientNo);

        query.executeUpdate();

        JOptionPane.showMessageDialog(null, "One record deleted");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - VanHai
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        textField4 = new JTextField();
        label5 = new JLabel();
        comboBox1 = new JComboBox<>();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        scrollPane2 = new JScrollPane();
        table2 = new JTable();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        label6 = new JLabel();
        textField6 = new JTextField();

        //======== this ========
        setTitle("Loan Projection");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Enter the client number:");
        contentPane.add(label1, "cell 0 0");
        contentPane.add(textField1, "cell 3 0 40 1");

        //---- label2 ----
        label2.setText("Enter the client name:");
        contentPane.add(label2, "cell 0 1");
        contentPane.add(textField2, "cell 3 1 40 1");

        //---- label3 ----
        label3.setText("Enter the customer loan amount:");
        contentPane.add(label3, "cell 0 2");
        contentPane.add(textField3, "cell 3 2 40 1");

        //---- label4 ----
        label4.setText("Enter the number of years to pay:");
        contentPane.add(label4, "cell 0 3");
        contentPane.add(textField4, "cell 3 3 40 1");

        //---- label5 ----
        label5.setText("Enter the loan type:");
        contentPane.add(label5, "cell 0 4");

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "Business",
            "Personal"
        }));
        contentPane.add(comboBox1, "cell 3 4 40 1");

        //======== scrollPane1 ========
        {
            scrollPane1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    scrollPane1MouseClicked(e);
                }
            });
            scrollPane1.setViewportView(table1);
        }
        contentPane.add(scrollPane1, "cell 0 8 3 1");

        //======== scrollPane2 ========
        {
            scrollPane2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    scrollPane2MouseClicked(e);
                }
            });
            scrollPane2.setViewportView(table2);
        }
        contentPane.add(scrollPane2, "cell 3 8 40 1");

        //---- button3 ----
        button3.setText("Add");
        button3.addActionListener(e -> {
            try {
                AddActionPerformed(e);
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });
        contentPane.add(button3, "cell 0 9");

        //---- button4 ----
        button4.setText("Edit");
        button4.addActionListener(e -> {
            try {
                EditActionPerformed(e);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
        });
        contentPane.add(button4, "cell 1 9 2 1");

        //---- button5 ----
        button5.setText("Delete");
        button5.addActionListener(e -> {
            try {
                DeleteActionPerformed(e);
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });
        contentPane.add(button5, "cell 1 9 2 1");

        //---- label6 ----
        label6.setText("Monthly Payment");
        contentPane.add(label6, "cell 5 9");
        contentPane.add(textField6, "cell 12 9 31 1");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - VanHai
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JLabel label4;
    private JTextField textField4;
    private JLabel label5;
    private JComboBox<String> comboBox1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JScrollPane scrollPane2;
    private JTable table2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JLabel label6;
    private JTextField textField6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void prepare() {
        // set model for JTable1
        String[] cols = {"Number", "Name", "Amount", "Years", "Type of Loan"};

        String[][] data = {{"b1", "b2", "b3", "b4", "b5"}};

        DefaultTableModel model = new DefaultTableModel(data, cols);

        table1.setModel(model);

        // set model for JTable2
        String[] cols2 = {"Payment", "Principal", "Interest", "Monthly Payment", "Balance"};

        String[][] data2 = {{"b1", "b2", "b3", "b4", "b5"}};

        DefaultTableModel model2 = new DefaultTableModel(data2, cols2);

        table2.setModel(model2);
    }

    // this method will validate user input
    private static boolean isLetter(String string) {
        char[] charArray = string.toCharArray();

        for (char ch1 : charArray) {
            if (!Character.isLetter(ch1)) {
                return false;
            }
        }
        return true;
    }

    // this method will validate user input
    private static boolean isNumeric(Double number) {

        if (    number.equals(Math.floor(number)) &&
                !Double.isInfinite(number)        &&
                !Double.isNaN(number)             &&
                number <= Integer.MAX_VALUE       &&
                number >= Integer.MIN_VALUE) {
            return true;
        } else {
            return false;
        }
    }

    public void displayTable() throws ClassNotFoundException, SQLException {

        PreparedStatement query;

        // load the jdbc driver
        Class.forName("com.mysql.jdbc.Driver");

        // connect to the database
        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/loan", "root", "");

        // update the record
        query = con1.prepareStatement("select * from loantable ");

        ResultSet rs = query.executeQuery();

        int c;

        ResultSetMetaData res = rs.getMetaData();

        c = res.getColumnCount();

        DefaultTableModel bf = (DefaultTableModel)table1.getModel();

        bf.setRowCount(0);

        // check if there is data
        if (!rs.isBeforeFirst()) {
            System.out.println("There is no data. Please add some data to database");
            return;
        }

        while (rs.next()) {
            Vector vector = new Vector();
            for (int i = 1; i <= c; i++) {
                vector.add(rs.getString("clientno"));
                vector.add(rs.getString("clientname"));
                vector.add(rs.getDouble("loanamount"));
                vector.add(rs.getInt("years"));
                vector.add(rs.getString("loantype"));
            }

            bf.addRow(vector);
        }
    }

    public static void main(String[] args) {
        LoanProjection loanProjection = new LoanProjection();

        loanProjection.prepare();

        loanProjection.setVisible(true);

        //loanProjection.displayTable();
    }
}
