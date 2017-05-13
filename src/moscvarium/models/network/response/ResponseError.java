package moscvarium.models.network.response;

/**
 * Created by Inventor on 27.04.2017.
 */
public abstract class ResponseError {
  public Error Error;

  public class Error {
    public int Code;
    public String Message;
  }
}
