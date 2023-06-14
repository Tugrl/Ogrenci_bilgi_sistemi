public class LecturerOffices extends Areas{

boolean is_locked;
boolean is_avaliable;
String consulation_day;   // danışmanın uygun danışma günü


    public LecturerOffices(int area_id, boolean isdirty,String consulation_day) {
        super(area_id, isdirty);
        this.consulation_day=consulation_day;
    }


    public void leaveoffice(){
        is_locked=true;
    }  // lecturer offisten ayırılınca kapı kilitli olur

    public void cometooffice(){  // ofise gelince kapı açık olur
        is_locked=false;

    }

    public void avaliable(String day, String consulation_day){  // öğrencinin görüşmek istediği gün ile öğretmenin günü uygun mu?

        if(day==consulation_day){   // günler uyuşuyorsa true
           is_avaliable=true;
        }
        else {
            is_avaliable=false;  // uyuşmuyorsa false yani meşgul
        }

    }







}
