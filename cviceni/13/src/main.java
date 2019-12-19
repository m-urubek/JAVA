import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class main {
    private JTextArea taChat;
    private JTextField tfMessage;
    private JTextField tfNickanme;
    private JButton bntSend;
    private JPanel panel1;
    private InetAddress serverIP;
    private static final int serverPort = 55555;

    public main() {
        boolean connected = false;
        taChat.append("Attempting to find the server");
        while (!connected) {
            try {
                serverIP = InetAddress.getByName("localhost");
                connected = true;
                taChat.append("\nServer found");
            } catch (Exception ex) {
                connected = false;
                taChat.append("\nServer not found, retrying");
            }
        }

        bntSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                sendMessage();
            }
        });
        taChat.addComponentListener(new ComponentAdapter() {
        });
        tfMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                sendMessage();
            }
        });
    }

    private void sendMessage() {
        if (tfMessage.getText().isEmpty() || tfMessage.getText().isBlank() || tfNickanme.getText().isEmpty() || tfNickanme.getText().isBlank())
            return;
        tfNickanme.setEditable(false);
        String message = tfNickanme.getText() + ": " + tfMessage.getText();
        tfMessage.setText("");
        tfMessage.requestFocus();
        try {
            Socket socket = new Socket(serverIP, serverPort);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message);
            oos.flush();
            oos.close();
            taChat.append("\n"+message);
        } catch (Exception ex) {
            taChat.append("\nNepodarilo se odeslat zpravu: ");
            taChat.append(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("main");
        frame.setContentPane(new main().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
