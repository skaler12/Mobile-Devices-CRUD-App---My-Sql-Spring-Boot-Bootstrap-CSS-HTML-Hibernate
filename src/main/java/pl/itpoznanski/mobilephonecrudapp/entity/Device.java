package pl.itpoznanski.mobilephonecrudapp.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "device")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_device")
    private Integer idDevice ;

    @Column(name = "model")
    private String model;

    @Column(name = "colour")
    private String colour;

    @Column(name = "weight")
    private int weight;

    public Device() {
    }
    public Device(String model, String colour, int weight){
        this.model=model;
        this.colour=colour;
        this.weight=weight;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_network")
    private Network network;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "device_user",joinColumns = @JoinColumn(name = "id_device"),inverseJoinColumns = @JoinColumn(name = "id_user"))
    private List<User>userList;

    public Integer getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(Integer idDevice) {
        this.idDevice = idDevice;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
    public void addUser(User user){
        if(userList==null){
            userList=new ArrayList<>();
        }
        userList.add(user);
    }

    @Override
    public String toString() {
        return "Device{" +
                "idDevice=" + idDevice +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", weight=" + weight +
                '}';
    }
}
