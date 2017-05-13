package moscvarium.models.network.response.resp2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by xTazy on 5/10/17.
 */
@JacksonXmlRootElement(localName = "OutTicketFromBasket")
public class ResponseGetOutTicketFromBasket {
    @JacksonXmlProperty(localName = "res_count")
    private String res_count;

    public String getRes_count ()
    {
        return res_count;
    }

    public void setRes_count (String res_count)
    {
        this.res_count = res_count;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [res_count = "+res_count+"]";
    }
}
