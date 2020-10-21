package kr.co.yunnote.infrastructor.test;

import com.querydsl.jpa.impl.JPAQueryFactory;
import kr.co.yunnote.domain.QTest;
import kr.co.yunnote.domain.Test;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class TestRepository {

    @PersistenceContext
    private EntityManager em;

    private final JPAQueryFactory queryFactory;

    public TestRepository(JPAQueryFactory queryFactory) {
        this.queryFactory = queryFactory;
    }

    public void save (Test test) {
        em.persist(test);
    }

    public Test findTestById(Long id) {
        QTest qTest = new QTest("qTest");
        return queryFactory
                .select(qTest)
                .from(qTest)
                .where(qTest.id.eq(id))
                .fetchOne();
    }
}
