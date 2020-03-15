package pl.itpoznanski.mobilephonecrudapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.itpoznanski.mobilephonecrudapp.entity.Device;

@Repository
public interface DeviceRepository extends CrudRepository<Device,Integer> {
}
