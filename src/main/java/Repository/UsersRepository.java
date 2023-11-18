package Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Model.Users;
public interface UsersRepository extends MongoRepository<Users, String> {
}
