package moscvarium.models.network.response;

/**
 * Created by xTazy on 26.04.2017.
 */
public class ResponseShowUnReserveAllShowsPlaces extends ResponseError {
  public long SesssionTime;//кол-во секунд до завершения сессии
  public Show[] Shows;

  public class Show {
    public long Show;//Id шоу
    public int Result;//Флаг наличия ошибки в выполнении запроса. 1 - запрос прошёл успешно.
  }
}
