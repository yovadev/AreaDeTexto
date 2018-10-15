
package areadetexto;
import javax.swing.*;

public class AreaDeTexto extends JFrame{
    
    private JTextField campo1;
    private JTextArea campo2;
    private JScrollPane scroll1;
    
    public AreaDeTexto(){
        setLayout(null);
        campo1 = new JTextField();
        campo1.setBounds(10, 10, 200, 30);
        add(campo1);
        
        
        campo2 = new JTextArea();
        /** para agregar scroll en textarea */
        scroll1 = new JScrollPane(campo2);
        scroll1.setBounds(10, 50, 380, 300);
        add(scroll1);
    }


    public static void main(String[] args) {
        AreaDeTexto ventana = new AreaDeTexto();
        ventana.setBounds(0, 0, 540, 400);
        ventana.setVisible(true);
        ventana.setResizable(false);
    }

}
