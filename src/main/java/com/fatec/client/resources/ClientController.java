package com.fatec.client.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.client.entities.Client;

@RestController
public class ClientController {
    
    @GetMapping("client")
    public Client getClient(){
        Client objClient = new Client(1, "Luiz", "luiz@gmail.com");
        return objClient;
    }

    @GetMapping("clients")
    public List<Client> getClients(){
        List<Client> clients = new ArrayList<Client>();
        Client client1 = new Client(1, "Luiz", "luiz@gmail.com");
        Client client2 = new Client(2, "Maria", "maria@gmail.com");
        clients.add(client1);
        clients.add(client2);
        return clients;
    }
}
