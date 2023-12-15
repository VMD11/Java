/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 84362
 */
public class Index extends javax.swing.JFrame {
    
    /**
     * Creates new form Index
     */
    public Index() {
        initComponents();
        LoadcbVaiTro();
        ViewDangNhap.setVisible(true);
        ViewDHP.setVisible(false);
        ViewDT.setVisible(false);
        MenuSideBar.setVisible(false);
        ViewDangKy.setVisible(false);
        ViewNhapDiem.setVisible(false);
    }
    
    User user;
    ArrayList<String> SubjectName = new ArrayList<String>();
    ArrayList<Subject> SubjectList = new ArrayList<Subject>();
    ArrayList<User> UserList = new ArrayList<User>();
    Subject subject = new Subject();
    
    
    private void SaveUser(User u){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("User.txt", true))) {
            {
                //writer.newLine();
                writer.write(String.format("%s\t%s\t%s\t%s\t%s\t%s%n",
                        u.getID(), u.getTen(), u.getMatKhau(), u.getVaitro(), u.getEmail(),u.getDiaChi()));
                writer.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
    private boolean CheckUser(User u){
        try (BufferedReader reader = new BufferedReader(new FileReader("User.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 6) {
                    String id = parts[0].trim();
                    if(u.getID().equals(id))
                        return false;
                }
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return true;
    }
    
    private boolean UserLogin(String taikhoan, String matkhau){
        try (BufferedReader reader = new BufferedReader(new FileReader("User.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 6) {
                    String id = parts[0].trim();
                    String ten = parts[1].trim();
                    String mk = parts[2].trim();
                    String vaitro = parts[3].trim();
                    String email = parts[4].trim();
                    String diachi = parts[5].trim();
                    if(taikhoan.equals(id) && matkhau.equals(mk)){
                        user = new User(id, ten, mk, vaitro, email, diachi);
                        return true;
                    }   
                }
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return false;
    }
    
    private void SetNhapDiem(){
        if(user.getVaitro().equals("Giáo Viên")){
            NhapDiem.setVisible(true);
        }
        else{
            NhapDiem.setVisible(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Index = new javax.swing.JPanel();
        MenuSideBar = new javax.swing.JPanel();
        Logo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        TaiKhoan = new javax.swing.JPanel();
        lblTaiKhoan = new javax.swing.JLabel();
        DiemHocPhan = new javax.swing.JPanel();
        lblDHP = new javax.swing.JLabel();
        DiemThi = new javax.swing.JPanel();
        lblDiemThi = new javax.swing.JLabel();
        Logout = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        NhapDiem = new javax.swing.JPanel();
        lblNhapDiem = new javax.swing.JLabel();
        View = new javax.swing.JPanel();
        ViewDHP = new javax.swing.JPanel();
        lblTitleDHP = new javax.swing.JLabel();
        jpContentDHP = new javax.swing.JPanel();
        jpButton = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDiemHP = new javax.swing.JTable();
        ViewDangNhap = new javax.swing.JPanel();
        lblTitleDN = new javax.swing.JLabel();
        jpFormDN = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        BtnDangNhap = new javax.swing.JButton();
        BtnDangKy = new javax.swing.JButton();
        ViewDT = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpContentDT = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDiemThi = new javax.swing.JTable();
        ViewTaiKhoan = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpContentTK = new javax.swing.JPanel();
        ViewNhapDiem = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jpFormND = new javax.swing.JPanel();
        cbMonHoc = new javax.swing.JComboBox<>();
        cbSinhVien = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTX1 = new javax.swing.JTextField();
        txtTX2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSTN = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDiemThi = new javax.swing.JTextField();
        btnLuuDiem = new javax.swing.JButton();
        btnSuaDiem = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JLabel();
        ViewHome = new javax.swing.JPanel();
        lblTitleHome = new javax.swing.JLabel();
        ViewDangKy = new javax.swing.JPanel();
        jpTitleDK = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jpFormDK = new javax.swing.JPanel();
        jpID = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jpMK = new javax.swing.JPanel();
        lblMK = new javax.swing.JLabel();
        txtMK = new javax.swing.JTextField();
        jpTen = new javax.swing.JPanel();
        lblTen = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jpVaiTro = new javax.swing.JPanel();
        lblVaiTro = new javax.swing.JLabel();
        cbVaiTro = new javax.swing.JComboBox<>();
        jpEmail = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jpDiaChi = new javax.swing.JPanel();
        lblDiaChi = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        btnDangKy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Index.setBackground(new java.awt.Color(250, 255, 255));
        Index.setPreferredSize(new java.awt.Dimension(981, 482));

        MenuSideBar.setBackground(new java.awt.Color(250, 255, 255));
        MenuSideBar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));

        Logo.setBackground(new java.awt.Color(250, 255, 255));
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblLogo.setBackground(new java.awt.Color(250, 255, 255));
        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo-haui-size.png"))); // NOI18N

        javax.swing.GroupLayout LogoLayout = new javax.swing.GroupLayout(Logo);
        Logo.setLayout(LogoLayout);
        LogoLayout.setHorizontalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblLogo)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        LogoLayout.setVerticalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoLayout.createSequentialGroup()
                .addComponent(lblLogo)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TaiKhoan.setBackground(new java.awt.Color(250, 255, 255));
        TaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaiKhoanMouseClicked(evt);
            }
        });

        lblTaiKhoan.setBackground(new java.awt.Color(250, 255, 255));
        lblTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTaiKhoan.setText("Tài khoản");

        javax.swing.GroupLayout TaiKhoanLayout = new javax.swing.GroupLayout(TaiKhoan);
        TaiKhoan.setLayout(TaiKhoanLayout);
        TaiKhoanLayout.setHorizontalGroup(
            TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TaiKhoanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TaiKhoanLayout.setVerticalGroup(
            TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTaiKhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        DiemHocPhan.setBackground(new java.awt.Color(250, 255, 255));
        DiemHocPhan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DiemHocPhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiemHocPhanMouseClicked(evt);
            }
        });

        lblDHP.setBackground(new java.awt.Color(250, 255, 255));
        lblDHP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDHP.setText("Điểm học phần");

        javax.swing.GroupLayout DiemHocPhanLayout = new javax.swing.GroupLayout(DiemHocPhan);
        DiemHocPhan.setLayout(DiemHocPhanLayout);
        DiemHocPhanLayout.setHorizontalGroup(
            DiemHocPhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DiemHocPhanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDHP, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        DiemHocPhanLayout.setVerticalGroup(
            DiemHocPhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDHP, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        DiemThi.setBackground(new java.awt.Color(250, 255, 255));
        DiemThi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DiemThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiemThiMouseClicked(evt);
            }
        });

        lblDiemThi.setBackground(new java.awt.Color(250, 255, 255));
        lblDiemThi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDiemThi.setText("Điểm thi");

        javax.swing.GroupLayout DiemThiLayout = new javax.swing.GroupLayout(DiemThi);
        DiemThi.setLayout(DiemThiLayout);
        DiemThiLayout.setHorizontalGroup(
            DiemThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DiemThiLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDiemThi, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        DiemThiLayout.setVerticalGroup(
            DiemThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDiemThi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Logout.setBackground(new java.awt.Color(250, 255, 255));
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        lblLogout.setBackground(new java.awt.Color(250, 255, 255));
        lblLogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 0, 0));
        lblLogout.setText("Đăng xuất");

        javax.swing.GroupLayout LogoutLayout = new javax.swing.GroupLayout(Logout);
        Logout.setLayout(LogoutLayout);
        LogoutLayout.setHorizontalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoutLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        LogoutLayout.setVerticalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        NhapDiem.setBackground(new java.awt.Color(250, 255, 255));
        NhapDiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NhapDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhapDiemMouseClicked(evt);
            }
        });

        lblNhapDiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNhapDiem.setText("Nhập điểm");

        javax.swing.GroupLayout NhapDiemLayout = new javax.swing.GroupLayout(NhapDiem);
        NhapDiem.setLayout(NhapDiemLayout);
        NhapDiemLayout.setHorizontalGroup(
            NhapDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NhapDiemLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblNhapDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        NhapDiemLayout.setVerticalGroup(
            NhapDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNhapDiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MenuSideBarLayout = new javax.swing.GroupLayout(MenuSideBar);
        MenuSideBar.setLayout(MenuSideBarLayout);
        MenuSideBarLayout.setHorizontalGroup(
            MenuSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DiemHocPhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DiemThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TaiKhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(NhapDiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuSideBarLayout.setVerticalGroup(
            MenuSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuSideBarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DiemHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DiemThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NhapDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        View.setBackground(new java.awt.Color(250, 255, 255));
        View.setMinimumSize(new java.awt.Dimension(0, 0));
        View.setPreferredSize(new java.awt.Dimension(810, 480));

        ViewDHP.setBackground(new java.awt.Color(250, 255, 255));
        ViewDHP.setMinimumSize(new java.awt.Dimension(0, 0));
        ViewDHP.setPreferredSize(new java.awt.Dimension(800, 468));

        lblTitleDHP.setBackground(new java.awt.Color(250, 255, 255));
        lblTitleDHP.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitleDHP.setText("Điểm học phần");

        jpContentDHP.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpContentDHPLayout = new javax.swing.GroupLayout(jpContentDHP);
        jpContentDHP.setLayout(jpContentDHPLayout);
        jpContentDHPLayout.setHorizontalGroup(
            jpContentDHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpContentDHPLayout.setVerticalGroup(
            jpContentDHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jpButton.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpButtonLayout = new javax.swing.GroupLayout(jpButton);
        jpButton.setLayout(jpButtonLayout);
        jpButtonLayout.setHorizontalGroup(
            jpButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpButtonLayout.setVerticalGroup(
            jpButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(tbDiemHP);

        javax.swing.GroupLayout ViewDHPLayout = new javax.swing.GroupLayout(ViewDHP);
        ViewDHP.setLayout(ViewDHPLayout);
        ViewDHPLayout.setHorizontalGroup(
            ViewDHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewDHPLayout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addComponent(lblTitleDHP)
                .addGap(272, 272, 272))
            .addGroup(ViewDHPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ViewDHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpContentDHP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ViewDHPLayout.setVerticalGroup(
            ViewDHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewDHPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleDHP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ViewDHPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpContentDHP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ViewDHPLayout.createSequentialGroup()
                        .addComponent(jpButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                .addContainerGap())
        );

        ViewDangNhap.setBackground(new java.awt.Color(250, 255, 255));
        ViewDangNhap.setMinimumSize(new java.awt.Dimension(0, 0));

        lblTitleDN.setBackground(new java.awt.Color(250, 255, 255));
        lblTitleDN.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitleDN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleDN.setText("XEM ĐIỂM HỌC PHẦN HAUI");

        jpFormDN.setBackground(new java.awt.Color(250, 255, 255));

        jPanel5.setBackground(new java.awt.Color(250, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(438, 60));

        jLabel5.setBackground(new java.awt.Color(250, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tài khoản:");

        txtTaiKhoan.setBackground(new java.awt.Color(250, 255, 255));
        txtTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTaiKhoan.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(250, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(438, 60));

        jLabel6.setBackground(new java.awt.Color(250, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Mật khẩu:");

        txtMatKhau.setBackground(new java.awt.Color(250, 255, 255));
        txtMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        BtnDangNhap.setBackground(new java.awt.Color(204, 204, 204));
        BtnDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnDangNhap.setText("Đăng nhập");
        BtnDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDangNhapMouseClicked(evt);
            }
        });

        BtnDangKy.setBackground(new java.awt.Color(204, 204, 204));
        BtnDangKy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BtnDangKy.setText("Đăng ký");
        BtnDangKy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDangKyMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpFormDNLayout = new javax.swing.GroupLayout(jpFormDN);
        jpFormDN.setLayout(jpFormDNLayout);
        jpFormDNLayout.setHorizontalGroup(
            jpFormDNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
            .addGroup(jpFormDNLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(BtnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jpFormDNLayout.setVerticalGroup(
            jpFormDNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormDNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jpFormDNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ViewDangNhapLayout = new javax.swing.GroupLayout(ViewDangNhap);
        ViewDangNhap.setLayout(ViewDangNhapLayout);
        ViewDangNhapLayout.setHorizontalGroup(
            ViewDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewDangNhapLayout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addGroup(ViewDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpFormDN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitleDN, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );
        ViewDangNhapLayout.setVerticalGroup(
            ViewDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewDangNhapLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblTitleDN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpFormDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        ViewDT.setBackground(new java.awt.Color(250, 255, 255));
        ViewDT.setMinimumSize(new java.awt.Dimension(0, 0));
        ViewDT.setPreferredSize(new java.awt.Dimension(800, 468));

        jLabel2.setBackground(new java.awt.Color(250, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Điểm thi");

        jpContentDT.setBackground(new java.awt.Color(255, 255, 255));

        btn.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btn)
                .addGap(31, 31, 31)
                .addComponent(jButton2)
                .addGap(30, 30, 30)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tbDiemThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbDiemThi);

        javax.swing.GroupLayout jpContentDTLayout = new javax.swing.GroupLayout(jpContentDT);
        jpContentDT.setLayout(jpContentDTLayout);
        jpContentDTLayout.setHorizontalGroup(
            jpContentDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        jpContentDTLayout.setVerticalGroup(
            jpContentDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContentDTLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ViewDTLayout = new javax.swing.GroupLayout(ViewDT);
        ViewDT.setLayout(ViewDTLayout);
        ViewDTLayout.setHorizontalGroup(
            ViewDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewDTLayout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(jLabel2)
                .addContainerGap(325, Short.MAX_VALUE))
            .addGroup(ViewDTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpContentDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ViewDTLayout.setVerticalGroup(
            ViewDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewDTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpContentDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ViewTaiKhoan.setBackground(new java.awt.Color(250, 255, 255));
        ViewTaiKhoan.setPreferredSize(new java.awt.Dimension(800, 468));

        jLabel3.setBackground(new java.awt.Color(250, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Tài khoản");

        jpContentTK.setBackground(new java.awt.Color(250, 255, 255));

        javax.swing.GroupLayout jpContentTKLayout = new javax.swing.GroupLayout(jpContentTK);
        jpContentTK.setLayout(jpContentTKLayout);
        jpContentTKLayout.setHorizontalGroup(
            jpContentTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpContentTKLayout.setVerticalGroup(
            jpContentTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ViewTaiKhoanLayout = new javax.swing.GroupLayout(ViewTaiKhoan);
        ViewTaiKhoan.setLayout(ViewTaiKhoanLayout);
        ViewTaiKhoanLayout.setHorizontalGroup(
            ViewTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewTaiKhoanLayout.createSequentialGroup()
                .addContainerGap(318, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(317, 317, 317))
            .addGroup(ViewTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpContentTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ViewTaiKhoanLayout.setVerticalGroup(
            ViewTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpContentTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ViewNhapDiem.setBackground(new java.awt.Color(250, 255, 255));

        jLabel4.setBackground(new java.awt.Color(250, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setText("Nhập điểm");

        jpFormND.setBackground(new java.awt.Color(250, 255, 255));

        cbMonHoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbMonHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbSinhVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbSinhVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Môn :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Mã sinh viên:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Thường xuyên 1:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Thường xuyên 2:");

        txtTX1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTX2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Số tiết nghỉ:");

        txtSTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Điểm thi:");

        txtDiemThi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnLuuDiem.setBackground(new java.awt.Color(204, 204, 204));
        btnLuuDiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLuuDiem.setText("Lưu");
        btnLuuDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuDiemMouseClicked(evt);
            }
        });

        btnSuaDiem.setBackground(new java.awt.Color(204, 204, 204));
        btnSuaDiem.setText("Sửa");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Họ tên:");

        lbHoTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jpFormNDLayout = new javax.swing.GroupLayout(jpFormND);
        jpFormND.setLayout(jpFormNDLayout);
        jpFormNDLayout.setHorizontalGroup(
            jpFormNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormNDLayout.createSequentialGroup()
                .addGroup(jpFormNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFormNDLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jpFormNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFormNDLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(28, 28, 28)
                                .addComponent(txtTX2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpFormNDLayout.createSequentialGroup()
                                .addGroup(jpFormNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addGap(28, 28, 28)
                                .addGroup(jpFormNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSTN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTX1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpFormNDLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpFormNDLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(cbMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jpFormNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFormNDLayout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(jpFormNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSuaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpFormNDLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDiemThi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jpFormNDLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel13)
                                .addGap(34, 34, 34)
                                .addComponent(lbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpFormNDLayout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btnLuuDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFormNDLayout.setVerticalGroup(
            jpFormNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormNDLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpFormNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(lbHoTen))
                .addGap(26, 26, 26)
                .addGroup(jpFormNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(jpFormNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jpFormNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtDiemThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(27, 27, 27)
                .addGroup(jpFormNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jpFormNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuuDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ViewNhapDiemLayout = new javax.swing.GroupLayout(ViewNhapDiem);
        ViewNhapDiem.setLayout(ViewNhapDiemLayout);
        ViewNhapDiemLayout.setHorizontalGroup(
            ViewNhapDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewNhapDiemLayout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jLabel4)
                .addContainerGap(309, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewNhapDiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpFormND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ViewNhapDiemLayout.setVerticalGroup(
            ViewNhapDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewNhapDiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpFormND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ViewHome.setBackground(new java.awt.Color(250, 255, 255));

        lblTitleHome.setBackground(new java.awt.Color(250, 255, 255));
        lblTitleHome.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitleHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleHome.setText("XEM ĐIỂM HỌC PHẦN HAUI");

        javax.swing.GroupLayout ViewHomeLayout = new javax.swing.GroupLayout(ViewHome);
        ViewHome.setLayout(ViewHomeLayout);
        ViewHomeLayout.setHorizontalGroup(
            ViewHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewHomeLayout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addComponent(lblTitleHome, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        ViewHomeLayout.setVerticalGroup(
            ViewHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewHomeLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(lblTitleHome, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        ViewDangKy.setBackground(new java.awt.Color(250, 255, 255));

        jpTitleDK.setBackground(new java.awt.Color(250, 255, 255));

        jLabel7.setBackground(new java.awt.Color(250, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ĐĂNG KÝ");

        javax.swing.GroupLayout jpTitleDKLayout = new javax.swing.GroupLayout(jpTitleDK);
        jpTitleDK.setLayout(jpTitleDKLayout);
        jpTitleDKLayout.setHorizontalGroup(
            jpTitleDKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleDKLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jpTitleDKLayout.setVerticalGroup(
            jpTitleDKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleDKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpFormDK.setBackground(new java.awt.Color(250, 255, 255));
        jpFormDK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jpID.setBackground(new java.awt.Color(250, 255, 255));
        jpID.setPreferredSize(new java.awt.Dimension(0, 35));

        lblID.setBackground(new java.awt.Color(250, 255, 255));
        lblID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblID.setText("ID");

        txtID.setBackground(new java.awt.Color(250, 255, 255));
        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID.setPreferredSize(new java.awt.Dimension(64, 24));

        javax.swing.GroupLayout jpIDLayout = new javax.swing.GroupLayout(jpID);
        jpID.setLayout(jpIDLayout);
        jpIDLayout.setHorizontalGroup(
            jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIDLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jpIDLayout.setVerticalGroup(
            jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpMK.setBackground(new java.awt.Color(250, 255, 255));
        jpMK.setPreferredSize(new java.awt.Dimension(0, 35));

        lblMK.setBackground(new java.awt.Color(250, 255, 255));
        lblMK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMK.setText("Mật khẩu");

        txtMK.setBackground(new java.awt.Color(250, 255, 255));
        txtMK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMK.setPreferredSize(new java.awt.Dimension(64, 24));

        javax.swing.GroupLayout jpMKLayout = new javax.swing.GroupLayout(jpMK);
        jpMK.setLayout(jpMKLayout);
        jpMKLayout.setHorizontalGroup(
            jpMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMKLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblMK, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpMKLayout.setVerticalGroup(
            jpMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMKLayout.createSequentialGroup()
                .addGroup(jpMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblMK, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMK, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpTen.setBackground(new java.awt.Color(250, 255, 255));
        jpTen.setPreferredSize(new java.awt.Dimension(0, 35));

        lblTen.setBackground(new java.awt.Color(250, 255, 255));
        lblTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTen.setText("Họ tên");

        txtTen.setBackground(new java.awt.Color(250, 255, 255));
        txtTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTen.setPreferredSize(new java.awt.Dimension(64, 24));

        javax.swing.GroupLayout jpTenLayout = new javax.swing.GroupLayout(jpTen);
        jpTen.setLayout(jpTenLayout);
        jpTenLayout.setHorizontalGroup(
            jpTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTenLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTen, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTenLayout.setVerticalGroup(
            jpTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpVaiTro.setBackground(new java.awt.Color(250, 255, 255));
        jpVaiTro.setPreferredSize(new java.awt.Dimension(0, 35));

        lblVaiTro.setBackground(new java.awt.Color(250, 255, 255));
        lblVaiTro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVaiTro.setText("Vai trò");

        cbVaiTro.setBackground(new java.awt.Color(250, 255, 255));

        javax.swing.GroupLayout jpVaiTroLayout = new javax.swing.GroupLayout(jpVaiTro);
        jpVaiTro.setLayout(jpVaiTroLayout);
        jpVaiTroLayout.setHorizontalGroup(
            jpVaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVaiTroLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpVaiTroLayout.setVerticalGroup(
            jpVaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVaiTroLayout.createSequentialGroup()
                .addGroup(jpVaiTroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblVaiTro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbVaiTro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpEmail.setBackground(new java.awt.Color(250, 255, 255));
        jpEmail.setPreferredSize(new java.awt.Dimension(0, 35));

        lblEmail.setBackground(new java.awt.Color(250, 255, 255));
        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("Email");

        txtEmail.setBackground(new java.awt.Color(250, 255, 255));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setPreferredSize(new java.awt.Dimension(64, 24));

        javax.swing.GroupLayout jpEmailLayout = new javax.swing.GroupLayout(jpEmail);
        jpEmail.setLayout(jpEmailLayout);
        jpEmailLayout.setHorizontalGroup(
            jpEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmailLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpEmailLayout.setVerticalGroup(
            jpEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpDiaChi.setBackground(new java.awt.Color(250, 255, 255));
        jpDiaChi.setPreferredSize(new java.awt.Dimension(0, 35));

        lblDiaChi.setBackground(new java.awt.Color(250, 255, 255));
        lblDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDiaChi.setText("Địa chỉ");

        txtDiaChi.setBackground(new java.awt.Color(250, 255, 255));
        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDiaChi.setPreferredSize(new java.awt.Dimension(64, 24));

        javax.swing.GroupLayout jpDiaChiLayout = new javax.swing.GroupLayout(jpDiaChi);
        jpDiaChi.setLayout(jpDiaChiLayout);
        jpDiaChiLayout.setHorizontalGroup(
            jpDiaChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDiaChiLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jpDiaChiLayout.setVerticalGroup(
            jpDiaChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDiaChiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnDangKy.setBackground(new java.awt.Color(204, 204, 204));
        btnDangKy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDangKy.setText("Đăng ký");
        btnDangKy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangKy.setPreferredSize(new java.awt.Dimension(75, 30));
        btnDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangKyMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpFormDKLayout = new javax.swing.GroupLayout(jpFormDK);
        jpFormDK.setLayout(jpFormDKLayout);
        jpFormDKLayout.setHorizontalGroup(
            jpFormDKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormDKLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpFormDKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFormDKLayout.createSequentialGroup()
                        .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFormDKLayout.createSequentialGroup()
                        .addGroup(jpFormDKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jpDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpFormDKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jpEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                .addComponent(jpVaiTro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                .addComponent(jpTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                .addComponent(jpMK, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                .addComponent(jpID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jpFormDKLayout.setVerticalGroup(
            jpFormDKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormDKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ViewDangKyLayout = new javax.swing.GroupLayout(ViewDangKy);
        ViewDangKy.setLayout(ViewDangKyLayout);
        ViewDangKyLayout.setHorizontalGroup(
            ViewDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewDangKyLayout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addGroup(ViewDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpFormDK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpTitleDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );
        ViewDangKyLayout.setVerticalGroup(
            ViewDangKyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewDangKyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpTitleDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpFormDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ViewLayout = new javax.swing.GroupLayout(View);
        View.setLayout(ViewLayout);
        ViewLayout.setHorizontalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ViewDHP, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ViewLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ViewDT, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ViewLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ViewDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ViewLayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(ViewTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ViewLayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(ViewNhapDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ViewLayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(ViewHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ViewLayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(ViewDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
        );
        ViewLayout.setVerticalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ViewDHP, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ViewLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ViewDT, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ViewLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ViewDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ViewLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ViewTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ViewLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ViewNhapDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ViewLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ViewHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ViewLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ViewDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout IndexLayout = new javax.swing.GroupLayout(Index);
        Index.setLayout(IndexLayout);
        IndexLayout.setHorizontalGroup(
            IndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IndexLayout.createSequentialGroup()
                .addComponent(MenuSideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        IndexLayout.setVerticalGroup(
            IndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(View, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
            .addComponent(MenuSideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Index, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Index, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        ViewDangNhap.setVisible(true);
        ViewTaiKhoan.setVisible(false);
        ViewDHP.setVisible(false);
        ViewDT.setVisible(false);
        ViewNhapDiem.setVisible(false);
        ViewDangKy.setVisible(false);
        MenuSideBar.setVisible(false);
    }//GEN-LAST:event_LogoutMouseClicked

    
    private void LoadDiem(){
        SubjectList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("Subject.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 8) {
                    String id = parts[0].trim();
                    String ten = parts[1].trim();
                    int stc = Integer.parseInt(parts[2].trim());
                    float tx1 = Float.parseFloat(parts[3].trim());
                    float tx2 = Float.parseFloat(parts[4].trim());
                    float diemthi = Float.parseFloat(parts[5].trim());
                    int stn = Integer.parseInt(parts[6].trim());
                    String id_user = parts[7].trim();
                    SubjectList.add(new Subject(id,ten, stc, tx1, tx2, diemthi, stn, id_user));
                }   
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        tbDiemThi.setModel(new TableDiemThi(SubjectList));
        tbDiemHP.setModel(new TableDiemHP(SubjectList));
    }
        
    private void DiemThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiemThiMouseClicked
        ViewTaiKhoan.setVisible(false);
        ViewDHP.setVisible(false);
        ViewDT.setVisible(true);
        ViewNhapDiem.setVisible(false);
        ViewDangNhap.setVisible(false);
        ViewDangKy.setVisible(false);
        TaiKhoan.setBackground(null);
        DiemHocPhan.setBackground(null);
        DiemThi.setBackground(Color.LIGHT_GRAY);
        NhapDiem.setBackground(null);
        LoadDiem();
        SetNhapDiem();
        
    }//GEN-LAST:event_DiemThiMouseClicked

    private void DiemHocPhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiemHocPhanMouseClicked
        ViewTaiKhoan.setVisible(false);
        ViewDHP.setVisible(true);
        ViewDT.setVisible(false);
        ViewNhapDiem.setVisible(false);
        ViewDangNhap.setVisible(false);
        ViewDangKy.setVisible(false);
        TaiKhoan.setBackground(null);
        DiemHocPhan.setBackground(Color.LIGHT_GRAY);
        DiemThi.setBackground(null);
        NhapDiem.setBackground(null);
        LoadDiem();
        SetNhapDiem();
    }//GEN-LAST:event_DiemHocPhanMouseClicked

    private void TaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaiKhoanMouseClicked
        ViewTaiKhoan.setVisible(true);
        ViewDHP.setVisible(false);
        ViewDT.setVisible(false);
        ViewNhapDiem.setVisible(false);
        ViewDangNhap.setVisible(false);
        ViewDangKy.setVisible(false);
        TaiKhoan.setBackground(Color.LIGHT_GRAY);
        DiemHocPhan.setBackground(null);
        DiemThi.setBackground(null);
        NhapDiem.setBackground(null);
        SetNhapDiem();
    }//GEN-LAST:event_TaiKhoanMouseClicked

    private void BtnDangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDangNhapMouseClicked
        String taikhoan = txtTaiKhoan.getText();
        String matkhau = txtMatKhau.getText();
        if(taikhoan.isEmpty() || matkhau.isEmpty()){
            JOptionPane.showMessageDialog(null, "Không được để trống");
        }
        else if(UserLogin(taikhoan, matkhau)){
            JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
            ViewTaiKhoan.setVisible(false);
            ViewDHP.setVisible(false);
            ViewDT.setVisible(false);
            ViewNhapDiem.setVisible(false);
            ViewDangNhap.setVisible(false);
            ViewHome.setVisible(true);
            MenuSideBar.setVisible(true);
            ViewDangKy.setVisible(false);
            SetNhapDiem();
            
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Thông tin tài khoản hoặc mật khẩu không chính xác");
        }
    }//GEN-LAST:event_BtnDangNhapMouseClicked

    private void LoadcbMonHoc(){
        SubjectName.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("SubjectName.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                SubjectName.add(line);
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        DefaultComboBoxModel monhoc = new DefaultComboBoxModel();
         for (String s : SubjectName) {
             monhoc.addElement(s);
         }
        cbMonHoc.setModel(monhoc);
    }
    
    private void LoadcbSinhVien(){
        UserList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("User.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 6) {
                    String id = parts[0].trim();
                    String ten = parts[1].trim();
                    String mk = parts[2].trim();
                    String vaitro = parts[3].trim();
                    String email = parts[4].trim();
                    String diachi = parts[5].trim();
                    UserList.add(new User(id, ten, mk, vaitro, email, diachi));
                }
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        DefaultComboBoxModel sinhvien = new DefaultComboBoxModel();
         for (User u : UserList) {
             if(u.getVaitro().equals("Sinh Viên"))
                 sinhvien.addElement(u.getID());
         }
        cbSinhVien.setModel(sinhvien);
    }
    
    private void NhapDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhapDiemMouseClicked
        ViewTaiKhoan.setVisible(false);
        ViewDHP.setVisible(false);
        ViewDT.setVisible(false);
        ViewNhapDiem.setVisible(true);
        ViewDangNhap.setVisible(false);
        ViewDangKy.setVisible(false);
        TaiKhoan.setBackground(null);
        DiemHocPhan.setBackground(null);
        DiemThi.setBackground(null);
        NhapDiem.setBackground(Color.LIGHT_GRAY);
        LoadcbSinhVien();
        LoadcbMonHoc();
        ActionListener cbListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id_user = (String) cbSinhVien.getSelectedItem();
                String ten = (String) cbMonHoc.getSelectedItem();
                LoadDiem();
                for(User u : UserList){
                    if(u.getID().equals(id_user)){
                        lbHoTen.setText(u.getTen());
                    }
                }
                for(Subject s : SubjectList){
                    if(s.getTen().equals(ten)&&s.getID_User().equals(id_user)){
                        txtTX1.setText(Float.toString(s.getDTX1()));
                        txtTX2.setText(Float.toString(s.getDTX2()));
                        txtSTN.setText(Integer.toString(s.getSTN()));
                        txtDiemThi.setText(Float.toString(s.getDiemThi()));
                        if(s.getDKDT().equals("Học lại"))
                            txtDiemThi.setEnabled(false);
                    }else{
                        txtTX1.setText("");
                        txtTX2.setText("");
                        txtSTN.setText("");
                        txtDiemThi.setText("");
                    }
                }
                
            }
        };
        cbMonHoc.addActionListener(cbListener);
        cbSinhVien.addActionListener(cbListener);
        
        
    }//GEN-LAST:event_NhapDiemMouseClicked

    private void LoadcbVaiTro(){
       DefaultComboBoxModel vaitro = new DefaultComboBoxModel();
       vaitro.addElement("Giáo Viên");
       vaitro.addElement("Sinh Viên");
       cbVaiTro.setModel(vaitro);
    }
    
    private void SaveDiem(Subject s){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Subject.txt", true))) {
                {
                    writer.write(String.format("%s\t%s\t%d\t%.1f\t%.1f\t%.1f\t%d\t%s%n",
                            s.getID(), s.getTen(), s.getSTC(), s.getDTX1(), s.getDTX2(),s.getDiemThi(),s.getSTN(),s.getID_User()));
                    writer.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
    }
    
    private void btnDangKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangKyMouseClicked
        User userNew = new User();
        try{
            userNew.setID(txtID.getText());
            userNew.setMatKhau(txtMK.getText());
            userNew.setTen(txtTen.getText());
            userNew.setVaitro(cbVaiTro.getSelectedItem().toString());
            userNew.setEmail(txtEmail.getText());
            userNew.setDiaChi(txtDiaChi.getText());
            if(CheckUser(userNew)){
                SaveUser(userNew);
                JOptionPane.showMessageDialog(null, "Đăng ký thành công");
                ViewDangNhap.setVisible(true);
                ViewDHP.setVisible(false);
                ViewDT.setVisible(false);
                MenuSideBar.setVisible(false);
                ViewDangKy.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "ID đã tồn tại");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        txtID.setText("");
        txtTen.setText("");
        txtMK.setText("");
        txtDiaChi.setText("");
        txtEmail.setText("");
    }//GEN-LAST:event_btnDangKyMouseClicked

    private void BtnDangKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDangKyMouseClicked
        ViewHome.setVisible(false);
        ViewTaiKhoan.setVisible(false);
        ViewDHP.setVisible(false);
        ViewDT.setVisible(false);
        ViewNhapDiem.setVisible(false);
        MenuSideBar.setVisible(false);
        ViewDangNhap.setVisible(false);
        ViewDangKy.setVisible(true);
    }//GEN-LAST:event_BtnDangKyMouseClicked

    private void btnLuuDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuDiemMouseClicked
        
        String id_user = (String) cbSinhVien.getSelectedItem();
        String ten = (String) cbMonHoc.getSelectedItem();
        boolean check = false;
        for(Subject s : SubjectList){
            if(s.getTen().equals(ten)&&s.getID_User().equals(id_user))
                check = true; 
        }
        if(check)
            JOptionPane.showMessageDialog(null, "Đã lưu điểm rồi");
        else{
            float tx1 = Float.parseFloat(txtTX1.getText());
            float tx2 = Float.parseFloat(txtTX2.getText());
            int stn = Integer.parseInt(txtSTN.getText());
            float diemthi = Float.parseFloat(txtDiemThi.getText());
            SaveDiem(new Subject("",ten,3,tx1,tx2,diemthi,stn,id_user));
            JOptionPane.showMessageDialog(null, "Lưu thành công");
        }
    }//GEN-LAST:event_btnLuuDiemMouseClicked

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDangKy;
    private javax.swing.JButton BtnDangNhap;
    private javax.swing.JPanel DiemHocPhan;
    private javax.swing.JPanel DiemThi;
    private javax.swing.JPanel Index;
    private javax.swing.JPanel Logo;
    private javax.swing.JPanel Logout;
    private javax.swing.JPanel MenuSideBar;
    private javax.swing.JPanel NhapDiem;
    private javax.swing.JPanel TaiKhoan;
    private javax.swing.JPanel View;
    private javax.swing.JPanel ViewDHP;
    private javax.swing.JPanel ViewDT;
    private javax.swing.JPanel ViewDangKy;
    private javax.swing.JPanel ViewDangNhap;
    private javax.swing.JPanel ViewHome;
    private javax.swing.JPanel ViewNhapDiem;
    private javax.swing.JPanel ViewTaiKhoan;
    private javax.swing.JButton btn;
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnLuuDiem;
    private javax.swing.JButton btnSuaDiem;
    private javax.swing.JComboBox<String> cbMonHoc;
    private javax.swing.JComboBox<String> cbSinhVien;
    private javax.swing.JComboBox<String> cbVaiTro;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpButton;
    private javax.swing.JPanel jpContentDHP;
    private javax.swing.JPanel jpContentDT;
    private javax.swing.JPanel jpContentTK;
    private javax.swing.JPanel jpDiaChi;
    private javax.swing.JPanel jpEmail;
    private javax.swing.JPanel jpFormDK;
    private javax.swing.JPanel jpFormDN;
    private javax.swing.JPanel jpFormND;
    private javax.swing.JPanel jpID;
    private javax.swing.JPanel jpMK;
    private javax.swing.JPanel jpTen;
    private javax.swing.JPanel jpTitleDK;
    private javax.swing.JPanel jpVaiTro;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lblDHP;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblDiemThi;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblMK;
    private javax.swing.JLabel lblNhapDiem;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblTitleDHP;
    private javax.swing.JLabel lblTitleDN;
    private javax.swing.JLabel lblTitleHome;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JTable tbDiemHP;
    private javax.swing.JTable tbDiemThi;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDiemThi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMK;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtSTN;
    private javax.swing.JTextField txtTX1;
    private javax.swing.JTextField txtTX2;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
