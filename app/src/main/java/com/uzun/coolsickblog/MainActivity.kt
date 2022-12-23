package com.uzun.coolsickblog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.uzun.coolsickblog.ui.theme.CoolSickBlogTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			CoolSickBlogTheme {
			}
		}
	}
}