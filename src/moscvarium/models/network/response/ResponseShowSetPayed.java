package moscvarium.models.network.response;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by xTazy on 26.04.2017.
 */
public class ResponseShowSetPayed extends ResponseError {
  public Map<Long, Show> Shows;//Список шоу на которые были оплачены билеты
  public int PaymentError;//Статус наличия ошибки при оплате. 0 - Ошибки нет.

  public class Show {
    public long Id;//Идентификатор шоу
    public String Date;//Дата проведения шоу
    public String Time;//Время начала шоу
    public String Length;//Продолжительность шоу
    public String HallSchemeId;//Идентификатор зала
    public String HallName;//Название зала, в котором будет проводится шоу
    public String TypeName;//Тип представления
    public String Comment;//Комментарий к шоу (на случай возможных уведомлений связанных с данным Шоу)
    public Ticket[] Places;//Список билетов оплаченных в данном шоу (в случае ошибки - список пустой)
  }

  public class Ticket {
    public String TicketCode;//Код билета(штрихкод) формат https://ru.wikipedia.org/wiki/Code_128
    public String PlaceTypeName;//Тип места в зале
    public String SectorName;//Название сектора
    public String RowNumber;//№ Ряда
    public String RowPlaceNumber;//№ Места в ряду
    public String BuyerName;//Имя покупателя
    public String BuyerPhone;//Телефон покупателя
    public String BuyerEMail;//E-mail покупателя
    public String MiniSectorName;//Название минисектора
    public String MiniSectorStage;//Название входа
    public Tariff Tariff;//Информация по тарифу для данного места
  }

  public class Tariff {
    public long Id;//Id тарифа на который ссылаются по TariffId из Places
    public String Name;//Название тарифа
    public BigDecimal Price;//Стоимость за место, т.е. ровно столько стоит одно выбранное место в данном тарифе.
    public String Units;//денежные единицы (на данный момент только рубли)
  }
}
