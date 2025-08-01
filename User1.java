import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class User1 implements ActionListener,Runnable {

    JTextField text;
    static JPanel a1;
    static Box vertical = Box.createVerticalBox();
    static DataOutputStream dout;
    static JFrame f = new JFrame();
    BufferedReader reader;
    BufferedWriter writer;
    String name = "Itachi Uchiha";

    User1() {

        f.setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(0, 0, 0));
        p1.setBounds(0, 0, 450, 70);
        p1.setLayout(null);
        f.add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3 (1).png"));
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3);
        back.setBounds(5, 20, 25, 25);
        p1.add(back);

        back.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae) {
                System.exit(0);
            }
        });

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/wallpaper.jpeg"));
        Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6);
        profile.setBounds(40, 10, 50, 50);
        p1.add(profile);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
        Image i8 = i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel video = new JLabel(i9);
        video.setBounds(300, 20, 30, 30);
        p1.add(video);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
        Image i11 = i10.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel phone = new JLabel(i12);
        phone.setBounds(360, 20, 35, 30);
        p1.add(phone);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
        Image i14 = i13.getImage().getScaledInstance(10, 25, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel threeicon = new JLabel(i15);
        threeicon.setBounds(420, 20, 10, 25);
        p1.add(threeicon);

        JLabel name = new JLabel("The Leaf Village");
        name.setBounds(110, 15, 150, 20);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p1.add(name);

        JLabel status = new JLabel("Itachi,Obito,Naruto,Sasuke,Kakashi");
        status.setBounds(110, 35, 160, 18);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        p1.add(status);

        a1 = new JPanel(){
            ImageIcon background = new ImageIcon(ClassLoader.getSystemResource("icons/background.jpg"));
            Image img = background.getImage();

        protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
        };
        
        a1.setLayout(new BorderLayout());
        a1.setBounds(5, 75, 440, 570);
        f.add(a1);
        vertical.setOpaque(false);

        a1.add(vertical, BorderLayout.PAGE_START); 

        text = new JTextField();
        text.setBounds(5, 655, 310, 40);
        text.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        f.add(text);

        JButton send = new JButton("Send");
        send.setBounds(320, 655, 123, 40);
        send.setBackground(new Color(30, 30, 30));
        send.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        send.setForeground(Color.WHITE);
        send.addActionListener(this);
        f.add(send);

        f.setSize(450, 700);
        f.setLocation(20, 50);
        f.setUndecorated(true);
        f.getContentPane().setBackground(Color.GRAY);
        f.setVisible(true);

        try{
            Socket socket = new Socket("localhost",2003);
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (writer == null) {
                JOptionPane.showMessageDialog(f, "No client connected yet!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String out = "<html><p>" +name+ "</p><p>"+ text.getText() + "</p></html>";
            JPanel p2 = formatLabel(out);

            JPanel right = new JPanel(new BorderLayout());
            //right.setBackground(Color.WHITE);
            right.setOpaque(false);
            right.add(p2, BorderLayout.LINE_END);
            vertical.add(right);
            vertical.add(Box.createVerticalStrut(15));
            
            try{
                writer.write(out);
                writer.write("\r\n");
                writer.flush();
            }catch(Exception e){
                e.printStackTrace();
            }

            text.setText("");

            f.repaint();
            f.invalidate();
            f.validate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static JPanel formatLabel(String out) {
        JPanel panel = new JPanel();
        //panel.setBackground(Color.WHITE);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setOpaque(false);
        JLabel output = new JLabel("<html><p style=\"width: 150px\">" + out + "</p></html>");
        output.setFont(new Font("Tahoma", Font.PLAIN, 16));
        output.setBackground(new Color(37, 211, 102));
        output.setOpaque(true);
        output.setBorder(new EmptyBorder(0, 15, 0, 50));

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        JLabel time = new JLabel();
        time.setText(sdf.format(cal.getTime()));
        time.setForeground(Color.WHITE);
        time.setOpaque(false);
        panel.add(time);
        panel.add(output);

        return panel;
    }
    public void run(){
      try{
       String msg = "";
       while(true){
        msg=reader.readLine();
        if(msg.contains(name)) {
            continue;
        }
        JPanel panel = formatLabel(msg);

        JPanel left = new JPanel(new BorderLayout());
        //left.setBackground(Color.WHITE);
        left.setOpaque(false);
        left.add(panel,BorderLayout.LINE_START);
        vertical.add(left);

        a1.add(vertical,BorderLayout.PAGE_START);

        f.repaint();
        f.invalidate();
        f.validate();
       }
      }catch(Exception e){
        e.printStackTrace();
      }
    }

    public static void main(String[] args) {
    try {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    } catch (Exception e) {
        e.printStackTrace();
    }

    User1 one = new User1();
    Thread t1 = new Thread(one);
    t1.start();

    }
}
