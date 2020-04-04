package lect_ex19.shop;

import java.time.LocalDateTime;
import java.util.List;

public class Receipt {
    int id;
    LocalDateTime localDate;
    int casseNo;
    List<Item> items;
    String totalSum;
    String change;

    @Override
    public String toString() {
        return "\n" + "RECEIPT" +"\n" +
                "**" + "\n" +
                "id=" + id +"\n" +
                "localDate=" + localDate +"\n" +
                "casseNo=" + casseNo +"\n" +
                "items=" + items +"\n" +
                "totalSum=" + totalSum +"\n" +
                "change=" + change + "\n" +
                "** " + "\n";
    }

    public Receipt(int id, LocalDateTime localDate, int casseNo, List<Item> items, String totalSum, String change) {
        this.id = id;
        this.localDate = localDate;
        this.casseNo = casseNo;
        this.items = items;
        this.totalSum = totalSum;
        this.change = change;
    }
}
