object Dependencies {

    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val appcompact by lazy { "androidx.appcompat:appcompat:${Versions.appcompact}" }
    val material by lazy { "androidx.compose.material:material:${Versions.material}" }
    val lifecycleRuntimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val composeBom by lazy { "androidx.compose:compose-bom:${Versions.compose}" }
    val composeUi by lazy { "androidx.compose.ui:ui:" }
    val composeUiGraphic by lazy { "androidx.compose.ui:ui-graphics:" }
    val composeUiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val composeMaterial3 by lazy { "androidx.compose.material3:material3" }
    val navigationCompose by lazy { "androidx.navigation:navigation-compose:${Versions.navigationCompose}" }
    val composTestJUnit4 by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.compose}" }
    val composTooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.compose}" }
    val composUiTestmanifest by lazy { "androidx.compose.ui:ui-test-manifest:${Versions.compose}" }

    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
    val hiltAndroidCompailer by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hiltCompailer}" }
    val hiltCompailer by lazy { "androidx.hilt:hilt-compiler:${Versions.hiltCompailer}" }

}

object Modules {
    const val utilities = ":utilities"
}