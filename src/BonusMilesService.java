public class BonusMilesService {
    public int calculate(int price) {
        int priceMile = 20;  //стоимость одной мили
        int bonusMiles = (price / priceMile);
        return bonusMiles;
    }
}