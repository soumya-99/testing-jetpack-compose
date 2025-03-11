package com.example.bazarford

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreen() {

    val userName by remember { mutableStateOf("") }
    val password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        CustomTextField(userName, label = "User Name", placeholder = "Enter User Name", icon = Icons.Default.Person)

        Spacer(
            modifier = Modifier.padding(5.dp)
        )

        CustomTextField(password, label = "Password", placeholder = "Enter Password", icon = Icons.Default.Lock)

        Spacer(
            modifier = Modifier.padding(5.dp)
        )

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp).height(60.dp),
        ) {
            Text(
                text = "LOGIN"
            )
        }

    }

}

@Composable
private fun CustomTextField(
    value: String,
    label: String = "", placeholder: String = "",
    icon: ImageVector
) {
    var userName = value
    OutlinedTextField(
        value = userName,
        onValueChange = {
            userName = it
        },
        label = {
            Text(text = label, fontSize = 14.sp)
        },
        placeholder = {
            Text(text = placeholder, fontSize = 14.sp)
        },
        leadingIcon = {
            Icon(imageVector = icon, contentDescription = "")
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        shape = MaterialTheme.shapes.large


    )
}
