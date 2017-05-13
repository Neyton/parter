package moscvarium.models.network.response.resp2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by xTazy on 5/10/17.
 */
@JacksonXmlRootElement(localName = "data")
public class ResponseGetSpecChangedList {
    @JacksonXmlProperty(localName = "spec_changed_list")
    private String spec_changed_list;

    public String getSpec_changed_list ()
    {
        return spec_changed_list;
    }

    public void setSpec_changed_list (String spec_changed_list)
    {
        this.spec_changed_list = spec_changed_list;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [spec_changed_list = "+spec_changed_list+"]";
    }
}
