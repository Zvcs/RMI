import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

public class Servidor {
    public static void main(String[] args){
        try{
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("Calculadora", new rmi());
            JOptionPane.showMessageDialog(null, "Servidor conectado!");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Servidor não conectado" + e);
        }
    }
}
