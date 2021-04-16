package edu.pe.idat.appkea4materialdesign.service

import edu.pe.idat.appkea4materialdesign.R
import edu.pe.idat.appkea4materialdesign.model.Android

class DatosService {

    public fun listaVersionesAndroid(): ArrayList<Android> {
        val lstAndroid = ArrayList<Android>()
        lstAndroid.add(
            Android(
            lstAndroid.size+1,
            R.drawable.image1,
                "Apple Pie",
                "Android 1.0")
        )
        lstAndroid.add(
            Android(
                lstAndroid.size+1,
                R.drawable.image2,
                "Banana Bread",
                "Android 1.1")
        )
        lstAndroid.add(
            Android(
                lstAndroid.size+1,
                R.drawable.image3,
                "Cupcake",
                "Android 1.5")
        )
        lstAndroid.add(
            Android(
                lstAndroid.size+1,
                R.drawable.image4,
                "Donut",
                "Android 1.6")
        )
        lstAndroid.add(
            Android(
                lstAndroid.size+1,
                R.drawable.image5,
                "Eclair",
                "Android 2.0 - 2.1")
        )
        lstAndroid.add(
            Android(
                lstAndroid.size+1,
                R.drawable.image6,
                "Froyo",
                "Android 2.2")
        )
        lstAndroid.add(
            Android(
                lstAndroid.size+1,
                R.drawable.image7,
                "Gingerbread",
                "Android 2.3")
        )
        lstAndroid.add(
            Android(
                lstAndroid.size+1,
                R.drawable.image8,
                "Honeycomb",
                "Android 3.0")
        )
        lstAndroid.add(
            Android(
                lstAndroid.size+1,
                R.drawable.image9,
                "Ice cream sandwich",
                "Android 4.0")
        )
        lstAndroid.add(
            Android(
                lstAndroid.size+1,
                R.drawable.image10,
                "Jelly bean",
                "Android 4.1 - 4.3")
        )
        return lstAndroid;
    }
}