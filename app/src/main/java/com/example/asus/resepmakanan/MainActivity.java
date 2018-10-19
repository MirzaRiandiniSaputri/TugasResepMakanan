package com.example.asus.resepmakanan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private LinkedList<String> resep_nama = new LinkedList<String>();
    private LinkedList<String> resep_detail = new LinkedList<String>();
    private LinkedList<String> resep_ingredients = new LinkedList<String>();
    private LinkedList<String> resep_process = new LinkedList<String>();
    private Context ctx;
    private RecyclerView mRecyclerView;
    private RecyclerviewAdapter mAdapter;
    private List<Menu> menuList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        resep_nama.add("Nasi Megono");
        resep_detail.add("Nasi Megono ini umumnya terdiri dari nasi yang kemudian diolah bersama cacahan nangka muda serta parutan kelapa. Proses pembuatannya sendiri tergolong cukup mudah. ");
        resep_ingredients.add("Bahan Membuat Nasi Megono :\n" +
                "500 gr nangka muda yang sudah dicacah\n" +
                "1/2 butir kelapa parut (jangan terlalu tua)\n" +
                "bumbu halus :\n" +
                "4 siung bawang putih\n" +
                "8 siung bawang merah\n" +
                "8 buah cabe rawit\n" +
                "1 sdt terasi\n" +
                "1 cm kencur\n" +
                "1 sdm ketumbar\n" +
                "1 batang serai\n" +
                "1 sdm gula merah\n" +
                "5 lembar daun salam\n" +
                "1 kuntum bunga kecombrang diiris\n" +
                "2 batang bawang daun diiris\n");
        resep_process.add("\nCara Membuat Nasi Megono :\n" +
                " 1.Langkah pertama, Iris iris bawang merah beserta daun bawang, bunga kecombrang dan cabe merah.\n" +
                " 2.Selanjutnya, haluskan semua bahan bumbu lalu campurkan bumbu yang sudah dihaluskan, irisan bawang merah irisan kecombrang, irisan cabe merah dengan kelapa parut. Setelah itu masukkan semua bahan ke dalam panci,kemudian kukus hingga matang, lalu aduk rata angkat dan sajikan bersama tempe mendoan (jika suka) agar rasanya lebih maknyus :D.\n" +
                "  ");
        resep_nama.add("Udang Saus Pedas Manis ");
        resep_detail.add("Ingin menikmati olahan udang yang lezat dan simpel bikinnya. Yuk, coba bikin udang saus pedas manis yang satu ini. Cukup gampang lho resepnya.");
        resep_ingredients.add("Bahan-Bahan\n" +
                "250 gram udang\n" +
                "1/4 butir bawang bombay, diiris\n" +
                "2 siung bawang putih, digeprek\n" +
                "3 sdm saus sambal ekstra pedas\n" +
                "2 sdm saus tomat\n" +
                "1 sdm saus tiram\n" +
                "1 sdt tepung maizena, larutkan dengan air (bila suka)\n" +
                "garam, gula, lada, dan kaldu bubuk secukupnya\n" +
                "margarin dan minyak goreng secukupnya\n");
        resep_process.add("Cara Membuat\n" +
                "1. Panaskan minyak dan margarin, goreng udang sampai berubah warna. \n" +
                "2. Masukkan bawang putih dan bawang bombay, tumis dengan udang.\n" +
                "3. Masukkan semua bahan saus dan bumbu lainnya.\n" +
                "4. Tambahkan larutan maizena.\n" +
                "5. Aduk rata sampai mendidih, matikan api. \n" +
                "6. Udang saus pedas manis siap disajikan.");
        resep_nama.add("Sate Usus Ayam");
        resep_detail.add("Jika dibandingkan dengan sate ayam, sate daging sapi dan sate kambing. Sate usus ayam ini tergolong jarang ditemukan. Namun jika anda termasuk penyuka sate usus ayam ini namun jarang menemukannya di daerah anda, tidak ada salahnya membuatnya sendiri dirumah.");
        resep_ingredients.add("Bahan Membuat Sate Usus Ayam :\n" +
                "500 gr usus ayam\n" +
                "3 lembar daun salam\n" +
                "5 cm lengkuas, iris tipis\n" +
                "5 lembar daun jeruk\n" +
                "Air dan minyak goreng secukupnya\n" +
                "Bahan bumbu halus (haluskan) :\n" +
                "7 siung bawang merah\n" +
                "3 siung bawang putih\n" +
                "1 ruas kunyit\n" +
                "5 buah kemiri sangrai\n" +
                "1 ruas jahe\n" +
                "Gula,garam dan kaldu bubuk secukupnya\n");
        resep_process.add("Cara Membuat Sate Usus Ayam :\n" +
                "1.\tLangkah pertama, buang lemak yang ada pada usus ayam lalu rebus usus hingga matang, lalu angkat dan tiriskan, setelah itu potong – potong usus sesuai selera\n" +
                "2.\tLangkah kedua, tumis bumbu halus hingga terasa harum, lalu masukan daun salam, daun jeruk, jahe dan lengkuas lengkuas, kemudian tumis hingga bumbu matang, setelah itu beri garam, gula dan kaldu bubuk (untuk rasa pedasnya sesuai selera masing aja yah, cabenya bisa di tambah ataupun di kurangi)\n" +
                "3.\tSelanjutnya, masukan usus ayam, aduk rata lalu beri air secukupnya dan biarkan hingga mendidih, sesekali di aduk-aduk hingga bumbu terlihat meresap dan airnya surut.\n" +
                "4.\tTerakhir, setelah air surut dan bumbu meresap di usus…matikan api, lalu angkat dan dinginkan sejenak kemudian tusukkan usus pada tusukan sate hingga habis setelah itu sate usus ayam buatan anda siap untuk disantap\n");
        resep_nama.add("Chicken popcorn ");
        resep_detail.add("Untuk membuat Chicken popcorn ini sebenarnya tidak sulit dan tergolong mudah. Selain itu, bahan-bahannya pun sangat mudah ditemui dipasaran. Anda bisa mengikuti Resep Cara Membuat Ayam Chicken Popcorn berikut ini");
        resep_ingredients.add("Bahan Membuat Ayam Chicken Popcorn :\n" +
                "500 gr ayam fillet (bagian dada)\n" +
                "1 butir telur\n" +
                "Tepung bumbu (saya memakai Kobe)\n" +
                "Lada putih\n" +
                "Garam\n" +
                "Parsley atau seledri\n" +
                "Minyak untuk menggoreng\n");
        resep_process.add("Cara Membuat Ayam Chicken Popcorn Enak Praktis :\n" +
                "1.\tLangkah pertama, potong fillet ayam kotak kotak kecil atau sesuai selera. Lalu marinate dengan garam, lada dan sedikit tepung bumbu kobe yang telah dicampur sedikit air.\n" +
                "2.\tSelanjutnya, masukan dan balur 1 per 1 potongan ayam ke dalam telur yang sudah dikocok.\n" +
                "3.\tTerakhir, masukan 1 per 1 potongan ayam yang sudah dibalur dengan kocokan telur ke dalam tepung bumbu kering. Lalu goreng hingga berwarna coklat keemasan. Kemudian taburkan seledri atau parsley, setelah itu sajikan Ayam Chicken Popcorn buatan anda bersama cocolan sambal. Selesai ^^\n");
        resep_nama.add("Krengsengan Ayam");
        resep_detail.add("Krengsengan Ayam adalah salah satu jenis masakan khas tradisional indonesia yang memiliki rasa yang enak dan nikmat. Krengsengan ayam ini sangat pas disajikan sebagai salah satu menu masakan alternatif bagi keluarga dan buah hati anda");
        resep_ingredients.add("Bahan Membuat Krengsengan Ayam :\n" +
                "1 kg ayam\n" +
                "5 buah cabai merah keriting\n" +
                "1/4 biji pala\n" +
                "3 butir kemiri\n" +
                "5 siung bawang merah\n" +
                "3 siung bawang putih\n" +
                "Cabe rawit secukupnya sesuai selera\n" +
                "Merica bubuk secukupnya\n" +
                "Kecap manis secukupnya\n");
        resep_process.add("Cara Membuat Krengsengan Ayam Enak Praktis :\n" +
                "•\tLangkah pertama, haluskan semua bumbu.Lalu tumis hingga terasa harum, kemudian tambahkan kecap, setelah itu masukkan ayam dan aduk bersama bumbu\n" +
                "•\tSelanjutnya, tambahkan air hingga ayam terendam, lalu masak dengan api takaran kecil sampai bumbu terlihat agak mengental. Kemudian tambahkan garam, merica, gula dan kecap sesuai selera. Setelah itu masak kembali hingga bumbu mengental. Tadaaaa….Krengsengan ayam buatan anda siap untuk disajikan\n");
        resep_nama.add("Es Kepal Milo ");
        resep_detail.add("Untuk membuat Es Kepal Milo ini ternyata sangat mudah, bahan-bahannya pun tergolong minim, simpel dan terjangkau. Jika anda kebetulan penggemar berat Es Kepal Milo tersebut dan berniat untuk membuatnya sendiri dirumah baik untuk konsumsi pribadi atau untuk jualan");
        resep_ingredients.add("Bahan Membuat Es Kepal Milo :\n" +
                "10 sdm milo bubuk\n" +
                "4 sdm susu cair\n" +
                "1/2 kaleng susu kental manis\n" +
                "Es serut\n" +
                "Topping (opsional sesuai selera) :\n" +
                "Taburan kacang\n" +
                "Chocochips\n" +
                "Oreo\n" +
                "Tango\n" +
                "Remahan biskuit\n" +
                "Messes\n");
        resep_process.add("Cara Membuat Es Kepal Milo :\n" +
                "1.\tLangkah pertama, Siapkan milo bubuk 10 sdm lalu tuangkan 1/2 kaleng susu kental manis kemudian tambahkan 4 sdm susu cair. Setelah itu, aduk hingga semua bahan tercampur rata.\n" +
                "2.\tSelanjutnya, Serut es batu sesuai porsi lalu bentuk bulat (bisa menggunakan mangkok kecil) kemudian Tuang campuran milo cair kedalam es serut.\n" +
                "3.\tTerakhir, taburkan topping sesuai selera. Setelah itu Es Kepal Milo buatan siap untuk disantap atau bahkan untuk dijual :D.\n");

        setContentView(R.layout.activity_main);
        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.



        mAdapter = new RecyclerviewAdapter(this, resep_nama, resep_detail, resep_ingredients, resep_process);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
