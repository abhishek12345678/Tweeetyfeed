package dcom.tweeetyfeed;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Portfolio extends AppCompatActivity {

    ImageView iv;
    int n=1;
    int s=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        iv=(ImageView)findViewById(R.id.ivv2);
    }

    public void forwad(View v)
    {
        if(n>-1 && n<3) {
            if (n == 0) {
                iv.setImageResource(R.drawable.portfolio1a);
                n++;
            }
            if (n == 1) {
                iv.setImageResource(R.drawable.portfolio1b);
                n++;
            }
            if (n == 2) {
                iv.setImageResource(R.drawable.portfolio1c);
                 n++;
            }
        }
        else
        {
            Toast.makeText(this,"out of range please try back button",Toast.LENGTH_SHORT).show();
        }
    }


    public void backwad(View view)
    {
        if(n>1 && n<4)
        {
            if(n==3)
            {
                iv.setImageResource(R.drawable.portfolio1b);
                n--;
            }
            if(n==2)
            {
                iv.setImageResource(R.drawable.portfolio1a);
                n--;
            }
        }
        else
        {
            Toast.makeText(this,"out of range please try back button",Toast.LENGTH_SHORT).show();
        }

    }

    public void forward(View view)
    {

        if(s>-1 && s<3) {
            if (s == 0) {
                iv.setImageResource(R.drawable.portfolio2a);
                s++;
            }
            if (s == 1) {
                iv.setImageResource(R.drawable.portfolio2b);
                s++;
            }
            if (s == 2) {
                iv.setImageResource(R.drawable.portfolio2c);
                s++;
            }
        }
        else
        {
            Toast.makeText(this,"out of range please try back button",Toast.LENGTH_SHORT).show();
        }

    }

    public void backward(View view)
    {
        if(s>1 && s<4)
        {
            if(s==3)
            {
                iv.setImageResource(R.drawable.portfolio2b);
                s--;
            }
            if(s==2)
            {
                iv.setImageResource(R.drawable.portfolio2a);
                s--;
            }
        }
        else
        {
            Toast.makeText(this,"out of range please try back button",Toast.LENGTH_SHORT).show();
        }

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
        String email="swabhimansingh@gmail.com";

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
