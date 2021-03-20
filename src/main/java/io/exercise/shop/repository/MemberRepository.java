package io.exercise.shop.repository;

import io.exercise.shop.domain.entity.MemberEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Long save(MemberEntity memberEntity){
        entityManager.persist(memberEntity);
        return memberEntity.getMemberNo();
    }

    public MemberEntity find(Long memberNo){
        return entityManager.find(MemberEntity.class, memberNo);
    }
}
