import java.util.List;

public class Application {

    public int priceCheck(List<String> products,List<Float> productPrices,
                          List<String> productsSold,List<Float> soldPrices) {
        int countOfErrors = 0;

        for(int i = 0; i < productsSold.size(); i++){
            int productsNameAndIndex = products.indexOf(productsSold.get(i));
            if (soldPrices.get(i).equals(productPrices.get(productsNameAndIndex))) {
                countOfErrors++;
            }
        }
        return countOfErrors;
    }

}
