package AV2.Q6ArvoreGenealogica;

public class Pessoa {
    private String namePerson;
    private Pessoa mae;
    private Pessoa pai;

    public Pessoa(String namePerson, Pessoa mae, Pessoa pai) {
        this.namePerson = namePerson;
        this.mae = mae;
        this.pai = pai;
    }

    public Pessoa(String namePerson) {
        this.namePerson = namePerson;
        this.mae = null;
        this.pai = null;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public Pessoa getPai() {
        return pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Pessoa outraPessoa = (Pessoa) obj;
        return this.namePerson.equals(outraPessoa.namePerson) &&
                ((this.mae == null && outraPessoa.mae == null) ||
                        (this.mae != null && this.mae.equals(outraPessoa.mae)));
    }
}