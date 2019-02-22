package demomedia.t3h.trongvu.com.baitap3_layout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rg_one;
    private Button btn_red;
    private Button btn_blue;
    private Button btn_yellow;
    private TextView tv_setcolor;
    private Button btn_setcolor;
    private Button btn_can;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relativelayout);
//        init();
//        checkRadioGroup();
//        btn_can.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tv_setcolor.setBackgroundColor(Color.BLACK);
//            }
//        });


    }
    private void init(){
        rg_one = (RadioGroup) findViewById(R.id.rgone);
        btn_red = (Button) findViewById(R.id.btnred);
        btn_blue = (Button) findViewById(R.id.btnblue);
        btn_yellow = (Button) findViewById(R.id.btnyellow);
        tv_setcolor = (TextView) findViewById(R.id.tvsetcolor);
        btn_setcolor= (Button) findViewById(R.id.btnsetcolor);
        btn_can= (Button) findViewById(R.id.btncan);

    }
    private void checkRadioGroup(){
        rg_one.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radioButton = rg_one.findViewById(checkedId);// checkedId là ai id của các RadioButton khi chúng ta chọn trong GroupRadio
                int index= rg_one.indexOfChild(radioButton);
                switch (index){
                    case 0:
                        btn_setcolor.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                tv_setcolor.setBackgroundColor(Color.RED);
                            }
                        });
                        break;
                    case 1:
                        btn_setcolor.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                tv_setcolor.setBackgroundColor(Color.BLUE);
                            }
                        });
                        break;
                    case 2:
                        btn_setcolor.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                tv_setcolor.setBackgroundColor(Color.YELLOW);
                            }
                        });
                        break;
                        default:
                            break;
                }
            }
        });
    }
}
