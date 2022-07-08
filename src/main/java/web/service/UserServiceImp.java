package web.service;

import web.dao.UserDao;
import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao dao;

    @javax.transaction.Transactional
    @Override
    public List<User> allUsers() {
        return dao.AllUsers();
    }

    @javax.transaction.Transactional
    @Override
    public void create(User user) {
        dao.create(user);
    }

    @javax.transaction.Transactional
    @Override
    public void remove(User user) {
        dao.remove(user);
    }

    @javax.transaction.Transactional
    @Override
    public void update(User user) { dao.update(user); }

    @Transactional
    @Override
    public User getUserById(Long id) {
        return dao.getUsetById(id);
    }
}
