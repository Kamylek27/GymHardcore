package com.gh.gymhardcore.repository;

import org.hibernate.query.criteria.internal.ValueHandlerFactory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingPlan extends JpaRepository<TrainingPlan, ValueHandlerFactory.LongValueHandler> {
}
