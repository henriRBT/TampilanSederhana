package com.example.gd3_a_0781.entity

class Dosen (var name: String, var pengajar: String) {

    companion object {
        @JvmField
        var listOfDosen = arrayOf(
            Dosen("Fedelis Brian", "Pengajar kelas A, B, dan D"),
            Dosen("Thomas Adi", "Pengajar kelas C")
        )
    }
}