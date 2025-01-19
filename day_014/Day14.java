import java.util.ArrayList;
import java.util.List;

public class Day14 {

    // Classe representando um aluno
    public class Aluno {

        private Integer id;
        private String name;
        private String cpf;
        private Integer age;
        private SituacaoAcademica situacaoAcademica;

        public Aluno(Integer id, String name, String cpf, Integer age, SituacaoAcademica situacaoAcademica) {
            this.id = id;
            this.name = name;
            this.cpf = cpf;
            this.age = age;
            this.situacaoAcademica = situacaoAcademica;
        }

        public Aluno() {
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public SituacaoAcademica getSituacaoAcademica() {
            return situacaoAcademica;
        }

        public void setSituacaoAcademica(SituacaoAcademica situacaoAcademica) {
            this.situacaoAcademica = situacaoAcademica;
        }
    }

    // Enum para representar a situação acadêmica
    public enum SituacaoAcademica {
        ENSINO_FUNDAMENTAL,
        ENSINO_MEDIO,
        ENSINO_SUPERIOR
    }

    // Classe representando o sistema que gerencia alunos
    public class Sistema {
        private List<Aluno> alunos = new ArrayList<>();

        // Adiciona um aluno à lista
        public void adicionaAluno(Aluno aluno) {
            if (aluno == null) {
                throw new IllegalArgumentException("O aluno não pode ser nulo.");
            }
            alunos.add(aluno);
        }

        // Remove um aluno pelo ID
        public void removeAluno(Integer id) {
            if (id == null) {
                throw new IllegalArgumentException("O ID não pode ser nulo.");
            }
            boolean removed = alunos.removeIf(aluno -> aluno.getId().equals(id));
            if (!removed) {
                throw new IllegalArgumentException("Aluno com o ID " + id + " não encontrado.");
            }
        }

        // Atualiza as informações de um aluno existente
        public Aluno atualizarAluno(Integer id, Aluno alunoAtualizado) {
            if (id == null || alunoAtualizado == null) {
                throw new IllegalArgumentException("ID ou aluno atualizado não podem ser nulos.");
            }
            for (int i = 0; i < alunos.size(); i++) {
                Aluno aluno = alunos.get(i);
                if (aluno.getId().equals(id)) {
                    alunoAtualizado.setId(id);
                    alunos.set(i, alunoAtualizado);
                    return alunoAtualizado;
                }
            }
            throw new IllegalArgumentException("Aluno com o ID " + id + " não encontrado.");
        }
    }

}
