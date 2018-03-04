package cui.ssh.Service.impl;

import cui.ssh.Service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{
    @Override
    public String test() {
        return "test";
    }
}
