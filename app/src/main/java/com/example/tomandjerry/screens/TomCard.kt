package com.example.tomandjerry.screens

import com.example.tomandjerry.R

data class TomCard(
    val title: String,
    val description: String,
    val price: String,
    val imageRes: Int
)

val tomCards= listOf(
    TomCard(
        title = "Sport Tom",
        description = "He runs 1 meter... trips over his boot.",
        price = "3 cheeses",
        imageRes = R.drawable.tom_card_1,
    ),
    TomCard(
        title = "Tom the lover",
        description = "He loves one-sidedly... and is beaten by the other side.",
        price = "5 cheeses",
        imageRes = R.drawable.tom_card_2,
    ),
    TomCard(
        title = "Tom the bomb",
        description = "He blows himself up before Jerry can catch him.",
        price = "3 cheeses",
        imageRes = R.drawable.tom_card_3,
    ),
    TomCard(
        title = "Spy Tom",
        description = "Disguises itself as a table.",
        price = "6 cheeses",
        imageRes = R.drawable.tom_card_4,
    ),
    TomCard(
        title = "Frozen Tom",
        description = "He was chasing Jerry, he froze after the first look",
        price = "7 cheeses",
        imageRes = R.drawable.tom_card_5,
    ),
    TomCard(
        title = "Sleeping Tom",
        description = "He doesn't chase anyone, he just snores in stereo.",
        price = "9 cheeses",
        imageRes = R.drawable.tom_card_6,
    ),
)
