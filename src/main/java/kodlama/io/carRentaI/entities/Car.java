package kodlama.io.carRentaI.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@AllArgsConstructor
@Table(name = "car")
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    private int brandId;
//    private int colorId;

    @Column(name = "model_year")
    private String modelYear;

    @Column(name = "daily_price")
    private double dailyPrice;

    @Column(name = "description")
    private String description;

}
