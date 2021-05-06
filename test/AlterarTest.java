import Server.Entity.Usuario;
import Server.Services.UsuarioService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlterarTest {
    
    public AlterarTest() {
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
    public void preencherCamposValidosEOk(){
       //user e código
       Usuario user;
       UsuarioService userService = new UsuarioService(); 
       userService.cadastrarUsuario(new Usuario("admin", "admin", "12345678","admin"));
       userService.cadastrarUsuario(new Usuario("maria", "maria", "12345678", "maria"));
       userService.cadastrarUsuario(new Usuario("juca", "juca", "12345678", "juca"));
       
       user = new Usuario("joao", "joao", "joao","joao");
       userService.alterarUsuario(user, 2);
       
       assertEquals(user, userService.getUsuarioByCodigo(2));
    }
    
}
