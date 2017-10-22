
package lap.trinh.giao.dien;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoidap extends Applet implements ActionListener {
    Label lb1 = new Label("Ten: ");
    Label lb2 = new Label("Tuoi: ");
    Label lb4 = new Label("Loi chao: ");
    TextField txtTE = new TextField("",30);
    TextField txtTU = new TextField("",30);
    TextField txtC = new TextField("",30);
    Button btnVN = new Button("Viet Nam");
    Button btnA = new Button("Anh");
    Button btnP = new Button("Phap");
    Button btnLai = new Button("Lai");
    public void init(){
        btnVN.addActionListener(this);
        btnA.addActionListener(this);
        btnP.addActionListener(this);
        btnLai.addActionListener(this);
        txtC.setEditable(false);
        add(lb1);add(txtTE);
        add(lb2);add(txtTU);
        add(lb4);add(txtC);
        add(btnVN);add(btnA);
        add(btnP);add(btnLai);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String Ten;
        int Tuoi;
        String Chao;
        Ten = txtTE.getText();
        Tuoi = (int) Float.parseFloat(txtTU.getText());
        Chao = txtC.getText();
        if(e.getSource()==btnVN){
            txtC.setText("Xin chao! ");
        }
        if(e.getSource()==btnA){
            txtC.setText("Hello");
        }
        if(e.getSource()==btnP){
            txtC.setText("Boujour");
        }
        if(e.getSource()== btnLai){
            txtTE.setText("");
            txtTU.setText("");
            txtC.setText("");
        }
    }
}
