package moscvarium.models.network.response.resp2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by xTazy on 5/10/17.
 */
@JacksonXmlRootElement(localName = "data")
public class ResponseDropOrderWTicketTeh {
    @JacksonXmlProperty(localName = "return_res")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Return_res return_res;

    public Return_res getReturn_res() {
        return return_res;
    }

    public void setReturn_res(Return_res return_res) {
        this.return_res = return_res;
    }

    @Override
    public String toString() {
        return "ClassPojo [return_res = " + return_res + "]";
    }

    public class Return_res {
        @JacksonXmlProperty(localName = "ticket")
        @JacksonXmlElementWrapper(useWrapping = false)
        private Ticket ticket;

        public Ticket getTicket() {
            return ticket;
        }

        public void setTicket(Ticket ticket) {
            this.ticket = ticket;
        }

        @Override
        public String toString() {
            return "ClassPojo [ticket = " + ticket + "]";
        }
    }

    public class Ticket {
        @JacksonXmlProperty(localName = "result")
        private String result;
        @JacksonXmlProperty(localName = "idt")
        private String idt;
        @JacksonXmlProperty(localName = "ido")
        private String ido;

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public String getIdt() {
            return idt;
        }

        public void setIdt(String idt) {
            this.idt = idt;
        }

        public String getIdo() {
            return ido;
        }

        public void setIdo(String ido) {
            this.ido = ido;
        }

        @Override
        public String toString() {
            return "ClassPojo [result = " + result + ", idt = " + idt + ", ido = " + ido + "]";
        }
    }

}
