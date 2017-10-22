
package lap.trinh.giao.dien;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tinhtoan extends Applet implements ActionListener {
    Label lb1 = new Label("X: ");
    Label lb2 = new Label("Y: ");
    Label lb3 = new Label("Ket qua: ");
    TextField txtX = new TextField("4",30);
    TextField txtY = new TextField("5",30);
    TextField txtKQ = new TextField("",30);
    Button btnTong = new Button("Tong");
    Button btnHieu = new Button("Hieu");
    Button btnTich = new Button("Tich");
    Button btnThuong = new Button("thuong");
    public void init(){
        btnTong.addActionListener(this);
        btnHieu.addActionListener(this);
        btnTich.addActionListener(this);
        btnThuong.addActionListener(this);
        txtKQ.setEditable(false);
        add(lb1);add(txtX);
        add(lb2);add(txtY);
        add(lb3);add(txtKQ);
        add(btnTong);add(btnHieu);
        add(btnTich);add(btnThuong);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        float xx,yy,kq;
        xx = Float.parseFloat(txtX.getText());
        yy = Float.parseFloat(txtY.getText());
        if(e.getSource()==btnTong){
            kq= xx+yy;
            txtKQ.setText(String.valueOf(kq));
        }
        if(e.getSource()== btnHieu){
            kq=xx-yy;
            txtKQ.setText(String.valueOf(kq));
        }
        if(e.getSource()== btnTich){
            kq = xx*yy;
            txtKQ.setText(String.valueOf(kq));
        }
        if(e.getSource()== btnThuong){
            if(yy!=0){
                kq=xx/yy;
                txtKQ.setText(String.valueOf(kq));
            }else{
                txtKQ.setText("Khong chia duoc cho 0!");
            }
        }
    }
}
