package br.com.odonto.model;

import br.com.odonto.enums.Motivo;
import br.com.odonto.enums.Situacao;
import br.com.odonto.enums.TipoAgendamento;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
    @Enumerated(EnumType.STRING)
    private TipoAgendamento tipoAgendamento;
    @Enumerated(EnumType.STRING)
    private Situacao situacao;
    @Enumerated(EnumType.STRING)
    private Motivo motivo;
    @ManyToMany
    private List<Procedimento> procedimentos;

    public Agendamento() {
        this.protocolo = "AG-" + Calendar.getInstance().getTimeInMillis();
        this.procedimentos = new ArrayList<>();
    }

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

    public TipoAgendamento getTipoAgendamento() {
        return tipoAgendamento;
    }

    public void setTipoAgendamento(TipoAgendamento tipoAgendamento) {
        this.tipoAgendamento = tipoAgendamento;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Motivo getMotivo() {
        return motivo;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }

    public List<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(List<Procedimento> procedimentos) {
        this.procedimentos = procedimentos;
    }

}
