package nebula.plugin.nothing

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.logging.Logger
import org.gradle.api.logging.Logging

/**
 * Does nothing.
 */
class NothingPlugin implements Plugin<Project> {

    Logger logger = Logging.getLogger(NothingPlugin);

    Project project

    void apply(Project project) {

        this.project = project

    }
}
