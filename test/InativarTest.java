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
        UsuarioService service = new UsuarioService();
        Integer id = service.ultimoUsuarioInserido().getId();
        service.inativarUsuario(id);
        assertEquals(service.getUsuarioByCodigo(id).getAtivo(), "Inativo");
    }
    
    
}
