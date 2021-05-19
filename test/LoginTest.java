import Server.Entity.Usuario;
import Server.Services.UsuarioService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {
    
    public LoginTest() {
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
    public void usuarioESenhaValidos(){
        Usuario user = new Usuario("testeXPTO", "1234567894");
        UsuarioService userService = new UsuarioService();
        boolean expResult = true;
        boolean result = userService.login(user);
        
        assertEquals(expResult, result);
        System.out.println("usuarioESenhaValidos: " + result);
    }
    
    @Test
    public void usuarioESenhaInvalidos() {
        Usuario user = new Usuario("maria", "123");
        UsuarioService userService = new UsuarioService();
        boolean expResult = false;
        boolean result = userService.login(user);

        assertEquals(expResult, result);
        System.out.println("usuarioESenhaInvalidos: " + result);
    }

    @Test
    public void usuarioInvalidoESenhaValido() {
        Usuario user = new Usuario("maria", "admin");
        UsuarioService userService = new UsuarioService();
        boolean expResult = false;
        boolean result = userService.login(user);

        assertEquals(expResult, result);
        System.out.println("usuarioInvalidoESenhaValido: " + result);
    }

    @Test
    public void usuarioValidoESenhaInvalido() {
        Usuario user = new Usuario("admin", "123");
        UsuarioService userService = new UsuarioService();
        boolean expResult = false;
        boolean result = userService.login(user);

        assertEquals(expResult, result);
        System.out.println("usuarioValidoESenhaInvalido: " + result);
    }

    @Test
    public void usuarioESenhaVazios() {
        Usuario user = new Usuario("", "");
        UsuarioService userService = new UsuarioService();
        boolean expResult = false;
        boolean result = userService.login(user);

        assertEquals(expResult, result);
        System.out.println("usuarioESenhaVazios: " + result);
    }

    @Test
    public void apenasUsuarioVazio() {
        Usuario user = new Usuario("", "admin");
        UsuarioService userService = new UsuarioService();
        boolean expResult = false;
        boolean result = userService.login(user);

        assertEquals(expResult, result);
        System.out.println("apenasUsuarioVazio: " + result);
    }

    @Test
    public void apenasSenhaVazia() {
        Usuario user = new Usuario("admin", "");
        UsuarioService userService = new UsuarioService();
        boolean expResult = false;
        boolean result = userService.login(user);

        assertEquals(expResult, result);
        System.out.println("apenasSenhaVazia: " + result);
    }

    @Test
    public void senhaMenosDeOitoCaracteres(){
        Usuario user = new Usuario("juca", "123");
        UsuarioService userService = new UsuarioService();
        boolean expResult = false;
        boolean result = userService.login(user);

        assertEquals(expResult, result);
        System.out.println("senhaMenosDeOitoCaracteres: " + result);
    }

    @Test
    public void senhaMaisDezCaracteres(){
        Usuario user = new Usuario("joana", "12345678901");
        UsuarioService userService = new UsuarioService();
        boolean expResult = false;
        boolean result = userService.login(user);

        assertEquals(expResult, result);
        System.out.println("senhaMaisDezCaracteres: " + result);
    } 
}
