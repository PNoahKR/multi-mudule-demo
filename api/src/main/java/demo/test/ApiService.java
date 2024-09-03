package demo.test;

import org.springframework.stereotype.Service;

@Service
public class ApiService {
    private final CommonsRepository commonsRepository;

    public ApiService(CommonsRepository commonsRepository){
        this.commonsRepository = commonsRepository;
    }

    public String getText(){
        return commonsRepository.test();
    }
}
