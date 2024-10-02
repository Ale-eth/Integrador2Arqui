package tp2arquiintegrador.factory;

import tp2arquiintegrador.repositories.AlumnoCarreraRepository;
import tp2arquiintegrador.repositories.AlumnoRepository;
import tp2arquiintegrador.repositories.CarreraRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public abstract class DaoFactory  {

    public static DaoFactory getInstance(int whichFactory) {
        switch (whichFactory) {
            case 1:
                return MySqlDaoFactory.getInstance();
            default:
                return null;
        }
    }

    public abstract AlumnoRepository getAlumnoRepository();
    public abstract CarreraRepository getCarreraRepository();
    public abstract AlumnoCarreraRepository getAlumnoCarreraRepository();

}