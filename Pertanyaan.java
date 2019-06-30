package com.dimas.projectpi;

public class Pertanyaan {

    private String cPertanyaan [] = {

            "Apa nama benua terluas di dunia ? ",
            "Negara manakah yang memiliki wilayah terluas di dunia ?",
            "Gurun terluas di dunia adalah ?",
            "SEA Games diadakan setiap berapa tahun sekali ?",
            "Negara yang memiliki luas wilayah terkecil di dunia ?",
            "Danau terluas di Indonesia adalah ?",
            "Bunga Tulip berasal dari negara ?",
            "Samudra terluas di dunia adalah ?",
            "Ikan yang bernafas dengan paru-paru adalah ?",
            "Tumbuhan berduri yang kebanyakan tumbuh pada daerah gersang seperti gurun adalah ?",
            "Monumen terkenal di kota Paris adalah ?",
            "Bahan bakar kereta api adalah ?",
            "Gunung tertinggi di dunia adalah ? ",
            "Ilmu Pengetahuan Aalam disebut juga ilmu ? ",
            "Mata uang negara Indonesia adalah ?",
            "Ibukota negara Rusia adalah ?",
            "Pakaian tradisional khas Indonesia yang bernilai seni tinggi adalah ?",
            "Tari Kecak adalah jenis tarian yang berasal dari daerah ?",
            "Senjata yang digunakan indonesia pada masa penjajahan adalah ?",
            "Indonesia dijajah Jepang Selama ?",
            "Alat Pernafasan Belalang adalah ?",
            "Kota Terpadat di Dunia adalah ?",
            "Penduduk asli Australia adalah suku ?",
            "Vitamin yang banyak terkandung dalam buah-buahan adalah",
            "Lembaga yang membina kerjasama internasional di bidang ilmu pengetahuan dan pendidikan adalah ?"
        };

    private String cPilihan [][] = {
            {"Amerika Utara", "Afrika", "Eropa", "Asia"},
            {"Rusia", "Indonesia", "Belanda", "Colombia"},
            {"Gurun Syrian", "Gurun Antartika", "Gurun Kalahari", "Gurun Patogonia"},
            {"4 Tahun", "2 Tahun", "3 Tahun", "5 Tahun"},
            {"Vatikan", "Denmark", "Rusia", "Nigeria"},
            {"Danau Semayang", "Danau Matano", "Danau Toba", "Danau Poso"},
            {"Turki", "Indonesia", "Belanda", "China"},
            {"Samudra Atlantik", "Samudra Pasifik", "Samudra Hindia", "Samudra Antartika"},
            {"IkanSalmon", "Ikan Hiu", "Paus", "Ikan Buntel"},
            {"KAKTUS", "LUMUT", "BUNGA", "PINIDAE"},
            {"Menara Eiffel", "Monas", "Patung Liberty", "Patung Sphinx"},
            {"Bensin", "Avtur", "Solar", "Batubara"},
            {"Gunung Bromo", "Gunung Everest", "Gunung Makalu", "Gunung Salak"},
            {"Ilmu Seni", "Ilmu Sains", "Ilmu Beladiri", "Ilmu Ghaib"},
            {"YEN", "DOLAR", "RUPIAH", "RINGGIT"},
            {"MOSCOW", "TIRANA", "AMSTERDAM", "SANTIAGO"},
            {"Barong Tagalog", "JAS", "Batik", "Baju Kurung"},
            {"Bali", "Jawa", "Kalimantan", "Sumatra"},
            {"Gas Air Mata", "Tank", "Bambu Runcing", "MP7"},
            {"3,5 Tahun", "2,5 Tahun", "5 Tahun", "4,5 Tahun"},
            {"Paru-Paru", "Trakea", "Insang", "Stomata"},
            {"Kairo " , "Tokyo" , "Osaka" , "New York"},
            {"Ishi" , "Aborigin" , "Surma" , "Yanomami"},
            {"Vitamin A" , "Vitamin B" , "Vitamin C" , "Vitamin D"},
            {"UNICEKO" , "UNISKO" , "UNSCO" , "UNESCO"}
    };

    private String cJawaban [] = {

            "Asia",
            "Rusia",
            "Gurun Antartika",
            "2 Tahun",
            "Vatikan",
            "Danau Toba",
            "Turki",
            "Samudra Pasifik",
            "Paus",
            "KAKTUS",
            "Menara Eiffel",
            "Batubara",
            "Gunung Everest",
            "Ilmu Sains",
            "RUPIAH",
            "Batik",
            "Bali",
            "Bambu Runcin",
            "3,5 Tahun",
            "Trakea",
            "Tokyo",
            "Aborigin",
            "Vitamin A",
            "UNESCO"

    };

    public String getQuestion (int nomor){
        String tanya = cPertanyaan[nomor];
        return tanya;
    }

    public String getAnswer (int nomor){
        String jawab = cJawaban[nomor];
        return jawab;
    }

    public String getChoice1 (int nomor){
        String pilih = cPilihan[nomor][0];
        return pilih;
    }
    public  String getChoice2 (int nomor){
        String pilih = cPilihan[nomor][1];
        return pilih;
    }
    public  String getChoice3 (int nomor){
        String pilih = cPilihan[nomor][2];
        return pilih;
    }
    public  String getChoice4 (int nomor){
        String pilih = cPilihan[nomor][3];
        return pilih;
    }

}