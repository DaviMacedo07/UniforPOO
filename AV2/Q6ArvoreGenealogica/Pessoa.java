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

    public boolean equals(Pessoa outraPessoa) {
        if (this.namePerson.equals(outraPessoa.namePerson)) {
            if (this.mae == null && outraPessoa.mae == null) {
                return  true;
            }
            if (this.mae != null && outraPessoa.mae != null) {
                return  this.mae.equals(outraPessoa);
            }
        }
        return false;
    }
}
