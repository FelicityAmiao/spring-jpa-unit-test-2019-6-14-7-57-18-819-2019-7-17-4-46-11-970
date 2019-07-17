package com.oocl.web.sampleWebApp.jpaSample.repository;

import com.oocl.web.sampleWebApp.jpaSample.entity.RelatedEntity;
import com.oocl.web.sampleWebApp.jpaSample.entity.SingleEntity;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
class RelatedEntityRepositoryTest {

    @Autowired
    SingleEntityRepository singleEntityRepository;

    @Autowired RelatedEntityRepository relatedEntityRepository;

    @Test
    public void should_be_able_to_handle_one_to_one_relationship() {
        RelatedEntity relatedEntity = new RelatedEntity();
        relatedEntity.setName("Jerry");
        SingleEntity singleEntity = new SingleEntity();
        singleEntity.setName("Felicity");
        relatedEntity.setSingleEntity(singleEntity);
        RelatedEntity save = relatedEntityRepository.save(relatedEntity);
        assertEquals("Jerry", save.getName());
        assertEquals("Felicity", save.getSingleEntity().getName());
    }

}