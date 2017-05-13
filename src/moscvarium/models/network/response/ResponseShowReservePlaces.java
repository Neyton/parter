package moscvarium.models.network.response;

import java.math.BigDecimal;

/**
 * Created by xTazy on 19.04.2017.
 */
public class ResponseShowReservePlaces extends ResponseError {
  public long SesssionTime;//кол-во секунд до завершения сессии
  public Place[] Places;//Список мест из запроса
  public int ReserveError;//ReserveError - Флаг наличия ошибки в резервировании. 0 - ошибки нет.

  public class Place {
    public long ShowId;//Id шоу, из запроса
    public long Place;//Id места в зале, из запроса
    public BigDecimal Price;//Стоимость в рублях за данное место
    public int Result;//Статус резерва, 1 - Успешно, другой статус - Ошибка.
    public String ResultMessage;//Сообщение объясняющее статус
  }
}
