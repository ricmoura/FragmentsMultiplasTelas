package views.activities
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.logonrmlocal.fragmentsmultiplastelas.R
import models.Item
import views.fragments.DetalheItemFragment

class DetalheItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_item)
        val item = intent.getSerializableExtra("item") as Item
        if (savedInstanceState == null) {
            val detalheItemFragment = DetalheItemFragment.newInstance(item)
            val ft = supportFragmentManager.beginTransaction()
            ft.replace(R.id.flDetailContainer, detalheItemFragment)
            ft.commit()
        }
    }
}