package cui.ssh.Service.impl;

import cui.ssh.Service.AdminService;
import cui.ssh.entity.Admin;
import cui.ssh.repository.impl.AdminRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminRepositoryImpl adminRepository;
    @Override
    public Admin login(String username, String password) {

        return adminRepository.login(username,password);
    }
}
