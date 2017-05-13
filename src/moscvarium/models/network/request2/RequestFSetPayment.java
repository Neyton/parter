package moscvarium.models.network.request2;

import org.jetbrains.annotations.NotNull;

public class RequestFSetPayment extends RequestBase {

    /**
     * @param ido
     * @param idc
     */
    public RequestFSetPayment(@NotNull String ido, @NotNull String idc) {
        super(parametersEnum.PART.toString(), parametersEnum.ACTION.toString());
        this.getParameters().put(parametersEnum.IDORDERS.toString(), ido);
        this.getParameters().put(parametersEnum.IDCLIENT.toString(), idc);
    }

    protected enum parametersEnum {
        PART("orders"),
        ACTION("set_payment"),
        IDORDERS("ido"),
        IDCLIENT("idc");

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
