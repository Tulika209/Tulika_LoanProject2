/*
*loan assistant.java
 */
package loanassistant;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class loanassistant extends JFrame
{
    JLabel balanceLable = new JLabel();
    JTextField balanceTextField=new JTextField();
    JLabel interestLable = new JLabel();
    JTextField interestTextField=new JTextField();
    JLabel monthsLable=new JLabel();
    JTextField monthsTextField=new JTextField();
    JLabel paymentLable=new JLabel();
    JTextField paymentTextField=new JTextField();
    JButton computeButton =new JButton();
    JButton newLoanButton=new JButton();
    JButton monthsButton=new JButton();
    JLabel analysisLable=new JLabel();
    JTextArea analysisTextArea=new JTextArea();
    JButton exitButton=new JButton();

    Font myFont = new Font("Arial",Font.PLAIN,16);

    Color lightYellow=new Color(255,255,128);

    boolean computePayment;

    public static Void string;

    {
        //create frame
        new LoanAssistant().show();

    }
    public LoanAssistant;
    {
        //frame constructor
        setTitle("Loan Assistant");
        setResizable(false);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent evt) {
                exitForm(evt);

            }

        });
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints;

        balanceLable.setText("Loan Balance");
        balanceLable.setFont(myFont);
        gridConstraints=new GridBagConstraints();
        gridConstraints.gridx=0;
        gridConstraints.gridy=0;
        gridConstraints.anchor=GridBagConstraints.WEST;
        gridConstraints.insets=new Insets(10,10,0,10);
        getContentPane().add(balanceLable,gridConstraints);

        balanceTextField.setPreferredSize(new Dimension(100,25));

    balance TextField.setHorizontalAlignment(SwingConstants.RIGHT);

        balanceTextField.setFont(myFont);
        gridConstraints=new GridBagConstraints();
        gridConstraints=new GridBagConstraints();
        gridConstraints.gridx=1;
        gridConstraints.gridy=0;

        gridConstraints.insets=new Insets(10,10,0,10);
        getContentPane().add(balanceTextField,gridConstraints);
        balanceTextField.addActionListener(new ActionListener()
        {
            @Override
            void actionPerformed(ActionEvent e) {

            }
        });
        interestLableText("Interest Rate");
        interestLable.setFont(myFont);
        gridConstraints=new GridBagConstraints();
        gridConstraints.gridx=0;
        gridConstraints.gridy=1;
        gridConstraints.anchor=GridBagConstraints.WEST;
        gridConstraints.insets=new Insets(10,10,0,0);
        getContentPane().add(interestLable,gridConstraints);
        interestTextField.setPreferredSize(new Dimension(100,25));

    interestTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        interestTextField.setFont(myFont);
        gridConstraints=new GridBagConstraints();
        gridConstraints.gridyx=1;
        gridConstraints.gridy=1;
        gridConstraints.insets=new Insets(10,10,0,10);
        getContentPane().add(interestTextField,gridConstraints);
        interestTextField.add(interestTextField,gridConstraints);
        interestTextField.addActionListener(new ActionListener() {
            @Override
            void actionPerformed(ActionEvent e) {

            }
        });
        monthsLable.setText("Number of Payments");
        monthsLable.setFont(myFont);
        gridConstraints=new GridBagConstraints();
        gridConstraints.gridx=0;
        gridConstraints.gridy=2;
        gridConstraints.anchor=GridBagConstraints.WEST;
        gridConstraints.insets=new Insets(10,10,0);
        getContentPane().add(monthsLable,gridConstraints);
        monthsTextField.setFont(myFont);
        gridConstraints=new GridBagConstraints();
        gridConstraints.gridy=0;
        gridConstraints.gridy=2;
        gridConstraints.anchor=GridBagConstraints.WEST;
        gridConstraints.insets=new Insets(10,10,0,0);
        getContentPane().add(monthsLable,gridConstraints);

        monthsTextField.setPreferredSize(new Dimension(100,25));

    monthsTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        monthsTextField.setFont(myFont);
        gridConstraints=new GridBagConstraints();
        gridConstraints.gridx=1;
        gridConstraints.gridy=2;
        gridConstraints.insets=new Insets(10,10,0,10);
        getContentPane().add(monthsTextField,gridConstraints);
        monthsTextField.addActionListener(new ActionListener() {
            @Override
            void actionPerformed(ActionEvent e) {

            }
        });
        paymentLable.setText("Monthly Payment");
        paymentLable.setFont(myFont);
        gridConstraints.gridx=0;
        gridConstraints.gridy=3;
        gridConstraints.anchor=GridBagConstraints.WEST;
        gridConstraints.insets=new Insets(10,10,0,0);
        getContentPane().add(paymentLable,gridConstraints);

        paymentTextField.setPreferredSize(new Dimension(100,25));

    paymentTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        paymentTextField.setFont(myFont);
        gridConstraints=new GridBagConstraints();
        gridConstraints.gridx=1;
        gridConstraints.gridy=3;
        gridConstraints.insets=new Insets(10,10,0,10);
        getContentPane().add(paymentTextField,gridConstraints);
        paymentTextField.addActionListener(new ActionListener() {
            @Override
            void actionPerformed(ActionEvent e) {

            }
        });
        computeButton.setText("Compute Monthly Payment");
        gridConstraints=new GridBagConstraints();
        gridConstraints.gridx=0;
        gridConstraints.gridy=4;
        gridConstraints.gridwidth=2;
        gridConstraints.insets=new Insets(10,0,0,0);
        getContentPane().add(componentButton,gridConstraints);
        computeButton.addActionListener(new ActionListener() {
            @Override
            void actionPerformed(ActionEvent e) {

            }
        });
        newLoanButton.setText("New Loan Analysis");
        newLoanButton.setEnabled(false);
        gridConstraints=new GridBagConstraints();
        gridConstraints.gridx=0;
        gridConstraints.gridy=5;
        gridConstraints.gridwidth=2;
        gridConstraints.insets=new Insets(10,0,10,0);
        getContentPane().add(newLoanButton,gridConstraints);

        newLoanButton.addActionListener(new ActionListener() {
            @Override
            void actionPerformed(ActionEvent e) {

            }
        });
        monthsButton.setText("X");
        monthsButton.setFocusable(false);
        gridConstraints = newFocusable(false);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 2;
        gridConstraints.insets = new Insets(10,0,0,0);
        getContentPane().add(monthsButton,gridConstraints);
        monthsButton.addActionListener(new ActionListener() {
            @Override
            void actionPerformed(ActionEvent e) {

            }
        });
        paymentButton.setText("X");
        paymentButton.setFocusable(false);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 3;
        gridConstraints.insets = newInsets(10,0,0,0);
        getContentPane().add(paymentButton,gridConstraints);
        paymentButton.addActionListener(new ActionListener()
        {
            @Override
            void actionPerformed(ActionEvent e) {
                paymentButtonActionPerformed(e);
            }
        });
        analysisLable.setText("Loan Analysis");
        analysisLable.setFont(myFont);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 0;
        gridConstraints.anchor = GridBagConstraints.WEST;
        gridConstraints.insets = new Insets(0,10,0,0);
        getContentPane().add(analysisLable,gridConstraints);

        analysisTextArea.setPreferredSize(new Dimension(250,150));
        analysisTextArea.setFocusable(false);

        analysisTextArea.setBorder(BorderFactory.createLineBorder(color.BLACK));
        analysisTextArea.setBackground(Color.WHITE);
        getConstraints = new GridBagConstraints();
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 1;
        gridConstraints.gridheight =4;
        gridConstraints.insets = newInsets(0,10,0,10);
        getContentPane().add(exitButton,gridConstraints);
        exitButton.addActionListener(new ActionListener() {
            @Override
            void actionPerformed(ActionEvent e) {
                exitButtonActionPerformed(e);
            }
        });

        pack();
        Dimension screenSize =
    Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(int) (0.5 * (screenSize.width-getWidth()));(int) (0.5 * (screenSize.height -getHeight()));getWidth();getHeight();
        paymentButton.doClick();
    }

    private void exitForm(WindowEvent) {
        System.exit(0);
    }

    private void computeButtonActionPerformed(ActionEvent e)
    {
        double balance, interest, payment;
        int months;
        double monthlyInterest, multiplier;
        double loanBalance,finalPayment;
        if(validateDecimalNumber(balanceTextField))
        {
            balance =
    Double.valueOf(balanceTextField.getText()).doubleValue();
        }
        else {
            JOptionPane.showConfirmDialog(null, "Invalid or empty Loan Balance entry.\nPlease correct.", "Balance Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(validateDecimalNumber(interestTextField)) {
            interest =
                    Double.valueOf(interestTextField.getText()).double Value();
        }
        else {
            JOptionPane.showConfirmDialog(null,"Invalid or empty Interest Rate entry.\nPlease correct.","Interest Input Error",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
            return;
            }
        monthlyInterest=interest/1200;
        if(computePayment) {
            //Compute loan payment
            if (validateDecimalNumber(monthsTextField)) {
                months = Integer.valueOf(monthsTextField.getText()).intValue();
            } else {
                JOptionPane.showConfirmDialog(null, "Invalid or empty Number of Payments entry.\nPlease correct.", "Number of Payments Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (interest == 0) {
                payment = balance / months;
            } else {
                multiplier = Math.pow(1 + monthlyInterest, months);
                payment = balance * monthlyInterest * multiplier / (multiplier - 1);
            }
            paymentTextField.setText(new DecimalFormat("0.00").format(payment));
        }
        else {
            //Compute number of payments
            if (validateDecimalNumber(paymentTextField)) {
                payment = Double.valueOf(paymentTextField.getText()).doubleValue();
                if (payment <= (balance * monthlyInterest + 1.0)) {
                    if (JOptionPane.showConfirmDialog(null, "Minimum payment must be S" + new DecimalFormat("0.0").format(int)(balance * monthlyInterest + 1.0) + "\n" + "Do you want to use the minimum payment?"
                            , "Input error", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                        paymentTextField.setText(new DecimalFormat("0.0").format(int)(balance * monthlyInterest + 1.0));
                        payment = Double.valueOf(paymentTextField.getText().double.Value());
                    } else {
                        paymentTextField.requestFocus();
                        return;
                    }
                } else {
                    JOptionPane.showConfirmDialog(null, "Invalid or empty Monthly Payment entry.\nPlease correct.", "Payment Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    return;
                    if (interest == 0) {
                        months = (int) (balance / payment);
                    } else {
                        months = (int) (Math.log(payment) - Math.log(payment - balance * monthlyInterest)) / Math.log(1 + monthlyInterest);
                    }
                    monthsTextField.setText(String.valueOf(months));
                }
                payment = Double.valueOf(getPaymentTextField().getText()).doubleValue();
                analysisTextArea.setText("Loan Balance:" + new DecimalFormat("0.00").format(interest) + "%");
                loanBalance = balance;
                for (int paymentNumber = 1; paymentNumber <= months - 1; paymentNumber++) {
                    loanBalance += loanBalance * monthlyInterest - payment;
                }
                finalPayment = loanBalance;
                months++;
                monthsTextField.setText(String.valueOf(months));
            }
            analysisTextArea.Area.append("\n\n" + String.valueOf(months - 1) + "Payments of " + new DecimalFormat("0.00").format(payment));
            analysisTextArea.append("\n" + "Final Payment of:" + new DecimalFormat("0.0").format(finalPayment));
            analysisTextArea.append("\n" + "Total Payments:" + new DecimalFormat("0.00").format((months - 1) * payment + finalPayment));
            analysisTextArea.append("\n" + "Interest Paid" + new DecimalFormat("0.00").format(months - 1) * payment + finalPayment - balance);
            computeButton.setEnabled(false);
            newLoanButton.setEnabled(true);
            newLoanButton.requestFocus();
            void newLoanButtonActionPerformed;
                computePayment = False;
                paymentButton.setVisible(true);
                monthsButton.setVisible(False);
                monthsTextField.setText("");
                monthsTextField.setEditable(false);
                monthsTextField.setBackground(lightYellow);
                monthsTextField.setFocusable(false);
                paymentTextField.setEditable(true);
                paymentTextField.setBackground(Color: WHITE);
                paymentTextField.requestFocusable(true);
                computeButton.setText("Compute Number of Payments");
                balanceTextField.requestFocus();
            }
            void paymentButtonActionPerformed;
                computePayment = true;
                payButton.setVisible(false);
                months.Button.setVisible(true);
                monthsTextField.setEditable(true);
                monthsTextField.setBackground(color.WHITE);
                monthsTextField.setFocusable(true);
                paymentTextField.setText("");
                paymentTextField.setEditable(false);
                paymentTextField.setBackground(lightYellow);
                paymentTextField.setFocusable(false);
                computeButton.setText("Compute Monthly Payment");
                balanceTextField.requestFocus();
            }
            private void exitButtonActionPerformed(ActionEvent e) {
                balanceTextField.transferFocus();
            }
            private voidinterestTextFieldActionPerformed(ActionEvent e) {
                interestTextField.transferFocus();
            }
            private void monthsTextFieldActionPerformed(ActionEvent e) {
                monthsTextField.transferFocus();
            }
            private void paymentTextFieldActionPerformed(ActionEvent e) {
                paymentTextField.transferFocus();
            }
            private boolean validateDecimalNumber(JTextField tf) {
                String s = tf.getText().trim();
                boolean hasDecimal = false;
                boolean valid = true;
                if (s.length() == 0) {
                    valid = false;
                } else {
                    for (int i = 0; i < s.length(); i++) {
                        char c = s.charAt(i);
                        if (c >= '0' && c <= '9') {
                            continue;
                        } else if (c == '.' && !hasDecimal) {
                            hasDecimal = true;
                        } else {
                            valid = false;
                        }
                    }
                }
                tf.setText(s);
                if (!valid) {
                    tf.requestFocus();
                }
                return (valid);
            }
        }








        