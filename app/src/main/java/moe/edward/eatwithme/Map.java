package moe.edward.eatwithme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        ImageView imageView = (ImageView)findViewById(R.id.image);
        Animation zoom = AnimationUtils.loadAnimation(this, R.anim.zoom);
    }
}
