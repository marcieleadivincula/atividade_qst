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

       user = userService.ultimoUsuarioInserido();
       user.setLogin("testeXPTO");
       user.setSenha("1234567894");
       user.setNome("teste123");
       userService.alterarUsuario(user);
       
       assertEquals(user.getLogin(), userService.ultimoUsuarioInserido().getLogin());
    }
    
}
