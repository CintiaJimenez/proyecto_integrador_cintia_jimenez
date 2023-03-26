
package com.portfolio.cintia_jimenez.Interface;

import com.portfolio.cintia_jimenez.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> getPersona();

    public void savePersona(Persona persona);
        
    public void deletePersona (Long Id);
    
    public Persona findPersona (Long Id);
    }

