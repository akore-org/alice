package io.github.lexadiky.akore.alice.robo

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import io.github.lexadiky.akore.alice.DIModule
import io.github.lexadiky.akore.alice.ModuleBuilder

@Composable
fun eagerModule(name: String, vararg keys: Any, definition: ModuleBuilder.() -> Unit): DIModule =
    remember(keys = keys) { io.github.lexadiky.akore.alice.eagerModule(name, definition) }
