import com.android.build.gradle.BaseExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

class AndroidBasePlugin: Plugin<Project> {

    override fun apply(target: Project) {

        target.plugins.apply("kotlin-android")
        target.plugins.apply("kotlin-kapt")

        (target.extensions.getByName("android") as? BaseExtension)?.apply {
            compileSdkVersion(DefaultConfig.compileSdk)
            defaultConfig {
                applicationId = "com.enrech.paging3_example"
                targetSdkVersion(DefaultConfig.targetSdk)
                minSdkVersion(DefaultConfig.minSdk)

                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
            }
            compileOptions {
                sourceCompatibility = JavaVersion.VERSION_1_8
                targetCompatibility = JavaVersion.VERSION_1_8
            }
            target.tasks.withType(KotlinCompile::class.java).configureEach {
                kotlinOptions {
                    jvmTarget = "1.8"
                }
            }
        }

    }
}