package nl.scmm.superelf.services;

import nl.scmm.superelf.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public static List<User> getUsers() {
        List<User> users = new ArrayList<>();
        return users;
    }
}
