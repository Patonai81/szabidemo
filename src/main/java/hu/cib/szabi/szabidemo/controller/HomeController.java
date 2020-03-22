package hu.cib.szabi.szabidemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {



@GetMapping
public String getMapping(@RequestParam (required = false , defaultValue = "") String param ){
 System.out.println("Reméljük kkiiírja");
 return "Heyyyyyaaaaaa" +param +"!"+param+"iii";
}
}
