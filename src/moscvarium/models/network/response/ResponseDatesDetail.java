package moscvarium.models.network.response;

/**
 * Created by xTazy on 17.04.2017.
 */
public class ResponseDatesDetail extends ResponseError {
  public long SesssionTime;//кол-во секунд до завершения сессии
  public Date[] Dates;

  public class Date {
    public String Date;//Дата
    public int ComboTicket;//Возможна ли на данный день продажа "комбо-билетов"
    public int HaveShow;//Наличие шоу на данную дату: 1 - есть, 0 - нет
    public String Comment;//Комментарий о наличии шоу
    public Show[] ShowList;
  }

  public class Show {
    public long Id;//Идентификатор шоу
    public String Date;//Дата проведения шоу
    public String ComboTicket;//Возможна ли на данный день продажа "комбо-билетов"
    public String Time;//Время начала шоу
    public String Length;//Продолжительность шоу
    public String HallSchemeId;//Идентификатор зала
    public String HallName;//Название зала, в котором будет проводится шоу
    public String TypeName;//Тип представления
    public String Comment;//Комментарий к шоу (на случай возможных уведомлений связанных с данным Шоу)
  }
}
