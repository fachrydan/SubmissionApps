package com.example.submissionapps

object DataGunung {

    private val namaGunung = arrayOf(
        "Gunung Rinjani",
        "Gunung Semeru",
        "Gunung Prau",
        "Gunung Merbabu",
        "Gunung Gede Pangrango",
        "Gunung Papandayan",
        "Gunung Bromo",
        "Gunung Ijen",
        "Gunung Kelimutu",
        "Gunung Patuha"
    )

    private val lokasiGunung = arrayOf(
        "Lombok, NTB",
        "Malang, Jawa Timur",
        "Dieng, Jawa Tengah",
        "Magelang, Jawa Tengah",
        "Jawa Barat",
        "Garut, Jawa Barat",
        "Malang, Jawa Timur",
        "Banyuwangi, Jawa Timur",
        "Pulau Flores, NTT",
        "Ciwidey, Jawa Barat"
    )

    private val fotoGunung = intArrayOf(
        R.drawable.rinjani,
        R.drawable.semeru,
        R.drawable.prau,
        R.drawable.merbabu,
        R.drawable.gede,
        R.drawable.papandayan,
        R.drawable.bromo,
        R.drawable.ijen,
        R.drawable.kelimutu,
        R.drawable.patuha
    )

    val ketingganGunung = mapOf(
        "Gunung Rinjani" to "3726 mdpl",
        "Gunung Semeru" to "3676 mdpl",
        "Gunung Prau" to "2565 mdpl",
        "Gunung Merbabu" to "3145 mdpl",
        "Gunung Gede Pangrango" to "2958 mdpl",
        "Gunung Papandayan" to "2665 mdpl",
        "Gunung Bromo" to "2329 mdpl",
        "Gunung Ijen" to "2779 mdpl",
        "Gunung Kelimutu" to "1639 mdpl",
        "Gunung Patuha" to "2434 mdpl"
    )

    val descGunung = mapOf(
            "Gunung Rinjani" to "Gunung Rinjani adalah gunung yang komplit. Ia punya padang sabana cantik yang ditumbuhi bunda edelweis, ia juga punya pemandangan sunrise yang menawan. Dari semua keindahan yang ada di Gunung Rinjani, Danau Segara Anak adalah yang paling dicari. Danau yang berada di ketinggian 2.000 mdpl ini merupakan permata paling indah di Gunung Rinjani.",
            "Gunung Semeru" to "Gunung ini telah menjadi legenda sejak lama. Mulai dari jaman Su Hok Gie hingga jamannya pendaki kekinian seperti sekarang. Keindahan gunung ini tak pernah lekang termakan waktu. Keindahan gunung ini membuat para pendaki dari berbagai daerah rela datang jauh-jauh.",
            "Gunung Prau" to "Gunung ini merupakan tanah tertinggi dalam barisan Dataran Tinggi Dieng. Dari puncak gunung ini kita bisa melihat pemandangan puncak Gunung Sindoro dan Sumbing yang terlihat begitu gagah dan elegan.",
            "Gunung Merbabu" to "Gunung ini berada di antara perbatasan Kabupaten Magelang, Boyolali serta Semarang. Gunung Merbabu menyajikan keindahan berupa padang sabana yang bisa kita nikmati dari lereng-lereng puncak serta puncak.",
            "Gunung Gede Pangrango" to "Tempat yang paling indah di Gunung Gede adalah Alun-alun Suryakencana. Tempat ini merupakan padang rumput yang dipenuhi bunga edelweis. Alun-alun Suryakencana merupakan salah satu tempat terbaik untuk menikmati pemandangan sang bunda abadi, Edelweis.",
            "Gunung Papandayan" to "Tempat yang paling indah di Gunung Gede adalah Alun-alun Suryakencana. Tempat ini merupakan padang rumput yang dipenuhi bunga edelweis. Alun-alun Suryakencana merupakan salah satu tempat terbaik untuk menikmati pemandangan sang bunda abadi, Edelweis.",
            "Gunung Bromo" to "Gunung Bromo memiliki pemandangan yang layak untuk dipromosikan secara luas. Gunung Bromo juga dikenal dengan gumul pasirnya yang sangat luas. Kendaraan jeep serta kuda menjadi pemandangan yang biasa di Gunung Bromo. ",
            "Gunung Ijen" to "Gunung Ijen sangat terkenal dengan pemandangan api birunya. Sebuah fenomena alam langka yang konon hanya ada dua di dunia. Api biru tersebut berasal dari cairan belerang yang ditambang secara tradisional oleh masyarakat di sekitar Gunung Ijen.",
            "Gunung Kelimutu" to "Di puncak gunung ini terdapat tiga buah danau yang dikenal dengan Danau Tiga Warna karna masing-masing air di danau tersebut memiliki warna yang berbeda-beda. Ketiga danau tersebut memiliki nama masing-masing antara lain Tiwu Nuwa Muri Koo Fai (danau biru), Tiwu Ata Polo (danau merah) dan Tiwu Ata Mbupu (danau putih).",
            "Gunung Patuha" to "Nama gunung ini mungkin masih cukup asing. Namun, jika disebutkan Kawah Putih, semua pasti sudah tahu dimana gunung ini berada. Kawah Putih merupakan bagian dari Gunung Patuha yang lebih dikenal orang daripada Gunung Patuha itu sendiri."
    )


    val listData: ArrayList<Gunung>
    get(){
        val listGunung = arrayListOf<Gunung>()
        for (position in namaGunung.indices){
            val gunung = Gunung()
            gunung.name = namaGunung[position]
            gunung.location = lokasiGunung[position]
            gunung.photo = fotoGunung[position]
            listGunung.add(gunung)
        }
        return listGunung
    }

}