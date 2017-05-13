package moscvarium.models.network.request2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RequestGetTicketForNewOrder extends RequestBase {

    /**
     * @param idc
     * @param t
     * @param omake
     * @param tp
     * @param series
     * @param ticknum
     * @param barcode
     */
    public RequestGetTicketForNewOrder(@NotNull String idc, @NotNull String t, @NotNull String omake, @Nullable String tp,
                                       @Nullable String series, @Nullable String ticknum, @Nullable String barcode) {
        super(parametersEnum.PART.toString(), parametersEnum.ACTION.toString());
        this.getParameters().put(parametersEnum.CLIENT_ID.toString(), idc);
        this.getParameters().put(parametersEnum.TICKET_ID.toString(), t);
        this.getParameters().put(parametersEnum.O_MAKE.toString(), omake);
        this.getParameters().put(parametersEnum.TICTYPE_PAYKET_ID.toString(), tp);
        this.getParameters().put(parametersEnum.EXT_TICK_SER.toString(), series);
        this.getParameters().put(parametersEnum.EXT_TICK_NUM.toString(), ticknum);
        this.getParameters().put(parametersEnum.EXT_BARCODE.toString(), barcode);
    }

    protected enum parametersEnum {
        PART("ticket"),
        ACTION("get_ticket_for_new_order"),
        CLIENT_ID("idc"),
        TICKET_ID("t"),
        O_MAKE("omake"),
        TICTYPE_PAYKET_ID("tp"),
        EXT_TICK_SER("Series"),
        EXT_TICK_NUM("Ticknum"),
        EXT_BARCODE("Barcode");

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
