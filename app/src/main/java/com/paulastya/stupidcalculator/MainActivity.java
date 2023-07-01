package com.paulastya.stupidcalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
import java.util.Stack;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView txtInput;
    private TextView txtSolution;

    private StringBuilder inputStringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInput = findViewById(R.id.txtInput);
        txtSolution = findViewById(R.id.txtSolution);

        inputStringBuilder = new StringBuilder();

        // Set OnClickListener for all the buttons
        Button btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);

        Button btnSeven = findViewById(R.id.btnSeven);
        btnSeven.setOnClickListener(this);

        Button btnEight = findViewById(R.id.btnEight);
        btnEight.setOnClickListener(this);

        Button btnNine = findViewById(R.id.btnNine);
        btnNine.setOnClickListener(this);

        Button btnDivide = findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(this);

        Button btnFour = findViewById(R.id.btnFour);
        btnFour.setOnClickListener(this);

        Button btnFive = findViewById(R.id.btnFive);
        btnFive.setOnClickListener(this);

        Button btnSix = findViewById(R.id.btnSix);
        btnSix.setOnClickListener(this);

        Button btnMultiply = findViewById(R.id.btnMultiply);
        btnMultiply.setOnClickListener(this);

        Button btnOne = findViewById(R.id.btnOne);
        btnOne.setOnClickListener(this);

        Button btnTwo = findViewById(R.id.btnTwo);
        btnTwo.setOnClickListener(this);

        Button btnThree = findViewById(R.id.btnThree);
        btnThree.setOnClickListener(this);

        Button btnSubtract = findViewById(R.id.btnSubtract);
        btnSubtract.setOnClickListener(this);

        Button btnZero = findViewById(R.id.btnZero);
        btnZero.setOnClickListener(this);

        Button btnEquals = findViewById(R.id.btnEquals);
        btnEquals.setOnClickListener(this);

        Button btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String a="",resul="";

        int id = v.getId();
        if (id == R.id.btnClear) {
            clearInput();
            a = "0";
            resul = "";
        } else if (id == R.id.btnSeven) {
            a = a + 7;
            appendToInput(a);
        } else if (id == R.id.btnEight) {
            a = a + 8;
            appendToInput(a);
        } else if (id == R.id.btnNine) {
            a = a + 9;
            appendToInput(a);
        } else if (id == R.id.btnDivide) {
            a = a + " / ";
            appendToInput(a);
        } else if (id == R.id.btnFour) {
            a = a + 4;
            appendToInput(a);
        } else if (id == R.id.btnFive) {
            a = a + 5;
            appendToInput(a);
        } else if (id == R.id.btnSix) {
            a = a + 6;
            appendToInput(a);
        } else if (id == R.id.btnMultiply) {
            a = a + " * ";
            appendToInput(a);
        } else if (id == R.id.btnOne) {
            a = a + 1;
            appendToInput(a);
        } else if (id == R.id.btnTwo) {
            a = a + 2;
            appendToInput(a);
        } else if (id == R.id.btnThree) {
            a = a + 3;
            appendToInput(a);
        } else if (id == R.id.btnSubtract) {
            a = a + " - ";
            appendToInput(a);
        } else if (id == R.id.btnZero) {
            a = a + 0;
            appendToInput(a);
        } else if (id == R.id.btnAdd) {
            a = a + " + ";
            appendToInput(a);
        } else if (id == R.id.btnEquals) {
            Random rand = new Random();
            resul=Integer.toString(rand.nextInt(Integer.MAX_VALUE) + 1);
            showresul(resul);
        }

    }

    private void clearInput() {
        inputStringBuilder.setLength(0);
        txtInput.setText("");
        txtSolution.setText("");
    }
private void showresul(String lsd){
    txtSolution.setText(lsd);
}
    private void appendToInput(String input) {
        inputStringBuilder.append(input);
        txtInput.setText(inputStringBuilder.toString());
    }
}