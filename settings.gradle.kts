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
rootProject.name = "FoodDeliveryApp"

include(":app")
include(":gradleConfiguration")
include(":features:home:impl")
include(":features:home:public")
include(":design_system")
