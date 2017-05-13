package moscvarium.models.network.response.resp2;

/**
 * Created by xTazy on 5/10/17.
 */
public class ResponseSetPayment {
    private String IdPayment;
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
