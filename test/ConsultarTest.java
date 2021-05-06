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
        Usuario userToFind = new Usuario("admin", "admin", "12345678", "admin"); 
        UsuarioService userService = new UsuarioService();
        userService.cadastrarUsuario(userToFind);

        List<Usuario> result = userService.consultar("admin", "admin");
        result.contains(userToFind);
        
        assertEquals(true, result.contains(userToFind));
    }

    @Test
    public void usuarioENomeInvalidosEClicarEmConsultar(){
        Usuario userToFind = new Usuario("admin", "admin", "12345678", "admin"); 
        UsuarioService userService = new UsuarioService();
        userService.cadastrarUsuario(userToFind);
 
        List<Usuario> result = userService.consultar("juca", "juca");
        result.contains(userToFind);
        
        assertEquals(false, result.contains(userToFind));
    }
    
     @Test
    public void usuarioENomeVaziosEClicarEmConsultar(){
        Usuario userToFind = new Usuario("admin", "admin", "12345678","admin"); 
        UsuarioService userService = new UsuarioService();
        userService.cadastrarUsuario(userToFind);
 
        List<Usuario> result = userService.consultar("", "");
        result.contains(userToFind);
        
        assertEquals(true, result.contains(userToFind));
    }
    
     @Test
    public void apenasNomeEClicarEmConsultar(){
        Usuario userToFind = new Usuario("admin", "admin", "12345678","admin"); 
        UsuarioService userService = new UsuarioService();
        userService.cadastrarUsuario(userToFind);
 
        List<Usuario> result = userService.consultar("admin", "");
        result.contains(userToFind);
        
        assertEquals(true, result.contains(userToFind));
    }
    
    @Test
    public void apenasUsuarioEClicarEmConsultar(){
        Usuario userToFind = new Usuario("admin", "admin", "12345678","admin"); 
        UsuarioService userService = new UsuarioService();
        userService.cadastrarUsuario(userToFind);
 
        List<Usuario> result = userService.consultar("", "admin");
        result.contains(userToFind);
        
        assertEquals(true, result.contains(userToFind));
    }
}
