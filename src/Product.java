import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String title;
    private String manufacture;
    private double weight;
    private double price;
    private int classification;
}
