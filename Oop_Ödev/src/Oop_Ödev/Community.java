package Oop_Ödev;
public class Community {

    private int coummunity_id;
    private String community_name;
    private String rank;
    private String activity_date;
    boolean permission;  // topluluk işlemlerinde izin alınma durumu




    public Community(int coummunity_id, String community_name, String rank) {   //constructor

        this.coummunity_id = coummunity_id;
        this.community_name = community_name;
        this.rank = rank;
    }





public void activity(String activity_date){   // burada topluluk etkinlik oluşturuyor


        if(permission) {
            this.activity_date = activity_date;
        }
    }



//getter setter methodlar
    public int getCoummunity_id() {
        return coummunity_id;
    }
    public void setCoummunity_id(int coummunity_id) {
        this.coummunity_id = coummunity_id;
    }
    public String getCommunity_name() {
        return community_name;
    }
    public void setCommunity_name(String community_name) {
        this.community_name = community_name;
    }

    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }

   public String getActivity_date() {return activity_date; }

   public void setActivity_date(String activity_date) {this.activity_date = activity_date;}

}



