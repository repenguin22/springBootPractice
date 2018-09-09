package com.soma.springboot.db.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soma.springboot.db.entity.TestEntitiy;

// リポジトリを表す
@Repository
//  JpaRepositoryというリポジトリの根底となるインタフェースを継承する
public interface TestRepository extends JpaRepository<TestEntitiy, Long>{

}
