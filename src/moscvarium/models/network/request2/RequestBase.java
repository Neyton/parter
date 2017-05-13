package moscvarium.models.network.request2;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class RequestBase {

    @NotNull
    private final Map<String, String> parameters;

    public RequestBase(@NotNull String part, @NotNull String action) {
        this.parameters = new HashMap<>();
        parameters.put(parametersEnum.PART.toString(), part);
        parameters.put(parametersEnum.ACTION.toString(), action);
    }

    @NotNull
    public Map<String, String> getParameters() {
        return parameters;
    }

    private enum parametersEnum {
        PART("part"),
        ACTION("action");

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
