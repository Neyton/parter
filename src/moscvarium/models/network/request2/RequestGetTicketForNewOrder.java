package moscvarium.models.network.request2;

import org.jetbrains.annotations.NotNull;

public class RequestGetTicketForNewOrder extends RequestBase {

    public RequestGetTicketForNewOrder(@NotNull String part, @NotNull String action) {
        super(part, action);
    }
}
