package kodlama.io.carRentaI.dataAcces;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarDao extends JpaRepository<CarDao, Integer> {


    List<CarDao> findAll(int id);
    List<CarDao> findById(int id);
}
