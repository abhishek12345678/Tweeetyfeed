package dcom.tweeetyfeed;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
    }

    public void tweetyfeed(View view)
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void home(View view)
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void getStarted(View view)
    {
        Intent i=new Intent(this,Contactus.class);
        startActivity(i);
    }

    public void services(View view)
    {
        Intent i=new Intent(this,Services.class);
        startActivity(i);
    }

    public void blog(View view)
    {
        String uri="http://tweeetyfeed.com/blog/";
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(i);
    }
    public void contactus(View view)
    {
        Intent i=new Intent(this,Contactus.class);
        startActivity(i);

    }
    public void faq(View view)
    {
        Intent i=new Intent(this,Faq.class);
        startActivity(i);
    }
    public void portfoli(View view)
    {
        Intent i=new Intent(this,Portfolio.class);
        startActivity(i);
    }

    public void gallery(View view)
    {
        Intent i=new Intent(this,Gallery.class);
        startActivity(i);
    }
    public void about(View view)
    {
        Intent i=new Intent(this,Aboutus.class);
        startActivity(i);
    }
    public void calltoAction(View view)
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void email(View view)
    {
        String email="swabhimansingh676@gmail.com";

        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{email});

        intent.setType("message/rfc822");

        startActivity(Intent.createChooser(intent, "select Email app"));
    }

    public void facebook(View view)
    {
        String uri="https://www.facebook.com/tweeetyfeed.in/";
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(i);
    }


}
