package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class activity_main extends Activity {

    Button bOne,bTwo,bThree,bFour,bFive,bSix,bSeven,bEight,bNine,bZero,bAdd,bMinus,bPoint,bDiv,bMul,
            bEqual,bCe,bClear;
    TextView inputTxt,resultTxt;
    String s="" , s1="" , s2="" , resString="" ;
    int i=0, i1=0 , c=-1;
    int result= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        bOne=(Button)findViewById(R.id.one);
        bTwo=(Button)findViewById(R.id.two);
        bThree=(Button)findViewById(R.id.three);
        bFour=(Button)findViewById(R.id.four);
        bFive=(Button)findViewById(R.id.five);
        bSix=(Button)findViewById(R.id.six);
        bSeven=(Button)findViewById(R.id.seven);
        bEight=(Button)findViewById(R.id.eight);
        bNine=(Button)findViewById(R.id.nine);
        bZero=(Button)findViewById(R.id.zero);
        bAdd=(Button)findViewById(R.id.add);
        bMinus=(Button)findViewById(R.id.minus);
        bMul=(Button)findViewById(R.id.multiply);
        bDiv=(Button)findViewById(R.id.divide);
        bEqual=(Button)findViewById(R.id.equal);
        bCe=(Button)findViewById(R.id.CE);
        bClear=(Button)findViewById(R.id.clear);
        bPoint=(Button)findViewById(R.id.point);

        inputTxt=(TextView)findViewById(R.id.inTxt);
        resultTxt=(TextView) findViewById(R.id.result);

        bOne.setOnClickListener((v)->{
            s = (String) resultTxt.getText();
            if(s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*"))
            {
                resultTxt.setText("");
                s="";
            }
            resultTxt.setText(s + "1");
            s = "";
        });

        bTwo.setOnClickListener((v)->{
            s = (String) resultTxt.getText();
            if(s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*"))
            {
                resultTxt.setText("");
                s="";
            }
            resultTxt.setText(s + "2");
            s = "";
        });

        bThree.setOnClickListener((v)->{
            s = (String) resultTxt.getText();
            if(s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*"))
            {
                resultTxt.setText("");
                s="";
            }
            resultTxt.setText(s + "3");
            s = "";
        });

        bFour.setOnClickListener((v)->{
            s = (String) resultTxt.getText();
            if(s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*"))
            {
                resultTxt.setText("");
                s="";
            }
            resultTxt.setText(s + "4");
            s = "";
        });

        bFive.setOnClickListener((v)->{
            s = (String) resultTxt.getText();
            if(s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*"))
            {
                resultTxt.setText("");
                s="";
            }
            resultTxt.setText(s + "5");
            s = "";
        });

        bSix.setOnClickListener((v)->{
            s = (String) resultTxt.getText();
            if(s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*"))
            {
                resultTxt.setText("");
                s="";
            }
            resultTxt.setText(s + "6");
            s = "";
        });

        bSeven.setOnClickListener((v)->{
            s = (String) resultTxt.getText();
            if(s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*"))
            {
                resultTxt.setText("");
                s="";
            }
            resultTxt.setText(s + "7");
            s = "";
        });
        bEight.setOnClickListener((v)->{
            s = (String) resultTxt.getText();
            if(s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*"))
            {
                resultTxt.setText("");
                s="";
            }
            resultTxt.setText(s + "8");
            s = "";
        });

        bNine.setOnClickListener((v)->{
            s = (String) resultTxt.getText();
            if(s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*"))
            {
                resultTxt.setText("");
                s="";
            }
            resultTxt.setText(s + "9");
            s = "";
        });

        bZero.setOnClickListener((v)->{
            s = (String) resultTxt.getText();
            if(s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*"))
            {
                resultTxt.setText("");
                s="";
            }
            resultTxt.setText(s + "0");
            s = "";
        });

        bAdd.setOnClickListener((v)->{
            String temp=(String) resultTxt.getText();

            if(temp.isEmpty())
                s1="0";
            else if(!temp.equals("+")&&!temp.equals("-")&&!temp.equals("*")&&!temp.equals("/"))
                s1=temp;

            c=0;
            resString="";
            resultTxt.setText("+");
            inputTxt.setText(s1+"+");
        });

        bMinus.setOnClickListener((v)->{
            String temp=(String) resultTxt.getText();

            if(temp.isEmpty())
                s1="0";
            else if(!temp.equals("+")&&!temp.equals("-")&&!temp.equals("*")&&!temp.equals("/"))
                s1=temp;

            c=1;
            resString="";
            resultTxt.setText("-");
            inputTxt.setText(s1+"-");
        });

        bMul.setOnClickListener((v)->{
            String temp=(String) resultTxt.getText();

            if(temp.isEmpty())
                s1="0";
            else if(!temp.equals("+")&&!temp.equals("-")&&!temp.equals("*")&&!temp.equals("/"))
                s1=temp;

            c=2;
            resString="";
            resultTxt.setText("*");
            inputTxt.setText(s1+"*");
        });

        bDiv.setOnClickListener((v)->{
            String temp=(String) resultTxt.getText();

            if(temp.isEmpty())
                s1="0";
            else if(!temp.equals("+")&&!temp.equals("-")&&!temp.equals("*")&&!temp.equals("/"))
                s1=temp;

            c=3;
            resString="";
            resultTxt.setText("/");
            inputTxt.setText(s1+"/");
        });

        bEqual.setOnClickListener((v)->{
            String operator = "";
            if(s1.equalsIgnoreCase("+")||s1.equalsIgnoreCase("*")||s1.equalsIgnoreCase("-")||s1.equalsIgnoreCase("/"))
                i=0;
            else if(s1==null||s1.isEmpty())
                 i=0;
            else
                i=Integer.parseInt(s1);

            if(resString.isEmpty())
            {
                s2=(String)resultTxt.getText();
                if(s2.equalsIgnoreCase("+")||s2.equalsIgnoreCase("*")||s2.equalsIgnoreCase("-")||s2.equalsIgnoreCase("/"))
                    i1=0;
                else if(s2==null||s2.isEmpty())
                    i1=0;
                else
                    i1=Integer.parseInt(s2);
            }
            else
                i=result;

            if(c==0){
                operator="+";
                result=i+i1;
            }else if(c==1)
            {
                operator="-";
                result=i-i1;
            }else if(c==2)
            {
                operator="*";
                result=i*i1;
            }else if(c==3)
            {
                operator="/";
                if(i1==0){
                    Toast.makeText(getApplicationContext(),"Inavalid Input",Toast.LENGTH_LONG).show();
                    result=0;
                }
                else{
                    result=i/i1;
                }
            }else{
                operator="";
                result=0;
            }

            if(!operator.isEmpty())
                inputTxt.setText(i+" "+operator+" "+i1);
            else
                inputTxt.setText("");

            resString=String.valueOf(result);
            resultTxt.setText(resString);
        });

        bClear.setOnClickListener((v)->{
            s=(String)resultTxt.getText();
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
                i=0;
            else{
                i=Integer.parseInt(s);
                i=i/10;
            }

            if(i==0)
                resultTxt.setText("");
            else
                resultTxt.setText(i+"");

            s=null;
        });

        bCe.setOnClickListener((v)->{
            resultTxt.setText("");
            inputTxt.setText("");
            i=0;
            i1=0;
            s1="";
            s2="";
            resString="";
            c=-1;
            result=0;
        });
    }
}