package moscvarium.models.network.response.resp2;

/**
 * Created by xTazy on 5/10/17.
 */
public class ResponseGetSpecChangedList {
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
