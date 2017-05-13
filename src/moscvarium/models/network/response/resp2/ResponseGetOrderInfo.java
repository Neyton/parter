package moscvarium.models.network.response.resp2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by xTazy on 5/10/17.
 */
@JacksonXmlRootElement(localName = "OrderInfo")
public class ResponseGetOrderInfo {
    @JacksonXmlProperty(localName = "nstate")
    private String nstate;
    @JacksonXmlProperty(localName = "key_order")
    private String key_order;
    @JacksonXmlProperty(localName = "createtime")
    private String createtime;
    @JacksonXmlProperty(localName = "canceltime")
    private String canceltime;
    @JacksonXmlProperty(localName = "print_button")
    private String print_button;
    @JacksonXmlProperty(localName = "status")
    private String status;
    @JacksonXmlProperty(localName = "order_state")
    private String order_state;
    @JacksonXmlProperty(localName = "typepay")
    private String typepay;
    @JacksonXmlProperty(localName = "number")
    private String number;
    @JacksonXmlProperty(localName = "spectcale")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Spectcale spectcale;
    @JacksonXmlProperty(localName = "ticket_count")
    private String ticket_count;
    @JacksonXmlProperty(localName = "order_price")
    private String order_price;

    public String getNstate() {
        return nstate;
    }

    public void setNstate(String nstate) {
        this.nstate = nstate;
    }

    public String getKey_order() {
        return key_order;
    }

    public void setKey_order(String key_order) {
        this.key_order = key_order;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getCanceltime() {
        return canceltime;
    }

    public void setCanceltime(String canceltime) {
        this.canceltime = canceltime;
    }

    public String getPrint_button() {
        return print_button;
    }

    public void setPrint_button(String print_button) {
        this.print_button = print_button;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrder_state() {
        return order_state;
    }

    public void setOrder_state(String order_state) {
        this.order_state = order_state;
    }

    public String getTypepay() {
        return typepay;
    }

    public void setTypepay(String typepay) {
        this.typepay = typepay;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Spectcale getSpectcale() {
        return spectcale;
    }

    public void setSpectcale(Spectcale spectcale) {
        this.spectcale = spectcale;
    }

    public String getTicket_count() {
        return ticket_count;
    }

    public void setTicket_count(String ticket_count) {
        this.ticket_count = ticket_count;
    }

    public String getOrder_price() {
        return order_price;
    }

    public void setOrder_price(String order_price) {
        this.order_price = order_price;
    }

    @Override
    public String toString() {
        return "ClassPojo [nstate = " + nstate + ", key_order = " + key_order + ", createtime = " + createtime + ", canceltime = " + canceltime + ", print_button = " + print_button + ", status = " + status + ", order_state = " + order_state + ", typepay = " + typepay + ", number = " + number + ", spectcale = " + spectcale + ", ticket_count = " + ticket_count + ", order_price = " + order_price + "]";
    }


    public class Spectcale {
        @JacksonXmlProperty(localName = "time")
        private String time;
        @JacksonXmlProperty(localName = "o_ticket")
        @JacksonXmlElementWrapper(useWrapping = false)
        private O_ticket o_ticket;
        @JacksonXmlProperty(localName = "name")
        private String name;
        @JacksonXmlProperty(localName = "date")
        private String date;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public O_ticket getO_ticket() {
            return o_ticket;
        }

        public void setO_ticket(O_ticket o_ticket) {
            this.o_ticket = o_ticket;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "ClassPojo [time = " + time + ", o_ticket = " + o_ticket + ", name = " + name + ", date = " + date + "]";
        }
    }

    public class O_ticket {
        @JacksonXmlProperty(localName = "price")
        private String price;
        @JacksonXmlProperty(localName = "number")
        private String number;
        @JacksonXmlProperty(localName = "PlaceState")
        private String PlaceState;
        @JacksonXmlProperty(localName = "decription")
        private String decription;

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getPlaceState() {
            return PlaceState;
        }

        public void setPlaceState(String PlaceState) {
            this.PlaceState = PlaceState;
        }

        public String getDecription() {
            return decription;
        }

        public void setDecription(String decription) {
            this.decription = decription;
        }

        @Override
        public String toString() {
            return "ClassPojo [price = " + price + ", number = " + number + ", PlaceState = " + PlaceState + ", decription = " + decription + "]";
        }
    }
}
