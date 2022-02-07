import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    Application testApp = new Application();
    List<String> productsTest = new ArrayList<>(List.of("product1", "product2"));
    List<Float> productPricesTest = new ArrayList<>(List.of(1f,2f));
    List<String> productSoldTest = new ArrayList<>(List.of("product1","product1","product2","product2"));
    List<Float> soldPricesTest = new ArrayList<>(List.of(1f,2f,1f,2f));


    @Test
    void canAppGetProductsPricesAndCompareThemWithSetPrices() {
        assertEquals(2, testApp.priceCheck(productsTest,productPricesTest,productSoldTest,soldPricesTest));
    }


}