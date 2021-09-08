
import com.mycompany.exercicio1.AbstractCensurador;
import com.mycompany.exercicio1.AppleCensurador;
import com.mycompany.exercicio1.Cliente;
import com.mycompany.exercicio1.IBMCensurador;


public class Main {
    
    public static void main(String args[]) {
        Cliente cliente = new Cliente();
        
        AbstractCensurador cApple = new AppleCensurador();
        AbstractCensurador cIBM = new IBMCensurador();
        
        cApple.setProximo(cIBM);
        cliente.setPrimeiroCensurador(cApple);
        
        System.out.println(cliente.censurar("A Apple está em processo de compra da IBM e do Facebook"));
    }
    
}
