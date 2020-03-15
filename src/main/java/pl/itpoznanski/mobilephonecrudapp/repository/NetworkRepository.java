package pl.itpoznanski.mobilephonecrudapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.itpoznanski.mobilephonecrudapp.entity.Network;

@Repository
public interface NetworkRepository extends CrudRepository<Network,Integer> {
}
