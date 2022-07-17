package com.example.appargentina.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appargentina.R
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class HomeActivity : AppCompatActivity() {

    val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val carousel: ImageCarousel = findViewById(R.id.carousel)
        list.add(CarouselItem("https://elcomercio.pe/resizer/TD3DM7bgM9bK__p7uXiTsfr9VSY=/1200x675/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/T5WBBY7PTNHDRHV26YM6DQTER4.jpg"))
        list.add(CarouselItem("https://cdn.www.gob.pe/uploads/campaign/photo/000/000/151/campaign_campania-no-al-acoso-virtual-mimp.jpg"))
        list.add(CarouselItem("https://cdn.www.gob.pe/uploads/document/file/1762330/standard_WhatsApp%20Image%202021-03-30%20at%204.41.13%20PM.jpeg.jpeg"))
        list.add(CarouselItem("https://cdn.www.gob.pe/uploads/document/file/545952/standard_WhatsApp_Image_2020-03-06_at_8.03.49_PM.jpeg"))
        carousel.addData(list)
    }
}