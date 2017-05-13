package moscvarium.models.network.response.resp2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by xTazy on 5/10/17.
 */
@JacksonXmlRootElement(localName = "data")
public class ResponseGetSpecFreePlace {
    @JacksonXmlProperty(localName = "spec_free_place_pict")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Spec_free_place_pict spec_free_place_pict;

    public Spec_free_place_pict getSpec_free_place_pict() {
        return spec_free_place_pict;
    }

    public void setSpec_free_place_pict(Spec_free_place_pict spec_free_place_pict) {
        this.spec_free_place_pict = spec_free_place_pict;
    }

    @Override
    public String toString() {
        return "ClassPojo [spec_free_place_pict = " + spec_free_place_pict + "]";
    }

    public class Spec_free_place_pict {
        @JacksonXmlProperty(localName = "ticket")
        @JacksonXmlElementWrapper(useWrapping = false)
        private Ticket[] ticket;

        @JacksonXmlProperty(localName = "spectacle_info")
        @JacksonXmlElementWrapper(useWrapping = false)
        private Spectacle_info spectacle_info;

        public Ticket[] getTicket() {
            return ticket;
        }

        public void setTicket(Ticket[] ticket) {
            this.ticket = ticket;
        }

        public Spectacle_info getSpectacle_info() {
            return spectacle_info;
        }

        public void setSpectacle_info(Spectacle_info spectacle_info) {
            this.spectacle_info = spectacle_info;
        }

        @Override
        public String toString() {
            return "ClassPojo [ticket = " + ticket + ", spectacle_info = " + spectacle_info + "]";
        }
    }

    public class Spectacle_info {
        @JacksonXmlProperty(localName = "Name")
        private String Name;
        @JacksonXmlProperty(localName = "id")
        private String id;
        @JacksonXmlProperty(localName = "time")
        private String time;
        @JacksonXmlProperty(localName = "hall")
        private String hall;
        @JacksonXmlProperty(localName = "IdHall")
        private String IdHall;
        @JacksonXmlProperty(localName = "date")
        private String date;
        @JacksonXmlProperty(localName = "type")
        private String type;
        @JacksonXmlProperty(localName = "tarif")
        private String tarif;

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getHall() {
            return hall;
        }

        public void setHall(String hall) {
            this.hall = hall;
        }

        public String getIdHall() {
            return IdHall;
        }

        public void setIdHall(String IdHall) {
            this.IdHall = IdHall;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTarif() {
            return tarif;
        }

        public void setTarif(String tarif) {
            this.tarif = tarif;
        }

        @Override
        public String toString() {
            return "ClassPojo [Name = " + Name + ", id = " + id + ", time = " + time + ", hall = " + hall + ", IdHall = " + IdHall + ", date = " + date + ", type = " + type + ", tarif = " + tarif + "]";
        }
    }

    public class Ticket {
        @JacksonXmlProperty(localName = "ycoord")
        private String ycoord;
        @JacksonXmlProperty(localName = "trowmetric")
        private String trowmetric;
        @JacksonXmlProperty(localName = "xcoord")
        private String xcoord;
        @JacksonXmlProperty(localName = "tprice")
        private String tprice;
        @JacksonXmlProperty(localName = "trow")
        private String trow;
        @JacksonXmlProperty(localName = "tplacemetric")
        private String tplacemetric;
        @JacksonXmlProperty(localName = "tregion")
        private String tregion;
        @JacksonXmlProperty(localName = "tplace")
        private String tplace;
        @JacksonXmlProperty(localName = "pid")
        private String pid;
        @JacksonXmlProperty(localName = "tid")
        private String tid;
        @JacksonXmlProperty(localName = "tside")
        private String tside;

        public String getYcoord() {
            return ycoord;
        }

        public void setYcoord(String ycoord) {
            this.ycoord = ycoord;
        }

        public String getTrowmetric() {
            return trowmetric;
        }

        public void setTrowmetric(String trowmetric) {
            this.trowmetric = trowmetric;
        }

        public String getXcoord() {
            return xcoord;
        }

        public void setXcoord(String xcoord) {
            this.xcoord = xcoord;
        }

        public String getTprice() {
            return tprice;
        }

        public void setTprice(String tprice) {
            this.tprice = tprice;
        }

        public String getTrow() {
            return trow;
        }

        public void setTrow(String trow) {
            this.trow = trow;
        }

        public String getTplacemetric() {
            return tplacemetric;
        }

        public void setTplacemetric(String tplacemetric) {
            this.tplacemetric = tplacemetric;
        }

        public String getTregion() {
            return tregion;
        }

        public void setTregion(String tregion) {
            this.tregion = tregion;
        }

        public String getTplace() {
            return tplace;
        }

        public void setTplace(String tplace) {
            this.tplace = tplace;
        }

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getTid() {
            return tid;
        }

        public void setTid(String tid) {
            this.tid = tid;
        }

        public String getTside() {
            return tside;
        }

        public void setTside(String tside) {
            this.tside = tside;
        }

        @Override
        public String toString() {
            return "ClassPojo [ycoord = " + ycoord + ", trowmetric = " + trowmetric + ", xcoord = " + xcoord + ", tprice = " + tprice + ", trow = " + trow + ", tplacemetric = " + tplacemetric + ", tregion = " + tregion + ", tplace = " + tplace + ", pid = " + pid + ", tid = " + tid + ", tside = " + tside + "]";
        }
    }
}
