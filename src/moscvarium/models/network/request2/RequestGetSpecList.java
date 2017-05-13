package moscvarium.models.network.request2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RequestGetSpecList extends RequestBase {

    /**
     * @param month
     * @param year
     */
    public RequestGetSpecList(@NotNull String month, @Nullable String year) {
        super(parametersEnum.PART.toString(), parametersEnum.ACTION.toString());
        this.getParameters().put(parametersEnum.MONTH.toString(), month);
        this.getParameters().put(parametersEnum.YEAR.toString(), year);
    }

    protected enum parametersEnum {
        PART("performance"),
        ACTION("get_spec_list"),
        MONTH("month"),
        YEAR("year");

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
