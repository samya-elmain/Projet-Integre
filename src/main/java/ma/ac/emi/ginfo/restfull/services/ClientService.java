package ma.ac.emi.ginfo.restfull.services;

import ma.ac.emi.ginfo.restfull.entities.Client;
import ma.ac.emi.ginfo.restfull.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
    public Client addClient(Client newCl){
        return clientRepository.save(newCl);
    }
}
