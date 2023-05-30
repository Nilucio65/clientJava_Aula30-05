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
        String[] names = {"Luiz", "Maria", "José", "Stefanio", "Marcio", "Louiz", "Gustavo", "Matheus", };

        List<Client> clients = new ArrayList<Client>();
        int i = 0;
        for(String name: names){

            Client obj = new Client(i, name, name + "@gmail.com");
            clients.add(obj);
            i++;
        }
        return clients;
    }
}
