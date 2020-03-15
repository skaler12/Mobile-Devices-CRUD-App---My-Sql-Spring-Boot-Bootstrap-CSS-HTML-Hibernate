package pl.itpoznanski.mobilephonecrudapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.itpoznanski.mobilephonecrudapp.entity.Device;
import pl.itpoznanski.mobilephonecrudapp.entity.User;
import pl.itpoznanski.mobilephonecrudapp.repository.DeviceRepository;
import pl.itpoznanski.mobilephonecrudapp.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Iterable<User> findAll(){return userRepository.findAll();}
    public User save(User user){return  userRepository.save(user);}
    public Optional<User> findById(Integer id){return userRepository.findById(id);}
    public void delete(User user){userRepository.delete(user);}
}
