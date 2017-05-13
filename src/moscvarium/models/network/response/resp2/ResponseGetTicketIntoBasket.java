package moscvarium.models.network.response.resp2;

/**
 * Created by xTazy on 5/10/17.
 */
public class ResponseGetTicketIntoBasket {
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
