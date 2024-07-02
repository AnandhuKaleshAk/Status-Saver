package com.status.saver

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource

sealed class BottomBarScreen(
    val route: String,
    val titleResId: Int,
    val icon: Int
) {
    data object Images : BottomBarScreen(
        route = "Images",
        titleResId=R.string.images,
        icon = R.drawable.ic_image_icon
    )

    data object Videos : BottomBarScreen(
        route = "Videos",
        titleResId=R.string.videos,
        icon = R.drawable.ic_play
    )

    data object Saved : BottomBarScreen(
        route = "Saved",
        titleResId=R.string.saved,
        icon = R.drawable.ic_saved
    )

    data object Settings : BottomBarScreen(
        route = "Settings",
        titleResId=R.string.settings,
        icon = R.drawable.ic_settings
    )



}