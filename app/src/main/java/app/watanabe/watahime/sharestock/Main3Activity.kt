package app.watanabe.watahime.sharestock

import android.app.Activity
import android.content.Intent
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_main3.*
import java.util.*

class Main3Activity : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

//        imagedlbutton.setOnClickListener {
//            val intent = Intent(Intent.ACTION_PICK)
//            intent.type = "image/="
//            startActivityForResult(intent, 0)
//        }

        registorbutton.setOnClickListener {
//            if (usernemaText.text.isNotEmpty()) {
//                val information = hashMapOf(
//                    "username" to usernemaText.text.toString()
//                )
//
//                db.collection("information")
//                    .add(information)
//            }

            val memo = Intent(this, Main5Activity::class.java)
            startActivity(memo)
        }


    }
}

//
//    var selectedPhotoUri: Uri? = null
//
//    lateinit var storage: FirebaseStorage
//
//
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        if (requestCode == 0&& resultCode == Activity.RESULT_OK&& data !==null){
//
//            selectedPhotoUri= data.data
//
//            val bitmap = MediaStore.Images.Media.getBitmap(contentResolver,selectedPhotoUri)
//
//            val bitmapDrawable = BitmapDrawable(bitmap)
//            registorbutton.setBackgroundDrawable(bitmapDrawable)
//
//        }
//    }
//
//    private  fun uploadImageToFirebaseStorage() {
//
//        val db = FirebaseFirestore.getInstance()
//
//
//
//            val memo = Intent(this, Main5Activity::class.java)
//            startActivity(memo)
//
//
//            storage = FirebaseStorage.getInstance()
//
//
//
//            val filename = UUID.randomUUID().toString()
//            val ref = FirebaseStorage.getInstance().getReference("/images/$filename")
//
//            ref.putFile(selectedPhotoUri!!)
//
//        }
//
//    }

