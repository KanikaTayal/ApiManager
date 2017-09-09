package com.matrixdev.game.apimanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.matrixdev.game.apimanagerlib.web.ApiManager;
import com.matrixdev.game.apimanagerlib.web.ServerResponseListener;

public class MainActivity extends AppCompatActivity implements ServerResponseListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiManager apiManager= new ApiManager(this,this);
        apiManager.getStringGetResponse("test","http://jsonplaceholder.typicode.com/posts/1");

    }

    @Override
    public void positiveResponse(String TAG, String response) {
        Toast.makeText(getBaseContext(),response,Toast.LENGTH_LONG).show();
    }

    @Override
    public void positiveResponse(String TAG, Object responseObj) {

    }

    @Override
    public void negativeResponse(String TAG, String errorResponse) {

    }
}
