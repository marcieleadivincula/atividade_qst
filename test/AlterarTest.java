/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Server.Entity.Usuario;
import Server.Services.UsuarioService;
import java.util.ArrayList;
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void preencherCamposValidosEOk(){
       //user e código
       Usuario user = new Usuario();
       UsuarioService userService = new UsuarioService(); 
       userService.cadastrarUsuario(new Usuario("admin", "admin", "admin","admin"));
       userService.cadastrarUsuario(new Usuario("maria", "maria", "maria", "maria"));
       userService.cadastrarUsuario(new Usuario("juca", "juca", "juca", "juca"));
       
       user = new Usuario("joao", "joao", "joao","joao");
       userService.alterarUsuario(user, 2);
       userService.getUsuarioByCodigo(2);
       
       assertEquals(user, userService.getUsuarioByCodigo(2));
    }
    
    
}
