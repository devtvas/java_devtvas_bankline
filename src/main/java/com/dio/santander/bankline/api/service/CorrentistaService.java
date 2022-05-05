package com.dio.santander.bankline.api.service;
//regra de negocios
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Conta;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;

@Service
public class CorrentistaService {
	//regra de negocios
	@Autowired
	private CorrentistaRepository correntistaRepository;//server para persistir os dados
	
	//regra de negocios
	public void save(NovoCorrentista novoCorrentista) {
		Correntista correntista = new Correntista();
		correntista.setCpf(novoCorrentista.getCpf());//model (recebe) dto
		correntista.setName(novoCorrentista.getName());//model (recebe) dto
		
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumber(new Date().getTime());
		
		correntista.setConta(conta);
		//agora sim, ja podemos persistir nossos dados
		correntistaRepository.save(correntista);
	}
}
