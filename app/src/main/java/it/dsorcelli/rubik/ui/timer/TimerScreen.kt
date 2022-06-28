package it.dsorcelli.rubik.ui.timer

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import it.dsorcelli.rubik.ui.navigation.NavRoutes

private const val TAG = "TimerScreen"

@Composable
fun TimerScreen(
    navController: NavController,
    viewModel: TimerVM = hiltViewModel()
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(12.dp)
    ) {
        Text(text = "Timer Screen", fontSize = 24.sp, fontWeight = FontWeight.Bold)

        Button(onClick = { navController.navigate(NavRoutes.Stats.route) }) {
            Text(text = "Stats")
        }
        Button(onClick = { viewModel.edit() }) {
            Text(text = "Edit")
        }

        Button(onClick = {
            val edited = viewModel.read()
            Log.d(TAG, "Edited --> $edited")
        }) {
            Text(text = "Read")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TimerScreen(navController = rememberNavController())
}