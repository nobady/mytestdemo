package hemiy.qinghui.com.mytestdemo.loadingview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import hemiy.qinghui.com.mytestdemo.R;

/**
 * 一个好看的loadingview
 *
 * https://github.com/81813780/AVLoadingIndicatorView
 * Created by hemiy on 16/6/6.
 */
public class LoadIngView extends Activity {

    private Button btnShow;
    private Button btnHide;
    private Button btnCode;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_view);
        btnShow= (Button) findViewById(R.id.btn_showView);
        btnHide= (Button) findViewById(R.id.btn_hideView);
        btnCode= (Button) findViewById(R.id.btn_code);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.avloadingIndicatorView).setVisibility(View.VISIBLE);
            }
        });

        btnHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.avloadingIndicatorView).setVisibility(View.INVISIBLE);
            }
        });

        btnCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
