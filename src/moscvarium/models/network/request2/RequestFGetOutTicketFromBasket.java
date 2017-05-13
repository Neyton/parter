package moscvarium.models.network.request2;

import org.jetbrains.annotations.NotNull;

public class RequestFGetOutTicketFromBasket extends RequestBase {

    /**
     * @param idc
     * @param t
     */
    public RequestFGetOutTicketFromBasket(@NotNull String idc, @NotNull String t) {
        super(parametersEnum.PART.toString(), parametersEnum.ACTION.toString());
        this.getParameters().put(parametersEnum.CLIENT_ID.toString(), idc);
        this.getParameters().put(parametersEnum.TICKET_ID.toString(), t);
    }

    protected enum parametersEnum {
        PART("ticket"),
        ACTION("get_out_ticket_from_basket"),
        CLIENT_ID("idc"),
        TICKET_ID("t");

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
