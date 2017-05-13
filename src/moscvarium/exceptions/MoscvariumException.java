package moscvarium.exceptions;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Inventor on 26.04.2017.
 */
public class MoscvariumException extends Exception {
  public MoscvariumException(@NotNull String message) {
    super(message);
  }

  public MoscvariumException(@NotNull String message, @NotNull Throwable cause) {
    super(message, cause);
  }

  public MoscvariumException(@NotNull Throwable cause) {
    super(cause);
  }
}
