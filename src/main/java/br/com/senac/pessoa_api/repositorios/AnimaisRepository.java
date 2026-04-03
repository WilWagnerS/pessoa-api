package br.com.senac.pessoa_api.repositorios;

import br.com.senac.pessoa_api.entidades.Animais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimaisRepository extends JpaRepository<Animais, Long> {
}
