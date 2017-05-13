package moscvarium.models.network.response.resp2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by xTazy on 5/10/17.
 */
@JacksonXmlRootElement(localName = "data")
public class ResponseSetPayment {
    @JacksonXmlProperty(localName = "IdPayment")
    private String IdPayment;
    @JacksonXmlProperty(localName = "PaySum")
    private String PaySum;

    public String getIdPayment ()
    {
        return IdPayment;
    }

    public void setIdPayment (String IdPayment)
    {
        this.IdPayment = IdPayment;
    }

    public String getPaySum ()
    {
        return PaySum;
    }

    public void setPaySum (String PaySum)
    {
        this.PaySum = PaySum;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [IdPayment = "+IdPayment+", PaySum = "+PaySum+"]";
    }
}
