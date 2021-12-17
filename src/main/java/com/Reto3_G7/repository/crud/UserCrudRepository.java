package com.Reto3_G7.repository.crud;

import com.Reto3_G7.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Diego
 */
public interface UserCrudRepository extends MongoRepository<User,Integer> {
    //aqui defino consultas adicionales que no estan predeterminadas en la Interfaz "MongoRepository"
    
    public Optional <User> findByEmail(String email);
    
    public Optional<User> findByEmailAndPassword(String email, String password);
    
    //Para seleccionar el usuario con el id maximo
    //db.users.find().limit(1).sort({$natural:-1}) en mongo db
    Optional<User> findTopByOrderByIdDesc();
    
    //Reto 5: Listado de cumpleaños del mes
    List<User> findByMonthBirthtDay(String month);
}
