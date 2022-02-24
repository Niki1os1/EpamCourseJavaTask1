import controllers.BouquetController;
import models.*;
import views.BouquetView;

public class Test {
    public static void main(String[] args) {
        Rose rose = new Rose(15, 3);
        Peony peony = new Peony(10, 2);
        Chamomile chamomile = new Chamomile(8, 1);

        Ribbon ribbon = new Ribbon(15);
        Wrapping wrapping = new Wrapping(10, 10);

        Bouquet bouquet = new Bouquet();

        BouquetView bouquetView = new BouquetView();

        BouquetController bouquetController = new BouquetController(bouquet, bouquetView);

        bouquetController.addFlower(rose).addFlower(peony).addFlower(chamomile);
        bouquetController.addAccessory(ribbon).addAccessory(wrapping);
        bouquetController.sortedFlowerByFreshnessLevel();
        bouquetController.updateView();
        bouquetController.searchFlowersByRangeStalkLength(1, 10);
    }
}