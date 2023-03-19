package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Abc
import androidx.compose.material.icons.outlined.KeyboardBackspace
import androidx.compose.material.icons.outlined.KeyboardReturn
import androidx.compose.material.icons.outlined.Settings
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.SwipeDirection

val NUMERIC_KEYBOARD = KeyboardC(
    arrayOf(
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("1"),
                    action = KeyAction.CommitText("1"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("-"),
                        action = KeyAction.CommitText("-")
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("$"),
                        action = KeyAction.CommitText("$")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("2"),
                    action = KeyAction.CommitText("2"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("`"),
                        action = KeyAction.CommitText("`")
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("^"),
                        action = KeyAction.CommitText("^")
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("´"),
                        action = KeyAction.CommitText("´")
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("!"),
                        action = KeyAction.CommitText("!")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("\\"),
                        action = KeyAction.CommitText("\\")
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("/"),
                        action = KeyAction.CommitText("/")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("3"),
                    action = KeyAction.CommitText("3"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("?"),
                        action = KeyAction.CommitText("?")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("€"),
                        action = KeyAction.CommitText("€")
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("="),
                        action = KeyAction.CommitText("=")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
                    action = KeyAction.GotoSettings,
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("4"),
                    action = KeyAction.CommitText("4"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("{"),
                        action = KeyAction.CommitText("{")
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("%"),
                        action = KeyAction.CommitText("%")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("_"),
                        action = KeyAction.CommitText("_")
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("["),
                        action = KeyAction.CommitText("[")
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("("),
                        action = KeyAction.CommitText("(")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("5"),
                    action = KeyAction.CommitText("5"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("6"),
                    action = KeyAction.CommitText("6"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("|"),
                        action = KeyAction.CommitText("|")
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("}"),
                        action = KeyAction.CommitText("}")
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay(")"),
                        action = KeyAction.CommitText(")")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("]"),
                        action = KeyAction.CommitText("]")
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("@"),
                        action = KeyAction.CommitText("@")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.Abc),
                    action = KeyAction.ToggleNumericMode(false),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("7"),
                    action = KeyAction.CommitText("7"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("~"),
                        action = KeyAction.CommitText("~")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay(":"),
                        action = KeyAction.CommitText(":")
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("<"),
                        action = KeyAction.CommitText("<")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("8"),
                    action = KeyAction.CommitText("8"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("\""),
                        action = KeyAction.CommitText("\"")
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("'"),
                        action = KeyAction.CommitText("'")
                    ),
                    SwipeDirection.BOTTOM_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("*"),
                        action = KeyAction.CommitText("*")
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("."),
                        action = KeyAction.CommitText(".")
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay(","),
                        action = KeyAction.CommitText(",")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("9"),
                    action = KeyAction.CommitText("9"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("&"),
                        action = KeyAction.CommitText("&")
                    ),
                    SwipeDirection.TOP_RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("°"),
                        action = KeyAction.CommitText("°")
                    ),
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay(">"),
                        action = KeyAction.CommitText(">")
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        display = KeyDisplay.TextDisplay(";"),
                        action = KeyAction.CommitText(";")
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("#"),
                        action = KeyAction.CommitText("#")
                    )
                )
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardBackspace),
                    action = KeyAction.SendEvent(
                        KeyEvent(
                            KeyEvent.ACTION_DOWN,
                            KeyEvent
                                .KEYCODE_DEL
                        )
                    ),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        action = KeyAction.DeleteLastWord,
                        display = null
                    ),
                    SwipeDirection.TOP_LEFT to KeyC(
                        action = KeyAction.DeleteLastWord,
                        display = null
                    ),
                    SwipeDirection.BOTTOM_LEFT to KeyC(
                        action = KeyAction.DeleteLastWord,
                        display = null
                    )
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        ),
        arrayOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("0"),
                    action = KeyAction.CommitText("0"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                widthMultiplier = 2
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay(" "),
                    action = KeyAction.CommitText(" ")
                ),
                nextTapActions = arrayOf(
                    KeyAction.ReplaceLastText(". ", trimCount = 1),
                    KeyAction.ReplaceLastText(", "),
                    KeyAction.ReplaceLastText("? "),
                    KeyAction.ReplaceLastText("! "),
                    KeyAction.ReplaceLastText(": ")
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardReturn),
                    action = KeyAction.IMECompleteAction,
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY
                ),
                backgroundColor = ColorVariant.SURFACE_VARIANT
            )
        )
    )
)
