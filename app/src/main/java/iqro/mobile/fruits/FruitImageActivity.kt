package iqro.mobile.fruits

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import iqro.mobile.fruits.databinding.ActivityFruitImageBinding

class FruitImageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFruitImageBinding
    private val fruits = arrayListOf<String>("Olma", "Banan", "O'rik", "Uzum", "Shaftoli")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFruitImageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val position = intent.getIntExtra("position", 0)

        supportActionBar?.title = fruits[position]

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        when (position) {
            0 -> binding.fruitImage.setImageResource(R.drawable.apple)
            1 -> binding.fruitImage.setImageResource(R.drawable.banana)
            2 -> binding.fruitImage.setImageResource(R.drawable.apricot)
            3 -> binding.fruitImage.setImageResource(R.drawable.grapes)
            4 -> binding.fruitImage.setImageResource(R.drawable.peach)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}