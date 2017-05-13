package moscvarium.models.network.response;

/**
 * Created by xTazy on 12.04.2017.
 */
public class ResponseAuthorisation extends ResponseError {
  public String Hash; //Сервер возвращает вам идентификатор вашей сессии, во всех последующих запросах к серверу вы обязаны передавать в запросе переменную Hash содержащую данный идентификатор.
}
