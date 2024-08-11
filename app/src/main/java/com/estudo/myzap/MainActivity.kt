package com.estudo.myzap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.PhotoCamera
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.estudo.myzap.model.NavItem
import com.estudo.myzap.sampledata.itemsNavSample
import com.estudo.myzap.sampledata.sampleMenu
import com.estudo.myzap.ui.components.SearchTextField
import com.estudo.myzap.ui.theme.GreenDark
import com.estudo.myzap.ui.theme.GreenDefault
import com.estudo.myzap.ui.theme.GreenShadow
import com.estudo.myzap.ui.theme.MyZapTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    val navItems: List<NavItem> = itemsNavSample
    var expanded by remember {
        mutableStateOf(false)
    }
    val menuItems = sampleMenu
    MyZapTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = stringResource(id = R.string.app_name),
                            color = GreenDefault,
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp,

                            )
                    },
                    actions = {

                        Icon(
                            imageVector = Icons.Outlined.PhotoCamera,
                            contentDescription = "Search",
                        )
                        IconButton(
                            onClick = { expanded = true }
                        ) {
                            Icon(
                                imageVector = Icons.Filled.MoreVert,
                                contentDescription = "More",
                            )
                            DropdownMenu(
                                expanded = expanded,
                                onDismissRequest = { expanded = false },

                                ) {
                                menuItems.forEach { item ->
                                    DropdownMenuItem(
                                        onClick = {
                                            expanded = false
                                        },
                                        leadingIcon = {
                                            Icon(
                                                imageVector = item.icon,
                                                contentDescription = null
                                            )
                                        },
                                        text = {
                                            Text(text = item.title)
                                        }
                                    )
                                }
                            }
                        }

                    }
                )
            },
            bottomBar = {
                BottomAppBar {

                    var selectedItem by remember {
                        mutableStateOf(navItems.first())
                    }

                    navItems.forEach { navItem ->
                        NavigationBarItem(
                            selected = navItem == selectedItem,
                            onClick = {
                                selectedItem = navItem
                            },
                            icon = {
                                if (selectedItem == navItem) {
                                    Icon(
                                        imageVector = navItem.blackIcon,
                                        contentDescription = null
                                    )
                                } else {
                                    Icon(imageVector = navItem.icon, contentDescription = null)

                                }
                            },
                            label = {
                                if (selectedItem == navItem) {
                                    Text(
                                        text = navItem.label,
                                        fontWeight = FontWeight.Bold
                                    )
                                } else {
                                    Text(
                                        text = navItem.label,
                                    )
                                }
                            },
                            colors = NavigationBarItemDefaults.colors(
                                selectedIconColor = GreenDark,
                                indicatorColor = GreenShadow,
                            )
                        )
                    }
                }
            },
        )
        { innerPadding ->
            Column(Modifier.padding(top = 85.dp)) {
                Row {
                    SearchTextField(
                        searchText = "Pesquisar",
                        onSearchChanged = {}
                    )
                }
            }

            Box(modifier = Modifier.padding(innerPadding)) {
                // Content
            }
        }
    }
}

@Preview
@Composable
private fun AppPreview() {
    MyZapTheme {
        App()
    }
}