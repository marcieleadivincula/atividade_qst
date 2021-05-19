import Server.Entity.Usuario;
import Server.Services.UsuarioService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CadastrarTest {
    
    public CadastrarTest() {
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
    public void cadastrarUsuario() {
        UsuarioService service = new UsuarioService();
        Usuario user = new Usuario("admin", "admin", "12345678","Ativo");
        user.setId(service.ultimoUsuarioInserido().getId() + 1);
        service.cadastrarUsuario(user);
        assertEquals(service.ultimoUsuarioInserido().getId(), user.getId());
    }
    
    public void cadastrarUsuarioInvalido() {
        UsuarioService service = new UsuarioService();
        Usuario user = new Usuario("admin", "admin", "012345678910","Ativo");
        user.setId(service.ultimoUsuarioInserido().getId() + 1);
        service.cadastrarUsuario(user);
        assertEquals(service.ultimoUsuarioInserido().getId(), user.getId());
    }
    
    @Test
    public void validaSenha() {
        UsuarioService service = new UsuarioService();
        Usuario user = new Usuario("admin", "admin", "123456","admin");
        service.cadastrarUsuario(user);
        assertEquals(false, service.getLista().contains(user));
    }
}
