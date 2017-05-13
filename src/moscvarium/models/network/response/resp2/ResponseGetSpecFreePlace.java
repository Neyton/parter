package moscvarium.models.network.response.resp2;

/**
 * Created by xTazy on 5/10/17.
 */
public class ResponseGetSpecFreePlace {
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
        private Ticket[] ticket;
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
        private String Name;
        private String id;
        private String time;
        private String hall;
        private String IdHall;
        private String date;
        private String type;
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
        private String ycoord;
        private String trowmetric;
        private String xcoord;
        private String tprice;
        private String trow;
        private String tplacemetric;
        private String tregion;
        private String tplace;
        private String pid;
        private String tid;
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
