package com.example.piko.calculus;


import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


import java.util.ArrayList;
import java.util.Collections;

import com.example.piko.calculus.databinding.ActivityMainBinding;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    DecimalFormat decimalFormat = new DecimalFormat("#.#####");
    private ArrayList<Compute> list;
    private String num = "";
    private boolean eqPressed=false;

    // private Pattern p
    public ActivityMainBinding getBinding() {
        return binding;
    }

    public void setBinding(ActivityMainBinding binding) {
        this.binding = binding;
    }

    // private Matcher m;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        list = new ArrayList<Compute>();
        super.onCreate(savedInstanceState);


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


//Number buttons//

        binding.button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed(new Compute(0), "number");

            }
        });
        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed(new Compute(1), "number");

            }
        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed(new Compute(2), "number");


            }
        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed(new Compute(3), "number");


            }
        });
        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed(new Compute(4), "number");


            }
        });
        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed(new Compute(5), "number");

            }
        });
        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed(new Compute(6), "number");


            }
        });
        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed(new Compute(7), "number");

            }
        });
        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed(new Compute(8), "number");


            }
        });
        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed(new Compute(9), "number");

            }
        });

        binding.buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed(new Compute(true), "dot");


            }
        });

        binding.buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed(new Compute("+"), "operand");


            }
        });

        binding.buttonSubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed(new Compute("-"), "operand");

            }
        });

        binding.buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed(new Compute("*"), "operand");


            }
        });

        binding.buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPressed(new Compute("/"), "operand");


            }
        });

        binding.buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.editableDisplay.getText().toString().matches(".*\\d$")){
                    list.add(new Compute(Double.parseDouble(num)));
                    calculate(list);
                    num=String.valueOf(decimalFormat.format(list.get(0).getNumber()));
                    binding.editableDisplay.setText(String.valueOf(num));
                    binding.displayOutput.setText(String.valueOf(num));
                    eqPressed=true;
                }



            }
        }


    );

    binding.buttonClear.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){
        binding.editableDisplay.setText("");
            binding.displayOutput.setText("");
        list = new ArrayList<Compute>();
            eqPressed=false;
            num="";
    }
    }

    );
}


    public void buttonPressed(Compute e, String type) {
//if not operand (num or ".")
        if (e.getOperand() == null) {
            //"."
            if (e.isDot() && binding.editableDisplay.getText().toString().matches(".*\\d$")) {//regex to check if last but pressed is number
                num = num + ".";
                binding.editableDisplay.setText(binding.editableDisplay.getText() + ".");
            } else if (!e.isDot()) {//num
                num = num + String.valueOf((int) e.getNumber());
                binding.editableDisplay.setText(binding.editableDisplay.getText() + String.valueOf((int) e.getNumber()));
            }                                                                               //regex to check if last but pressed is number
        } else if (e.getOperand() != null && binding.editableDisplay.getText().toString().matches(".*\\d$")) {//OPERAND PRESSED!!!!
            System.out.println(num);
            binding.editableDisplay.setText(binding.editableDisplay.getText() + e.getOperand());
            if(!eqPressed){
                list.add(new Compute(Double.parseDouble(num)));
            }
            list.add(e);
            num = "";

        }
    }

    public void calculate(ArrayList<Compute> list) {
        int i;
        double outcome=0;
        Numbers numbers = new Numbers();
        for (i = 0; i < list.size(); i++) {
            //FOUND OPERAND!!!
            if (list.get(i).getOperand() != null) {
                switch (list.get(i).getOperand()) {
                    case "*":
                        numbers=calculate(list,i);
                        outcome=numbers.getLeft()*numbers.getRight();
                        list.set(i,new Compute(outcome));
                        list.removeAll(Collections.singleton(null));
                        break;
                    case "/":
                        numbers=calculate(list,i);
                        outcome=numbers.getLeft()/numbers.getRight();
                        list.set(i,new Compute(outcome));
                        list.removeAll(Collections.singleton(null));
                        break;

                    case "+":
                        numbers=calculate(list,i);
                        outcome=numbers.getLeft()+numbers.getRight();
                        list.set(i,new Compute(outcome));
                        list.removeAll(Collections.singleton(null));
                        break;

                    case "-":
                        numbers=calculate(list,i);
                        outcome=numbers.getLeft()-numbers.getRight();
                        list.set(i,new Compute(outcome));
                        list.removeAll(Collections.singleton(null));
                        break;


                }



            }
            i=0;
            if(list.size()==1){
                break;
            }
        }
    }

    public Numbers calculate(ArrayList<Compute> list, int i) {

        Numbers numbers = new Numbers();

        numbers.setLeft(list.get(i - 1).getNumber());
        numbers.setRight(list.get(i + 1).getNumber());
        list.set(i - 1, null);
        list.set(i + 1, null);
        return numbers;
    }


}
