package lambda.Predicate;

import model.Apple;

/**
 * Created by jackie on 17/9/12.
 */
public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
