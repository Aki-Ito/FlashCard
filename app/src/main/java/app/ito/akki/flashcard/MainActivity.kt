package app.ito.akki.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Word型の変数を宣言 りんご
        val apple = Word(R.drawable.apple_icon,"りんご")
        val banana = Word(R.drawable.banana_icon,"バナナ")
        val orange = Word(R.drawable.orange_icon,"オレンジ")
        val strawberry = Word(R.drawable.strawberry_icon,"いちご")

        //作ったメソッドを実行する
        addWord(apple)
        addWord(banana)
        addWord(orange)
        addWord(strawberry)
    }

    private fun addWord(word: Word){
        val nameTextView = TextView(applicationContext)

        nameTextView.text = word.name

        //LinearLayoutインスタンスを作成する
        val layout = LinearLayout(this.applicationContext)

        //LinearLayoutの方向をHORIAONTAに設定する
        layout.orientation = LinearLayout.HORIZONTAL

        //ImageViewのインスタンスを生成
        val imageView = ImageView(this)

        //appleが持っているリソースIDを使って、画像をImageViewに設定する
        imageView.setImageResource(word.resId)

        //小さな枠にImageViewとTextViewを入れる
        layout.addView(imageView)
        layout.addView(nameTextView)

        container.addView(layout)

    }
}