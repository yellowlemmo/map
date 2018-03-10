package cui.ssh.entity;

public class Marker {

    private Long id;
    private String des;
    private String type;
    private String position;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDes() {

        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
