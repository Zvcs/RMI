import java.rmi.Naming;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cliente{
    public static void main(String[] args){
        Scanner ac = new Scanner (System.in);
        int x, y, x1, y1;
        try{
            Calculadora d = (Calculadora)Naming.lookup("//localhost/Calculadora");
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeira coordenada do primeiro ponto: "));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo coordenada do primeiro ponto: "));
            x1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número do segundo ponto: "));
            y1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número do segundo ponto: "));
            ac.close();
            JOptionPane.showMessageDialog(null, "A distancia euclidiana e: "+ d.dist(x, y, x1, y1));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Servidor não conectado " + e);
        }
    }
}