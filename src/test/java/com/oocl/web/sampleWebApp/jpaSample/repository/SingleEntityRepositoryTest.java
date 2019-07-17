package com.oocl.web.sampleWebApp.jpaSample.repository;

import com.oocl.web.sampleWebApp.jpaSample.entity.SingleEntity;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
class SingleEntityRepositoryTest {
    @Autowired
    private SingleEntityRepository singleEntityRepository;

    @Test
    public void should_return_singleEntity_when_call_save() {
        //given
        SingleEntity singleEntity = new SingleEntity();
        singleEntity.setName("amiao");

        //when
        SingleEntity addedSingleEntity = singleEntityRepository.save(singleEntity);

        //then
        assertEquals("amiao", addedSingleEntity.getName());
    }

}