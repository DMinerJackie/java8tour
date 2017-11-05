package lambda.Predicate;

import model.Apple;

/**
 * Created by jackie on 17/9/12.
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
