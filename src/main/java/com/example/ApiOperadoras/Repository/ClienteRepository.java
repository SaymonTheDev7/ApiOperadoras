package com.example.ApiOperadoras.Repository;
import com.example.ApiOperadoras.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    @Query("UPDATE Cliente c SET c.email = :email WHERE c.id = :id")
    Cliente atualizarEmail(@Param("id") Integer id, @Param("email") String email);
}
