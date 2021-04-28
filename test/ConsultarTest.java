/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Server.Entity.Usuario;
import Server.Services.UsuarioService;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marci
 */
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void usuarioESenhaValidosEClicarEmConsultar(){
        //nome e usuário
        Usuario userToFind = new Usuario("admin", "admin", "admin"); 
        UsuarioService userService = new UsuarioService();
        userService.cadastrarUsuario(userToFind);

        List<Usuario> result = userService.consultar("admin", "admin");
        result.contains(userToFind);
        
        assertEquals(true, result.contains(userToFind));
        //System.out.println("usuarioESenhaValidosEClicarEmConsultar: " + result);
    }

    @Test
    public void usuarioESenhaInvalidosEClicarEmConsultar(){
        Usuario userToFind = new Usuario("admin", "admin", "admin"); 
        UsuarioService userService = new UsuarioService();
        userService.cadastrarUsuario(userToFind);
 
        List<Usuario> result = userService.consultar("juca", "juca");
        result.contains(userToFind);
        
        assertEquals(false, result.contains(userToFind));
        //System.out.println("usuarioESenhaInvalidosEClicarEmConsultar: " + result);
    }
    
     @Test
    public void usuarioESenhaVaziosEClicarEmConsultar(){
        Usuario userToFind = new Usuario("admin", "admin", "admin"); 
        UsuarioService userService = new UsuarioService();
        userService.cadastrarUsuario(userToFind);
 
        List<Usuario> result = userService.consultar("", "");
        result.contains(userToFind);
        
        assertEquals(true, result.contains(userToFind));
        //System.out.println("usuarioESenhaVaziosEClicarEmConsultar: " + result);
    }
    
     @Test
    public void apenasNomeEClicarEmConsultar(){
        Usuario userToFind = new Usuario("admin", "admin", "admin"); 
        UsuarioService userService = new UsuarioService();
        userService.cadastrarUsuario(userToFind);
 
        List<Usuario> result = userService.consultar("admin", "");
        result.contains(userToFind);
        
        assertEquals(true, result.contains(userToFind));
        //System.out.println("apenasNomeEClicarEmConsultar: " + result);
    }
    
    @Test
    public void apenasUsuarioEClicarEmConsultar(){
        Usuario userToFind = new Usuario("admin", "admin", "admin"); 
        UsuarioService userService = new UsuarioService();
        userService.cadastrarUsuario(userToFind);
 
        List<Usuario> result = userService.consultar("", "admin");
        result.contains(userToFind);
        
        assertEquals(true, result.contains(userToFind));
        //System.out.println("apenasUsuarioEClicarEmConsultar: " + result);
    }
}
