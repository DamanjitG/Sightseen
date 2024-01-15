package components

import AuthManager
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import commonGreen

@Composable
fun LoginButton(authManager: AuthManager, setUserId: (String) -> Unit) {
    Column(
        modifier = Modifier.fillMaxWidth().fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Welcome to Sightseen!", fontSize = 60.sp)
        Text("Login using the button below.", fontSize = 60.sp)
        Spacer(modifier = Modifier.size(30.dp))
        Button(
            onClick = {
                authManager.authenticateUser(
                    // auth0 details, you must fill these out
                    domain = "PLACEHOLDER_DOMAIN",
                    clientId = "PLACEHOLDER_CLIENTID",
                    redirectUri = "http://localhost:5789/callback",
                    scope = "openid offline_access profile",
                    audience = "api1",
                )
                setUserId(authManager.getAuthId())

            },
            colors = ButtonDefaults.buttonColors(backgroundColor = commonGreen, contentColor = Color.White),
            modifier = Modifier.height(250.dp).width(450.dp)
        ) {
            Text("Login", fontSize = 90.sp)
        }
    }


}