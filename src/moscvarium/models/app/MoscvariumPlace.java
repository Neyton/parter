package moscvarium.models.app;

import moscvarium.models.network.response.ResponseShowPlaces;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;

/**
 * Created by xTazy on 19.04.2017.
 */
public class MoscvariumPlace {
  private final long placeId;//Id места
  @NotNull
  private final String sectorName;//Название сектора
  @NotNull
  private final String rowNumber;//№ Ряда
  @NotNull
  private final String rowPlaceNumber;//№ Места в ряду
  @Nullable
  private final BigDecimal price;//Стоимость за место, null - если место недоступно к продаже

  public MoscvariumPlace(@NotNull ResponseShowPlaces.Place place, @NotNull ResponseShowPlaces.Sector sector, @NotNull ResponseShowPlaces.Tariff tariff, @NotNull ResponseShowPlaces.EStatus status) {
    this.placeId = place.Id;
    this.sectorName = sector.Name;
    this.rowNumber = place.RowNumber;
    this.rowPlaceNumber = place.RowPlaceNumber;
    this.price = status == ResponseShowPlaces.EStatus.FREE ? tariff.Price : null;
  }

  public long getPlaceId() {
    return placeId;
  }

  @NotNull
  public String getSectorName() {
    return sectorName;
  }

  @NotNull
  public String getRowNumber() {
    return rowNumber;
  }

  @NotNull
  public String getRowPlaceNumber() {
    return rowPlaceNumber;
  }

  @Nullable
  public BigDecimal getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "MoscvariumPlace{" +
        "placeId=" + placeId +
        ", sectorName=" + sectorName +
        ", rowNumber='" + rowNumber + '\'' +
        ", rowPlaceNumber='" + rowPlaceNumber + '\'' +
        ", price=" + price +
        '}';
  }
}
