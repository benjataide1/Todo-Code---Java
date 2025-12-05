package persistence;

import logic.Odontologo;

/**
 * JpaController para la entidad Odontologo.
 * Ahora hereda la funcionalidad CRUD de GenericJpaDAO para reducir código duplicado.
 */
public class OdontologoJpaController extends GenericJpaDAO<Odontologo, Integer> {

    public OdontologoJpaController() {
        // Llama al constructor de la clase padre (GenericJpaDAO)
        // pasándole la clase de la entidad que manejará.
        super(Odontologo.class);
    }

    // Ya no se necesita el código CRUD (create, edit, destroy, find, etc.) aquí.
    // Todo es heredado de GenericJpaDAO.

}
