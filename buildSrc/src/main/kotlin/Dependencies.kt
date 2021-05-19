import org.gradle.api.artifacts.dsl.DependencyHandler

object Deps {
    const val androidGradle = "com.android.tools.build:gradle:${Versions.androidGradleVersion}"
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"

    //support libs
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerViewVersion}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    const val materialLibrary = "com.google.android.material:material:${Versions.materialVersion}"

    //arch components
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreVersion}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"
    const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
    const val roomRuntime = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"
    const val pagingRuntime = "androidx.paging:paging-runtime:${Versions.pagging3Version}"
    const val pagingRxjava = "androidx.paging:paging-rxjava2-ktx:${Versions.pagging3Version}"

    //retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val moshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofitVersion}"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptorVersion}"

    //image processing lib
    const val coil = ("io.coil-kt:coil:${Versions.coilVersion}")
}

object TestDeps {
    const val junit = "junit:junit:${Versions.junitVersion}"
    const val runner = "androidx.test:runner:${Versions.runnerVersion}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
}

fun DependencyHandler.coroutines() {
    add("implementation", Deps.coroutinesAndroid)
    add("implementation", Deps.coroutinesCore)
}

fun DependencyHandler.retrofit() {
    add("implementation", Deps.retrofit)
    add("implementation", Deps.moshi)
    add("implementation", Deps.loggingInterceptor)
}

fun DependencyHandler.lifecycle(){
    add("implementation", Deps.lifecycleLiveData)
    add("implementation", Deps.lifecycleViewModel)
}

fun DependencyHandler.room(){
    add("implementation", Deps.roomRuntime)
    add("implementation", Deps.roomKtx)
    add("kapt", Deps.roomCompiler)
}

fun DependencyHandler.navigation() {
    add("implementation", Deps.navigationFragment)
    add("implementation", Deps.navigationUi)
}

fun DependencyHandler.paging() {
    add("implementation", Deps.pagingRuntime)
    add("implementation", Deps.pagingRxjava)
}

fun DependencyHandler.uiTest() {
    add("testImplementation", TestDeps.junit)
    add("androidTestImplementation", TestDeps.espressoCore)
    add("androidTestImplementation", TestDeps.runner)
}