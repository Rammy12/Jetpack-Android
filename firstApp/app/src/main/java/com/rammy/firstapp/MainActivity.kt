package com.rammy.firstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rammy.firstapp.ui.theme.FirstAppTheme 

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    //Text(text = "KuchBhi")
                    Column(
                        modifier = Modifier.background(Color.Yellow)
                    ) {
                        // Login Text
                        Text(text = "Login",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.ExtraBold,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .padding(vertical = 120.dp))
                        // text field 1
                        TextField(value = "",
                            onValueChange = {},
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            placeholder = {
                                Text(text = "Email")
                            },
                            colors = TextFieldDefaults.textFieldColors(
                                containerColor  = Color.Transparent
                            ),
                            leadingIcon = {
                                Icon(imageVector = Icons.Rounded.Email, contentDescription = null)
                            }
                                )

                        Spacer(modifier = Modifier.height(10.dp))
                        // spacer for space

                        // Text field 2
                        TextField(
                            value = "", onValueChange = {},
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            placeholder = {
                                Text(text = "Password")
                            },
                            leadingIcon = {
                                Icon(imageVector = Icons.Rounded.Lock, contentDescription = null)
                            },
                            colors = TextFieldDefaults.textFieldColors(
                                containerColor  = Color.Transparent
                            ),
                            shape = RoundedCornerShape(20.dp)
                                )

                        Spacer(modifier = Modifier.height(10.dp))

                        // Login Button
                        Button(onClick = { /*TODO*/ },
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .fillMaxWidth()
                                .fillMaxWidth()
                                .padding(horizontal = 60.dp)
                                ) {
                            Text(text = "Login")
                        }

                    }
                }
            }
        }
    }
}

