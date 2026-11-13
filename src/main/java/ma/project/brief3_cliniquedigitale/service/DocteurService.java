package ma.project.brief3_cliniquedigitale.service;

import ma.project.brief3_cliniquedigitale.model.Departement;
import ma.project.brief3_cliniquedigitale.model.Docteur;
import ma.project.brief3_cliniquedigitale.repository.DepartementRepositoryImpl;
import ma.project.brief3_cliniquedigitale.repository.DocteurRepositoryImpl;

import java.util.List;
import java.util.Optional;

public class DocteurService {
    private DocteurRepositoryImpl docteurRepository;
    private DepartementRepositoryImpl departementRepository;

    public DocteurService(){
        this.docteurRepository =new DocteurRepositoryImpl();
        this.departementRepository= new DepartementRepositoryImpl();
    }

    public Docteur save(Docteur docteur){
        return docteurRepository.save(docteur);
    }

    public List<Docteur> findAll(){
        return docteurRepository.findAll();
    }

    public boolean delete(Long id){
        return docteurRepository.delete(id);
    }

    public Optional<Docteur> findById(Long id) {
        return docteurRepository.findById(id);
    }

    public Docteur update(Docteur docteur){
        return docteurRepository.update(docteur);
    }
}
