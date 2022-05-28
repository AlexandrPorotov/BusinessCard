package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BGDark
import com.example.businesscard.ui.theme.BusinessCardTheme
import android.content.Intent
import android.net.Uri
import androidx.core.content.ContextCompat.startActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = BGDark
                ) {
                    BusinessCard(
                        fullName = stringResource(id = R.string.business_card_full_name),
                        title = stringResource(id = R.string.business_card_title),
                        subTitle = stringResource(id = R.string.business_card_sub_title),
                        phone = stringResource(id = R.string.business_card_phone),
                        mail = stringResource(id = R.string.business_card_mail),
                        socialMedia = stringResource(id = R.string.business_card_socialMedia),
                        imagePainter = painterResource(id = R.drawable.android_logo),
                        modifier = Modifier
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(
    fullName: String,
    title: String,
    subTitle: String,
    phone: String,
    mail: String,
    socialMedia: String,
    imagePainter: Painter,
    modifier: Modifier
) {
    Surface(
        color = colorResource(id =R.color.bg_color_main)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box (
                modifier = Modifier
                    .weight(1.0F)
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(3F),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(
                        painter = imagePainter,
                        contentDescription = "Android logo",
                        modifier = Modifier
                            .size(120.dp)
                    )
                    Text(
                        text = fullName,
                        color = Color.White,
                        fontSize = 38.sp,
                        fontWeight = FontWeight.Light
                    )
                    Text(
                        text = title,
                        color = colorResource(id = R.color.text_android_green),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    /*Text(
                        text = subTitle,
                        color = colorResource(id = R.color.text_android_green),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )*/
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1F)
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(2F),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(
                        modifier = Modifier
                            .height(1.5.dp)
                            .fillMaxWidth()
                            .background(colorResource(id = R.color.white))
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.bg_color_main))
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ){
                            Spacer(
                                modifier = Modifier
                                    .weight(0.25F)
                            )
                            Icon(
                                Icons.Rounded.Phone,
                                contentDescription = "Phone icon",
                                tint = colorResource(id = R.color.text_android_green),
                                modifier = Modifier
                                    .weight(0.8F)
                            )
                            Text(
                                text = phone,
                                color = colorResource(id = R.color.white),
                                modifier = Modifier
                                    .weight(3F),
                                fontWeight = FontWeight.Normal
                            )
                            Spacer(
                                modifier = Modifier
                                    .weight(0.5F)
                            )
                        }
                    }

                    Spacer(
                        modifier = Modifier
                            .height(1.5.dp)
                            .fillMaxWidth()
                            .background(colorResource(id = R.color.white))
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.bg_color_main))
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ){
                            Spacer(
                                modifier = Modifier
                                    .weight(0.25F)
                            )
                            Icon(
                                Icons.Rounded.Share,
                                contentDescription = "Share icon",
                                tint = colorResource(id = R.color.text_android_green),
                                modifier = Modifier
                                    .weight(0.8F)
                            )
                            Text(
                                text = socialMedia,
                                color = colorResource(id = R.color.white),
                                modifier = Modifier
                                    .weight(3F),
                                fontWeight = FontWeight.Normal
                            )
                            Spacer(
                                modifier = Modifier
                                    .weight(0.5F)
                            )
                        }

                    }
                    Spacer(
                        modifier = Modifier
                            .height(1.5.dp)
                            .fillMaxWidth()
                            .background(colorResource(id = R.color.white))
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.bg_color_main))
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Spacer(
                                modifier = Modifier
                                    .weight(0.25F)
                            )
                            Icon(
                                Icons.Rounded.Email,
                                contentDescription = "Email icon",
                                tint = colorResource(id = R.color.text_android_green),
                                modifier = Modifier
                                    .weight(0.8F)
                            )
                            Text(
                                text = mail,
                                color = colorResource(id = R.color.white),
                                modifier = Modifier
                                    .weight(3F),
                                fontWeight = FontWeight.Normal
                            )
                            Spacer(
                                modifier = Modifier
                                    .weight(0.5F)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Business Card Preview")
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard(
            fullName = stringResource(id = R.string.business_card_full_name),
            title = stringResource(id = R.string.business_card_title),
            subTitle = stringResource(id = R.string.business_card_sub_title),
            phone = stringResource(id = R.string.business_card_phone),
            mail = stringResource(id = R.string.business_card_mail),
            socialMedia = stringResource(id = R.string.business_card_socialMedia),
            imagePainter = painterResource(id = R.drawable.android_logo),
            modifier = Modifier
        )
    }
}