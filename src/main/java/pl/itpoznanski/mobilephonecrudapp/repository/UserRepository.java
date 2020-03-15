package pl.itpoznanski.mobilephonecrudapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.itpoznanski.mobilephonecrudapp.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
}
