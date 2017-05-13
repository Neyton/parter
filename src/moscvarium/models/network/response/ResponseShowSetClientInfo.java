package moscvarium.models.network.response;

import java.math.BigDecimal;

/**
 * Created by xTazy on 26.04.2017.
 */
public class ResponseShowSetClientInfo extends ResponseError {
  public static final int SUCCESS = 1;//запрос прошёл успешно.

  public long SesssionTime;//кол-во секунд до завершения сессии
  public String SessionCode;//идентификатор резерва билетов
  public BigDecimal TicketPrices;//Суммарная стоимость в рублях выбранных билетов для данного шоу
  public int Result;//Флаг наличия ошибки в выполнении запроса. 1 - запрос прошёл успешно.
}
