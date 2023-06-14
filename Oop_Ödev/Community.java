package Oop_Ödev;
public class Community {

    private int coummunity_id;  //variables for community class
    private String community_name;
    private String rank;


    public Community(int coummunity_id, String community_name, String rank) { //constructor for community class

        this.coummunity_id = coummunity_id;
        this.community_name = community_name;
        this.rank = rank;
    }


    public int getCoummunity_id() {  //getter setter methods 
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
    } // end of getters setters
}



