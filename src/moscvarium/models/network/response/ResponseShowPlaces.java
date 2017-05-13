package moscvarium.models.network.response;

import org.jetbrains.annotations.Nullable;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by xTazy on 17.04.2017.
 */
public class ResponseShowPlaces extends ResponseError {
  public long SesssionTime;//кол-во секунд до завершения сессии
  public Map<Long, Tariff> Tariffs;//Список тарифов используемых в списке Places
  public Map<Long, PlaceType> PlaceTypes;//Список типов мест используемых в списке Places
  public Map<Long, Sector> Sectors;//Список секторов используемых в списке Places
  public Map<Long, MiniSector> MiniSectors;//Список мини-секторов используемых в списке Places
  public Map<Long, Status> Statuses;//Список статусов мест используемых в списке Places
  public Place Places[];//Список мест в зале для выбранного шоу

  public class Tariff {
    public long Id;//Id тарифа на который ссылаются по TariffId из Places
    public String Name;//Название тарифа
    public BigDecimal Price;//Стоимость за место, т.е. ровно столько стоит одно выбранное место в данном тарифе.
    public String Units;//денежные единицы (на данный момент только рубли)
  }

  public class PlaceType {
    public long Id;//Id типа-мест на который ссылаются по TypeNameId из Places
    public String Name;//Название типа
  }

  public class Sector {
    public long Id;//Id сектора на который ссылаются по SectorId из Places
    public String Name;//Название сектора
  }

  public class MiniSector {
    public long Id;//Id сектора на который ссылаются по MiniSectorId из Places
    public String Number;//Номер сектора
  }

  public class Status {
    public long Id;//Id статуса на который ссылаются по StatusId из Places
    public String Name;//Название статуса
  }

  public class Place {
    public long Id;//Id места
    public long TypeNameId;//Тип места из списка PlaceTypes
    public long SectorId;//Сектор в зале из списка Sectors
    public long MiniSectorId;//Мини-сектор в зале из списка MiniSectors
    public String RowNumber;//№ Ряда
    public String RowPlaceNumber;//№ Места в ряду
    public long TariffId;//Тариф для данного места из списка Tariffs
    public int StatusId;//Статус места из списка Statuses
  }

  public enum EStatus {
    FREE,//1-Свободное место
    PAID,//2-Оплаченное место
    BOOCKED,//3-Забронированное место (покупатель в процессе оформления билета, но еще не оплатил его)
    RESERVED,//4-Зарезервированное место (место недоступно для продажи)
    PASSED_CONTROL;//5-Пройден контроль (покупатель прошел контроль на входе в зал)

    private final int id;

    EStatus() {
      id = ordinal() + 1;
    }

    public int getId() {
      return id;
    }

    @Nullable
    public static EStatus getStatusById(int id) {
      for (EStatus status : EStatus.values()) {
        if (status.getId() == id) return status;
      }
      return null;
    }
  }
}
