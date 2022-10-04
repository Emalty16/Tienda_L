
package com.Tienda_L.controller;

import com.Tienda_L.dao.ClienteDao;
import com.Tienda_L.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {
    
    
    @Autowired
    private ClienteDao clienteDao;
    
    @RequestMapping("/")
    public String inicio(Model model){        
        log.info("Ahora se usa arquitectura MVC");
        
        Cliente cliente = new Cliente("Edgar", "Madrigal Borge", "messi4ever@gmail.com", "8877-1535");
        /*Cliente cliente2 = new Cliente("Pedro", "Martinez Araya", "loca55@gmail.com", "8627-1534");
        var clientes = Arrays.asList(cliente, cliente2);
        */
        var clientes = clienteDao.findAll();
        
        model.addAttribute("cliente", cliente);
        
        
        model.addAttribute("clientes",clientes);
        
        return "index";
    }
    
}
