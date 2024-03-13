pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "kvetkovsky_labs"
include(":app")
include(":app:lab2_events_src")
include(":app:lab3_menus")
include(":lab3_kvetkovsky_example_1")
include(":lab3_kvetkovsky_example_2")
include(":lab3_example3")
include(":lab3_task")
