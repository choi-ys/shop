package io.exercise.shop.repository;

import io.exercise.shop.domain.entity.MemberEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
@DisplayName("Repository:MemberEntity")
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    @DisplayName("Save:MemberEntity")
    @Transactional
    @Rollback(value = false)
    public void saveMemberEntity() throws Exception {
        // Given
        String memberName = "최용석";
        MemberEntity memberEntity = MemberEntity.builder()
                .memberName(memberName)
                .build();

        // When
        Long savedMemberNo = this.memberRepository.save(memberEntity);
//        MemberEntity savedMemberEntity = this.memberRepository.find(savedMemberNo);

        // Then
        assertThat(savedMemberNo).isNotZero();
        assertThat(savedMemberNo).isEqualTo(memberEntity.getMemberNo());
    }
}