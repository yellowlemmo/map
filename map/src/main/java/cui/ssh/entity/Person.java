package cui.ssh.entity;


import javax.persistence.*;

/**
 * Created by XRog
 * On 2/2/2017.2:03 PM
 */
@Entity
@Table(name = "Person")
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "created")
    private Long created = System.currentTimeMillis();

    @Column(name = "username")
    private String username;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "remark")
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getCreated() {

        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}