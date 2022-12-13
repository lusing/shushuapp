package xulun.liuyao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import xulun.liuyao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        binding.output.text = "请按下面按钮进行计算"

        binding.calc.text = "计算"

        class Listener : View.OnClickListener {
            override fun onClick(v: View?) {
                binding.output.text = stringFromJNI()
            }
        }
        binding.calc.setOnClickListener(Listener());
    }


    /**
     * A native method that is implemented by the 'liuyao' native library,
     * which is packaged with this application.
     */
    private external fun stringFromJNI(): String

    companion object {
        // Used to load the 'liuyao' library on application startup.
        init {
            System.loadLibrary("liuyao")
        }
    }
}


