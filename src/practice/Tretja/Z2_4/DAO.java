package practice.Tretja.Z2_4;

import java.util.Objects;

public interface DAO {

    Object save (Objects objects);

    Objects updare (Objects objects);

    boolean delete (Objects objects);

    Objects find (long id);
}
