plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}
// Required since Gradle 4.10+.
repositories {
    google()
    mavenCentral()
}

dependencies {
    compileOnly(gradleApi())
    implementation("com.android.tools.build:gradle:4.1.3")
    implementation(kotlin("gradle-plugin", "1.4.10"))
    implementation(kotlin("android-extensions"))
}

gradlePlugin {
    plugins {
        register("base-android-config") {
            id = "base-android-config"
            implementationClass = "AndroidBasePlugin"
        }
    }
}