package moscvarium.models.network.request2;

import org.jetbrains.annotations.NotNull;

public class RequestFGetSpecFreePlace extends RequestBase {

    /**
     * @param ids
     * @param tarif
     * @param idc
     */
    public RequestFGetSpecFreePlace(@NotNull String ids, @NotNull String tarif, @NotNull String idc) {
        super(parametersEnum.PART.toString(), parametersEnum.ACTION.toString());
        this.getParameters().put(parametersEnum.IDSPEC.toString(), ids);
        this.getParameters().put(parametersEnum.TARIF.toString(), tarif);
        this.getParameters().put(parametersEnum.CLIENT_ID.toString(), idc);
    }

    protected enum parametersEnum {
        PART("performance"),
        ACTION("get_spec_free_place"),
        IDSPEC("ids"),
        TARIF("tarif"),
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
