package moscvarium.models.network.response;

/**
 * Created by xTazy on 26.04.2017.
 */
public class ResponseShowUnReservePlaces extends ResponseError {
  public long SesssionTime;//кол-во секунд до завершения сессии
  public Place[] Places;//Список мест из запроса
  public int UnReserveError;//Флаг наличия ошибки в выполнении запроса. 0 - ошибки нет.

  public class Place {
    public long ShowId;//Id шоу, из запроса
    public long Place;//Id места в зале, из запроса
    public int Result;//Статус снятия резерва, 1 - Успешно снят, другой статус - Ошибка.
    public String ResultMessage;//Сообщение объясняющее статус
  }
}
