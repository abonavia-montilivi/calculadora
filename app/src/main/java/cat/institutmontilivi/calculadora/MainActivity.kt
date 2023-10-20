package cat.institutmontilivi.calculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cat.institutmontilivi.calculadora.ui.theme.CalculadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Calculadora()
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun Calculadora() {
    CalculadoraTheme {
    var estaEditantInicial = false
    val memoriaInicial = 0
    var sumaInicial=true
    var operacioInical="+"
    val displayInicial = "0"

        var operacio by remember { mutableStateOf(operacioInical) }
        var estaEditant by remember { mutableStateOf(estaEditantInicial) }
        var suma by remember { mutableStateOf(sumaInicial) }
        var memoria by remember { mutableStateOf(memoriaInicial) }
        var display by remember { mutableStateOf(displayInicial) }
        Column(modifier = Modifier
            .height(300.dp)
            .width(400.dp)) {
//            Text(text = "Memoria: $memoria")
//            Text(text = "Operacio: $operacio")
            Box(modifier = Modifier
                .fillMaxWidth()
                .weight(2F)
                .padding(10.dp)
                .background(Color(200,200,200,255)))
                {
                Text(text = display,
                    style=MaterialTheme.typography.displaySmall,
                    textAlign=TextAlign.End,
                    modifier = Modifier
                        .padding(end = 10.dp)
                        .align(Alignment.CenterEnd))
            }
            Row(modifier = Modifier
                .weight(1F)
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)) {
                Button(onClick = {
                    if (!estaEditant)
                        display="7"
                    else{

                        display=display+"7"
                    }
                    estaEditant=true
                }, modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(2.dp),
                    shape = RoundedCornerShape(4.dp)) {
                    Text(text = "7")
                }
                Button(onClick = {
                    if (!estaEditant)
                        display="8"
                    else{

                        display=display+"8"
                    }
                    estaEditant=true
                }, modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(2.dp),
                    shape = RoundedCornerShape(4.dp)) {
                    Text(text = "8")
                }
                Button(onClick = {
                    if (!estaEditant)
                        display="9"
                    else{

                        display=display+"9"
                    }
                    estaEditant=true
                }, modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(2.dp),
                    shape = RoundedCornerShape(4.dp)) {
                    Text(text = "9")
                }
                Button(onClick = {
                    memoria=Operacio(memoria = memoria,display=display,operacio=operacio)
                    estaEditant=false
                    operacio="+"
                    display=memoria.toString()
                }, modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(2.dp),
                    colors = ButtonDefaults.buttonColors(Color(238, 130, 84, 255)),
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Text(text = "+")
                }
                Button(onClick = {
                    memoria=Operacio(memoria = memoria,display=display,operacio=operacio)
                    estaEditant=false
                    operacio="-"
                    display=memoria.toString()
                }, modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(2.dp),
                    colors = ButtonDefaults.buttonColors(Color(238, 130, 84, 255)),
                    shape = RoundedCornerShape(4.dp)) {
                    Text(text = "-")
                }

            }

            Row (modifier = Modifier
                .weight(1F)
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)){
                Button(onClick = {
                    if (!estaEditant)
                        display="4"
                    else{

                        display=display+"4"
                    }
                    estaEditant=true
                }, modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(2.dp),
                    shape = RoundedCornerShape(4.dp)) {
                    Text(text = "4")
                }
                Button(onClick = {
                    if (!estaEditant)
                        display="5"
                    else{

                        display=display+"5"
                    }
                    estaEditant=true
                }, modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(2.dp),
                    shape = RoundedCornerShape(4.dp)) {
                    Text(text = "5")
                }
                Button(onClick = {
                    if (!estaEditant)
                        display="6"
                    else{

                        display=display+"6"
                    }
                    estaEditant=true
                }, modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(2.dp),
                    shape = RoundedCornerShape(4.dp)) {
                    Text(text = "6")
                }
                Button(onClick = {
                    memoria=Operacio(memoria = memoria,display=display,operacio=operacio)
                    estaEditant=false
                    operacio="*"
                    display=memoria.toString()
                }, modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(2.dp),
                    colors = ButtonDefaults.buttonColors(Color(238, 130, 84, 255)),
                    shape = RoundedCornerShape(4.dp)) {
                    Text(text = "*")
                }
                Button(onClick = {
                    memoria=Operacio(memoria = memoria,display=display,operacio=operacio)
                    estaEditant=false
                    operacio="/"
                    display=memoria.toString()
                }, modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(2.dp),
                    colors = ButtonDefaults.buttonColors(Color(238, 130, 84, 255)),
                    shape = RoundedCornerShape(4.dp)) {
                    Text(text = "/")
                }

            }
            Row (modifier = Modifier
                .weight(1F)
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)){
                Button(onClick = {
                    if (!estaEditant)
                        display="1"
                    else{

                        display=display+"1"
                    }
                    estaEditant=true
                }, modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(2.dp),
                    shape = RoundedCornerShape(4.dp)) {
                    Text(text = "1")
                }
                Button(onClick = {
                    if (!estaEditant)
                        display="2"
                    else{

                        display=display+"2"
                    }
                    estaEditant=true
                }, modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(2.dp),
                    shape = RoundedCornerShape(4.dp)) {
                    Text(text = "2")
                }
                Button(onClick = {
                    if (!estaEditant)
                        display="3"
                    else{

                        display=display+"3"
                    }
                    estaEditant=true
                }, modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(2.dp),
                    shape = RoundedCornerShape(4.dp)) {
                    Text(text = "3")
                }
                Button(onClick = {
                    estaEditant=false
                    display=displayInicial
                }, modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(2.dp),
                    colors = ButtonDefaults.buttonColors(Color(238, 130, 84, 255)),
                    shape = RoundedCornerShape(4.dp)) {
                    Text(text = "C")
                }
                Button(onClick = {
                    display=Operacio(memoria = memoria,display=display,operacio=operacio).toString()
                    memoria=memoriaInicial
                    operacio=operacioInical
                    estaEditant=false
                    //suma=sumaInicial
                }, modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(2.dp),
                    colors = ButtonDefaults.buttonColors(Color(238, 130, 84, 255)),
                    shape = RoundedCornerShape(4.dp)) {
                    Text(text = "=")
                }
            }
            Row (modifier = Modifier
                .weight(1F)
                .fillMaxWidth()
                .padding(start = 8.dp, end = 10.dp)
                .padding(2.dp)){
                Button(onClick = {
                    if (!estaEditant)
                        display="0"
                    else{

                        display=display+"0"
                    }
                    estaEditant=true
                }, modifier = Modifier
                    .weight(3F)
                    .fillMaxHeight()
                    .padding(1.dp),
                    shape = RoundedCornerShape(4.dp)) {
                    Text(text = "0")
                }
                Button(onClick = {
                    estaEditant=false
                    display=displayInicial
                    memoria=memoriaInicial
                    suma=sumaInicial
                }, modifier = Modifier
                    .weight(2F)
                    .fillMaxHeight()
                    .padding(start=4.dp, top=1.dp, bottom=1.dp),
                    colors = ButtonDefaults.buttonColors(Color(238, 130, 84, 255)),
                    shape = RoundedCornerShape(4.dp))
                {
                    Text(text = "CE")
                }
            }
        }
    }
}

fun Operacio(memoria:Int, display:String, operacio:String): Int {
    var resultat:Int
    if (operacio.equals("+"))
        resultat=memoria+display.toInt()
    else if(operacio.equals("-"))
        resultat=memoria-display.toInt()
    else if(operacio.equals("*"))
        resultat=memoria*display.toInt()
    else
        resultat=memoria/display.toInt()

    return resultat
}