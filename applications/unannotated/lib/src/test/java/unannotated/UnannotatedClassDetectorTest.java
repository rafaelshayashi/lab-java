package unannotated;

import static edu.umd.cs.findbugs.test.CountMatcher.containsExactly;
import static org.junit.Assert.assertThat;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Rule;
import org.junit.Test;

import edu.umd.cs.findbugs.BugCollection;
import edu.umd.cs.findbugs.test.SpotBugsRule;
import edu.umd.cs.findbugs.test.matcher.BugInstanceMatcher;
import edu.umd.cs.findbugs.test.matcher.BugInstanceMatcherBuilder;

public class UnannotatedClassDetectorTest {

    @Rule
    public SpotBugsRule spotbugs = new SpotBugsRule();

    @Test
    public void testGoodCase() {
        Path path = Paths.get("build/classes/java/test/", "unannotated".replace('.', '/'), "AnnotatedClass.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType("MY_BUG").build();

        assertThat(bugCollection, containsExactly( 0, bugTypeMatcher));
    }

    @Test
    public void testBadCase() {
        Path path = Paths.get("build/classes/java/test/", "unannotated".replace('.', '/'), "UnannotatedClass.class");
        BugCollection bugCollection = spotbugs.performAnalysis(path);

        BugInstanceMatcher bugTypeMatcher = new BugInstanceMatcherBuilder()
                .bugType("MY_BUG").build();

        assertThat(bugCollection, containsExactly( 1, bugTypeMatcher));
    }
}