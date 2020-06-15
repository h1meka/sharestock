package app.watanabe.watahime.sharestock

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.SeekBar
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_main5.*
import kotlinx.android.synthetic.main.activity_main7.*
import kotlinx.android.synthetic.main.activity_main7.addresstext
import kotlinx.android.synthetic.main.item_memo_data_cell.*
import java.io.ByteArrayOutputStream
import java.util.*

class Main7Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        val storage = FirebaseStorage.getInstance()
        val db = FirebaseFirestore.getInstance()

        seekBar.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                Log.d("hoge","onProgressChanged $progress")
                textView4.text = "$progress%"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }


        })



        RBUTTON.setOnClickListener {
            val memo1 = hashMapOf(
                "favorite" to favoritetext.text.toString(),
                "address" to addresstext.text.toString(),
                "percent" to textView4.text.toString()
            )



            db.collection("memo")
                .add(memo1)

            val docRef = db.collection("memo")
            docRef.get().addOnSuccessListener {
                    documentSnapshot ->
                val memo = documentSnapshot.toObjects(memoData::class.java)

                Log.d("hoge","${memo.toString()}}")
            }
        }
        backbutton2.setOnClickListener {
            val memo2 = Intent(this, Main5Activity::class.java)
            startActivity(memo2);
            overridePendingTransition(
                android.R.anim.slide_in_left,
                android.R.anim.slide_out_right
            )
        }
//        button_upload.setOnClickListener {
//
//            val intent = Intent(Intent.ACTION_PICK)
//            intent.type = "image/="
//            startActivityForResult(intent, 0)
//        }
    }
//        var selectedPhotoUri: Uri? = null
//        override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//            (super.onActivityResult(requestCode, resultCode, data))
//            if (data != null) {
//                selectedPhotoUri = data.data
//           }
//            val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, selectedPhotoUri)
//            val bitmapDrawable = BitmapDrawable(bitmap)
//            button_upload.setBackgroundDrawable(bitmapDrawable)
//        }


//    private fun uploadImageToFirebaseStorare(){
//        if (selectedPhotoUri == null)  {
//            val filename = UUID.randomUUID().toString()
//            val ref = FirebaseStorage.getInstance().getReference("/image/$filename")
//
//            ref.putFile(selectedPhotoUri!!)
//                .addOnSuccessListener {
//                    Log.d("hoge","image:${it.metadata?.path}")
//                }
//        }
//    }
}











