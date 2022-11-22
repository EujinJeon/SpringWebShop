package MyShop.Mujinjang.repository;

import MyShop.Mujinjang.domain.item.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemEntity, Long> {


}
