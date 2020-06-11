package service;

import java.util.List;

import beans.Apple;
import predicate.StrategyPredicate;

public interface AppleService {
	// interface access modifier default: public
	List<Apple> getAll();// them public de neu co class ke thua se ko bi loi

	List<Apple> filter(List<Apple> inventory,StrategyPredicate<Apple> predicate);
}
