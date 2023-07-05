import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notebook {
    private String model;
    private String brand;
    private String color;
    private String platform;
    private double price;
    private int year;
}
