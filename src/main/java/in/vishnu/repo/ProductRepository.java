package in.vishnu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vishnu.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
