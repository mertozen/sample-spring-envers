package com.faded.sprinbootenvers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.faded.sprinbootenvers.entity.SomeGroup;

public interface SomeGroupRepository extends JpaRepository<SomeGroup, String>, JpaSpecificationExecutor<SomeGroup> {

}
