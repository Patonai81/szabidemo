package hu.cib.szabi.szabidemo.controller;

import hu.cib.szabi.szabidemo.exception.TestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

     @GetMapping("/home")
     public String getMapping(@RequestParam (required = false , defaultValue = "") String param ){
          System.out.println("Reméljük kkiiírja");
          return "Heyyyyyaaaaaa" +param +"!"+param+"iiii";
     }


     //hibás működés: http://localhost:8080/testRest?test=asd
     //helyes működés: http://localhost:8080/testRest
     @GetMapping("/testRest")
     public ResponseEntity<String> test(@RequestParam(required = false) String test){

          if(test != null && test.equals("asd")){
               throw new TestException("ajjaj hiba!!");
          }

          return ResponseEntity.ok("juhééé ez működik!!");
     }
}
