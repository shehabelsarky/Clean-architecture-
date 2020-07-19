object Versions {
    val sharedPreference = "1.0.6"
    val work_version = "2.3.4"
    val core_ktx_version = "1.3.0"
    val kotlin_version = "1.3.41"
    val picasso_version = "2.5.2"
    val nav_version = "2.3.0-beta01"
    val appcompat_version = "1.1.0"
    val fragment_version = "1.2.4"
    val cardview_version = "1.0.0"
    val recyclerview_version = "1.1.0-alpha01"
    val multidex_version = "2.0.1"
    val lifecycle_version = "2.2.0"
    val legacy_version = "1.0.0"
    val room_version = "2.2.5"
    val constraintlayout_version = "1.1.3"
    val material_version = "1.3.0-alpha01"
    val retrofit2_version = "2.6.1"
    val okhttp3_version = "3.11.0"
    val converter_gson_version = "2.4.0"
    val logging_interceptor_version = "3.9.1"
    val gson_version = "2.8.2"
    val coroutines_version = "1.3.7"
    val groupie_version = "2.1.0"
    val hilt_android = "2.28-alpha"
    val hilt_view_model = "1.0.0-alpha01"
    val hilt_kapt = "2.28-alpha"
    val hilt_kapt_compiler = "1.0.0-alpha01"
    val test_junit = "4.12"
    val test_runner = "1.1.1"
    val espresso = "3.1.1"
    val mockitoInline = "2.11.0"
    val test_arch_core = "2.0.0"
    val mockitoKotlinVersion = "1.5.0"
    val activityKtxVersion = "1.2.0-alpha05"
    val fragmentKtxVersion = "1.3.0-alpha05"
}


object Android {
    val applicationId = "com.cooking.coroutine"
    val compileSdkVersion = 29
    val buildToolsVersion = "29.0.2"
    val minSdkVersion = 23
    val targetSdkVersion = 29
    val versionCode = 1
    val versionName = "1.0"

    val kotlin_version = "1.3.72"
    val mockitoKotlinVersion = "1.5.0"
    val nav_version = "2.1.0"
    val arch_version = "1.1.1"
}

object Kotlin {
    val kotlin_stdlib_jdk = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_version}"
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
    val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx_version}"
    val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin_version}"
}

object Androidx {
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat_version}"
    val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment_version}"
    val cardview = "androidx.cardview:cardview:${Versions.cardview_version}"
    val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview_version}"
    val multidex = "androidx.multidex:multidex:${Versions.multidex_version}"
    val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle_version}"
    val legacy = "androidx.legacy:legacy-support-v4:${Versions.legacy_version}"
    val lifecycle_compiler_kapt =
            "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle_version}"
    val ifecycle_reactivestreams =
            "androidx.lifecycle:lifecycle-reactivestreams:${Versions.lifecycle_version}"
    val lifecycle_common =
            "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle_version}"
    val lifecycle_runtime =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_version}"
    val lifecycle_livedata =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle_version}"
    val constraintlayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout_version}"
    val navigation_fragment =
            "androidx.navigation:navigation-fragment-ktx:${Versions.nav_version}"
    val navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.nav_version}"
    val room_runtime = "androidx.room:room-runtime:${Versions.room_version}"
    val room_ktx = "androidx.room:room-ktx:${Versions.room_version}"
    val room_compiler_kapt = "androidx.room:room-compiler:${Versions.room_version}"
    val lifecycle_viewmodel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle_version}"

    val activityKtx =  "androidx.activity:activity-ktx:${Versions.activityKtxVersion}"
    val fragmentKtx =  "androidx.fragment:fragment-ktx:${Versions.fragmentKtxVersion}"
}

object Material {
    val material = "com.google.android.material:material:${Versions.material_version}"
}

object Picasso {
    val picasso = "com.squareup.picasso:picasso:${Versions.picasso_version}"
}

object Retrofit {
    val retrofit2 = "com.squareup.retrofit2:retrofit:${Versions.retrofit2_version}"
    val okhttp3 = "com.squareup.okhttp3:okhttp:${Versions.okhttp3_version}"
    val converter_gson =
            "com.squareup.retrofit2:converter-gson:${Versions.converter_gson_version}"
    val logging_interceptor =
            "com.squareup.okhttp3:logging-interceptor:${Versions.logging_interceptor_version}"
}

object Gson {
    val gson = "com.google.code.gson:gson:${Versions.gson_version}"
}

object Coroutines {
    val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines_version}"
    val android =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines_version}"
}

object Groupie {
    val groupie = "com.xwray:groupie:${Versions.groupie_version}"
    val groupie_extension =
            "com.xwray:groupie-kotlin-android-extensions:${Versions.groupie_version}"
}

object Hilt {
    val hilt_android = "com.google.dagger:hilt-android:${Versions.hilt_android}"
    val viewmodel = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hilt_view_model}"
    val kapt_hilt_android = "com.google.dagger:hilt-android-compiler:${Versions.hilt_kapt}"
    val kapt_hilt_compiler = "androidx.hilt:hilt-compiler:${Versions.hilt_kapt_compiler}"
}

object TestLib {
    val junit = "junit:junit:${Versions.test_junit}"
    val runner = "androidx.test:runner:${Versions.test_runner}"
    val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    val mockito = "org.mockito:mockito-inline:${Versions.mockitoInline}"
    val core_testing = "androidx.arch.core:core-testing:${Versions.test_arch_core}"
    val mockito_kotlin = "com.nhaarman:mockito-kotlin-kt1.1:${Versions.mockitoKotlinVersion}"
}

object WorkManager{
    val workManager = "androidx.work:work-runtime-ktx:${Versions.work_version}"
}

object SharedPreference{
    val sharedPreference = "com.github.yehiahd:FastSave-Android:${Versions.sharedPreference}"
}

