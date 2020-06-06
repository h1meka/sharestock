public class Note {
    private String name;
    private String memo;
    private String address;

    public Note(String name,String memo,String address){
        this.name = name;
        this.memo = memo;
        this.address = address    ;
    }

    public String getName() {
        return name;
    }

    public String getMemo() {
        return memo;
    }

    public String getAddress() {
        return address;
    }
}
