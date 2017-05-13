package moscvarium.models.network.request2;

import org.jetbrains.annotations.NotNull;

public class RequestFGetTicketListFromBasket extends RequestBase {

    /**
     * @param idc
     */
    public RequestFGetTicketListFromBasket(@NotNull String idc) {
        super(parametersEnum.PART.toString(), parametersEnum.ACTION.toString());
        this.getParameters().put(parametersEnum.CLIENT_ID.toString(), idc);
    }

    protected enum parametersEnum {
        PART("ticket"),
        ACTION("get_ticket_list_from_basket"),
        CLIENT_ID("idc");

        private String value;

        parametersEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }
    }
}
