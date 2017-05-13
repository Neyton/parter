package moscvarium.models.app;

import moscvarium.models.network.response.ResponseShowSetPayed;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

/**
 * Created by Inventor on 27.04.2017.
 */
public class MoscvariumTicket {
  private final long showId;//Идентификатор шоу
  @NotNull
  private final String barcode;//Код билета
  @NotNull
  private final BigDecimal price;//цена билета

  public MoscvariumTicket(@NotNull ResponseShowSetPayed.Show show, @NotNull ResponseShowSetPayed.Ticket ticket) {
    this.showId = show.Id;
    this.barcode = ticket.TicketCode;
    this.price = ticket.Tariff.Price;
  }

  public long getShowId() {
    return showId;
  }

  @NotNull
  public String getBarcode() {
    return barcode;
  }

  @NotNull
  public BigDecimal getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "MoscvariumTicket{" +
        "showId=" + showId +
        ", barcode='" + barcode + '\'' +
        ", price=" + price +
        '}';
  }
}
