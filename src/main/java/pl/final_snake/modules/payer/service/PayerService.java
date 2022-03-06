package pl.final_snake.modules.payer.service;

import pl.final_snake.modules.payer.model.Payer;

import java.util.List;

public interface PayerService {

    Payer addPayer(Payer payer);
    void deletePayer(Long id);
    Payer showPayer(Long id);
    Payer editPayer(Payer payer);
    List<Payer> showPayers();

}
