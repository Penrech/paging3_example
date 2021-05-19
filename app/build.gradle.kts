plugins {
    id("com.android.application")
    `base-android-config`
}

android {
    defaultConfig {
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

}

dependencies {
    implementation(Deps.kotlin)

    //support libs
    coroutines()
    implementation(Deps.appCompat)
    implementation(Deps.recyclerView)
    implementation(Deps.constraintLayout)
    implementation(Deps.materialLibrary)

    //arch components
    implementation(Deps.coreKtx)
    lifecycle()
    room()
    navigation()
    paging()

    //retrofit
    retrofit()

    //image processing lib
    implementation(Deps.coil)

    // testing
    uiTest()
}