/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCmanagementForm;

import Decorator.Beverage;
import Decorator.Coffee;
import Decorator.Milk;
import Decorator.Shot;
import Factory.Pc;
import Factory.PcFactory;
import PCmanagement.Pc1;
import PCmanagement.Pc2;
import RemainTime.NotUse;
import RemainTime.RemainTime;
import RemainTime.Seat;
import java.util.Timer;
import java.util.TimerTask;
import PCCommand.PowerOffCommand;
import PCCommand.PowerOnCommand;
import PCCommand.Power;
import PCCommand.PowerCommand;

/**
 *
 * @author 순범
 */
public class MainForm extends javax.swing.JFrame {

    PcFactory pf = new PcFactory();
    Pc pc1 = pf.createPc("pc1");
    Pc pc2 = pf.createPc("pc2");

    Pc1 p = new Pc1();
    Pc2 p2 = new Pc2();
    Beverage beverage = new Coffee();
    Beverage beverage2 = new Coffee();
    int j = 1;
    int k = 1;

    int user = 0;

    int count = 0;

    public MainForm() {
        initComponents();

        this.p = (Pc1) pc1.MakePcO();
        this.p2 = (Pc2) pc2.MakePcO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        CalOfSales = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextArea2 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        COMBO2 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        START2 = new javax.swing.JButton();
        Time2 = new javax.swing.JTextField();
        USE2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        COMBO = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        START = new javax.swing.JButton();
        Time = new javax.swing.JTextField();
        USE = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        CalOfSales.setMinimumSize(new java.awt.Dimension(500, 400));

        TextArea2.setColumns(20);
        TextArea2.setRows(5);
        TextArea2.setEnabled(false);
        jScrollPane3.setViewportView(TextArea2);

        jButton5.setText("매출 보기");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setText("매출 정산");
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CalOfSalesLayout = new javax.swing.GroupLayout(CalOfSales.getContentPane());
        CalOfSales.getContentPane().setLayout(CalOfSalesLayout);
        CalOfSalesLayout.setHorizontalGroup(
            CalOfSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalOfSalesLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(CalOfSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(108, 108, 108))
            .addGroup(CalOfSalesLayout.createSequentialGroup()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CalOfSalesLayout.setVerticalGroup(
            CalOfSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalOfSalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        COMBO2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "커피(2000)", "과자(1000)", "1시간", "우유(500)", "샷(500)" }));
        COMBO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMBO2ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setText("No.2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton2.setText("주문하기");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        START2.setText("시작/종료");
        START2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                START2ActionPerformed(evt);
            }
        });

        Time2.setEnabled(false);
        Time2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Time2ActionPerformed(evt);
            }
        });

        USE2.setText("빈자리");
        USE2.setEnabled(false);
        USE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USE2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(USE2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Time2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(COMBO2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(START2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(USE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(COMBO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Time2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(START2)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        COMBO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "커피(2000)", "과자(1000)", "1시간", "우유(500)", "샷(500)" }));
        COMBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMBOActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setText("No.1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("주문하기");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        START.setText("시작/종료");
        START.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STARTActionPerformed(evt);
            }
        });

        Time.setEnabled(false);
        Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeActionPerformed(evt);
            }
        });

        USE.setText("빈자리");
        USE.setEnabled(false);
        USE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(USE, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Time)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(COMBO, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(START))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(USE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(COMBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(START)))
        );

        jButton3.setText("관리자 계정 수정");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setText("PC관리 프로그램");
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        TextArea.setColumns(20);
        TextArea.setRows(5);
        TextArea.setEnabled(false);
        jScrollPane2.setViewportView(TextArea);

        jButton4.setText("매출 정산");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton4)
                        .addGap(95, 95, 95)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(121, 121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void COMBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMBOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COMBOActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        //1번 pc 선택시

        TextArea.setText("");//텍스트 화면 초기화
        String combo = (String) COMBO.getSelectedItem();
        TextArea.append(p.PrintPcNum());
        TextArea.append(p.show()); //텍스트 화면 출력

    }//GEN-LAST:event_jPanel2MouseClicked

    private void COMBO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMBO2ActionPerformed

    }//GEN-LAST:event_COMBO2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //1번 pc 주문하기 버튼

        String combo = (String) COMBO.getSelectedItem();
        p.Count(combo); //주문했을때 갯수 올리기

        if (combo == "우유(500)") {
            beverage = new Milk(beverage);
        }
        if (combo == "샷(500)") {
            beverage = new Shot(beverage);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //2번 pc주문하기 버튼

        String combo2 = (String) COMBO2.getSelectedItem();
        p2.Count(combo2); //주문했을때 갯수 올리기

        if (combo2 == "우유(500)") {
            beverage2 = new Milk(beverage2);
        }
        if (combo2 == "샷(500)") {
            beverage2 = new Shot(beverage2);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        //2번 pc 선택시

        TextArea.setText("");//텍스트 화면 초기화
        String combo = (String) COMBO.getSelectedItem();
        TextArea.append(p2.PrintPcNum());
        TextArea.append(p2.show()); //텍스트 화면 출력

    }//GEN-LAST:event_jPanel1MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ManagerInfoChangeForm mifcf = new ManagerInfoChangeForm();
        mifcf.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //매출 정산 으로 이동
        CalOfSales.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //매출 보기 클릭시

        TextArea2.setText(""); //텍스트 화면 초기화
        int pCoffee = p.coffee;
        int p2Coffee = p2.coffee;

        int tCoffee = p.coffee + p2.coffee;
        int tSnack = p.snack + p2.snack;
        int tUser = p.user + p2.user;
        int tTimeCount = p.timecount + p2.timecount;

        if (pCoffee == 0 && p2Coffee == 0) {
            TextArea2.append(p.getCoffee(tCoffee) + "\n");
        } else if (pCoffee == 1 && p2Coffee == 0) {
            TextArea2.append(p.getCoffee(beverage.cost()) + "\n");
        } else if (pCoffee == 0 && p2Coffee == 1) {
            TextArea2.append(p.getCoffee(beverage2.cost()) + "\n");
        } else {
            TextArea2.append(p.getCoffee(beverage.cost() + beverage2.cost()) + "\n");
        }

        TextArea2.append(p.getSnack(tSnack) + "\n");
        TextArea2.append(p.getTime(tTimeCount) + "\n");
        TextArea2.append(p.getUser(tUser) + "\n");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void STARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STARTActionPerformed
        //1번 pc 시작버튼

        Timer timer = new Timer();
        Seat seat = new Seat();

        PowerCommand remote = new PowerCommand();
        Power first = new Power("1번");
        PowerOnCommand firstPowerOn = new PowerOnCommand(first);
        PowerOffCommand firstPowerOff = new PowerOffCommand(first);

        remote.setCommand(0, firstPowerOn, firstPowerOff);

        RemainTime rt = new RemainTime();
        rt.GetTime(p.time);

        if (p.time > 0) {
            j++;
        }
        if (p.time > 0 && j % 2 == 0) {
            USE.setText(seat.Useable());
            remote.onButtonPressed(0);
            p.user++;
            TimerTask ttask = new TimerTask() {
                public void run() {
                    if (count < 3600) {
                        Time.setText(rt.RemainTime() + "\n");
                        count++;
                    }
                    if (j % 2 != 0) {
                        timer.cancel();
                        Time.setText("");
                    }
                }
            };
            timer.schedule(ttask, 1, 1000);
            Time.setText("");
        } else {
            seat.setUseState(new NotUse());
            USE.setText(seat.Useable());
            remote.offButtonPressed(0);
            p.time = 0;
            p.snackcount = 0;
            p.coffeecount = 0;
            p.milk = 0;
            p.shot = 0;
            p.time = 0;
            Time.setText("충전 시간이 없습니다.\n");
        }
    }//GEN-LAST:event_STARTActionPerformed

    private void START2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_START2ActionPerformed
        //2번 pc 시작 버튼

        Timer timer = new Timer();
        Seat seat = new Seat();

        PowerCommand remote = new PowerCommand();
        Power second = new Power("2번");
        PowerOnCommand secondPowerOn = new PowerOnCommand(second);
        PowerOffCommand secondPowerOff = new PowerOffCommand(second);

        remote.setCommand(1, secondPowerOn, secondPowerOff);

        RemainTime rt2 = new RemainTime();
        rt2.GetTime(p2.time);

        if (p2.time > 0) {
            k++;
        }
        if (p2.time > 0 && k % 2 == 0) {
            USE2.setText(seat.Useable());
            remote.onButtonPressed(1);
            p2.user++;
            TimerTask ttask = new TimerTask() {
                public void run() {
                    if (count < 3600) {
                        Time2.setText(rt2.RemainTime() + "\n");
                        count++;
                    }
                    if (k % 2 != 0) {
                        timer.cancel();
                        Time2.setText("");
                    }
                }
            };
            timer.schedule(ttask, 1, 1000);
            Time2.setText("");
        } else {
            seat.setUseState(new NotUse());
            USE2.setText(seat.Useable());
            remote.offButtonPressed(1);
            p2.time = 0;
            p2.snackcount = 0;
            p2.coffeecount = 0;
            p2.milk = 0;
            p2.shot = 0;
            p2.time = 0;
            Time2.setText("충전 시간이 없습니다.\n");
        }
    }//GEN-LAST:event_START2ActionPerformed

    private void USEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USEActionPerformed

    private void USE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USE2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void Time2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Time2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Time2ActionPerformed

    private void TimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> COMBO;
    private javax.swing.JComboBox<String> COMBO2;
    private javax.swing.JDialog CalOfSales;
    private javax.swing.JButton START;
    private javax.swing.JButton START2;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JTextArea TextArea2;
    private javax.swing.JTextField Time;
    private javax.swing.JTextField Time2;
    private javax.swing.JTextField USE;
    private javax.swing.JTextField USE2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}