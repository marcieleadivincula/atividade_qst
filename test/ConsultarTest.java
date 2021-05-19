import Server.Entity.Usuario;
import Server.Services.UsuarioService;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConsultarTest {
    
    public ConsultarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void usuarioENomeValidosEClicarEmConsultar(){
        //nome e usuário
        UsuarioService userService = new UsuarioService();

        List<Usuario> result = userService.consultar("teste123", "testeXPTO");
        
        assertEquals(1, result.size());
    }

    @Test
    public void usuarioENomeInvalidosEClicarEmConsultar(){
        UsuarioService userService = new UsuarioService();
 
        List<Usuario> result = userService.consultar("nuncaUsarEsteNomeParaCadastro", "nuncaUsarEsteNomeParaCadastro");
        
        assertEquals(0, result.size());
    }
    
     @Test
    public void usuarioENomeVaziosEClicarEmConsultar(){
        UsuarioService userService = new UsuarioService();
        Integer totalCadastrado = userService.countUsuarios();
        List<Usuario> result = userService.consultar("", "");
        
        assertEquals(totalCadastrado.longValue(), result.size());
    }
    
     @Test
    public void apenasNomeEClicarEmConsultar(){
        UsuarioService userService = new UsuarioService();
 
        List<Usuario> result = userService.consultar("teste123", "");
        
        assertEquals(1, result.size());
    }
    
    @Test
    public void apenasUsuarioEClicarEmConsultar(){
        UsuarioService userService = new UsuarioService();
 
        List<Usuario> result = userService.consultar("", "testeXPTO");
        
        assertEquals(1, result.size());
    }
}
