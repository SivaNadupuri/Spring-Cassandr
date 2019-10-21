package se.ikea.spring.cassandra.api.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import se.ikea.spring.cassandra.api.model.User;

public interface UserRepository extends CassandraRepository<User, Integer> {

}
