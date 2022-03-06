package pl.final_snake.modules.payer.controller;

import org.springframework.web.bind.annotation.*;
import pl.final_snake.modules.category.model.Category;
import pl.final_snake.modules.payer.model.Payer;
import pl.final_snake.modules.payer.service.PayerService;

import java.util.List;

@RestController
public class PayerController {

    private final PayerService payerService;

    public PayerController(PayerService payerService) {
        this.payerService = payerService;
    }

    @PostMapping("/payer/add")
    public Payer addPayer(@RequestBody Payer payer){
        return payerService.addPayer(payer);
    }

    @GetMapping("/payer")
    public List<Payer> allPayers(){
        return payerService.showPayers();
    }

    @GetMapping("/payer/{id}")
    public Payer showPayer(@PathVariable Long id){
        return payerService.showPayer(id);
    }

    @GetMapping("/payer/{id}/delete")
    public void deletePayer(@PathVariable Long id){
        payerService.deletePayer(id);
    }

    @PostMapping("/payer/{id}/edit")
    public Payer editPayer(@PathVariable Long id, @RequestBody Payer payer){
        return payerService.editPayer(payer);
    }

}
