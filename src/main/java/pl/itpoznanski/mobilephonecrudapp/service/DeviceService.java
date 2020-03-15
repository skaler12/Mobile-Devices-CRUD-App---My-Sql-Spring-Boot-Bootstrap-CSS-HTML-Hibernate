package pl.itpoznanski.mobilephonecrudapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.itpoznanski.mobilephonecrudapp.entity.Device;
import pl.itpoznanski.mobilephonecrudapp.repository.DeviceRepository;

import java.util.Optional;

@Service
public class DeviceService {
    @Autowired
    DeviceRepository deviceRepository;

    public Iterable<Device> findAll(){return deviceRepository.findAll();}
    public Device save(Device device){return  deviceRepository.save(device);}
    public Optional <Device>findById(Integer id){return deviceRepository.findById(id);}
    public void delete(Device device){deviceRepository.delete(device);}
}
