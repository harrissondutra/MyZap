package com.estudo.myzap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.PhotoCamera
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
import com.estudo.myzap.sampledata.sampleMenu
import com.estudo.myzap.ui.screens.AtualizacoesScreen
import com.estudo.myzap.ui.screens.ChatScreen
import com.estudo.myzap.ui.screens.ComunidadesScreen
import com.estudo.myzap.ui.screens.LigacoesScreen
import com.estudo.myzap.ui.theme.GreenDarkIcon
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

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun App() {
    val items = remember {
        listOf(
            NavItem.Conversas,
            NavItem.Atualizacoes,
            NavItem.Comunidades,
            NavItem.Ligacoes
        )
    }
    var expanded by remember {
        mutableStateOf(false)
    }
    val pagerState = rememberPagerState {
        items.size
    }
    val menuItems = sampleMenu

    var selectedItem by remember {
        mutableStateOf(items.first())
    }

    LaunchedEffect(selectedItem) {
        pagerState.animateScrollToPage(items.indexOf(selectedItem))
    }
    LaunchedEffect (pagerState.targetPage) {
        selectedItem = items[pagerState.targetPage]

    }

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
                BottomAppBar(Modifier.fillMaxWidth()) {
                    items.forEach { navItem ->
                        NavigationBarItem(
                            selected = navItem == selectedItem,
                            onClick = {
                                selectedItem = navItem
                            },
                            icon = {
                                if (selectedItem == navItem) {
                                    Icon(
                                        modifier = Modifier.size(30.dp),
                                        imageVector = navItem.blackIcon,
                                        contentDescription = null
                                    )
                                } else {
                                    Icon(
                                        modifier = Modifier.size(30.dp),
                                        imageVector = navItem.icon,
                                        contentDescription = null
                                    )

                                }
                            },
                            label = {
                                if (selectedItem == navItem) {
                                    Text(
                                        text = navItem.label,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 14.sp
                                    )
                                } else {
                                    Text(
                                        text = navItem.label,
                                        fontWeight = FontWeight.Normal,
                                        fontSize = 14.sp
                                    )
                                }
                            },
                            colors = NavigationBarItemDefaults.colors(
                                selectedIconColor = MaterialTheme.colorScheme.secondary,
                                indicatorColor = MaterialTheme.colorScheme.tertiary,
                            )
                        )
                    }
                }
            },
        )
        { innerPadding ->
            HorizontalPager(
                state = pagerState,
                modifier = Modifier.padding(innerPadding)
            ) { page ->
                val item = items[page]
                when (item) {
                    NavItem.Conversas -> ChatScreen()
                    NavItem.Atualizacoes -> AtualizacoesScreen()
                    NavItem.Comunidades -> ComunidadesScreen()
                    NavItem.Ligacoes -> LigacoesScreen()
                }

            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun AppPreview() {
    MyZapTheme(darkTheme = true, dynamicColor = false) {
        App()
    }
}