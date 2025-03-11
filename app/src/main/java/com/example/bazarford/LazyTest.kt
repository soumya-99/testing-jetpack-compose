package com.example.bazarford

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

data class Contact (
    val name: String,
    val phoneNumber: String
)

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LazyTest() {

    val contacts = remember {
        listOf(
            Contact(
                name = "Soumyadeep Mondal",
                phoneNumber = "8910792003"
            ),
            Contact(
                name = "Hello",
                phoneNumber = "8910792003"
            ),
            Contact(
                name = "Hiii",
                phoneNumber = "8910792003"
            ),
            Contact(
                name = "SOme name",
                phoneNumber = "8910792003"
            ),
            Contact(
                name = "fsd Mondal",
                phoneNumber = "8910792003"
            ),
            Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ), Contact(
                name = "Avisdhfo",
                phoneNumber = "8910792003"
            ),
        )
    }

//    LazyColumn(
//        modifier = Modifier.fillMaxSize()
//    ) {
//
//        items(contacts) {
//            contact ->
//            Card(
//                modifier = Modifier.fillMaxWidth().padding(16.dp)
//            ) {
//                Column(
//                    modifier = Modifier.padding(12.dp)
//                ) {
//                    Text(text = contact.name)
//                    Text(text = contact.phoneNumber)
//                }
//            }
//        }
//
//    }


    LazyRow (
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.Bottom
    ) {

        items(contacts) {
                contact ->
            Card(
                modifier = Modifier.fillMaxWidth().padding(16.dp)
            ) {
                Column(
                    modifier = Modifier.padding(12.dp)
                ) {
                    Text(text = contact.name)
                    Text(text = contact.phoneNumber)
                }
            }
        }

    }

}