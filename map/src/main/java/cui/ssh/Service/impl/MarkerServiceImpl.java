package cui.ssh.Service.impl;

import cui.ssh.Service.MarkerService;
import cui.ssh.entity.Marker;
import cui.ssh.repository.impl.MarkerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkerServiceImpl implements MarkerService{
    @Autowired
    private MarkerRepositoryImpl markerRepository;
    @Override
    public List findAll(String id) {
        List<Marker> markers = markerRepository.findAll(id);
        return markers;
    }

    @Override
    public Long addMarker(String type, String position) {
        Marker marker = new Marker();
        marker.setDes("gas this");
        marker.setPosition(position);
        marker.setType(type);
        return markerRepository.save(marker);
    }
    @Override
    public void delete(String position) {
      markerRepository.delete(position);
    }
}
