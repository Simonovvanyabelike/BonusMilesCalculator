public class BonusMilesService {
    public int calculate(int price) {
        int miles = price / 20; // расчёт миль: 1 миля за каждые 20 рублей
        return miles;
    }
}
