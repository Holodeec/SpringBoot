package com.example.demo.dao;

import com.example.demo.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Repository
@Component
public class UserDaoImpl implements UserDao {
    @PersistenceContext(unitName = "entityManagerFactory")
    private EntityManager entityManager;

    @Override
    public List<User> getUserList() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void removeUser(int id) {
        User user = getUserById(id);
        entityManager.remove(user);
    }

    @Override
    public User getUserById(int id) {

        return entityManager.find(User.class, id);

    }

    @Override
    public void update(int id, User user) {
        User user1 = getUserById(id);
        user1.setName(user.getName());
        user1.setLastName(user.getLastName());

    }

}
