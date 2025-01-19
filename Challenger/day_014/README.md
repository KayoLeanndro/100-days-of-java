# Day 14

## Desafio:
Crie uma classe em Java para representar um sistema de gerenciamento de alunos com operações de adicionar, remover e atualizar informações dos alunos.

**Resultado:**

```java

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
                    alunoAtualizado.setId(id); // Preserva o ID do aluno
                    alunos.set(i, alunoAtualizado);
                    return alunoAtualizado;
                }
            }
            throw new IllegalArgumentException("Aluno com o ID " + id + " não encontrado.");
        }
    }