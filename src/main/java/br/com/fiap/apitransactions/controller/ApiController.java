package br.com.fiap.apitransactions.controller;

import br.com.fiap.apitransactions.dao.TransactionsDao;
import br.com.fiap.apitransactions.model.Statistics;
import br.com.fiap.apitransactions.model.Transactions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class ApiController {

    private TransactionsDao daoTransactions;

    public ApiController() {
        daoTransactions = new TransactionsDao();
    }

    @PostMapping("/transactions")
    public ResponseEntity<Object> save(@RequestBody() Transactions trans){

        return new ResponseEntity(trans, HttpStatus.OK);

    }

    @GetMapping("/statistics")
    public ResponseEntity<Statistics> get(){

        return new ResponseEntity(null, HttpStatus.OK);

    }
}
