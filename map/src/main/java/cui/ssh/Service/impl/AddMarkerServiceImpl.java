package cui.ssh.Service.impl;

import cui.ssh.Service.AddMarkerService;
import cui.ssh.entity.Marker;
import cui.ssh.repository.impl.AddMarkerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddMarkerServiceImpl implements AddMarkerService{
    @Autowired
    private AddMarkerRepositoryImpl addMarkerRepository;
    @Override
    public void save(Marker entity) {
        addMarkerRepository.save(entity);
    }
}
