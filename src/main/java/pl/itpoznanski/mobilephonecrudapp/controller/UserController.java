package pl.itpoznanski.mobilephonecrudapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.itpoznanski.mobilephonecrudapp.entity.Device;
import pl.itpoznanski.mobilephonecrudapp.service.DeviceService;
import pl.itpoznanski.mobilephonecrudapp.service.NetworkService;
import pl.itpoznanski.mobilephonecrudapp.service.UserService;

import javax.persistence.criteria.CriteriaBuilder;

@Controller
public class UserController {

    @Autowired
    DeviceService deviceService;
    @Autowired
    NetworkService networkService;
    @Autowired
    UserService userService;

    @GetMapping()
    public String index(Model model){
        model.addAttribute("device",new Device());
        model.addAttribute("devices",deviceService.findAll());
        model.addAttribute("networks",networkService.findAll());
        model.addAttribute("users",userService.findAll());
        return "index";
    }
    @PostMapping("/addNewPhone")
    public String createDevice(Model model,Device device){
     deviceService.save(device);
        model.addAttribute("device",new Device());
        model.addAttribute("devices",deviceService.findAll());
        model.addAttribute("networks",networkService.findAll());
        model.addAttribute("users",userService.findAll());
        return "add";
    }
    @GetMapping("/editPhone/{idDevice}")
    public String editDevice(Model model, @PathVariable(name = "idDevice") Integer idDevice){
       Device deviceParamEdit =deviceService.findById(idDevice).get();
        model.addAttribute("device",deviceParamEdit);
        model.addAttribute("devices",deviceService.findAll());
        model.addAttribute("networks",networkService.findAll());
        model.addAttribute("users",userService.findAll());
       return "index";
    }
    @GetMapping("/deletePhone/{idDevice}")
    public String deleteDevice(Model model, @PathVariable(name = "idDevice")Integer idDevice){
      Device deviceDelete = deviceService.findById(idDevice).get();
      deviceService.delete(deviceDelete);
        model.addAttribute("device",new Device());
        model.addAttribute("devices",deviceService.findAll());
        model.addAttribute("networks",networkService.findAll());
        model.addAttribute("users",userService.findAll());
        return "delete";
    }
}
