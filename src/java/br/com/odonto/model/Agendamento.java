package br.com.odonto.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Sanderson
 */
@Entity
public class Agendamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String protocolo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtendimento;
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaInicial;
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaFinal;
    @ManyToOne
    private Cliente paciente;
    @ManyToOne
    private Dentista dentista;
    private String ortodontia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public Date getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(Date dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public Date getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(Date horaInicial) {
        this.horaInicial = horaInicial;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    public Cliente getPaciente() {
        return paciente;
    }

    public void setPaciente(Cliente paciente) {
        this.paciente = paciente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public String getOrtodontia() {
        return ortodontia;
    }

    public void setOrtodontia(String ortodontia) {
        this.ortodontia = ortodontia;
    }

}
