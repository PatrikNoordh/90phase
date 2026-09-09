package com.example.a90phase.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a90phase.presentation.theme.NightSkyTheme
import com.example.a90phase.presentation.theme.SleepColors
import com.example.a90phase.presentation.theme.SleepTypography
import com.example.a90phase.presentation.theme.Spacing

/**
 * A labelled switch, optionally with a line of explanation underneath.
 *
 * [description] is for saying what the toggle will actually do — a label alone often cannot,
 * and cramming the explanation into the label pushes the switch off the row.
 */
@Composable
fun SleepToggle(
    label: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    description: String? = null,
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(
            // weight, so a long label wraps instead of squeezing the switch off the row.
            modifier = Modifier
                .weight(1f)
                .padding(end = Spacing.Medium),
        ) {
            Text(
                text = label,
                style = SleepTypography.BodyLarge,
                color = SleepColors.White,
            )
            if (description != null) {
                Spacer(modifier = Modifier.height(Spacing.XXS))
                Text(
                    text = description,
                    style = SleepTypography.BodyMedium,
                    color = SleepColors.Silver,
                )
            }
        }
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            colors = SwitchDefaults.colors(
                checkedTrackColor = SleepColors.CyanGlow,
                uncheckedTrackColor = SleepColors.MidnightBlue,
                checkedThumbColor = SleepColors.DeepSpace,
                uncheckedThumbColor = SleepColors.Silver,
            ),
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1120)
@Composable
internal fun SleepToggleOnPreview() {
    NightSkyTheme {
        SleepToggle(label = "Daily Check-in (18:00)", checked = true, onCheckedChange = {})
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF0B1120)
@Composable
internal fun SleepToggleOffPreview() {
    NightSkyTheme {
        SleepToggle(label = "Smart Wake Window", checked = false, onCheckedChange = {})
    }
}
