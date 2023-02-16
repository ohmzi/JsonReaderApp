package com.example.jsonreaderapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ca.bell.nmf.feature.wifioptimization.ui.troubleshooting.model.TroubleshootCMSResponse
import com.example.jsonreaderapp.databinding.ActivityMainBinding
import com.google.gson.Gson
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var selectedFile: Uri
    private lateinit var textViewText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val searchButton = binding.button
        textViewText = binding.textView


        searchButton.setOnClickListener() {

            val intent = Intent()
                .setType("*/*")
                .setAction(Intent.ACTION_GET_CONTENT)

            startActivityForResult(Intent.createChooser(intent, "Select a file"), 111)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 111 && resultCode == RESULT_OK) {
            selectedFile = data?.data!! // The URI with the location of the file

            Log.d("File Location ", selectedFile.toString())


            try {
                val inn = contentResolver.openInputStream(selectedFile)
                val r = BufferedReader(InputStreamReader(inn))
                val total = StringBuilder()
                var line: String?
                while (r.readLine().also { line = it } != null) {
                    total.append(line).append('\n')
                }
                val content = total.toString()
                    .also { Gson().fromJson(total.toString(), TroubleshootCMSResponse::class.java) }

                Log.d("file", content)
                textViewText.text = content


            } catch (e: java.lang.Exception) {
            }

        }
    }


}