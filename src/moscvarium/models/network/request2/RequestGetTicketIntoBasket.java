package moscvarium.models.network.request2;

import org.jetbrains.annotations.NotNull;

public class RequestGetTicketIntoBasket extends RequestBase {

    /**
     * @param tarif
     * @param idc
     * @param t
     */
    public RequestGetTicketIntoBasket(@NotNull String tarif, @NotNull String idc, @NotNull String t) {
        super(parametersEnum.PART.toString(), parametersEnum.ACTION.toString());
        this.getParameters().put(parametersEnum.TARIF.toString(), tarif);
        this.getParameters().put(parametersEnum.CLIENT_ID.toString(), idc);
        this.getParameters().put(parametersEnum.TICKET_ID.toString(), t);
    }

    protected enum parametersEnum {
        PART("ticket"),
        ACTION("get_ticket_into_basket"),
        TARIF("tarif"),
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
