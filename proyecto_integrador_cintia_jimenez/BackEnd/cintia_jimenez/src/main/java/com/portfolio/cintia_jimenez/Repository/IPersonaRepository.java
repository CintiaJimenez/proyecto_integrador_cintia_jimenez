
package com.portfolio.cintia_jimenez.Repository;

import com.portfolio.cintia_jimenez.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository  extends JpaRepository<Persona, Long>{
    
}
