package cui.ssh.Service;

import cui.ssh.entity.Admin;

import java.util.List;

public interface AdminService {
    public Admin login(String username,String password);
}
