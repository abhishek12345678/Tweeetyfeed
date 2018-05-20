package dcom.tweeetyfeed;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Contactus extends AppCompatActivity {

    EditText et1,et2,et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

        et1=(EditText)findViewById(R.id.e1);
        et2=(EditText)findViewById(R.id.e3);
        et3=(EditText)findViewById(R.id.e4);

    }

    public void sendMessage(View view)
    {
        String num=et3.getText().toString().trim();
        int n=Integer.parseInt(num);
        if( n == 7)
        {
            String email="swabhimansingh676@gmail.com";
            String subject=et1.getText().toString();
            String message=et2.getText().toString();

            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_EMAIL,new String[]{email});
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT, message);

            intent.setType("message/rfc822");

            startActivity(Intent.createChooser(intent, "select Email app"));
        }
        else
        {
            et3.setError("Right Correct");
            et3.requestFocus();
        }

    }

    public void send(View view)
    {
        String em="email@yourbusiness.com";

        Intent i=new Intent(Intent.ACTION_VIEW);
        i.putExtra(Intent.EXTRA_TEXT,new String[]{em});

        i.setType("message/rfc822");

        startActivity(Intent.createChooser(i,"select Email apps"));

    }

    public void email(View view)
    {
        String email="swabhimansingh676@gmail.com";

        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{email});

        intent.setType("message/rfc822");

        startActivity(Intent.createChooser(intent, "select Email app"));
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

    public void facebook(View view)
    {
        String uri="https://www.facebook.com/tweeetyfeed.in/";
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(i);
    }
}

