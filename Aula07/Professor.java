public final class Professor extends  Pessoa {
    public CARGO cargo;

    public Professor(CARGO cargo) {
        this.cargo = cargo;
    }

    public Professor(String nome, CARGO cargo) {
        super(nome);
        this.cargo = cargo;
    }

    public CARGO getCargo() {
        return cargo;
    }

    public void setCargo(CARGO cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "cargo=" + cargo +
                '}';
    }



    public Professor(String nome){
        super(nome);
    }

    @Override
    public void quemSouEu() {
        System.out.println("Sou o professor");
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Ensinar");
    }

}