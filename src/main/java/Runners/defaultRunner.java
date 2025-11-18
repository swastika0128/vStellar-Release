package Runners;

import com.vaf.RunnerInterchange;
import com.vaf.exceptions.MissingPropertiesException;

public class defaultRunner {
    public static void main(String[] args) throws MissingPropertiesException {
        String[] defaultRunnerArgs = {
                "--activeTags", "@Smoke",
                "--featureFilePath", "src/main/resources/test-suite/UI",
                "--stepDefPath", "com.vaf.steps", "com.example.ui.stepdef"
        };
        RunnerInterchange.initializeAndRun(args, defaultRunnerArgs);
    }
}
