package moscvarium.models.network.request2;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Neyton on 13.05.2017.
 */
public class RequestFGetSpecChangedList extends RequestBase {

    /**
     * @param dt
     * @param idc
     */
    public RequestFGetSpecChangedList(@NotNull String dt, @NotNull String idc) {
        super(parametersEnum.PART.toString(), parametersEnum.ACTION.toString());
        this.getParameters().put(parametersEnum.DATE.toString(), dt);
        this.getParameters().put(parametersEnum.IDCLIENT.toString(), idc);
    }

    protected enum parametersEnum {
        PART("performance"),
        ACTION("get_spec_changed_list"),
        DATE("dt"),
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
