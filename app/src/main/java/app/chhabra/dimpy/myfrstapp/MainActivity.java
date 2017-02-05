package app.chhabra.dimpy.myfrstapp;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,B1,B2,B3,B4,B5;
    int c=0, f=0, m=0, n=0;
    static float res=0, num1 =0 , num2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        B1 = (Button) findViewById(R.id.B1);
        B2 = (Button) findViewById(R.id.B2);
        B3 = (Button) findViewById(R.id.B3);
        B4 = (Button) findViewById(R.id.B4);
        B5 = (Button) findViewById(R.id.B5);
        tv1 = (TextView) findViewById(R.id.textView);


        b1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "-1", Toast.LENGTH_LONG).show();
                String num = tv1.getText().toString();
                if(n==3 || num.isEmpty())
                    {num = num + "-1"; m=0;}
                tv1.setText(num);
                return true;
            }
        });

        b2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "-2", Toast.LENGTH_LONG).show();
                String num = tv1.getText().toString();
                if(n==3 || num.isEmpty())
                {num = num + "-2"; m=0;}
                tv1.setText(num);
                return true;
            }
        });

        b3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "-3", Toast.LENGTH_LONG).show();
                String num = tv1.getText().toString();
                if(n==3 || num.isEmpty())
                {num = num + "-3"; m=0;}
                tv1.setText(num);
                return true;
            }
        });


        b4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "-4", Toast.LENGTH_LONG).show();
                String num = tv1.getText().toString();
                if(n==3 || num.isEmpty())
                {num = num + "-4"; m=0;}
                tv1.setText(num);
                return true;
            }
        });

        b5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "-5", Toast.LENGTH_LONG).show();
                String num = tv1.getText().toString();
                if(n==3 || num.isEmpty())
                {num = num + "-5"; m=0;}
                tv1.setText(num);
                return true;
            }
        });

        b6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "-6", Toast.LENGTH_LONG).show();
                String num = tv1.getText().toString();
                if(n==3 || num.isEmpty())
                {num = num + "-6"; m=0;}
                tv1.setText(num);
                return true;
            }
        });

        b7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "-7", Toast.LENGTH_LONG).show();
                String num = tv1.getText().toString();
                if(n==3 || num.isEmpty())
                {num = num + "-7"; m=0;}
                tv1.setText(num);
                return true;
            }
        });

        b8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "-8", Toast.LENGTH_LONG).show();
                String num = tv1.getText().toString();
                if(n==3 || num.isEmpty())
                {num = num + "-8"; m=0;}
                tv1.setText(num);
                return true;
            }
        });

        b9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "-9", Toast.LENGTH_LONG).show();
                String num = tv1.getText().toString();
                if(n==3 || num.isEmpty())
                {num = num + "-9"; m=0;}
                tv1.setText(num);
                return true;
            }
        });



    }

    public void one(View v) {
        String num = tv1.getText().toString();
        num = num + "1";
        m=0;
        tv1.setText(num);

    }
    public void two(View v) {
        String num = tv1.getText().toString();
        num = num + "2";
        m=0;
        tv1.setText(num);
    }
    public void three(View v) {
        String num = tv1.getText().toString();
        num = num + "3";
        m=0;
        tv1.setText(num);
    }
    public void four(View v) {
        String num = tv1.getText().toString();
        num = num + "4";
        m=0;
        tv1.setText(num);
    }
    public void five(View v) {
        String num = tv1.getText().toString();
        num = num + "5";
        m=0;
        tv1.setText(num);
    }
    public void six(View v) {
        String num = tv1.getText().toString();
        num = num + "6";
        m=0;
        tv1.setText(num);
    }
    public void seven(View v) {
        String num = tv1.getText().toString();
        num = num + "7";
        m=0;
        tv1.setText(num);
    }
    public void eight(View v) {
        String num = tv1.getText().toString();
        num = num + "8";
        m=0;
        tv1.setText(num);
    }
    public void nine(View v) {
        String num = tv1.getText().toString();
        num = num + "9";
        m=0;
        tv1.setText(num);
    }
    public void zero(View v) {
        String num = tv1.getText().toString();
        num = num + "0";
        m=0;
        tv1.setText(num);
    }
    public void dot(View v) {
        if(c == 0){
            String num = tv1.getText().toString();
            num = num + ".";
            tv1.setText(num);
            c++;
        }
        else{
            String num = tv1.getText().toString();
            tv1.setText(num);
        }
    }
    public void clear(View v){
        tv1.setText("");
        c=0;
        f=0;
        m=0;

        num1=0;num2=0;res=0;
    }
    public void sub(View v) {
        String num = tv1.getText().toString();
        if(m == 0 || tv1.getText()==null)
            num = num + " - ";
        tv1.setText(num);
        c=0;        // for the dot operation
        f++;        // for the equals operation //mitigating a*0 type operation
        m++;        //to prevent the event of multiple binary operations ( 4 + + )
        n=3;        //to keep the negative numbers safe
    }
    public void add(View v) {
        String num = tv1.getText().toString();
        if(m == 0 && tv1.getText()!=null)
            num = num + " + ";
        tv1.setText(num);
        c=0;        // for the dot operation
        f++;        // for the equals operation //mitigating a*0 type operation
        m++;        //to prevent the event of multiple binary operations ( 4 + + )
        n=3;
    }
    public void mul(View v) {
        String num = tv1.getText().toString();
        if(m == 0 && tv1.getText()!=null)
            num = num + " x ";
        tv1.setText(num);
        c=0;        // for the dot operation
        f++;        // for the equals operation //mitigating a*0 type operation
        m++;        //to prevent the event of multiple binary operations ( 4 + + )
        n=3;
    }
    public void div(View v) {
        String num = tv1.getText().toString();
        if(m == 0 && tv1.getText()!=null)
            num = num + " / ";
        tv1.setText(num);
        c=0;        // for the dot operation
        f++;        // for the equals operation //mitigating a*0 type operation
        m++;        //to prevent the event of multiple binary operations ( 4 + + )
        n=3;
    }
    public void equal(View v) {
        n = 0;
        String num = tv1.getText().toString();
        String[] result = num.split("\\s");
        String tempS=null;
        try {
            if (f != 0 && result.length > 2) {
                //for(int i = 0; i<result.length ; i++){
                //      Log.e("Entire Input >", "element "+i+">>" + result[i] );
                //  }
                if ((result[0]).isEmpty()) {
                    Toast.makeText(this, "In order to use negative numbers LONG PRESS the number", Toast.LENGTH_LONG).show();
                    //Log.e("In Equal's function case : ", "res[0] is empty );
                    //Log.e("errr", "0th ele ababaababab >" + result[0]);
                    float tempF = -1 * Float.parseFloat(result[2]);
                    tempS = String.valueOf(tempF);
                    //Log.e("errr", "bang nbang >" + tempS);
                    //Log.e("errr", "bang nbang lenght>" + result.length);
                    if (result.length > 3)
                        try {
                            for (int i = 3; i <= result.length; i++) {
                                Log.e("In for loop in MainAct", ">>" + result[i] + " >>");
                                tempS = tempS + " " + result[i];
                            }
                        } catch (ArrayIndexOutOfBoundsException e) {
                            Toast.makeText(this, "Long press a number to get a negative number", Toast.LENGTH_LONG).show();
                        } finally {
                            tv1.setText(""+tempS);
                        }

                    Log.e("PRINT", "TEMP-S IS >" + tempS);
                    tv1.setText(tempS);
                    num = tempS;
                    result = num.split("\\s");

                    Log.e("Final TempS and result", ">" + tempS + " >" + result[0]);
                }
                num1 = Float.parseFloat(result[0]);
                Log.e("errr", "0th ele >" + num1);
                res = num1;
                for (int x = 1; x < (result.length - 1); x++, x++) {

                    m = 0;
                    num2 = Float.parseFloat(result[x + 1]);

                    Log.e("errr", "2nd ele >" + num2);
                    switch (result[x]) {


                        case "+":
                            //Toast.makeText(MainActivity.this, result[x], Toast.LENGTH_SHORT).show();
                            //Log.e("Inside Switch"," in case : add");
                            res = num1 + num2;
                            break;

                        case "-":
                            //Toast.makeText(MainActivity.this, result[x], Toast.LENGTH_SHORT).show();
                            //Log.e("Inside Switch"," in case : sub");
                            res = num1 - num2;
                            break;

                        case "x":
                            //Toast.makeText(MainActivity.this, result[x], Toast.LENGTH_SHORT).show();
                            //Log.e("Inside Switch"," in case : mul");
                            res = num1 * num2;
                            break;

                        case "/":
                            //Toast.makeText(MainActivity.this, result[x], Toast.LENGTH_SHORT).show();
                            //Log.e("Inside Switch"," in case : div");
                            res = num1 / num2;
                            break;


                        default:
                            Log.e("Inside Switch"," in case : default");
                            num1 = num1;
                            break;
                    }
                    num1 = res;
                }

                tempS= String.valueOf(res);

            } else {
                String abc = tv1.getText().toString();
                tv1.setText(abc);
            }

        }catch (NumberFormatException e){

            Toast.makeText(this, "Long press a number to get a negative number", Toast.LENGTH_LONG).show();
        } finally {
            tv1.setText(""+tempS);
        }
        }
    }
