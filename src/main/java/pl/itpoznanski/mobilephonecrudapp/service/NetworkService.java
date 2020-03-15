package pl.itpoznanski.mobilephonecrudapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.itpoznanski.mobilephonecrudapp.entity.Device;
import pl.itpoznanski.mobilephonecrudapp.entity.Network;
import pl.itpoznanski.mobilephonecrudapp.repository.DeviceRepository;
import pl.itpoznanski.mobilephonecrudapp.repository.NetworkRepository;

import java.util.Optional;

@Service
public class NetworkService {

    @Autowired
    NetworkRepository networkRepository;

    public Iterable<Network> findAll(){return networkRepository.findAll();}
    public Network save(Network network){return  networkRepository.save(network);}
    public Optional<Network> findById(Integer id){return networkRepository.findById(id);}
    public void delete(Network network){networkRepository.delete(network);}
}
