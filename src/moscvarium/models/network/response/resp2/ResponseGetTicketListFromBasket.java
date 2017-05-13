package moscvarium.models.network.response.resp2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by xTazy on 5/10/17.
 */
@JacksonXmlRootElement(localName = "data")
public class ResponseGetTicketListFromBasket {
    @JacksonXmlProperty(localName = "basket")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Basket basket;

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "ClassPojo [basket = " + basket + "]";
    }

    public class Basket {
        @JacksonXmlProperty(localName = "count")
        private String count;
        @JacksonXmlProperty(localName = "typepay")
        @JacksonXmlElementWrapper(useWrapping = false)
        private Typepay typepay;
        @JacksonXmlProperty(localName = "spectcale")
        @JacksonXmlElementWrapper(useWrapping = false)
        private Spectcale spectcale;
        @JacksonXmlProperty(localName = "cost")
        private String cost;

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public Typepay getTypepay() {
            return typepay;
        }

        public void setTypepay(Typepay typepay) {
            this.typepay = typepay;
        }

        public Spectcale getSpectcale() {
            return spectcale;
        }

        public void setSpectcale(Spectcale spectcale) {
            this.spectcale = spectcale;
        }

        public String getCost() {
            return cost;
        }

        public void setCost(String cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "ClassPojo [count = " + count + ", typepay = " + typepay + ", spectcale = " + spectcale + ", cost = " + cost + "]";
        }
    }


    public class Spectcale {
        @JacksonXmlProperty(localName = "time")
        private String time;
        @JacksonXmlProperty(localName = "b_ticket")
        @JacksonXmlElementWrapper(useWrapping = false)
        private B_ticket b_ticket;
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

        public B_ticket getB_ticket() {
            return b_ticket;
        }

        public void setB_ticket(B_ticket b_ticket) {
            this.b_ticket = b_ticket;
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
            return "ClassPojo [time = " + time + ", b_ticket = " + b_ticket + ", name = " + name + ", date = " + date + "]";
        }
    }

    public class B_ticket {
        @JacksonXmlProperty(localName = "price")
        private String price;
        @JacksonXmlProperty(localName = "tid")
        private String tid;
        @JacksonXmlProperty(localName = "place")
        private String place;

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getTid() {
            return tid;
        }

        public void setTid(String tid) {
            this.tid = tid;
        }

        public String getPlace() {
            return place;
        }

        public void setPlace(String place) {
            this.place = place;
        }

        @Override
        public String toString() {
            return "ClassPojo [price = " + price + ", tid = " + tid + ", place = " + place + "]";
        }
    }


    public class Typepay {
        @JacksonXmlProperty(localName = "name")
        private String name;
        @JacksonXmlProperty(localName = "pay")
        private String pay;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPay() {
            return pay;
        }

        public void setPay(String pay) {
            this.pay = pay;
        }

        @Override
        public String toString() {
            return "ClassPojo [name = " + name + ", pay = " + pay + "]";
        }
    }


}
