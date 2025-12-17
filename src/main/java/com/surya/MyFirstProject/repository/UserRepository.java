package com.surya.MyFirstProject.repository;

import com.surya.MyFirstProject.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
}
