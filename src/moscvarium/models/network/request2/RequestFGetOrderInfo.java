package moscvarium.models.network.request2;

import org.jetbrains.annotations.NotNull;

public class RequestFGetOrderInfo extends RequestBase {

    /**
     * @param ido
     * @param idc
     */
    public RequestFGetOrderInfo(@NotNull String ido, @NotNull String idc) {
        super(parametersEnum.PART.toString(), parametersEnum.ACTION.toString());
        this.getParameters().put(parametersEnum.ORDER_ID.toString(), ido);
        this.getParameters().put(parametersEnum.CLIENT_ID.toString(), idc);
    }

    protected enum parametersEnum {
        PART("orders"),
        ACTION("get_order_info"),
        ORDER_ID("ido"),
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
