package moscvarium.models.network.request2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RequestFGetSalesReport extends RequestBase {

    /**
     * @param idс
     * @param dtfrom
     * @param dtto
     */
    public RequestFGetSalesReport(@NotNull String idс, @Nullable String dtfrom, @Nullable String dtto) {
        super(parametersEnum.PART.toString(), parametersEnum.ACTION.toString());
        this.getParameters().put(parametersEnum.DATEFROM.toString(), idс);
        this.getParameters().put(parametersEnum.DATETO.toString(), dtfrom);
        this.getParameters().put(parametersEnum.IDCLIENT.toString(), dtto);
    }
    protected enum parametersEnum {
        PART("account"),
        ACTION("get_sales_report"),
        DATEFROM("dtfrom"),
        DATETO("dtto"),
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
