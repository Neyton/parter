package moscvarium.models.network.request2;

import org.jetbrains.annotations.NotNull;

public class RequestFSaleOrder extends RequestBase {

    public RequestFSaleOrder(@NotNull String part, @NotNull String action) {
        super(part, action);
    }
}
