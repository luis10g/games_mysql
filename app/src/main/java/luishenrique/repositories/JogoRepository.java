package luishenrique.repositories;

import org.springframework.data.repository.CrudRepository;

import luishenrique.models.Jogo;

public interface JogoRepository extends CrudRepository<Jogo, Integer> {
}