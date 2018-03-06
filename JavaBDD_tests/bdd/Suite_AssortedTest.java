package bdd;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Timothy Hoffman
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({bdd.CallbackTests.class, bdd.BasicTests.class, bdd.IteratorTests.class})
public class Suite_AssortedTest {
}
