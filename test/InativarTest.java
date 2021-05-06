import Server.Entity.Usuario;
import Server.Services.UsuarioService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class InativarTest {
    
    public InativarTest() {
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
    public void inativarUsuario() {
        Integer codigo = 1;
        UsuarioService service = new UsuarioService();
        service.cadastrarUsuario(new Usuario("admin", "admin", "12345678","admin"));
        service.cadastrarUsuario(new Usuario("maria", "maria", "12345678", "maria"));
        service.cadastrarUsuario(new Usuario("juca", "juca", "12345678", "juca"));
        service.inativarUsuario(codigo);
        assertEquals(service.getUsuarioByCodigo(codigo).getAtivo(), "Inativo");
    }
    
    
}
