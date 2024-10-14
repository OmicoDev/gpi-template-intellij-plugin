import me.omico.gradle.initialization.includeAllSubprojectModules
import me.omico.gradm.addDeclaredRepositories

addDeclaredRepositories()

plugins {
    id("gpi-ij.develocity")
    id("gpi-ij.gradm")
    id("gpi-ij.intellij")
}

includeBuild("build-logic/project")

includeAllSubprojectModules("gpi-ij")
