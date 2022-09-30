package kodlama.io.carRentaI.dataAcces;

import kodlama.io.carRentaI.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarDao extends JpaRepository<Brand, Integer> {


    List<CarDao> findAll(int id);
    List<CarDao> findById(int id);
}
