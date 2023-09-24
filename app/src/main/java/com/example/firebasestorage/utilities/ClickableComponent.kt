package com.example.firebasestorage.utilities
import androidx.compose.runtime.Composable

@Composable
fun Clickable(
    onClick: (() -> Unit)? = null,
    consumeDownOnStart: Boolean = false,
    children: @Composable() () -> Unit
){}