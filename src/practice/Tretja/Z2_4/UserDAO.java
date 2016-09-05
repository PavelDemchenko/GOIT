package practice.Tretja.Z2_4;

import java.util.Objects;

public class UserDAO implements DAO {
    @Override
    public Objects save (Objects user) {
        System.out.println(user.toString() + "saved");
        return user;
    }

    @Override
    public Objects updare(Objects user) {
        System.out.println(user.toString() + "updated");
        return user;
    }

    @Override
    public boolean delete(Objects user) {
        System.out.println(user.toString() + "deleted");
        return true;
    }

    @Override
    public Object find(long id) {
        User user = new User("Roma");
        user.setId(id);
        System.out.println(user.toString() + "found");
        return user;
    }
}
