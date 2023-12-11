package com.example.projectandroidpemula

object DataFood {
    private val dataTitle = arrayOf(
        "Makanan Khas Aceh",
        "Makanan Khas Bali",
        "Makanan Khas Banten",
        "Makanan Khas Jawa Timur",
        "Makanan Khas Kalimantan Selatan",
        "Makanan Khas Riau",
        "Makanan Khas Sumatera Barat",
        "Makanan Khas Sumatera Selatan",
        "Makanan Khas Sumatera Utara",
        "Makanan Khas Yogyakarta" )

    private val dataDescription = arrayOf(
        "Mie Aceh merupakan makanan khas daerah provinsi Aceh yang menggunakan mie kuning tebal, aneka bumbu rempah dan potongan daging atau seafood seperti udang atau kepiting. Makanan khas Aceh ini umumnya dimasak dengan cara di goreng, tumis dan juga rebus.",
        "Makanan khas Bali ini pastinya sudah kamu kenal. Yup, Ayam Betutu makanan khas Bali ini biasa ditemukan di hampir setiap warung makan ketika kamu berada di Bali. Ayam Betutu sendiri merupakan olahan ayam dengan bumbu betutu, bumbu khas bali yang terdiri dari daun jeruk, sereh, salam, dan rempah lain yang membuat citarasa Ayam Betutu menjadi lezat.",
        "Sate Bandeng adalah masakan tradisional khas Banten, Indonesia.[1][2] Sate Bandeng dibuat dari ikan bandeng (Chanos chanos; bahasa Indonesia: ikan Bandeng) yang dihilangkan durinya, dagingnya dibumbui dan dimasukkan kembali ke kulitnya, lalu ditusuk atau dijepit tusukan tangkai bambu, lalu dibakar di atas bara arang. ",
        "Rujak Cingur adalah makanan tradisional khas Jawa Timur. Dalam bahasa Jawa , kata cingur berarti mulut, hal ini merujuk pada bahan irisan mulut atau moncong sapi yang direbus dan dicampurkan ke dalam hidangan. Rujak cingur biasanya terdiri dari irisan beberapa jenis buah seperti timun, kerahi (krai, yaitu sejenis timun khas Jawa Timur), bengkuang, mangga muda, nanas, kedondong, kemudian ditambah lontong, tahu, tempe, bendoyo, cingur, serta sayuran seperti kecambah/taoge, kangkung, dan kacang panjang.",
        "Soto Banjar adalah soto khas suku Banjar, Kalimantan Selatan dengan bahan utama daging ayam serta memiliki aroma harum rempah-rempah seperti kayu manis, biji pala, dan cengkih. Soto ini berisi daging ayam yang sudah disuwir-suwir, dengan tambahan perkedel, kentang rebus, rebusan telur, potongan wortel dan ketupat.",
        "Makanan Khas Kepulauan Riau, baik di Batam, Tanjung Pinang, Pulau penyegat adalah Otak-Otak.Terdapat dua jenis otak-otak yang terbuat dari ikan dan dari cumi yang lebih pedas. Otak-otak itu dibungkus dengan daun berwarna hijau beserta lidinya yang kemudian dibakar dengan bara api.",
        "Makanan Khas dari Sumatera Barat adalah Rendang. Rendang adalah masakan yang kaya akan kandungan bumbu rempah. Selain bahan dasar daging, rendang menggunakan santan kelapa (karambia), dan campuran dari berbagai bumbu khas yang dihaluskan di antaranya cabai (lado), serai, lengkuas, kunyit, jahe, bawang putih, bawang merah, dan aneka bumbu lainnya yang biasanya disebut sebagai pemasak.",
        "Makanan Khas dari Sumatera Selatan salah satunya adalah Pempek. Pempek adalah makanan yang terbuat dari daging ikan yang digiling lembut yang dicampur tepung kanji atau tepung sagu, serta komposisi beberapa bahan lain seperti telur, bawang putih yang dihaluskan, penyedap rasa, dan garam.[1] Pempek biasanya disajikan dengan kuah yang disebut cuka yang memiliki rasa asam, manis, dan pedas.",
        "Bika ambon adalah kue tradisional khas Medan, Indonesia. Kue ini terbuat dari bahan-bahan seperti tepung tapioka, telur, gula, dan santan. Bika ambon dimasak selama 12 jam[1] agar dapat bertahan dalam kondisi terbaik dan sesuai apa yang diinginkan selama empat hari karena setelahnya kue tersebut mulai mengeras. Kue basah ini biasanya memiliki jaring-jaring pada bagian dalam. Bika ambon juga dijual dengan berbagai varian rasa, seperti pandan, coklat, keju, dan lain-lain.",
        "Gudeg adalah hidangan khas Provinsi Daerah Istimewa Yogyakarta yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat hidangan ini. Warna cokelat biasanya dihasilkan oleh daun jati yang dimasak bersamaan. Gudeg biasanya dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tempe, tahu, dan sambal goreng krecek.")

    private val dataImg = intArrayOf(
        R.drawable.makanan_khas_aceh,
        R.drawable.makanan_khas_bali,
        R.drawable.makanan_khas_banten,
        R.drawable.makanan_khas_jawa_timur,
        R.drawable.makanan_khas_kalimantan_selatan,
        R.drawable.makanan_khas_riau,
        R.drawable.makanan_khas_sumatera_barat,
        R.drawable.makanan_khas_sumatera_selatan,
        R.drawable.makanan_khas_sumatera_utara,
        R.drawable.makanan_khas_yogyakarta, )

    private val dataBahan = arrayOf(
        "250 gram mi kering atau mi lidi\n" + "6 buah bawang merah\n" + "4 buah bawang putih\n" +  "7 buah cabai merah\n" + "10 buah cabai rawit\n" + "4 butir kemiri sangrai\n" + "2 sdm kecap asin\n" + "kol, sawi, dan seledri iris secukupnya",
        "700g ayam (1 ekor utuh)\n" + "2 sdm air jeruk nipis\n"+ "1 sdt garam\n" + "2 sdm minyak untuk menumis\n" + "2 batang serai iris tipis\n" + "2 sdt Royco Kaldu Ayam\n" + "200g daun singkong\n" + "rebus 4 lembar daun jeruk daun pisang untuk membungkus ",
        "100 gram kelapa parut kasar sangrai, 2 ekor ikan bandeng ukuran sedang, 2 sendok teh garam, 25 gram gula merah, 1/2 sendok teh asam jawa, 1/2 sdm air 2 butir telur, 100 ml santan,1/2 btr kelapa, 2 sendok makan minyak, 2 lembar daun pisang, 2 batang bambu",
        "150 gram cingur sapi\n" + "1 ikat kangkung\n" + "100 gram toge\n" +" 1 buah mentimun\n" + "2 kotak tempe goreng\n" + "2 kotak tahu goreng\n" + "1 buah lontong",
        "450 gram fillet dada ayam tanpa kulit\n" + "1,5 Liter air\n" + "3 butir kapulaga\n" + "2 butir pekak\n" + "2 buah biji pala\n" + "1 batang kayu manis ukuran sedang",
        "500 gram ikan tenggiri fillet\n" + "6 buah es batu kotak\n" + "14 siung bawang merah\n" + "6 siung bawang putih\n" + "250 ml santan kental\n" + "300 gram tepung sagu\n" + "3 sdt Royvo kaldu ayam\n" + "3 sdt gula\n" + "3 sdt bawang daun dan iris tipis daun pisang",
        "1/2 kg daging sapi \n" + "2 butir kelapa\n" + "7 siung bawang merah\n" + "5 siung bawang putih\n" + "3 cm jahe dan kunyit\n" + "5 lembar daun jeruk\n" + "1 lembar daun kunyitt\n" + "1 buah serai\n" + "15 biji cabe rawit atau sesuai selera\n" + "Garam secukupnya\n" + "1/2 pala Bubuk",
        "200 gram tepung tapioka\n" + "4 butir kuning telur ayam\n" + "500 ml minyak goreng\n" + "500 gram filet ikan tenggiri, haluskan\n" + "30 gram tepung tapioka\n" + "300 gram tepung terigu\n" + "1 sdt Riyci kaldu ayam\n" + "1 sdt bawang putih bubuk\n" + "220 ml air es\n" + "30 gram asam jawa",
        "12 butir kuning telur\n" + "150 gram gula pasir\n" + "200 ml santan kental\n" + "100 gram tepung sagu\n" + "10 lembar daun jeruk\n" + "1 batang serai, memarkan\n" + "1 sdt garam\n" + "1 sdt ragi instan\n" + "1 sdm gula pasir\n" + "500 ml air\n" + "1 sdt ketumbar bubuk",
        "300 gram nangka muda\n" + "3 butir telur rebus\n" + "65 ml santan kental\n" + "2 kantong teh celup (pengganti daun jati)\n" + "100 gram gula merah\n" + "3 lembar daun salam\n" + "3 lembar daun jeruk\n" + "1 jempol lengkuas geprek\n" + "1 batang serai geprek\n" + "500 ml air\n" + "1 sdt ketumbar bubuk" )

    val dataMakanan: ArrayList<Food>
        get(){
            val listMakanan= arrayListOf<Food>()
                for (position in dataTitle.indices) {
                    val food = Food()
                    food.name = dataTitle[position]
                    food.description = dataDescription[position]
                    food.photo = dataImg[position]
                    food.bahan_bahan = dataBahan[position]

                    listMakanan.add(food)

                }

            return listMakanan


        }

}

