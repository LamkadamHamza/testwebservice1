package com.example.testwebservice1.dao;

import com.example.testwebservice1.entities.Cashtick;
import com.example.testwebservice1.entities.CashtickPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@RepositoryRestResource
public interface CashtickRepository extends JpaRepository<Cashtick, CashtickPK> {



    @Query(value = "SELECT ct.CMINT, SUM(ct.ctqte * ct.ctputtc) as CA ,m.CMRAISOC " +
            "FROM capcash.cashtick ct ,capcash.cashmag m " +
            "WHERE ct.ctdate >= CURRENT_DATE() and ct.cmint=m.CMINT " +
            "AND ct.ctdate < ADDDATE(CURRENT_DATE(), INTERVAL 1 DAY) " +
            "AND ct.cttiptick = 1 " +
            "GROUP BY ct.CMINT", nativeQuery = true)
    List<Object[]> yourCustomQuery();
}
