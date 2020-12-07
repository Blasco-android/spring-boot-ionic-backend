package com.blascoweb.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.blascoweb.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
