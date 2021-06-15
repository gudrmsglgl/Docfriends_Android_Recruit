package dependencies

import Versions

object Dependencies {
    // Android
    const val lifecycle_runtime = "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycleVersion}"
    const val navigation_fragment_ktx = "androidx.navigation:navigation-fragment-ktx:${Versions.navVersion}"
    const val navigation_ui_ktx = "androidx.navigation:navigation-ui-ktx:${Versions.navVersion}"
    const val livedata_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
    const val viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"

    // lib
    const val javaxAnnotation = "javax.annotation:jsr250-api:${Versions.javaxAnnotationVersion}"
    const val javaxInject = "javax.inject:javax.inject:${Versions.javaxInjectVersion}"
    const val dagger = "com.google.dagger:dagger:${Versions.daggerVersion}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val retrofit_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
    const val retrofit_rx = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofitVersion}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttpVersion}"
    const val okHttpLogger = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttpVersion}"
    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxVersion}"
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJavaVersion}"
}