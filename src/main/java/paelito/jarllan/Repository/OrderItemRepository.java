package paelito.jarllan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import paelito.jarllan.Model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
