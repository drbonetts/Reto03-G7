package com.Reto3_G7.repository.crud;

import com.Reto3_G7.model.Accessory;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Diego
 */
public interface AccessoryCrudRepository extends MongoRepository<Accessory, String> {
    //Reto 5
    public List<Accessory> findByPriceLessThanEqual(double precio);
    
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Accessory> findByDescriptionLike(String description);
}
