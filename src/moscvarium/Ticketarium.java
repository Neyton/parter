package moscvarium;

import moscvarium.models.network.request2.RequestBase;
import moscvarium.models.network.request2.RequestFGetSpecChangedList;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

/**
 * Created by Inventor on 20.02.2017.
 */
public class Ticketarium {

    public Ticketarium(@NotNull String login, @NotNull String password, @NotNull String baseUrl, int logIndex) {
        this.getHash();
    }

    @NotNull
    private String getHash() {
        try {
            Requester requester = new Requester("http://api.bil24.ru:1290/test/index.php/");
            Object html = requester.getHTML(this.buildURL(new RequestFGetSpecChangedList("12.1.2017", "15")), Object.class);
            System.out.println(html);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private String buildURL(RequestBase requestBase) {
        StringBuffer stringBuffer = new StringBuffer("?");
        for (Map.Entry<String, String> stringStringEntry : requestBase.getParameters().entrySet()) {
            stringBuffer.append(stringStringEntry.getKey());
            stringBuffer.append("=");
            stringBuffer.append(stringStringEntry.getValue());
            stringBuffer.append("&");
        }
        return stringBuffer.toString();
    }

//  /**
//   * Для получения списка сеансов на представления и информации о них
//   */
//  @NotNull
//  public List<MoscvariumShow> getShowList() throws MoscvariumException, IOException {
//    try {
//      ResponseDatesDetail response = getResponse(new Request<>(URL.SHOW_DATES_DETAIL), "ShowDatesDetail", getHash());
//
//      List<MoscvariumShow> showList = new ArrayList<>();
//      for (ResponseDatesDetail.Date date : response.Dates) {
//        for (ResponseDatesDetail.Show show : date.ShowList) {
//          showList.add(new MoscvariumShow(show));
//        }
//      }
//      return showList;
//    } catch (NoSuchAlgorithmException | KeyManagementException | VariableException | RequiredException | NotNullValueException | ClassTypeValueException e) {
//      throw new MoscvariumException(e);
//    } catch (ResponseException e) {
//      throw new MoscvariumException(e.getError(), e);
//    }
//  }
//
//  /**
//   * Вовзращает информацию о схеме зала для конкретного сеанса
//   */
//  @NotNull
//  public List<MoscvariumPlace> getPlaceList(long showId) throws MoscvariumException, IOException {
//    try {
//      ResponseShowPlaces response = getResponse(new Request<>(URL.SHOW_PLACES)
//          .addValue(RequestFShowPlaces.SHOW_ID, showId), "ShowPlaces", getHash());
//
//      List<MoscvariumPlace> placeList = new ArrayList<>();
//      for (ResponseShowPlaces.Place place : response.Places) {
//        ResponseShowPlaces.Sector sector = response.Sectors.get(place.SectorId);
//        if (sector == null) throw new MoscvariumException("no sector for place.id = " + place.Id);
//        ResponseShowPlaces.Tariff tariff = response.Tariffs.get(place.TariffId);
//        if (tariff == null) throw new MoscvariumException("no tariff for place.id = " + place.Id);
//        ResponseShowPlaces.EStatus status = ResponseShowPlaces.EStatus.getStatusById(place.StatusId);
//        if (status == null) throw new MoscvariumException("no status for place.id = " + place.Id);
//        placeList.add(new MoscvariumPlace(place, sector, tariff, status));
//      }
//      return placeList;
//    } catch (NoSuchAlgorithmException | KeyManagementException | VariableException | RequiredException | NotNullValueException | ClassTypeValueException e) {
//      throw new MoscvariumException(e);
//    } catch (ResponseException e) {
//      throw new MoscvariumException(e.getError(), e);
//    }
//  }
//
//  /**
//   * Возвращает информацию о схеме зала для свободных мест для конкретного сеанса
//   */
//  @NotNull
//  public List<MoscvariumAvailPlace> getAvailPlaceList(long showId) throws MoscvariumException, IOException {
//    try {
//      ResponseShowPlaces response = getResponse(new Request<>(URL.SHOW_PLACES)
//          .addValue(RequestFShowPlaces.SHOW_ID, showId)
//          .addValue(RequestFShowPlaces.ONLY_FREE, ""), "ShowPlaces", getHash());
//
//      List<MoscvariumAvailPlace> availPlaceList = new ArrayList<>();
//      for (ResponseShowPlaces.Place place : response.Places) {
//        ResponseShowPlaces.Tariff tariff = response.Tariffs.get(place.TariffId);
//        if (tariff == null) throw new MoscvariumException("no tariff for place.id = " + place.Id);
//        availPlaceList.add(new MoscvariumAvailPlace(place, tariff));
//      }
//      return availPlaceList;
//    } catch (NoSuchAlgorithmException | KeyManagementException | VariableException | RequiredException | NotNullValueException | ClassTypeValueException e) {
//      throw new MoscvariumException(e);
//    } catch (ResponseException e) {
//      throw new MoscvariumException(e.getError(), e);
//    }
//  }
//
//  /**
//   * Если hash равен null, то создается новый hash и возвращается
//   * Если надо добавлять места в существующий заказ, то нужно передавать его hash
//   * Если место уже находится в этой или другой корзине, то будет сгенерировано исключение
//   * Если будет ошибка резервирования одного из мест, то будет сгенерировано исключение
//   */
//  @NotNull
//  public String reservePlaces(@Nullable String hash, long showId, @NotNull Collection<Long> placeIdCollection) throws MoscvariumException, IOException {
//    try {
//      Request<RequestFShowReservePlaces> request = new Request<>(URL.SHOW_RESERVE_PLACES)
//          .addValue(RequestFShowReservePlaces.SHOW_ID, showId)
//          .addValue(RequestFShowReservePlaces.PARTNER_NAME, "BIL24");
//      for (Long placeId : placeIdCollection) request.addValue(RequestFShowReservePlaces.PLACES, placeId);
//      if (hash == null) hash = getHash();
//      ResponseShowReservePlaces response = getResponse(request, "ShowReservePlaces", hash);
//
//      if (response.ReserveError > 0) {
//        StringBuilder error = new StringBuilder();
//        for (ResponseShowReservePlaces.Place place : response.Places) {
//          error.append("placeId = ").append(place.Place);
//          error.append(" message = ").append(place.ResultMessage);
//          error.append("|");
//        }
//        throw new MoscvariumException("Ошибка резервирования в шоу = " + showId + " мест : " + error.toString());
//      }
//      return hash;
//    } catch (NoSuchAlgorithmException | KeyManagementException | VariableException | RequiredException | NotNullValueException | ClassTypeValueException e) {
//      throw new MoscvariumException(e);
//    } catch (ResponseException e) {
//      throw new MoscvariumException(e.getError(), e);
//    }
//  }
//
//  /**
//   * Если передан не существующий hash, то будет сгенерировано исключение
//   * Если передан не существующий showId, то будет сгенерировано исключение
//   * Если передан не существующий placeId, то запрос отработает
//   * Если передан не placeId, который доступен к продажах, то запрос отработает
//   * Если будет ошибка отмены резервирования одного из мест, запрос все равно выполняется для остальных мест
//   */
//  public void unReservePlaces(@NotNull String hash, long showId, @NotNull Collection<Long> placeIdCollection) throws MoscvariumException, IOException {
//    try {
//      Request<RequestFShowUnReservePlaces> request = new Request<>(URL.SHOW_UN_RESERVE_PLACES)
//          .addValue(RequestFShowUnReservePlaces.SHOW_ID, showId);
//      for (Long placeId : placeIdCollection) request.addValue(RequestFShowUnReservePlaces.PLACES, placeId);
//      ResponseShowUnReservePlaces response = getResponse(request, "ShowUnReservePlaces", hash);
//    } catch (NoSuchAlgorithmException | KeyManagementException | VariableException | RequiredException | NotNullValueException | ClassTypeValueException e) {
//      throw new MoscvariumException(e);
//    } catch (ResponseException e) {
//      throw new MoscvariumException(e.getError(), e);
//    }
//  }
//
//  /**
//   * Если передан не существующий hash, то будет сгенерировано исключение
//   * Если передан hash по которому уже выполнялся данный запрос, то запрос отработает
//   */
//  public void unReserveAllShowsPlaces(@NotNull String hash) throws MoscvariumException, IOException {
//    try {
//      ResponseShowUnReserveAllShowsPlaces response = getResponse(new Request<>(URL.SHOW_UN_RESERVE_ALL_SHOWS_PLACES), "ShowUnReserveAllShowsPlaces", hash);
//    } catch (NoSuchAlgorithmException | KeyManagementException | VariableException | RequiredException | NotNullValueException | ClassTypeValueException e) {
//      throw new MoscvariumException(e);
//    } catch (ResponseException e) {
//      throw new MoscvariumException(e.getError(), e);
//    }
//  }
//
//  /**
//   * Не обязательный запрос
//   * Cохраняет информацию о покупателе для созданных билетов в указанном шоу
//   * Если после вызова были добавлены новые билеты, запрос необходимо повторить.
//   */
//    /*public boolean setClientInfo(@NotNull String hash, long showId) throws MoscvariumException, IOException {
//        try {
//            ResponseShowSetClientInfo response = getResponse(new Request<>(URL.SHOW_SET_CLIENT_INFO)
//                .addValue(RequestFShowSetClientInfo.SHOW_ID, showId), "ShowSetClientInfo", hash);
//            return response.Result == ResponseShowSetClientInfo.SUCCESS;
//        } catch (NoSuchAlgorithmException | KeyManagementException | VariableException | RequiredException | NotNullValueException | ClassTypeValueException e) {
//            throw new MoscvariumException(e);
//        } catch (ResponseException e) {
//            throw new MoscvariumException(e.getError(), e);
//        }
//    }*/
//
//  /**
//   * В случае ошибки, оплата билетов вообще не происходит.
//   */
//  public List<MoscvariumTicket> setPayed(@NotNull String hash) throws MoscvariumException, IOException {
//    try {
//      ResponseShowSetPayed response = getResponse(new Request<>(URL.SHOW_SET_PAYED), "ShowSetPayed", hash);
//
//      if (response.PaymentError != 0) throw new MoscvariumException("Ошибка оплаты всех забронированных мест");
//      List<MoscvariumTicket> ticketList = new ArrayList<>();
//      for (ResponseShowSetPayed.Show show : response.Shows.values()) {
//        for (ResponseShowSetPayed.Ticket ticket : show.Places) {
//          ticketList.add(new MoscvariumTicket(show, ticket));
//        }
//      }
//      return ticketList;
//    } catch (NoSuchAlgorithmException | KeyManagementException | VariableException | RequiredException | NotNullValueException | ClassTypeValueException e) {
//      throw new MoscvariumException(e);
//    } catch (ResponseException e) {
//      throw new MoscvariumException(e.getError(), e);
//    }
//  }
//
//  @NotNull
//  @SuppressWarnings("unchecked")
//  private <FIELD extends RequestFBase, Response extends ResponseError> Response getResponse(@NotNull Request<FIELD> request, @NotNull String query, @NotNull String hash) throws VariableException, IOException, KeyManagementException, NoSuchAlgorithmException, RequiredException, ResponseException, ClassTypeValueException, NotNullValueException, MoscvariumException {
//    return getResponse(request.addValue((FIELD) RequestFBase.QUERY, query).addValue((FIELD) RequestFBase.HASH, hash));
//  }
//
//  @NotNull
//  @SuppressWarnings("unchecked")
//  private <FIELD extends RequestFJson, Response extends ResponseError> Response getResponse(@NotNull Request<FIELD> request) throws VariableException, IOException, KeyManagementException, NoSuchAlgorithmException, RequiredException, ResponseException, ClassTypeValueException, NotNullValueException, MoscvariumException {
//    try {
//      Response response = Requester.getResponse(request.setStartUrl(baseUrl).addValue((FIELD) RequestFBase.JSON, ""));
//      if (response.Error != null)
//        throw new MoscvariumException("code[" + response.Error.Code + "] " + response.Error.Message);
//      return response;
//    } finally {
//      Logger logger = (request.isPrior() ? log : inf);
//      logger.write(request.getFinishURL() + "\nМетод = " + request.getMethod() + "\n" + request.getFinishContent() + "\n" + request.getFinishResponse());
//    }
//  }
}
