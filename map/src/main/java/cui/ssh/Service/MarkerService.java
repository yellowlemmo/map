package cui.ssh.Service;

import java.util.List;

public interface MarkerService {
    public List findAll(String id);
    public Long addMarker(String type, String position);
    public void delete(String position);

}
