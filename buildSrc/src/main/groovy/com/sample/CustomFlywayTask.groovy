package com.sample

import org.flywaydb.core.Flyway
import org.flywaydb.gradle.task.AbstractFlywayTask

class CustomFlywayTask extends AbstractFlywayTask {

    @Override
    def run(final Flyway flyway) {
        logger.info "Ran successfully!"
    }
}
