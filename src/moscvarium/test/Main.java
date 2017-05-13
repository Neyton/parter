package moscvarium.test;

import moscvarium.Ticketarium;
import moscvarium.exceptions.Errors;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Inventor on 20.02.2017.
 */
public class Main {
  @NotNull
  private final static Ticketarium moscvarium = new Ticketarium("", "", "http://api.bil24.ru:1290/test/index.php", 1);

  public static void main(String[] args) {
    Errors errors = new Errors();

    //getShowList();
    //getPlaceList(1998);
    //getAvailPlaceList(2031);//2031,1983,2008,1972,2017

//      List<Long> placeIdCollection = new ArrayList<>();
//      placeIdCollection.add(3821L);
    //reservePlaces("93d206cfaded6c33faaf3d3e318555d0", 2031, placeIdCollection);
    //unReservePlaces("f1bb32c314116159506b16c5cb349268", 2031, placeIdCollection);

    //unReserveAllShowsPlaces("c521a898041991bf8b648bfb2efca544");
    //setClientInfo("e488ec720b6210b8595763e69c7655d9", 1983);
//      setPayed("93d206cfaded6c33faaf3d3e318555d0");
    System.exit(0);
  }

//  private static void getShowList() throws IOException, MoscvariumException {
//    List<MoscvariumShow> list = moscvarium.getShowList();
//    for (MoscvariumShow model : list) {
//      System.out.println(model);
//    }
//  }
//
//  private static void getPlaceList(long showId) throws IOException, MoscvariumException {
//    List<MoscvariumPlace> list = moscvarium.getPlaceList(showId);
//    for (MoscvariumPlace model : list) {
//      System.out.println(model);
//    }
//  }
//
//  private static void getAvailPlaceList(long showId) throws IOException, MoscvariumException {
//    List<MoscvariumAvailPlace> list = moscvarium.getAvailPlaceList(showId);
//    for (MoscvariumAvailPlace model : list) {
//      System.out.println(model);
//    }
//  }
//
//  private static void reservePlaces(@Nullable String hash, long showId, @NotNull Collection<Long> placeIdCollection) throws IOException, MoscvariumException {
//    String value = moscvarium.reservePlaces(hash, showId, placeIdCollection);
//    System.out.println(value);
//  }
//
//  private static void unReservePlaces(@NotNull String hash, long showId, @NotNull Collection<Long> placeIdCollection) throws IOException, MoscvariumException {
//    moscvarium.unReservePlaces(hash, showId, placeIdCollection);
//  }
//
//  private static void unReserveAllShowsPlaces(@NotNull String hash) throws IOException, MoscvariumException {
//    moscvarium.unReserveAllShowsPlaces(hash);
//  }
//
//    /*private static void setClientInfo(@NotNull String hash, long showId) throws IOException, MoscvariumException {
//        boolean value = moscvarium.setClientInfo(hash, showId);
//        System.out.println(value);
//    }*/
//
//  private static void setPayed(@NotNull String hash) throws IOException, MoscvariumException {
//    List<MoscvariumTicket> list = moscvarium.setPayed(hash);
//    for (MoscvariumTicket model : list) {
//      System.out.println(model);
//    }
//  }
}
