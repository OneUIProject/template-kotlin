package oui.template.kotlin

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import dev.oneuiproject.oneui.layout.ToolbarLayout
import dev.oneuiproject.oneui.utils.ActivityUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbarLayout = findViewById<ToolbarLayout>(R.id.toolbar_layout)
        toolbarLayout.setNavigationButtonAsBack()

        /*TODO:
         *  - change packageName and name
         *  - check other TODOs
         * */
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_app_info) {
            ActivityUtils.startPopOverActivity(
                this,
                Intent(this, AboutActivity::class.java),
                null,
                ActivityUtils.POP_OVER_POSITION_RIGHT or ActivityUtils.POP_OVER_POSITION_TOP
            )
            return true
        }
        return false
    }
}