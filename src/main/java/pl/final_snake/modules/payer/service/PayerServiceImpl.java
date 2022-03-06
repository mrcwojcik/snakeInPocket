package pl.final_snake.modules.payer.service;

import org.springframework.stereotype.Service;
import pl.final_snake.modules.payer.model.Payer;
import pl.final_snake.modules.payer.repository.PayerRepository;

import java.util.List;

@Service
public class PayerServiceImpl implements PayerService{

    private final PayerRepository payerRepository;

    public PayerServiceImpl(PayerRepository payerRepository) {
        this.payerRepository = payerRepository;
    }

    @Override
    public Payer addPayer(Payer payer) {
        return payerRepository.save(payer);
    }

    @Override
    public void deletePayer(Long id) {
        payerRepository.delete(payerRepository.getById(id));
    }

    @Override
    public Payer showPayer(Long id) {
        return payerRepository.getById(id);
    }

    @Override
    public Payer editPayer(Payer payer) {
        Payer payerFromDb = payerRepository.getById(payer.getId());
        payerFromDb.setPayerName(payer.getPayerName());
        return payerRepository.save(payerFromDb);
    }

    @Override
    public List<Payer> showPayers() {
        return payerRepository.findAll();
    }
}
