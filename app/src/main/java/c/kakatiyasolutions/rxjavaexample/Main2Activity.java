package c.kakatiyasolutions.rxjavaexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        testtakechange();
    }


    private void testtakechange() {
        Observable.just( 1, 2, 3, 4, 5, 6, 7 )
                .skip( 5 )
                .subscribe( new Observer<Integer>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Integer integer) {
                        System.out.println("Next::"+integer);

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                } );


    }
    public void Next(View view){
        Intent it=new Intent( Main2Activity.this,Main3Activity.class );
        startActivity( it );
    }
}
