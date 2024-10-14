plugins {
    id("org.jetbrains.intellij.platform")
    id("gpi-ij.intellij.base")
}

dependencies {
    intellijPlatform {
        rootProject.subprojects.forEach { project ->
            if (project.plugins.hasPlugin("gpi-ij.intellij.module").not()) return@forEach
            pluginModule(implementation(project))
        }
    }
}
