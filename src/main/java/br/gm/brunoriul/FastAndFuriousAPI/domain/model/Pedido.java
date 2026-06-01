/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.gm.brunoriul.FastAndFuriousAPI.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

/**
 *
 * @author digma
 */

@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pedido_id;
    
    private LocalDateTime dataAbertura;
    
    @Enumerated(EnumType.STRING)
    private StatusPedido status;
    
    
    @Column(name = "numeroticket")
    private long numeroTicket;

    @Column(name = "valortotal")
    private Double valorTotal;
    
    private String observacao;

    public long getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(long pedido_id) {
        this.pedido_id = pedido_id;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public long getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(long numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
}



 
 