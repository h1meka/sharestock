package app.watanabe.watahime.sharestock

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.activity_main7.*
import kotlinx.android.synthetic.main.activity_maps.*

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {


    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val tokyo = LatLng(36.0, 140.0)
        //mMap.addMarker(MarkerOptions().position(tokyo).title("Marker in Tokyo"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tokyo))



        //        mMap.setOnMapClickListener(object : GoogleMap.OnMapClickListener {
//            override fun onMapClick(latlng: LatLng) {
//                val location = LatLng(latlng.latitude, latlng.longitude)
//                mMap.addMarker(MarkerOptions().position(location))
//            }
       // })


//        class MapsActivity : AppCompatActivity(), GoogleMap.OnMapLongClickListener{
//            mMap.setOnMapLongClickListener(this)
//            private lateinit var mMap:GoogleMap
//            override fun onMapLongClick(p0: LatLng?) {
//               var marker = MarkerOptions().position(point).title("目的地")
//                mMap!!.addMarker(marker)
//                drawPolyline(startmarker!!,endmarker!!)
//            }
//        }

//        RBUTTON.setOnClickListener {
//            mMap = googleMap
//            val lag = addresstext.text.toString().toInt()
//
//            val place = LatLng(lag,)
//        }
        MarkerOptions()
            .position(LatLng(10.0, 10.0))
            .title("Hello world")


    }








}
