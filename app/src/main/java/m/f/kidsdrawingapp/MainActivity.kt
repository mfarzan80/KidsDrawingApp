package m.f.kidsdrawingapp

import android.app.Dialog
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.brush_size.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawingView.setSizeForBrush(20f)
        ib_brush.setOnClickListener{
            showBrushSizes()
        }
    }
    fun onSelectColor(view: View){
        when(view.id){
            iv_blue_color.id -> {
                drawingView.setColor(Color.BLUE)
            }
            iv_black_color.id ->
                drawingView.setColor(Color.BLACK)
            iv_green_color.id ->
                drawingView.setColor(Color.GREEN)
            iv_white_color.id ->
                drawingView.setColor(Color.WHITE)
            iv_red_color.id ->
                drawingView.setColor(Color.RED)
            iv_yellow_color.id ->
                drawingView.setColor(Color.YELLOW)

        }
    }
    
    private fun showBrushSizes(){
        val brushDialog = Dialog(this)
        brushDialog.setContentView(R.layout.brush_size)
        brushDialog.setTitle("Brush size: ")
        brushDialog.show()


        val smallBtn = brushDialog.ib_small_brush
        smallBtn.setOnClickListener {
            drawingView.setSizeForBrush(10f)
            brushDialog.dismiss()
        }

        val mediumBtn = brushDialog.ib_medium_brush
        mediumBtn.setOnClickListener {
            drawingView.setSizeForBrush(20f)
            brushDialog.dismiss()
        }

        val largeBtn = brushDialog.ib_large_brush
        largeBtn.setOnClickListener {
            drawingView.setSizeForBrush(30f)
            brushDialog.dismiss()
        }


    }
}