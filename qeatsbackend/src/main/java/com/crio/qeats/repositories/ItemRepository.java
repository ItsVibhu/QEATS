
package com.crio.qeats.repositories;

import com.crio.qeats.models.ItemEntity;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ItemRepository extends MongoRepository<ItemEntity, String> {
  
  //@Query("{'name':{'$regex':'?0','$options':'i'}}") fields="{ 'firstname' : 1, 'lastname' : 1}"
  @Query("{'name':{'$regex':'?0','$options':'i'}}, fields={'itemId' : 1}") 
  List<ItemEntity> findItemEntityByName(String searchString);

  @Query("{ 'attributes' : {$elemMatch: {$all : [?0], $regex: ?0, $options: 'i'}}}")
  List<ItemEntity> findItemEntityByAttributes(String searchString);

  @Query("{'name': {$regex: '^?0$', $options: 'i'}}")
  Optional<List<ItemEntity>> findItemsByNameExact(String itemName);

  @Query("{'name': {$regex: '.*?0.*', $options: 'i'}}")
  Optional<List<ItemEntity>> findItemsByNameInexact(String itemRegex);

}
