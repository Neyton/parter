package moscvarium.models.app;

import moscvarium.models.network.response.ResponseShowPlaces;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

/**
 * Created by xTazy on 19.04.2017.
 */
public class MoscvariumAvailPlace {
  private final long placeId;//Id места
  @NotNull
  private final BigDecimal price;//Стоимость за место

  public MoscvariumAvailPlace(@NotNull ResponseShowPlaces.Place place, @NotNull ResponseShowPlaces.Tariff tariff) {
    this.placeId = place.Id;
    this.price = tariff.Price;
  }

  public long getPlaceId() {
    return placeId;
  }

  @NotNull
  public BigDecimal getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "MoscvariumAvailPlace{" +
        "placeId=" + placeId +
        ", price=" + price +
        '}';
  }
}
