package com.pgm.springdemo.sample;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service // @Component를 상속받아서 만들어진 어노테이션, 자동으로 빈으로 등록
@ToString
public class SampleService {
    @Autowired
    private SampleDAO sampleDAO;
    @Autowired
    private ISampleDAO sampleDAOImpl;
    @Autowired
    @Qualifier("event") // @Primary를 사용하지 않았을 때, @Qualifier를 사용하여 빈을 선택할 수 있다.
    private ISampleDAO eventSampleDAO;

}
