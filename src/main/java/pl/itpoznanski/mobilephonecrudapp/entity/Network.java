package pl.itpoznanski.mobilephonecrudapp.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "network")
public class Network {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_network")
    private int idNetwork;

    @Column(name = "network_name")
    private String networkName;

    public Network() {
    }
    public Network(String networkName){
        this.networkName=networkName;
    }
    @OneToMany(mappedBy = "network", cascade = CascadeType.ALL)
    private List<Device>deviceList;


    public int getIdNetwork() {
        return idNetwork;
    }

    public void setIdNetwork(int idNetwork) {
        this.idNetwork = idNetwork;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public List<Device> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(List<Device> deviceList) {
        this.deviceList = deviceList;
    }
    public  void addDevice(Device device){
        if(deviceList==null){
            deviceList= new ArrayList<>();
        }
       deviceList.add(device);
        device.setNetwork(this);
    }

    @Override
    public String toString() {
        return "Network{" +
                "idNetwork=" + idNetwork +
                ", networkName='" + networkName + '\'' +
                '}';
    }
}
