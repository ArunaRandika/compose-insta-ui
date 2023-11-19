package com.example.mvvmfirst.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mvvmfirst.R
import dagger.hilt.android.AndroidEntryPoint

@Composable
fun ProfileScreen() {

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        TopBar(name = "aruna_randika")
        Spacer(
            modifier = Modifier.fillMaxWidth()
        )

        ProfileSection(
            modifier = Modifier.fillMaxWidth()
        )

        ProfileInfo(
            modifier = Modifier
                .padding(10.dp)
        )
        Spacer(modifier = Modifier.height(25.dp))
        ButtonSection(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        )


    }

}

@Composable
fun TopBar(
    name: String,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Back",
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )

        Text(
            text = name,
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp

        )
        Icon(
            painter = painterResource(id = R.drawable.ic_bell),
            contentDescription = "Back",
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_dotmenu),
            contentDescription = "Back",
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )


    }

}

@Composable
fun ProfileSection(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {

            RoundImage(
                image = painterResource(id = R.drawable.randika),
                modifier = Modifier
                    .size(100.dp)
                    .weight(3f)

            )
            Spacer(modifier = Modifier.width(16.dp))

            ProfileStat(
                modifier = Modifier.weight(7f)
            )

        }
    }

}


@Composable
fun RoundImage(
    image: Painter,
    modifier: Modifier = Modifier
) {
    Image(
        painter = image,
        contentDescription = null,
        modifier = modifier
            .aspectRatio(1f, matchHeightConstraintsFirst = true)
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = CircleShape
            )
            .padding(3.dp)
            .clip(CircleShape)
    )

}

@Composable
fun ProfileStat(
    modifier: Modifier = Modifier
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = modifier
    ) {
        Stats(
            text = "232",
            number = "Posts"
        )
        Stats(
            text = "10.3k",
            number = "Followers"
        )
        Stats(
            text = "72",
            number = "Following"
        )

    }

}

@Composable
fun Stats(
    text: String,
    number: String,
    modifier: Modifier = Modifier
) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier

    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Spacer(
            modifier = Modifier
                .height(4.dp)
        )
        Text(text = number)


    }

}

@Composable
fun ProfileInfo(
    modifier: Modifier = Modifier

) {

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Aruna Randika",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp
        )
        Text(
            text = "Personal blog",
            fontSize = 15.sp,
            color = Color.LightGray
        )
        HyperLinkView(link = "https://www.instagram.com/aruna.randika/")

        Text(text = "Aruna Randika")

        FollowersInfo()

    }

}


@Composable
fun HyperLinkView(
    link: String,
    modifier: Modifier = Modifier

) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            modifier = Modifier.size(15.dp),
            painter = painterResource(id = R.drawable.link),
            contentDescription = "link to "
        )
        Text(
            modifier = Modifier
                .padding(start = 5.dp),
            text = link,
            color = Color.Blue

        )
    }

}

@Composable
fun FollowersInfo(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        RoundImage(
            image = painterResource(id = R.drawable.philipp),
            modifier = Modifier
                .size(30.dp)
        )

        Text(
            text = "Followed by",
        )
        Text(
            modifier = Modifier.padding(start = 3.dp),
            text = "Philipp Lackner",
            fontWeight = FontWeight.Bold
        )

    }
}

@Composable
fun ButtonSection(
    modifier: Modifier = Modifier
) {

    val minWith = 95.dp
    val height = 30.dp

    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        ActionButtons(
            buttonText = "Following",
            icon = Icons.Default.KeyboardArrowDown,
            modifier = Modifier
                .defaultMinSize(minWith)
                .height(height)
        )
        ActionButtons(
            buttonText = "Message",
            icon = null,
            modifier = Modifier
                .defaultMinSize(minWith)
                .height(height)
        )
        ActionButtons(
            buttonText = "Email",
            icon = null,
            modifier = Modifier
                .defaultMinSize(minWith)
                .height(height)
        )
        ActionButtons(
            buttonText = null,
            icon = Icons.Default.Phone,
            modifier = Modifier
                .defaultMinSize(minWith)
                .height(height)
        )


    }
}

@Composable
fun ActionButtons(
    modifier: Modifier = Modifier,
    buttonText: String? = null,
    icon: ImageVector? = null
) {

    Row(
        modifier = modifier
            .clickable { }
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(5.dp)

            )
            .padding(6.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (buttonText != null) {
            Text(
                text = buttonText,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp
            )

            if (icon != null) {
                Icon(
                    imageVector = icon,
                    contentDescription = "Add Friend",
                    tint = Color.Black
                )
            }
        }

    }


}


@Preview(showBackground = true)
@Composable
fun PreviewTheUI() {

    ProfileScreen()


}