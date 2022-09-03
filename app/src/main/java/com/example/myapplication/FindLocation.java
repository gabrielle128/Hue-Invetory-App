package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class FindLocation extends AppCompatActivity  implements View.OnClickListener {
    public static TextView input;


    TextView result, resulttextview;
    ImageButton cameraBtn;
    Button search, scan_btn, barcodebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scan);

        resulttextview = findViewById(R.id.input);

        scan_btn=findViewById(R.id.barcodebutton);

        cameraBtn = findViewById(R.id.camera_png);
        cameraBtn.setOnClickListener(this);

        search = findViewById(R.id.show);
        input = findViewById(R.id.input);

        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),FindLocation2.class));
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInfo();
            }
        });

    }

    @Override
    public void onClick(View v) {
        scanCode();
    }

    private void scanCode(){

        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setCaptureActivity(CaptureAct.class);
        integrator.setOrientationLocked(false);
        integrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
        integrator.setPrompt("Scanning Code");
        integrator.initiateScan();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null){
            if(result.getContents() != null){
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage(result.getContents());
                builder.setTitle("Scanning Result");
                builder.setPositiveButton("Scan Again", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        scanCode();
                    }
                }).setNegativeButton("finish", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
            else {
                Toast.makeText(this, "No Results Found", Toast.LENGTH_LONG).show();
            }
        }else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }



    private void showInfo() {
        AlertDialog.Builder myDialog = new AlertDialog.Builder(this);
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.showlocation, null);
        myDialog.setView(view);
        final AlertDialog dialog = myDialog.create();

        final TextView information = view.findViewById(R.id.information);
        final TextView name = view.findViewById(R.id.name);
        final TextView size = view.findViewById(R.id.size);
        final TextView location = view.findViewById(R.id.location);
        final TextView done = view.findViewById(R.id.done);

        String barcode = input.getText().toString().trim();

//      Initial A
//      Akalia White

        if (barcode.equals("878619465525")){
            information.setText("INFORMATION");
            name.setText("Akalia White");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("878619465536")){
            information.setText("INFORMATION");
            name.setText("Akalia White");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("878619465549")){
            information.setText("INFORMATION");
            name.setText("Akalia White");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("878619465564")){
            information.setText("INFORMATION");
            name.setText("Akalia White");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("878619465581")){
            information.setText("INFORMATION");
            name.setText("Akalia White");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Akalia Palomino

        if (barcode.equals("878619473625")){
            information.setText("INFORMATION");
            name.setText("Akalia Palomino");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("878619473636")){
            information.setText("INFORMATION");
            name.setText("Akalia Palomino");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("878619473649")){
            information.setText("INFORMATION");
            name.setText("Akalia Palomino");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("878619473664")){
            information.setText("INFORMATION");
            name.setText("Akalia Palomino");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("878619473681")){
            information.setText("INFORMATION");
            name.setText("Akalia Palomino");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Ada Biscotti

        if (barcode.equals("358764521125")){
            information.setText("INFORMATION");
            name.setText("Ada Biscotti");
            size.setText("5");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764521136")){
            information.setText("INFORMATION");
            name.setText("Ada Biscotti");
            size.setText("6");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764521149")){
            information.setText("INFORMATION");
            name.setText("Ada Biscotti");
            size.setText("7");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764521164")){
            information.setText("INFORMATION");
            name.setText("Ada Biscotti");
            size.setText("8");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764521181")){
            information.setText("INFORMATION");
            name.setText("Ada Biscotti");
            size.setText("9");
            location.setText("3-2-A");
            done.setText("done");
        }

//      Ada Black

        if (barcode.equals("358764546625")){
            information.setText("INFORMATION");
            name.setText("Ada Black");
            size.setText("5");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764546636")){
            information.setText("INFORMATION");
            name.setText("Ada Black");
            size.setText("6");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764546649")){
            information.setText("INFORMATION");
            name.setText("Ada Black");
            size.setText("7");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764546664")){
            information.setText("INFORMATION");
            name.setText("Ada Black");
            size.setText("8");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764546681")){
            information.setText("INFORMATION");
            name.setText("Ada Black");
            size.setText("9");
            location.setText("3-2-A");
            done.setText("done");
        }

//      Ada Bleu

        if (barcode.equals("358764584925")){
            information.setText("INFORMATION");
            name.setText("Ada Bleu");
            size.setText("5");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764584936")){
            information.setText("INFORMATION");
            name.setText("Ada Bleu");
            size.setText("6");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764584949")){
            information.setText("INFORMATION");
            name.setText("Ada Bleu");
            size.setText("7");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764584964")){
            information.setText("INFORMATION");
            name.setText("Ada Bleu");
            size.setText("8");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764584981")){
            information.setText("INFORMATION");
            name.setText("Ada Bleu");
            size.setText("9");
            location.setText("3-2-A");
            done.setText("done");
        }

//      Ada Blush

        if (barcode.equals("358764546625")){
            information.setText("INFORMATION");
            name.setText("Ada Blush");
            size.setText("5");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764546636")){
            information.setText("INFORMATION");
            name.setText("Ada Blush");
            size.setText("6");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764546649")){
            information.setText("INFORMATION");
            name.setText("Ada Blush");
            size.setText("7");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764546664")){
            information.setText("INFORMATION");
            name.setText("Ada Blush");
            size.setText("8");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764546681")){
            information.setText("INFORMATION");
            name.setText("Ada Blush");
            size.setText("9");
            location.setText("3-2-A");
            done.setText("done");
        }

//      Ada Daffodil

        if (barcode.equals("358764576725")){
            information.setText("INFORMATION");
            name.setText("Ada Daffodil");
            size.setText("5");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764576736")){
            information.setText("INFORMATION");
            name.setText("Ada Daffodil");
            size.setText("6");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764576749")){
            information.setText("INFORMATION");
            name.setText("Ada Daffodil");
            size.setText("7");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764576764")){
            information.setText("INFORMATION");
            name.setText("Ada Daffodil");
            size.setText("8");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764576781")){
            information.setText("INFORMATION");
            name.setText("Ada Daffodil");
            size.setText("9");
            location.setText("3-2-A");
            done.setText("done");
        }

//      Ada Fleur

        if (barcode.equals("358764537625")){
            information.setText("INFORMATION");
            name.setText("Ada Fleur");
            size.setText("5");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764537636")){
            information.setText("INFORMATION");
            name.setText("Ada Fleur");
            size.setText("6");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764537649")){
            information.setText("INFORMATION");
            name.setText("Ada Fleur");
            size.setText("7");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764537664")){
            information.setText("INFORMATION");
            name.setText("Ada Fleur");
            size.setText("8");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764537681")){
            information.setText("INFORMATION");
            name.setText("Ada Fleur");
            size.setText("9");
            location.setText("3-2-A");
            done.setText("done");
        }

//      Ada  Golden

        if (barcode.equals("358764553525")){
            information.setText("INFORMATION");
            name.setText("Ada Golden");
            size.setText("5");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764553536")){
            information.setText("INFORMATION");
            name.setText("Ada Golden");
            size.setText("6");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764553549")){
            information.setText("INFORMATION");
            name.setText("Ada Golden");
            size.setText("7");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764553564")){
            information.setText("INFORMATION");
            name.setText("Ada Golden");
            size.setText("8");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764553581")){
            information.setText("INFORMATION");
            name.setText("Ada Golden");
            size.setText("9");
            location.setText("3-2-A");
            done.setText("done");
        }

//      Ada Periwinkle

        if (barcode.equals("358764529825")){
            information.setText("INFORMATION");
            name.setText("Ada Periwinkle");
            size.setText("5");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764529836")){
            information.setText("INFORMATION");
            name.setText("Ada Periwinkle");
            size.setText("6");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764529849")){
            information.setText("INFORMATION");
            name.setText("Ada Periwinkle");
            size.setText("7");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764529864")){
            information.setText("INFORMATION");
            name.setText("Ada Periwinkle");
            size.setText("8");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764529881")){
            information.setText("INFORMATION");
            name.setText("Ada Periwinkle");
            size.setText("9");
            location.setText("3-2-A");
            done.setText("done");
        }

//      Ada White

        if (barcode.equals("358764565525")){
            information.setText("INFORMATION");
            name.setText("Ada White");
            size.setText("5");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764565536")){
            information.setText("INFORMATION");
            name.setText("Ada White");
            size.setText("6");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764565549")){
            information.setText("INFORMATION");
            name.setText("Ada White");
            size.setText("7");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764565564")){
            information.setText("INFORMATION");
            name.setText("Ada White");
            size.setText("8");
            location.setText("3-2-A");
            done.setText("done");
        }

        if (barcode.equals("358764565581")){
            information.setText("INFORMATION");
            name.setText("Ada White");
            size.setText("9");
            location.setText("3-2-A");
            done.setText("done");
        }

//     Adria Le Blanc

        if (barcode.equals("880751482025")){
            information.setText("INFORMATION");
            name.setText("Adria Le Blanc");
            size.setText("5");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("880751482036")){
            information.setText("INFORMATION");
            name.setText("Adria Le Blanc");
            size.setText("6");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("880751482049")){
            information.setText("INFORMATION");
            name.setText("Adria Le Blanc");
            size.setText("7");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("880751482064")){
            information.setText("INFORMATION");
            name.setText("Adria Le Blanc");
            size.setText("8");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("880751482081")){
            information.setText("INFORMATION");
            name.setText("Adria Le Blanc");
            size.setText("9");
            location.setText("3-3-E");
            done.setText("done");
        }

//      Adria Naturale

        if (barcode.equals("880751430325")){
            information.setText("INFORMATION");
            name.setText("Adria Naturale");
            size.setText("5");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("880751430336")){
            information.setText("INFORMATION");
            name.setText("Adria Naturale");
            size.setText("6");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("880751430349")){
            information.setText("INFORMATION");
            name.setText("Adria Naturale");
            size.setText("7");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("880751430364")){
            information.setText("INFORMATION");
            name.setText("Adria Naturale");
            size.setText("8");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("880751430381")){
            information.setText("INFORMATION");
            name.setText("Adria Naturale");
            size.setText("9");
            location.setText("3-3-E");
            done.setText("done");
        }

//      Adria Toscana

        if (barcode.equals("880751414725")){
            information.setText("INFORMATION");
            name.setText("Adria Toscana");
            size.setText("5");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("880751414736")){
            information.setText("INFORMATION");
            name.setText("Adria Toscana");
            size.setText("6");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("880751414749")){
            information.setText("INFORMATION");
            name.setText("Adria Toscana");
            size.setText("7");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("880751414764")){
            information.setText("INFORMATION");
            name.setText("Adria Toscana");
            size.setText("8");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("880751414781")){
            information.setText("INFORMATION");
            name.setText("Adria Toscana");
            size.setText("9");
            location.setText("3-3-E");
            done.setText("done");
        }

//      Alaia Biscotti

        if (barcode.equals("275869821125")){
            information.setText("INFORMATION");
            name.setText("Alaia Biscotti");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869821136")){
            information.setText("INFORMATION");
            name.setText("Alaia Biscotti");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869821149")){
            information.setText("INFORMATION");
            name.setText("Alaia Biscotti");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869821164")){
            information.setText("INFORMATION");
            name.setText("Alaia Biscotti");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869821181")){
            information.setText("INFORMATION");
            name.setText("Alaia Biscotti");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869821110")){
            information.setText("INFORMATION");
            name.setText("Alaia Biscotti");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Alaia Creme

        if (barcode.equals("275869894625")){
            information.setText("INFORMATION");
            name.setText("Alaia Biscotti");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869894636")){
            information.setText("INFORMATION");
            name.setText("Alaia Biscotti");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869894649")){
            information.setText("INFORMATION");
            name.setText("Alaia Biscotti");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869894664")){
            information.setText("INFORMATION");
            name.setText("Alaia Biscotti");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869894681")){
            information.setText("INFORMATION");
            name.setText("Alaia Biscotti");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869894610")){
            information.setText("INFORMATION");
            name.setText("Alaia Biscotti");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Alaia Fleur

        if (barcode.equals("275869837625")){
            information.setText("INFORMATION");
            name.setText("Alaia Fleur");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869837636")){
            information.setText("INFORMATION");
            name.setText("Alaia Fleur");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869837649")){
            information.setText("INFORMATION");
            name.setText("Alaia Fleur");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869837664")){
            information.setText("INFORMATION");
            name.setText("Alaia Fleur");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869837681")){
            information.setText("INFORMATION");
            name.setText("Alaia Fleur");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869837610")){
            information.setText("INFORMATION");
            name.setText("Alaia Fleur");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Alaia Toscana

        if (barcode.equals("275869814725")){
            information.setText("INFORMATION");
            name.setText("Alaia Toscana");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869814736")){
            information.setText("INFORMATION");
            name.setText("Alaia Toscana");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869814749")){
            information.setText("INFORMATION");
            name.setText("Alaia Toscana");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869814764")){
            information.setText("INFORMATION");
            name.setText("Alaia Toscana");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869814781")){
            information.setText("INFORMATION");
            name.setText("Alaia Toscana");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("275869814710")){
            information.setText("INFORMATION");
            name.setText("Alaia Toscana");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Alana Black

        if (barcode.equals("165393146625")){
            information.setText("INFORMATION");
            name.setText("Alana Black");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393146636")){
            information.setText("INFORMATION");
            name.setText("Alana Black");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393146649")){
            information.setText("INFORMATION");
            name.setText("Alana Black");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393146664")){
            information.setText("INFORMATION");
            name.setText("Alana Black");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393146681")){
            information.setText("INFORMATION");
            name.setText("Alana Black");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Alana Bleu

        if (barcode.equals("165393184925")){
            information.setText("INFORMATION");
            name.setText("Alana Bleu");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393184936")){
            information.setText("INFORMATION");
            name.setText("Alana Bleu");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393184949")){
            information.setText("INFORMATION");
            name.setText("Alana Bleu");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393184964")){
            information.setText("INFORMATION");
            name.setText("Alana Bleu");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393184981")){
            information.setText("INFORMATION");
            name.setText("Alana Bleu");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Alana Fleur

        if (barcode.equals("165393137625")){
            information.setText("INFORMATION");
            name.setText("Alana Fleur");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393137636")){
            information.setText("INFORMATION");
            name.setText("Alana Fleur");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393137649")){
            information.setText("INFORMATION");
            name.setText("Alana Fleur");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393137664")){
            information.setText("INFORMATION");
            name.setText("Alana Fleur");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393137681")){
            information.setText("INFORMATION");
            name.setText("Alana Fleur");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Alana Palomino

        if (barcode.equals("165393173625")){
            information.setText("INFORMATION");
            name.setText("Alana Palomino");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393173636")){
            information.setText("INFORMATION");
            name.setText("Alana Palomino");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393173649")){
            information.setText("INFORMATION");
            name.setText("Alana Palomino");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393173664")){
            information.setText("INFORMATION");
            name.setText("Alana Palomino");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393173681")){
            information.setText("INFORMATION");
            name.setText("Alana Palomino");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Alana White

        if (barcode.equals("165393165525")){
            information.setText("INFORMATION");
            name.setText("Alana White");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393165536")){
            information.setText("INFORMATION");
            name.setText("Alana White");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393165549")){
            information.setText("INFORMATION");
            name.setText("Alana White");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393165564")){
            information.setText("INFORMATION");
            name.setText("Alana White");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("165393165581")){
            information.setText("INFORMATION");
            name.setText("Alana White");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Alcott Biscotti

        if (barcode.equals("306992321125")){
            information.setText("INFORMATION");
            name.setText("Alcott Biscotti");
            size.setText("5");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("306992321136")){
            information.setText("INFORMATION");
            name.setText("Alcott Biscotti");
            size.setText("6");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("306992321149")){
            information.setText("INFORMATION");
            name.setText("Alcott Biscotti");
            size.setText("7");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("306992321164")){
            information.setText("INFORMATION");
            name.setText("Alcott Biscotti");
            size.setText("8");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("306992321181")){
            information.setText("INFORMATION");
            name.setText("Alcott Biscotti");
            size.setText("9");
            location.setText("3-3-C");
            done.setText("done");
        }

//      Alcott Palomino

        if (barcode.equals("306992373625")){
            information.setText("INFORMATION");
            name.setText("Alcott Palomino");
            size.setText("5");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("306992373636")){
            information.setText("INFORMATION");
            name.setText("Alcott Palomino");
            size.setText("6");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("306992373649")){
            information.setText("INFORMATION");
            name.setText("Alcott Palomino");
            size.setText("7");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("306992373664")){
            information.setText("INFORMATION");
            name.setText("Alcott Palomino");
            size.setText("8");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("306992373681")){
            information.setText("INFORMATION");
            name.setText("Alcott Palomino");
            size.setText("9");
            location.setText("3-3-C");
            done.setText("done");
        }

//      Alcott Toscana

        if (barcode.equals("306992314725")){
            information.setText("INFORMATION");
            name.setText("Alcott Toscana");
            size.setText("5");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("306992314736")){
            information.setText("INFORMATION");
            name.setText("Alcott Toscana");
            size.setText("6");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("306992314749")){
            information.setText("INFORMATION");
            name.setText("Alcott Toscana");
            size.setText("7");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("306992314764")){
            information.setText("INFORMATION");
            name.setText("Alcott Toscana");
            size.setText("8");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("306992314781")){
            information.setText("INFORMATION");
            name.setText("Alcott Toscana");
            size.setText("9");
            location.setText("3-3-C");
            done.setText("done");
        }

//      Alcott White

        if (barcode.equals("306992365525")){
            information.setText("INFORMATION");
            name.setText("Alcott White");
            size.setText("5");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("306992365536")){
            information.setText("INFORMATION");
            name.setText("Alcott White");
            size.setText("6");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("306992365549")){
            information.setText("INFORMATION");
            name.setText("Alcott White");
            size.setText("7");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("306992365564")){
            information.setText("INFORMATION");
            name.setText("Alcott White");
            size.setText("8");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("306992365581")){
            information.setText("INFORMATION");
            name.setText("Alcott White");
            size.setText("9");
            location.setText("3-3-C");
            done.setText("done");
        }

//      Alva Creme

        if (barcode.equals("454487994625")){
            information.setText("INFORMATION");
            name.setText("Alva Creme");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("454487994636")){
            information.setText("INFORMATION");
            name.setText("Alva Creme");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("454487994649")){
            information.setText("INFORMATION");
            name.setText("Alva Creme");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("454487994664")){
            information.setText("INFORMATION");
            name.setText("Alva Creme");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("454487994681")){
            information.setText("INFORMATION");
            name.setText("Alva Creme");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Alva Naturale

        if (barcode.equals("454487930325")){
            information.setText("INFORMATION");
            name.setText("Alva Naturale");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("454487930336")){
            information.setText("INFORMATION");
            name.setText("Alva Naturale");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("454487930349")){
            information.setText("INFORMATION");
            name.setText("Alva Naturale");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("454487930364")){
            information.setText("INFORMATION");
            name.setText("Alva Naturale");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("454487930381")){
            information.setText("INFORMATION");
            name.setText("Alva Naturale");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Alva Noir

        if (barcode.equals("454487938425")){
            information.setText("INFORMATION");
            name.setText("Alva Noir");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("454487938436")){
            information.setText("INFORMATION");
            name.setText("Alva Noir");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("454487938449")){
            information.setText("INFORMATION");
            name.setText("Alva Noir");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("454487938464")){
            information.setText("INFORMATION");
            name.setText("Alva Noir");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("454487938481")){
            information.setText("INFORMATION");
            name.setText("Alva Noir");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Amara Biscotti

        if (barcode.equals("160938421125")){
            information.setText("INFORMATION");
            name.setText("Amara Biscotti");
            size.setText("5");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("160938421136")){
            information.setText("INFORMATION");
            name.setText("Amara Biscotti");
            size.setText("6");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("160938421149")){
            information.setText("INFORMATION");
            name.setText("Amara Biscotti");
            size.setText("7");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("160938421164")){
            information.setText("INFORMATION");
            name.setText("Amara Biscotti");
            size.setText("8");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("160938421181")){
            information.setText("INFORMATION");
            name.setText("Amara Biscotti");
            size.setText("9");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

//      Amara Fleur

        if (barcode.equals("160938437625")){
            information.setText("INFORMATION");
            name.setText("Amara Fleur");
            size.setText("5");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("160938437636")){
            information.setText("INFORMATION");
            name.setText("Amara Fleur");
            size.setText("6");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("160938437649")){
            information.setText("INFORMATION");
            name.setText("Amara Fleur");
            size.setText("7");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("160938437664")){
            information.setText("INFORMATION");
            name.setText("Amara Fleur");
            size.setText("8");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("160938437681")){
            information.setText("INFORMATION");
            name.setText("Amara Fleur");
            size.setText("9");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

//      Amara Orchid

        if (barcode.equals("160938414325")){
            information.setText("INFORMATION");
            name.setText("Amara Orchid");
            size.setText("5");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("160938414336")){
            information.setText("INFORMATION");
            name.setText("Amara Orchid");
            size.setText("6");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("160938414349")){
            information.setText("INFORMATION");
            name.setText("Amara Orchid");
            size.setText("7");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("160938414364")){
            information.setText("INFORMATION");
            name.setText("Amara Orchid");
            size.setText("8");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("160938414381")){
            information.setText("INFORMATION");
            name.setText("Amara Orchid");
            size.setText("9");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

//      Amara White

        if (barcode.equals("160938465525")){
            information.setText("INFORMATION");
            name.setText("Amara White");
            size.setText("5");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("160938465536")){
            information.setText("INFORMATION");
            name.setText("Amara White");
            size.setText("6");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("160938465549")){
            information.setText("INFORMATION");
            name.setText("Amara White");
            size.setText("7");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("160938465564")){
            information.setText("INFORMATION");
            name.setText("Amara White");
            size.setText("8");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("160938465581")){
            information.setText("INFORMATION");
            name.setText("Amara White");
            size.setText("9");
            location.setText("3-3-N and 3-3-M");
            done.setText("done");
        }

//      Amber Black

        if (barcode.equals("346612046625")){
            information.setText("INFORMATION");
            name.setText("Amber Black");
            size.setText("5");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612046636")){
            information.setText("INFORMATION");
            name.setText("Amber Black");
            size.setText("6");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612046649")){
            information.setText("INFORMATION");
            name.setText("Amber Black");
            size.setText("7");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612046664")){
            information.setText("INFORMATION");
            name.setText("Amber Black");
            size.setText("8");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612046681")){
            information.setText("INFORMATION");
            name.setText("Amber Black");
            size.setText("9");
            location.setText("3-3-E");
            done.setText("done");
        }

//      Amber Cashew

        if (barcode.equals("346612068725")){
            information.setText("INFORMATION");
            name.setText("Amber Cashew");
            size.setText("5");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612068736")){
            information.setText("INFORMATION");
            name.setText("Amber Cashew");
            size.setText("6");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612068749")){
            information.setText("INFORMATION");
            name.setText("Amber Cashew");
            size.setText("7");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612068764")){
            information.setText("INFORMATION");
            name.setText("Amber Cashew");
            size.setText("8");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612068781")){
            information.setText("INFORMATION");
            name.setText("Amber Cashew");
            size.setText("9");
            location.setText("3-3-E");
            done.setText("done");
        }

//      Amber Daffodil

        if (barcode.equals("346612076725")){
            information.setText("INFORMATION");
            name.setText("Amber Daffodil");
            size.setText("5");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612076736")){
            information.setText("INFORMATION");
            name.setText("Amber Daffodil");
            size.setText("6");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612076749")){
            information.setText("INFORMATION");
            name.setText("Amber Daffodil");
            size.setText("7");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612076764")){
            information.setText("INFORMATION");
            name.setText("Amber Daffodil");
            size.setText("8");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612076781")){
            information.setText("INFORMATION");
            name.setText("Amber Daffodil");
            size.setText("9");
            location.setText("3-3-E");
            done.setText("done");
        }

//      Amber Lilac

        if (barcode.equals("346612012125")){
            information.setText("INFORMATION");
            name.setText("Amber Lilac");
            size.setText("5");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612012136")){
            information.setText("INFORMATION");
            name.setText("Amber Lilac");
            size.setText("6");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612012149")){
            information.setText("INFORMATION");
            name.setText("Amber Lilac");
            size.setText("7");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612012164")){
            information.setText("INFORMATION");
            name.setText("Amber Lilac");
            size.setText("8");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612012181")){
            information.setText("INFORMATION");
            name.setText("Amber Lilac");
            size.setText("9");
            location.setText("3-3-E");
            done.setText("done");
        }

//      Amber Oat

        if (barcode.equals("346612038025")){
            information.setText("INFORMATION");
            name.setText("Amber Oat");
            size.setText("5");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612038036")){
            information.setText("INFORMATION");
            name.setText("Amber Oat");
            size.setText("6");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612038049")){
            information.setText("INFORMATION");
            name.setText("Amber Oat");
            size.setText("7");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612038064")){
            information.setText("INFORMATION");
            name.setText("Amber Oat");
            size.setText("8");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612038081")){
            information.setText("INFORMATION");
            name.setText("Amber Oat");
            size.setText("9");
            location.setText("3-3-E");
            done.setText("done");
        }

//      Amber White

        if (barcode.equals("346612065525")){
            information.setText("INFORMATION");
            name.setText("Amber White");
            size.setText("5");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612065536")){
            information.setText("INFORMATION");
            name.setText("Amber White");
            size.setText("6");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612065549")){
            information.setText("INFORMATION");
            name.setText("Amber White");
            size.setText("7");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612065564")){
            information.setText("INFORMATION");
            name.setText("Amber White");
            size.setText("8");
            location.setText("3-3-E");
            done.setText("done");
        }

        if (barcode.equals("346612065581")){
            information.setText("INFORMATION");
            name.setText("Amber White");
            size.setText("9");
            location.setText("3-3-E");
            done.setText("done");
        }

//      Analia Palomino

        if (barcode.equals("508533173625")){
            information.setText("INFORMATION");
            name.setText("Analia Palomino");
            size.setText("5");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("508533173636")){
            information.setText("INFORMATION");
            name.setText("Analia Palomino");
            size.setText("6");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("508533173649")){
            information.setText("INFORMATION");
            name.setText("Analia Palomino");
            size.setText("7");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("508533173664")){
            information.setText("INFORMATION");
            name.setText("Analia Palomino");
            size.setText("8");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("508533173681")){
            information.setText("INFORMATION");
            name.setText("Analia Palomino");
            size.setText("9");
            location.setText("3-3-C");
            done.setText("done");
        }

//      Analia Toscana

        if (barcode.equals("508533114725")){
            information.setText("INFORMATION");
            name.setText("Analia Toscana");
            size.setText("5");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("508533114736")){
            information.setText("INFORMATION");
            name.setText("Analia Toscana");
            size.setText("6");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("508533114749")){
            information.setText("INFORMATION");
            name.setText("Analia Toscana");
            size.setText("7");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("508533114764")){
            information.setText("INFORMATION");
            name.setText("Analia Toscana");
            size.setText("8");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("508533114781")){
            information.setText("INFORMATION");
            name.setText("Analia Toscana");
            size.setText("9");
            location.setText("3-3-C");
            done.setText("done");
        }

//      Ashanti Biscotti

        if (barcode.equals("729561121125")){
            information.setText("INFORMATION");
            name.setText("Ashanti Biscotti");
            size.setText("5");
            location.setText("3-3-E and 3-3-C");
            done.setText("done");
        }

        if (barcode.equals("729561121136")){
            information.setText("INFORMATION");
            name.setText("Ashanti Biscotti");
            size.setText("6");
            location.setText("3-3-E and 3-3-C");
            done.setText("done");
        }

        if (barcode.equals("729561121149")){
            information.setText("INFORMATION");
            name.setText("Ashanti Biscotti");
            size.setText("7");
            location.setText("3-3-E and 3-3-C");
            done.setText("done");
        }

        if (barcode.equals("729561121164")){
            information.setText("INFORMATION");
            name.setText("Ashanti Biscotti");
            size.setText("8");
            location.setText("3-3-E and 3-3-C");
            done.setText("done");
        }

        if (barcode.equals("729561121181")){
            information.setText("INFORMATION");
            name.setText("Ashanti Biscotti");
            size.setText("9");
            location.setText("3-3-E and 3-3-C");
            done.setText("done");
        }

//      Ashanti Fleur

        if (barcode.equals("729561137625")){
            information.setText("INFORMATION");
            name.setText("Ashanti Fleur");
            size.setText("5");
            location.setText("3-3-E and 3-3-C");
            done.setText("done");
        }

        if (barcode.equals("729561137636")){
            information.setText("INFORMATION");
            name.setText("Ashanti Fleur");
            size.setText("6");
            location.setText("3-3-E and 3-3-C");
            done.setText("done");
        }

        if (barcode.equals("729561137649")){
            information.setText("INFORMATION");
            name.setText("Ashanti Fleur");
            size.setText("7");
            location.setText("3-3-E and 3-3-C");
            done.setText("done");
        }

        if (barcode.equals("729561137664")){
            information.setText("INFORMATION");
            name.setText("Ashanti Fleur");
            size.setText("8");
            location.setText("3-3-E and 3-3-C");
            done.setText("done");
        }

        if (barcode.equals("729561137681")){
            information.setText("INFORMATION");
            name.setText("Ashanti Fleur");
            size.setText("9");
            location.setText("3-3-E and 3-3-C");
            done.setText("done");
        }

//      Ashanti White

        if (barcode.equals("729561165525")){
            information.setText("INFORMATION");
            name.setText("Ashanti White");
            size.setText("5");
            location.setText("3-3-E and 3-3-C");
            done.setText("done");
        }

        if (barcode.equals("729561165536")){
            information.setText("INFORMATION");
            name.setText("Ashanti White");
            size.setText("6");
            location.setText("3-3-E and 3-3-C");
            done.setText("done");
        }

        if (barcode.equals("729561165549")){
            information.setText("INFORMATION");
            name.setText("Ashanti White");
            size.setText("7");
            location.setText("3-3-E and 3-3-C");
            done.setText("done");
        }

        if (barcode.equals("729561165564")){
            information.setText("INFORMATION");
            name.setText("Ashanti White");
            size.setText("8");
            location.setText("3-3-E and 3-3-C");
            done.setText("done");
        }

        if (barcode.equals("729561165581")){
            information.setText("INFORMATION");
            name.setText("Ashanti White");
            size.setText("9");
            location.setText("3-3-E and 3-3-C");
            done.setText("done");
        }

//      Aztrid Black

        if (barcode.equals("512608646625")){
            information.setText("INFORMATION");
            name.setText("Aztrid Black");
            size.setText("5");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("512608646636")){
            information.setText("INFORMATION");
            name.setText("Aztrid Black");
            size.setText("6");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("512608646649")){
            information.setText("INFORMATION");
            name.setText("Aztrid Black");
            size.setText("7");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("512608646664")){
            information.setText("INFORMATION");
            name.setText("Aztrid Black");
            size.setText("8");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("512608646681")){
            information.setText("INFORMATION");
            name.setText("Aztrid Black");
            size.setText("9");
            location.setText("3-3-C");
            done.setText("done");
        }

//      Aztrid Cloud

        if (barcode.equals("512608668825")){
            information.setText("INFORMATION");
            name.setText("Aztrid Cloud");
            size.setText("5");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("512608668836")){
            information.setText("INFORMATION");
            name.setText("Aztrid Cloud");
            size.setText("6");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("512608668849")){
            information.setText("INFORMATION");
            name.setText("Aztrid Cloud");
            size.setText("7");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("512608668864")){
            information.setText("INFORMATION");
            name.setText("Aztrid Cloud");
            size.setText("8");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("512608668881")){
            information.setText("INFORMATION");
            name.setText("Aztrid Cloud");
            size.setText("9");
            location.setText("3-3-C");
            done.setText("done");
        }

//      Aztrid Nude

        if (barcode.equals("512608645425")){
            information.setText("INFORMATION");
            name.setText("Aztrid Nude");
            size.setText("5");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("512608645436")){
            information.setText("INFORMATION");
            name.setText("Aztrid Nude");
            size.setText("6");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("512608645449")){
            information.setText("INFORMATION");
            name.setText("Aztrid Nude");
            size.setText("7");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("512608645464")){
            information.setText("INFORMATION");
            name.setText("Aztrid Nude");
            size.setText("8");
            location.setText("3-3-C");
            done.setText("done");
        }

        if (barcode.equals("512608645481")){
            information.setText("INFORMATION");
            name.setText("Aztrid Nude");
            size.setText("9");
            location.setText("3-3-C");
            done.setText("done");
        }

//      Initial B
//      Bahari Biscotti

        if (barcode.equals("726930421125")){
            information.setText("INFORMATION");
            name.setText("Bahari Biscotti");
            size.setText("5");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("726930421136")){
            information.setText("INFORMATION");
            name.setText("Bahari Biscotti");
            size.setText("6");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("726930421149")){
            information.setText("INFORMATION");
            name.setText("Bahari Biscotti");
            size.setText("7");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("726930421164")){
            information.setText("INFORMATION");
            name.setText("Bahari Biscotti");
            size.setText("8");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("726930421181")){
            information.setText("INFORMATION");
            name.setText("Bahari Biscotti");
            size.setText("9");
            location.setText("3-3-I");
            done.setText("done");
        }

//      Bahari Ecru

        if (barcode.equals("726930453425")){
            information.setText("INFORMATION");
            name.setText("Bahari Ecru");
            size.setText("5");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("726930453436")){
            information.setText("INFORMATION");
            name.setText("Bahari Ecru");
            size.setText("6");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("726930453449")){
            information.setText("INFORMATION");
            name.setText("Bahari Ecru");
            size.setText("7");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("726930453464")){
            information.setText("INFORMATION");
            name.setText("Bahari Ecru");
            size.setText("8");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("726930453481")){
            information.setText("INFORMATION");
            name.setText("Bahari Ecru");
            size.setText("9");
            location.setText("3-3-I");
            done.setText("done");
        }

//      Bahari Toscana

        if (barcode.equals("726930414725")){
            information.setText("INFORMATION");
            name.setText("Bahari Toscana");
            size.setText("5");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("726930414736")){
            information.setText("INFORMATION");
            name.setText("Bahari Toscana");
            size.setText("6");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("726930414749")){
            information.setText("INFORMATION");
            name.setText("Bahari Toscana");
            size.setText("7");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("726930414764")){
            information.setText("INFORMATION");
            name.setText("Bahari Toscana");
            size.setText("8");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("726930414781")){
            information.setText("INFORMATION");
            name.setText("Bahari Toscana");
            size.setText("9");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("726930414710")){
            information.setText("INFORMATION");
            name.setText("Bahari Toscana");
            size.setText("10");
            location.setText("3-3-I");
            done.setText("done");
        }

//      Becca Biscotti

        if (barcode.equals("720691721125")){
            information.setText("INFORMATION");
            name.setText("Becca Biscotti");
            size.setText("5");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("720691721136")){
            information.setText("INFORMATION");
            name.setText("Becca Biscotti");
            size.setText("6");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("720691721149")){
            information.setText("INFORMATION");
            name.setText("Becca Biscotti");
            size.setText("7");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("720691721164")){
            information.setText("INFORMATION");
            name.setText("Becca Biscotti");
            size.setText("8");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("720691721181")){
            information.setText("INFORMATION");
            name.setText("Becca Biscotti");
            size.setText("9");
            location.setText("3-3-I");
            done.setText("done");
        }

//      Becca Fleur

        if (barcode.equals("720691737625")){
            information.setText("INFORMATION");
            name.setText("Becca Fleur");
            size.setText("5");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("720691737636")){
            information.setText("INFORMATION");
            name.setText("Becca Fleur");
            size.setText("6");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("720691737649")){
            information.setText("INFORMATION");
            name.setText("Becca Fleur");
            size.setText("7");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("720691737664")){
            information.setText("INFORMATION");
            name.setText("Becca Fleur");
            size.setText("8");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("720691737681")){
            information.setText("INFORMATION");
            name.setText("Becca Fleur");
            size.setText("9");
            location.setText("3-3-I");
            done.setText("done");
        }

//      Becca White

        if (barcode.equals("720691765525")){
            information.setText("INFORMATION");
            name.setText("Becca White");
            size.setText("5");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("720691765536")){
            information.setText("INFORMATION");
            name.setText("Becca White");
            size.setText("6");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("720691765549")){
            information.setText("INFORMATION");
            name.setText("Becca White");
            size.setText("7");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("720691765564")){
            information.setText("INFORMATION");
            name.setText("Becca White");
            size.setText("8");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("720691765581")){
            information.setText("INFORMATION");
            name.setText("Becca White");
            size.setText("9");
            location.setText("3-3-I");
            done.setText("done");
        }

//      Beyza Biscotti

        if (barcode.equals("207160921125")){
            information.setText("INFORMATION");
            name.setText("Beyza Biscotti");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160921136")){
            information.setText("INFORMATION");
            name.setText("Beyza Biscotti");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160921149")){
            information.setText("INFORMATION");
            name.setText("Beyza Biscotti");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160921164")){
            information.setText("INFORMATION");
            name.setText("Beyza Biscotti");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160921181")){
            information.setText("INFORMATION");
            name.setText("Beyza Biscotti");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Beyza Cashew

        if (barcode.equals("207160968725")){
            information.setText("INFORMATION");
            name.setText("Beyza Cashew");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160968736")){
            information.setText("INFORMATION");
            name.setText("Beyza Cashew");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160968749")){
            information.setText("INFORMATION");
            name.setText("Beyza Cashew");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160968764")){
            information.setText("INFORMATION");
            name.setText("Beyza Cashew");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160968781")){
            information.setText("INFORMATION");
            name.setText("Beyza Cashew");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Beyza Lime

        if (barcode.equals("207160989825")){
            information.setText("INFORMATION");
            name.setText("Beyza Lime");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160989836")){
            information.setText("INFORMATION");
            name.setText("Beyza Lime");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160989849")){
            information.setText("INFORMATION");
            name.setText("Beyza Lime");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160989864")){
            information.setText("INFORMATION");
            name.setText("Beyza Lime");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160989881")){
            information.setText("INFORMATION");
            name.setText("Beyza Lime");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Beyza Old Rose

        if (barcode.equals("207160948225")){
            information.setText("INFORMATION");
            name.setText("Beyza Old Rose");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160948236")){
            information.setText("INFORMATION");
            name.setText("Beyza Old Rose");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160948249")){
            information.setText("INFORMATION");
            name.setText("Beyza Old Rose");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160948264")){
            information.setText("INFORMATION");
            name.setText("Beyza Old Rose");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160948281")){
            information.setText("INFORMATION");
            name.setText("Beyza Old Rose");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Beyza Sierra

        if (barcode.equals("207160999225")){
            information.setText("INFORMATION");
            name.setText("Beyza Sierra");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160999236")){
            information.setText("INFORMATION");
            name.setText("Beyza Sierra");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160999249")){
            information.setText("INFORMATION");
            name.setText("Beyza Sierra");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160999264")){
            information.setText("INFORMATION");
            name.setText("Beyza Sierra");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160999281")){
            information.setText("INFORMATION");
            name.setText("Beyza Sierra");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Beyza Tangerine 1

        if (barcode.equals("207160929925")){
            information.setText("INFORMATION");
            name.setText("Beyza Tangerine 1");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160929936")){
            information.setText("INFORMATION");
            name.setText("Beyza Tangerine 1");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160929949")){
            information.setText("INFORMATION");
            name.setText("Beyza Tangerine 1");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160929964")){
            information.setText("INFORMATION");
            name.setText("Beyza Tangerine 1");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160929981")){
            information.setText("INFORMATION");
            name.setText("Beyza Tangerine 1");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Beyza Tricolor

        if (barcode.equals("207160978125")){
            information.setText("INFORMATION");
            name.setText("Beyza Tricolor");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160978136")){
            information.setText("INFORMATION");
            name.setText("Beyza Tricolor");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160978149")){
            information.setText("INFORMATION");
            name.setText("Beyza Tricolor");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160978164")){
            information.setText("INFORMATION");
            name.setText("Beyza Tricolor");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160978181")){
            information.setText("INFORMATION");
            name.setText("Beyza Tricolor");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Beyza White

        if (barcode.equals("207160965525")){
            information.setText("INFORMATION");
            name.setText("Beyza White");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160965536")){
            information.setText("INFORMATION");
            name.setText("Beyza White");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160965549")){
            information.setText("INFORMATION");
            name.setText("Beyza White");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160965564")){
            information.setText("INFORMATION");
            name.setText("Beyza White");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("207160965581")){
            information.setText("INFORMATION");
            name.setText("Beyza White");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Binx Biscotti

        if (barcode.equals("564628021125")){
            information.setText("INFORMATION");
            name.setText("Binx Biscotti");
            size.setText("5");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("564628021136")){
            information.setText("INFORMATION");
            name.setText("Binx Biscotti");
            size.setText("6");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("564628021149")){
            information.setText("INFORMATION");
            name.setText("Binx Biscotti");
            size.setText("7");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("564628021164")){
            information.setText("INFORMATION");
            name.setText("Binx Biscotti");
            size.setText("8");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("564628021181")){
            information.setText("INFORMATION");
            name.setText("Binx Biscotti");
            size.setText("9");
            location.setText("3-3-G");
            done.setText("done");
        }

//      Binx Le Blanc

        if (barcode.equals("564628082025")){
            information.setText("INFORMATION");
            name.setText("Binx Le Blanc");
            size.setText("5");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("564628082036")){
            information.setText("INFORMATION");
            name.setText("Binx Le Blanc");
            size.setText("6");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("564628082049")){
            information.setText("INFORMATION");
            name.setText("Binx Le Blanc");
            size.setText("7");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("564628082064")){
            information.setText("INFORMATION");
            name.setText("Binx Le Blanc");
            size.setText("8");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("564628082081")){
            information.setText("INFORMATION");
            name.setText("Binx Le Blanc");
            size.setText("9");
            location.setText("3-3-G");
            done.setText("done");
        }

//      Binx Toscana

        if (barcode.equals("564628014725")){
            information.setText("INFORMATION");
            name.setText("Binx Toscana");
            size.setText("5");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("564628014736")){
            information.setText("INFORMATION");
            name.setText("Binx Toscana");
            size.setText("6");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("564628014749")){
            information.setText("INFORMATION");
            name.setText("Binx Toscana");
            size.setText("7");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("564628014764")){
            information.setText("INFORMATION");
            name.setText("Binx Toscana");
            size.setText("8");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("564628014781")){
            information.setText("INFORMATION");
            name.setText("Binx Toscana");
            size.setText("9");
            location.setText("3-3-G");
            done.setText("done");
        }

//      Blair Biscotti

        if (barcode.equals("866625621125")){
            information.setText("INFORMATION");
            name.setText("Blair Biscotti");
            size.setText("5");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("866625621136")){
            information.setText("INFORMATION");
            name.setText("Blair Biscotti");
            size.setText("6");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("866625621149")){
            information.setText("INFORMATION");
            name.setText("Blair Biscotti");
            size.setText("7");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("866625621164")){
            information.setText("INFORMATION");
            name.setText("Blair Biscotti");
            size.setText("8");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("866625621181")){
            information.setText("INFORMATION");
            name.setText("Blair Biscotti");
            size.setText("9");
            location.setText("3-3-I");
            done.setText("done");
        }

//      Blair Palomino

        if (barcode.equals("866625673625")){
            information.setText("INFORMATION");
            name.setText("Blair Palomino");
            size.setText("5");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("866625673636")){
            information.setText("INFORMATION");
            name.setText("Blair Palomino");
            size.setText("6");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("866625673649")){
            information.setText("INFORMATION");
            name.setText("Blair Palomino");
            size.setText("7");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("866625673664")){
            information.setText("INFORMATION");
            name.setText("Blair Palomino");
            size.setText("8");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("866625673681")){
            information.setText("INFORMATION");
            name.setText("Blair Palomino");
            size.setText("9");
            location.setText("3-3-I");
            done.setText("done");
        }

//      Blair White

        if (barcode.equals("866625665525")){
            information.setText("INFORMATION");
            name.setText("Blair White");
            size.setText("5");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("866625665536")){
            information.setText("INFORMATION");
            name.setText("Blair White");
            size.setText("6");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("866625665549")){
            information.setText("INFORMATION");
            name.setText("Blair White");
            size.setText("7");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("866625665564")){
            information.setText("INFORMATION");
            name.setText("Blair White");
            size.setText("8");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("866625665581")){
            information.setText("INFORMATION");
            name.setText("Blair White");
            size.setText("9");
            location.setText("3-3-I");
            done.setText("done");
        }

//      Blanche Black

        if (barcode.equals("448398846625")){
            information.setText("INFORMATION");
            name.setText("Blanche Black");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398846636")){
            information.setText("INFORMATION");
            name.setText("Blanche Black");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398846649")){
            information.setText("INFORMATION");
            name.setText("Blanche Black");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398846664")){
            information.setText("INFORMATION");
            name.setText("Blanche Black");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398846681")){
            information.setText("INFORMATION");
            name.setText("Blanche Black");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Blanche Cashew

        if (barcode.equals("448398868725")){
            information.setText("INFORMATION");
            name.setText("Blanche Cashew");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398868736")){
            information.setText("INFORMATION");
            name.setText("Blanche Cashew");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398868749")){
            information.setText("INFORMATION");
            name.setText("Blanche Cashew");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398868764")){
            information.setText("INFORMATION");
            name.setText("Blanche Cashew");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398868781")){
            information.setText("INFORMATION");
            name.setText("Blanche Cashew");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Blanche Cloud

        if (barcode.equals("448398868825")){
            information.setText("INFORMATION");
            name.setText("Blanche Cloud");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398868836")){
            information.setText("INFORMATION");
            name.setText("Blanche Cloud");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398868849")){
            information.setText("INFORMATION");
            name.setText("Blanche Cloud");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398868864")){
            information.setText("INFORMATION");
            name.setText("Blanche Cloud");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398868881")){
            information.setText("INFORMATION");
            name.setText("Blanche Cloud");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Blanche Honey

        if (barcode.equals("448398896325")){
            information.setText("INFORMATION");
            name.setText("Blanche Honey");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398896336")){
            information.setText("INFORMATION");
            name.setText("Blanche Honey");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398896349")){
            information.setText("INFORMATION");
            name.setText("Blanche Honey");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398896364")){
            information.setText("INFORMATION");
            name.setText("Blanche Honey");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398896381")){
            information.setText("INFORMATION");
            name.setText("Blanche Honey");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Blanche Rosette

        if (barcode.equals("448398849325")){
            information.setText("INFORMATION");
            name.setText("Blanche Rosette");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398849336")){
            information.setText("INFORMATION");
            name.setText("Blanche Rosette");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398849349")){
            information.setText("INFORMATION");
            name.setText("Blanche Rosette");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398849364")){
            information.setText("INFORMATION");
            name.setText("Blanche Rosette");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398849381")){
            information.setText("INFORMATION");
            name.setText("Blanche Rosette");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Blanche Tofu

        if (barcode.equals("448398839825")){
            information.setText("INFORMATION");
            name.setText("Blanche Tofu");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398839836")){
            information.setText("INFORMATION");
            name.setText("Blanche Tofu");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398839849")){
            information.setText("INFORMATION");
            name.setText("Blanche Tofu");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398839864")){
            information.setText("INFORMATION");
            name.setText("Blanche Tofu");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398839881")){
            information.setText("INFORMATION");
            name.setText("Blanche Tofu");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Blanche Tortoise

        if (barcode.equals("448398842125")){
            information.setText("INFORMATION");
            name.setText("Blanche Tortoise");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398842136")){
            information.setText("INFORMATION");
            name.setText("Blanche Tortoise");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398842149")){
            information.setText("INFORMATION");
            name.setText("Blanche Tortoise");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398842164")){
            information.setText("INFORMATION");
            name.setText("Blanche Tortoise");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398842181")){
            information.setText("INFORMATION");
            name.setText("Blanche Tortoise");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Blanche Turtledove

        if (barcode.equals("448398843625")){
            information.setText("INFORMATION");
            name.setText("Blanche Turtledove");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398843636")){
            information.setText("INFORMATION");
            name.setText("Blanche Turtledove");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398843649")){
            information.setText("INFORMATION");
            name.setText("Blanche Turtledove");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398843664")){
            information.setText("INFORMATION");
            name.setText("Blanche Turtledove");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("448398843681")){
            information.setText("INFORMATION");
            name.setText("Blanche Turtledove");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Blythe Biscotti

        if (barcode.equals("358253721125")){
            information.setText("INFORMATION");
            name.setText("Blythe Biscotti");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("358253721136")){
            information.setText("INFORMATION");
            name.setText("Blythe Biscotti");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("358253721149")){
            information.setText("INFORMATION");
            name.setText("Blythe Biscotti");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("358253721164")){
            information.setText("INFORMATION");
            name.setText("Blythe Biscotti");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("358253721181")){
            information.setText("INFORMATION");
            name.setText("Blythe Biscotti");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Blythe Black

        if (barcode.equals("358253746625")){
            information.setText("INFORMATION");
            name.setText("Blythe Black");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("358253746636")){
            information.setText("INFORMATION");
            name.setText("Blythe Black");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("358253746649")){
            information.setText("INFORMATION");
            name.setText("Blythe Black");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("358253746664")){
            information.setText("INFORMATION");
            name.setText("Blythe Black");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("358253746681")){
            information.setText("INFORMATION");
            name.setText("Blythe Black");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Blythe Cashew

        if (barcode.equals("358253768725")){
            information.setText("INFORMATION");
            name.setText("Blythe Cashew");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("358253768736")){
            information.setText("INFORMATION");
            name.setText("Blythe Cashew");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("358253768749")){
            information.setText("INFORMATION");
            name.setText("Blythe Cashew");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("358253768764")){
            information.setText("INFORMATION");
            name.setText("Blythe Cashew");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("358253768781")){
            information.setText("INFORMATION");
            name.setText("Blythe Cashew");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Blythe White

        if (barcode.equals("358253765525")){
            information.setText("INFORMATION");
            name.setText("Blythe White");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("358253765536")){
            information.setText("INFORMATION");
            name.setText("Blythe White");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("358253765549")){
            information.setText("INFORMATION");
            name.setText("Blythe White");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("358253765564")){
            information.setText("INFORMATION");
            name.setText("Blythe White");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("358253765581")){
            information.setText("INFORMATION");
            name.setText("Blythe White");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Brea Toscana

        if (barcode.equals("750350014725")){
            information.setText("INFORMATION");
            name.setText("Brea Toscana");
            size.setText("5");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("750350014736")){
            information.setText("INFORMATION");
            name.setText("Brea Toscana");
            size.setText("6");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("750350014749")){
            information.setText("INFORMATION");
            name.setText("Brea Toscana");
            size.setText("7");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("750350014764")){
            information.setText("INFORMATION");
            name.setText("Brea Toscana");
            size.setText("8");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("750350014781")){
            information.setText("INFORMATION");
            name.setText("Brea Toscana");
            size.setText("9");
            location.setText("3-3-I");
            done.setText("done");
        }

//      Brea White

        if (barcode.equals("750350065525")){
            information.setText("INFORMATION");
            name.setText("Brea White");
            size.setText("5");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("750350065536")){
            information.setText("INFORMATION");
            name.setText("Brea White");
            size.setText("6");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("750350065549")){
            information.setText("INFORMATION");
            name.setText("Brea White");
            size.setText("7");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("750350065564")){
            information.setText("INFORMATION");
            name.setText("Brea White");
            size.setText("8");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("750350065581")){
            information.setText("INFORMATION");
            name.setText("Brea White");
            size.setText("9");
            location.setText("3-3-I");
            done.setText("done");
        }


//      Brita Fleur

        if (barcode.equals("680700737625")){
            information.setText("INFORMATION");
            name.setText("Brita Fleur");
            size.setText("5");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("680700737636")){
            information.setText("INFORMATION");
            name.setText("Brita Fleur");
            size.setText("6");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("680700737649")){
            information.setText("INFORMATION");
            name.setText("Brita Fleur");
            size.setText("7");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("680700737664")){
            information.setText("INFORMATION");
            name.setText("Brita Fleur");
            size.setText("8");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("680700737681")){
            information.setText("INFORMATION");
            name.setText("Brita Fleur");
            size.setText("9");
            location.setText("3-3-G");
            done.setText("done");
        }

//      Brita Toscana

        if (barcode.equals("680700714725")){
            information.setText("INFORMATION");
            name.setText("Brita Toscana");
            size.setText("5");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("680700714736")){
            information.setText("INFORMATION");
            name.setText("Brita Toscana");
            size.setText("6");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("680700714749")){
            information.setText("INFORMATION");
            name.setText("Brita Toscana");
            size.setText("7");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("680700714764")){
            information.setText("INFORMATION");
            name.setText("Brita Toscana");
            size.setText("8");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("680700714781")){
            information.setText("INFORMATION");
            name.setText("Brita Toscana");
            size.setText("9");
            location.setText("3-3-G");
            done.setText("done");
        }

//      Brita White

        if (barcode.equals("680700765525")){
            information.setText("INFORMATION");
            name.setText("Brita White");
            size.setText("5");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("680700765536")){
            information.setText("INFORMATION");
            name.setText("Brita White");
            size.setText("6");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("680700765549")){
            information.setText("INFORMATION");
            name.setText("Brita White");
            size.setText("7");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("680700765564")){
            information.setText("INFORMATION");
            name.setText("Brita White");
            size.setText("8");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("680700765581")){
            information.setText("INFORMATION");
            name.setText("Brita White");
            size.setText("9");
            location.setText("3-3-G");
            done.setText("done");
        }

//      Briza Creme

        if (barcode.equals("990579994625")){
            information.setText("INFORMATION");
            name.setText("Briza Creme");
            size.setText("5");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("990579994636")){
            information.setText("INFORMATION");
            name.setText("Briza Creme");
            size.setText("6");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("990579994649")){
            information.setText("INFORMATION");
            name.setText("Briza Creme");
            size.setText("7");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("990579994664")){
            information.setText("INFORMATION");
            name.setText("Briza Creme");
            size.setText("8");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("990579994681")){
            information.setText("INFORMATION");
            name.setText("Briza Creme");
            size.setText("9");
            location.setText("3-3-G");
            done.setText("done");
        }

//      Briza Naturale

        if (barcode.equals("990579930325")){
            information.setText("INFORMATION");
            name.setText("Briza Naturale");
            size.setText("5");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("990579930336")){
            information.setText("INFORMATION");
            name.setText("Briza Naturale");
            size.setText("6");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("990579930349")){
            information.setText("INFORMATION");
            name.setText("Briza Naturale");
            size.setText("7");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("990579930364")){
            information.setText("INFORMATION");
            name.setText("Briza Naturale");
            size.setText("8");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("990579930381")){
            information.setText("INFORMATION");
            name.setText("Briza Naturale");
            size.setText("9");
            location.setText("3-3-G");
            done.setText("done");
        }

//      Briza Sedona

        if (barcode.equals("990579951025")){
            information.setText("INFORMATION");
            name.setText("Briza Sedona");
            size.setText("5");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("990579951036")){
            information.setText("INFORMATION");
            name.setText("Briza Sedona");
            size.setText("6");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("990579951049")){
            information.setText("INFORMATION");
            name.setText("Briza Sedona");
            size.setText("7");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("990579951064")){
            information.setText("INFORMATION");
            name.setText("Briza Sedona");
            size.setText("8");
            location.setText("3-3-G");
            done.setText("done");
        }

        if (barcode.equals("990579951081")){
            information.setText("INFORMATION");
            name.setText("Briza Sedona");
            size.setText("9");
            location.setText("3-3-G");
            done.setText("done");
        }


//      Initial C
//      Calais Le Blanc

        if (barcode.equals("432960882025")){
            information.setText("INFORMATION");
            name.setText("Calais Le Blanc");
            size.setText("5");
            location.setText("3-5-L and 3-5-N");
            done.setText("done");
        }

        if (barcode.equals("432960882036")){
            information.setText("INFORMATION");
            name.setText("Calais Le Blanc");
            size.setText("6");
            location.setText("3-5-L and 3-5-N");
            done.setText("done");
        }

        if (barcode.equals("432960882049")){
            information.setText("INFORMATION");
            name.setText("Calais Le Blanc");
            size.setText("7");
            location.setText("3-5-L and 3-5-N");
            done.setText("done");
        }

        if (barcode.equals("432960882064")){
            information.setText("INFORMATION");
            name.setText("Calais Le Blanc");
            size.setText("8");
            location.setText("3-5-L and 3-5-N");
            done.setText("done");
        }

        if (barcode.equals("432960882081")){
            information.setText("INFORMATION");
            name.setText("Calais Le Blanc");
            size.setText("9");
            location.setText("3-5-L and 3-5-N");
            done.setText("done");
        }

        if (barcode.equals("432960882010")){
            information.setText("INFORMATION");
            name.setText("Calais Le Blanc");
            size.setText("10");
            location.setText("3-5-L and 3-5-N");
            done.setText("done");
        }

//      Calais Naturale

        if (barcode.equals("432960830325")){
            information.setText("INFORMATION");
            name.setText("Calais Naturale");
            size.setText("5");
            location.setText("3-5-L and 3-5-N");
            done.setText("done");
        }

        if (barcode.equals("432960830336")){
            information.setText("INFORMATION");
            name.setText("Calais Naturale");
            size.setText("6");
            location.setText("3-5-L and 3-5-N");
            done.setText("done");
        }

        if (barcode.equals("432960830349")){
            information.setText("INFORMATION");
            name.setText("Calais Naturale");
            size.setText("7");
            location.setText("3-5-L and 3-5-N");
            done.setText("done");
        }

        if (barcode.equals("432960830364")){
            information.setText("INFORMATION");
            name.setText("Calais Naturale");
            size.setText("8");
            location.setText("3-5-L and 3-5-N");
            done.setText("done");
        }

        if (barcode.equals("432960830381")){
            information.setText("INFORMATION");
            name.setText("Calais Naturale");
            size.setText("9");
            location.setText("3-5-L and 3-5-N");
            done.setText("done");
        }

        if (barcode.equals("432960830310")){
            information.setText("INFORMATION");
            name.setText("Calais Naturale");
            size.setText("10");
            location.setText("3-5-L and 3-5-N");
            done.setText("done");
        }

//      Cali Biscotti

        if (barcode.equals("948331221125")){
            information.setText("INFORMATION");
            name.setText("Cali Biscotti");
            size.setText("5");
            location.setText("3-3-B");
            done.setText("done");
        }

        if (barcode.equals("948331221136")){
            information.setText("INFORMATION");
            name.setText("Cali Biscotti");
            size.setText("6");
            location.setText("3-3-B");
            done.setText("done");
        }

        if (barcode.equals("948331221149")){
            information.setText("INFORMATION");
            name.setText("Cali Biscotti");
            size.setText("7");
            location.setText("3-3-B");
            done.setText("done");
        }

        if (barcode.equals("948331221164")){
            information.setText("INFORMATION");
            name.setText("Cali Biscotti");
            size.setText("8");
            location.setText("3-3-B");
            done.setText("done");
        }

        if (barcode.equals("948331221181")){
            information.setText("INFORMATION");
            name.setText("Cali Biscotti");
            size.setText("9");
            location.setText("3-3-B");
            done.setText("done");
        }

//      Cali Creme

        if (barcode.equals("948331294625")){
            information.setText("INFORMATION");
            name.setText("Cali Creme");
            size.setText("5");
            location.setText("3-3-B");
            done.setText("done");
        }

        if (barcode.equals("948331294636")){
            information.setText("INFORMATION");
            name.setText("Cali Creme");
            size.setText("6");
            location.setText("3-3-B");
            done.setText("done");
        }

        if (barcode.equals("948331294649")){
            information.setText("INFORMATION");
            name.setText("Cali Creme");
            size.setText("7");
            location.setText("3-3-B");
            done.setText("done");
        }

        if (barcode.equals("948331294664")){
            information.setText("INFORMATION");
            name.setText("Cali Creme");
            size.setText("8");
            location.setText("3-3-B");
            done.setText("done");
        }

        if (barcode.equals("948331294681")){
            information.setText("INFORMATION");
            name.setText("Cali Creme");
            size.setText("9");
            location.setText("3-3-B");
            done.setText("done");
        }

//      Cali Fleur

        if (barcode.equals("948331237625")){
            information.setText("INFORMATION");
            name.setText("Cali Fleur");
            size.setText("5");
            location.setText("3-3-B");
            done.setText("done");
        }

        if (barcode.equals("948331237636")){
            information.setText("INFORMATION");
            name.setText("Cali Fleur");
            size.setText("6");
            location.setText("3-3-B");
            done.setText("done");
        }

        if (barcode.equals("948331237649")){
            information.setText("INFORMATION");
            name.setText("Cali Fleur");
            size.setText("7");
            location.setText("3-3-B");
            done.setText("done");
        }

        if (barcode.equals("948331237664")){
            information.setText("INFORMATION");
            name.setText("Cali Fleur");
            size.setText("8");
            location.setText("3-3-B");
            done.setText("done");
        }

        if (barcode.equals("948331237681")){
            information.setText("INFORMATION");
            name.setText("Cali Fleur");
            size.setText("9");
            location.setText("3-3-B");
            done.setText("done");
        }

//      Cali Noir

        if (barcode.equals("948331238425")){
            information.setText("INFORMATION");
            name.setText("Cali Noir");
            size.setText("5");
            location.setText("3-3-B");
            done.setText("done");
        }

        if (barcode.equals("948331238436")){
            information.setText("INFORMATION");
            name.setText("Cali Noir");
            size.setText("6");
            location.setText("3-3-B");
            done.setText("done");
        }

        if (barcode.equals("948331238449")){
            information.setText("INFORMATION");
            name.setText("Cali Noir");
            size.setText("7");
            location.setText("3-3-B");
            done.setText("done");
        }

        if (barcode.equals("948331238464")){
            information.setText("INFORMATION");
            name.setText("Cali Noir");
            size.setText("8");
            location.setText("3-3-B");
            done.setText("done");
        }

        if (barcode.equals("948331238481")){
            information.setText("INFORMATION");
            name.setText("Cali Noir");
            size.setText("9");
            location.setText("3-3-B");
            done.setText("done");
        }

//      Calista Black

        if (barcode.equals("967918246625")){
            information.setText("INFORMATION");
            name.setText("Calista Black");
            size.setText("5");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("967918246636")){
            information.setText("INFORMATION");
            name.setText("Calista Black");
            size.setText("6");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("967918246649")){
            information.setText("INFORMATION");
            name.setText("Calista Black");
            size.setText("7");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("967918246664")){
            information.setText("INFORMATION");
            name.setText("Calista Black");
            size.setText("8");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("967918246681")){
            information.setText("INFORMATION");
            name.setText("Calista Black");
            size.setText("9");
            location.setText("3-3-N");
            done.setText("done");
        }

//      Calista Fleur

        if (barcode.equals("967918237625")){
            information.setText("INFORMATION");
            name.setText("Calista Fleur");
            size.setText("5");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("967918237636")){
            information.setText("INFORMATION");
            name.setText("Calista Fleur");
            size.setText("6");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("967918237649")){
            information.setText("INFORMATION");
            name.setText("Calista Fleur");
            size.setText("7");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("967918237664")){
            information.setText("INFORMATION");
            name.setText("Calista Fleur");
            size.setText("8");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("967918237681")){
            information.setText("INFORMATION");
            name.setText("Calista Fleur");
            size.setText("9");
            location.setText("3-3-N");
            done.setText("done");
        }

//      Calista Toscana

        if (barcode.equals("967918214725")){
            information.setText("INFORMATION");
            name.setText("Calista Toscana");
            size.setText("5");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("967918214736")){
            information.setText("INFORMATION");
            name.setText("Calista Toscana");
            size.setText("6");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("967918214749")){
            information.setText("INFORMATION");
            name.setText("Calista Toscana");
            size.setText("7");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("967918214764")){
            information.setText("INFORMATION");
            name.setText("Calista Toscana");
            size.setText("8");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("967918214781")){
            information.setText("INFORMATION");
            name.setText("Calista Toscana");
            size.setText("9");
            location.setText("3-3-N");
            done.setText("done");
        }

//      Calista White

        if (barcode.equals("967918265525")){
            information.setText("INFORMATION");
            name.setText("Calista White");
            size.setText("5");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("967918265536")){
            information.setText("INFORMATION");
            name.setText("Calista White");
            size.setText("6");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("967918265549")){
            information.setText("INFORMATION");
            name.setText("Calista White");
            size.setText("7");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("967918265564")){
            information.setText("INFORMATION");
            name.setText("Calista White");
            size.setText("8");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("967918265581")){
            information.setText("INFORMATION");
            name.setText("Calista White");
            size.setText("9");
            location.setText("3-3-N");
            done.setText("done");
        }

//      Calla Biscotti

        if (barcode.equals("263274821125")){
            information.setText("INFORMATION");
            name.setText("Calla Biscotti");
            size.setText("5");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("263274821136")){
            information.setText("INFORMATION");
            name.setText("Calla Biscotti");
            size.setText("6");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("263274821149")){
            information.setText("INFORMATION");
            name.setText("Calla Biscotti");
            size.setText("7");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("263274821164")){
            information.setText("INFORMATION");
            name.setText("Calla Biscotti");
            size.setText("8");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("263274821181")){
            information.setText("INFORMATION");
            name.setText("Calla Biscotti");
            size.setText("9");
            location.setText("3-3-I");
            done.setText("done");
        }

//      Calla White

        if (barcode.equals("263274865525")){
            information.setText("INFORMATION");
            name.setText("Calla White");
            size.setText("5");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("263274865536")){
            information.setText("INFORMATION");
            name.setText("Calla White");
            size.setText("6");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("263274865549")){
            information.setText("INFORMATION");
            name.setText("Calla White");
            size.setText("7");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("263274865564")){
            information.setText("INFORMATION");
            name.setText("Calla White");
            size.setText("8");
            location.setText("3-3-I");
            done.setText("done");
        }

        if (barcode.equals("263274865581")){
            information.setText("INFORMATION");
            name.setText("Calla White");
            size.setText("9");
            location.setText("3-3-I");
            done.setText("done");
        }

//      Candice Fleur

        if (barcode.equals("541441937625")){
            information.setText("INFORMATION");
            name.setText("Candice Fleur");
            size.setText("5");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("541441937636")){
            information.setText("INFORMATION");
            name.setText("Candice Fleur");
            size.setText("6");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("541441937649")){
            information.setText("INFORMATION");
            name.setText("Candice Fleur");
            size.setText("7");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("541441937664")){
            information.setText("INFORMATION");
            name.setText("Candice Fleur");
            size.setText("8");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("541441937681")){
            information.setText("INFORMATION");
            name.setText("Candice Fleur");
            size.setText("9");
            location.setText("3-3-N");
            done.setText("done");
        }

//      Candice Palomino

        if (barcode.equals("541441973625")){
            information.setText("INFORMATION");
            name.setText("Candice Palomino");
            size.setText("5");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("541441973636")){
            information.setText("INFORMATION");
            name.setText("Candice Palomino");
            size.setText("6");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("541441973649")){
            information.setText("INFORMATION");
            name.setText("Candice Palomino");
            size.setText("7");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("541441973664")){
            information.setText("INFORMATION");
            name.setText("Candice Palomino");
            size.setText("8");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("541441973681")){
            information.setText("INFORMATION");
            name.setText("Candice Palomino");
            size.setText("9");
            location.setText("3-3-N");
            done.setText("done");
        }

//      Candice Toscana

        if (barcode.equals("541441914725")){
            information.setText("INFORMATION");
            name.setText("Candice Toscana");
            size.setText("5");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("541441914736")){
            information.setText("INFORMATION");
            name.setText("Candice Toscana");
            size.setText("6");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("541441914749")){
            information.setText("INFORMATION");
            name.setText("Candice Toscana");
            size.setText("7");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("541441914764")){
            information.setText("INFORMATION");
            name.setText("Candice Toscana");
            size.setText("8");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("541441914781")){
            information.setText("INFORMATION");
            name.setText("Candice Toscana");
            size.setText("9");
            location.setText("3-3-N");
            done.setText("done");
        }

//      Caprice Le Blanc

        if (barcode.equals("520740182025")){
            information.setText("INFORMATION");
            name.setText("Caprice Le Blanc");
            size.setText("5");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("520740182036")){
            information.setText("INFORMATION");
            name.setText("Caprice Le Blanc");
            size.setText("6");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("520740182049")){
            information.setText("INFORMATION");
            name.setText("Caprice Le Blanc");
            size.setText("7");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("520740182064")){
            information.setText("INFORMATION");
            name.setText("Caprice Le Blanc");
            size.setText("8");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("520740182081")){
            information.setText("INFORMATION");
            name.setText("Caprice Le Blanc");
            size.setText("9");
            location.setText("3-3-J");
            done.setText("done");
        }

//      Caprice Noir

        if (barcode.equals("520740138425")){
            information.setText("INFORMATION");
            name.setText("Caprice Noir");
            size.setText("5");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("520740138436")){
            information.setText("INFORMATION");
            name.setText("Caprice Noir");
            size.setText("6");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("520740138449")){
            information.setText("INFORMATION");
            name.setText("Caprice Noir");
            size.setText("7");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("520740138464")){
            information.setText("INFORMATION");
            name.setText("Caprice Noir");
            size.setText("8");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("520740138481")){
            information.setText("INFORMATION");
            name.setText("Caprice Noir");
            size.setText("9");
            location.setText("3-3-J");
            done.setText("done");
        }

//      Caprice Toast

        if (barcode.equals("520740127325")){
            information.setText("INFORMATION");
            name.setText("Caprice Toast");
            size.setText("5");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("520740127336")){
            information.setText("INFORMATION");
            name.setText("Caprice Toast");
            size.setText("6");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("520740127349")){
            information.setText("INFORMATION");
            name.setText("Caprice Toast");
            size.setText("7");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("520740127364")){
            information.setText("INFORMATION");
            name.setText("Caprice Toast");
            size.setText("8");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("520740127381")){
            information.setText("INFORMATION");
            name.setText("Caprice Toast");
            size.setText("9");
            location.setText("3-3-J");
            done.setText("done");
        }

//      Cari Beige

        if (barcode.equals("922315119125")){
            information.setText("INFORMATION");
            name.setText("Cari Beige");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315119136")){
            information.setText("INFORMATION");
            name.setText("Cari Beige");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315119149")){
            information.setText("INFORMATION");
            name.setText("Cari Beige");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315119164")){
            information.setText("INFORMATION");
            name.setText("Cari Beige");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315119181")){
            information.setText("INFORMATION");
            name.setText("Cari Beige");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Cari Biscotti

        if (barcode.equals("922315121125")){
            information.setText("INFORMATION");
            name.setText("Cari Biscotti");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315121136")){
            information.setText("INFORMATION");
            name.setText("Cari Biscotti");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315121149")){
            information.setText("INFORMATION");
            name.setText("Cari Biscotti");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315121164")){
            information.setText("INFORMATION");
            name.setText("Cari Biscotti");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315121181")){
            information.setText("INFORMATION");
            name.setText("Cari Biscotti");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Cari Black Leather

        if (barcode.equals("922315166925")){
            information.setText("INFORMATION");
            name.setText("Cari Black Leather");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315166936")){
            information.setText("INFORMATION");
            name.setText("Cari Black Leather");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315166949")){
            information.setText("INFORMATION");
            name.setText("Cari Black Leather");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315166964")){
            information.setText("INFORMATION");
            name.setText("Cari Black Leather");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315166981")){
            information.setText("INFORMATION");
            name.setText("Cari Black Leather");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Cari Black Suede

        if (barcode.equals("922315184625")){
            information.setText("INFORMATION");
            name.setText("Cari Black Suede");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315184636")){
            information.setText("INFORMATION");
            name.setText("Cari Black Suede");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315184649")){
            information.setText("INFORMATION");
            name.setText("Cari Black Suede");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315184664")){
            information.setText("INFORMATION");
            name.setText("Cari Black Suede");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315184681")){
            information.setText("INFORMATION");
            name.setText("Cari Black Suede");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Cari Blanc Gray

        if (barcode.equals("922315185425")){
            information.setText("INFORMATION");
            name.setText("Cari Blanc Gray");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315185436")){
            information.setText("INFORMATION");
            name.setText("Cari Blanc Gray");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315185449")){
            information.setText("INFORMATION");
            name.setText("Cari Blanc Gray");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315185464")){
            information.setText("INFORMATION");
            name.setText("Cari Blanc Gray");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315185481")){
            information.setText("INFORMATION");
            name.setText("Cari Blanc Gray");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Cari Cashew

        if (barcode.equals("922315168725")){
            information.setText("INFORMATION");
            name.setText("Cari Cashew");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315168736")){
            information.setText("INFORMATION");
            name.setText("Cari Cashew");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315168749")){
            information.setText("INFORMATION");
            name.setText("Cari Cashew");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315168764")){
            information.setText("INFORMATION");
            name.setText("Cari Cashew");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315168781")){
            information.setText("INFORMATION");
            name.setText("Cari Cashew");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Cari Mauve

        if (barcode.equals("922315144225")){
            information.setText("INFORMATION");
            name.setText("Cari Mauve");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315144236")){
            information.setText("INFORMATION");
            name.setText("Cari Mauve");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315144249")){
            information.setText("INFORMATION");
            name.setText("Cari Mauve");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315144264")){
            information.setText("INFORMATION");
            name.setText("Cari Mauve");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315144281")){
            information.setText("INFORMATION");
            name.setText("Cari Mauve");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Cari Milk

        if (barcode.equals("922315126225")){
            information.setText("INFORMATION");
            name.setText("Cari Milk");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315126236")){
            information.setText("INFORMATION");
            name.setText("Cari Milk");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315126249")){
            information.setText("INFORMATION");
            name.setText("Cari Milk");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315126264")){
            information.setText("INFORMATION");
            name.setText("Cari Milk");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315126281")){
            information.setText("INFORMATION");
            name.setText("Cari Milk");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Cari Nude Leather

        if (barcode.equals("922315172825")){
            information.setText("INFORMATION");
            name.setText("Cari Nude Leather");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315172836")){
            information.setText("INFORMATION");
            name.setText("Cari Nude Leather");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315172849")){
            information.setText("INFORMATION");
            name.setText("Cari Nude Leather");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315172864")){
            information.setText("INFORMATION");
            name.setText("Cari Nude Leather");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315172881")){
            information.setText("INFORMATION");
            name.setText("Cari Nude Leather");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Cari Nude Suede

        if (barcode.equals("922315113925")){
            information.setText("INFORMATION");
            name.setText("Cari Nude Suede");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315113936")){
            information.setText("INFORMATION");
            name.setText("Cari Nude Suede");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315113949")){
            information.setText("INFORMATION");
            name.setText("Cari Nude Suede");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315113964")){
            information.setText("INFORMATION");
            name.setText("Cari Nude Suede");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315113981")){
            information.setText("INFORMATION");
            name.setText("Cari Nude Suede");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Cari Tan

        if (barcode.equals("922315181425")){
            information.setText("INFORMATION");
            name.setText("Cari Tan");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315181436")){
            information.setText("INFORMATION");
            name.setText("Cari Tan");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315181449")){
            information.setText("INFORMATION");
            name.setText("Cari Tan");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315181464")){
            information.setText("INFORMATION");
            name.setText("Cari Tan");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315181481")){
            information.setText("INFORMATION");
            name.setText("Cari Tan");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Cari Toffee

        if (barcode.equals("922315134425")){
            information.setText("INFORMATION");
            name.setText("Cari Toffee");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315134436")){
            information.setText("INFORMATION");
            name.setText("Cari Toffee");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315134449")){
            information.setText("INFORMATION");
            name.setText("Cari Toffee");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315134464")){
            information.setText("INFORMATION");
            name.setText("Cari Toffee");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315134481")){
            information.setText("INFORMATION");
            name.setText("Cari Toffee");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Cari Wine Red

        if (barcode.equals("922315134625")){
            information.setText("INFORMATION");
            name.setText("Cari Wine Red");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315134636")){
            information.setText("INFORMATION");
            name.setText("Cari Wine Red");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315134649")){
            information.setText("INFORMATION");
            name.setText("Cari Wine Red");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315134664")){
            information.setText("INFORMATION");
            name.setText("Cari Wine Red");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("922315134681")){
            information.setText("INFORMATION");
            name.setText("Cari Wine Red");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Carin Creme

        if (barcode.equals("770666294625")){
            information.setText("INFORMATION");
            name.setText("Carin Creme");
            size.setText("5");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666294636")){
            information.setText("INFORMATION");
            name.setText("Carin Creme");
            size.setText("6");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666294649")){
            information.setText("INFORMATION");
            name.setText("Carin Creme");
            size.setText("7");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666294664")){
            information.setText("INFORMATION");
            name.setText("Carin Creme");
            size.setText("8");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666294681")){
            information.setText("INFORMATION");
            name.setText("Carin Creme");
            size.setText("9");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666294610")){
            information.setText("INFORMATION");
            name.setText("Carin Creme");
            size.setText("10");
            location.setText("3-3-D");
            done.setText("done");
        }

//      Carin Le Blanc

        if (barcode.equals("770666282025")){
            information.setText("INFORMATION");
            name.setText("Carin Le Blanc");
            size.setText("5");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666282036")){
            information.setText("INFORMATION");
            name.setText("Carin Le Blanc");
            size.setText("6");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666282049")){
            information.setText("INFORMATION");
            name.setText("Carin Le Blanc");
            size.setText("7");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666282064")){
            information.setText("INFORMATION");
            name.setText("Carin Le Blanc");
            size.setText("8");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666282081")){
            information.setText("INFORMATION");
            name.setText("Carin Le Blanc");
            size.setText("9");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666282010")){
            information.setText("INFORMATION");
            name.setText("Carin Le Blanc");
            size.setText("10");
            location.setText("3-3-D");
            done.setText("done");
        }

//      Carin Naturale

        if (barcode.equals("770666230325")){
            information.setText("INFORMATION");
            name.setText("Carin Naturale");
            size.setText("5");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666230336")){
            information.setText("INFORMATION");
            name.setText("Carin Naturale");
            size.setText("6");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666230349")){
            information.setText("INFORMATION");
            name.setText("Carin Naturale");
            size.setText("7");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666230364")){
            information.setText("INFORMATION");
            name.setText("Carin Naturale");
            size.setText("8");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666230381")){
            information.setText("INFORMATION");
            name.setText("Carin Naturale");
            size.setText("9");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666230310")){
            information.setText("INFORMATION");
            name.setText("Carin Naturale");
            size.setText("10");
            location.setText("3-3-D");
            done.setText("done");
        }

//      Carin Naturale Old

        if (barcode.equals("770666299725")){
            information.setText("INFORMATION");
            name.setText("Carin Naturale Old");
            size.setText("5");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666299736")){
            information.setText("INFORMATION");
            name.setText("Carin Naturale Old");
            size.setText("6");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666299749")){
            information.setText("INFORMATION");
            name.setText("Carin Naturale Old");
            size.setText("7");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666299764")){
            information.setText("INFORMATION");
            name.setText("Carin Naturale Old");
            size.setText("8");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666299781")){
            information.setText("INFORMATION");
            name.setText("Carin Naturale Old");
            size.setText("9");
            location.setText("3-3-D");
            done.setText("done");
        }

//      Carin Sedona

        if (barcode.equals("770666251025")){
            information.setText("INFORMATION");
            name.setText("Carin Sedona");
            size.setText("5");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666251036")){
            information.setText("INFORMATION");
            name.setText("Carin Sedona");
            size.setText("6");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666251049")){
            information.setText("INFORMATION");
            name.setText("Carin Sedona");
            size.setText("7");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666251064")){
            information.setText("INFORMATION");
            name.setText("Carin Sedona");
            size.setText("8");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666251081")){
            information.setText("INFORMATION");
            name.setText("Carin Sedona");
            size.setText("9");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666251010")){
            information.setText("INFORMATION");
            name.setText("Carin Sedona");
            size.setText("10");
            location.setText("3-3-D");
            done.setText("done");
        }

//      Carin Toscana

        if (barcode.equals("770666214725")){
            information.setText("INFORMATION");
            name.setText("Carin Toscana");
            size.setText("5");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666214736")){
            information.setText("INFORMATION");
            name.setText("Carin Toscana");
            size.setText("6");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666214749")){
            information.setText("INFORMATION");
            name.setText("Carin Toscana");
            size.setText("7");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666214764")){
            information.setText("INFORMATION");
            name.setText("Carin Toscana");
            size.setText("8");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666214781")){
            information.setText("INFORMATION");
            name.setText("Carin Toscana");
            size.setText("9");
            location.setText("3-3-D");
            done.setText("done");
        }

        if (barcode.equals("770666214710")){
            information.setText("INFORMATION");
            name.setText("Carin Toscana");
            size.setText("10");
            location.setText("3-3-D");
            done.setText("done");
        }

//      Casia Bleu

        if (barcode.equals("441092084925")){
            information.setText("INFORMATION");
            name.setText("Casia Bleu");
            size.setText("5");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("441092084936")){
            information.setText("INFORMATION");
            name.setText("Casia Bleu");
            size.setText("6");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("441092084949")){
            information.setText("INFORMATION");
            name.setText("Casia Bleu");
            size.setText("7");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("441092084964")){
            information.setText("INFORMATION");
            name.setText("Casia Bleu");
            size.setText("8");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("441092084981")){
            information.setText("INFORMATION");
            name.setText("Casia Bleu");
            size.setText("9");
            location.setText("3-3-N");
            done.setText("done");
        }

//      Casia Fleur

        if (barcode.equals("441092037625")){
            information.setText("INFORMATION");
            name.setText("Casia Fleur");
            size.setText("5");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("441092037636")){
            information.setText("INFORMATION");
            name.setText("Casia Fleur");
            size.setText("6");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("441092037649")){
            information.setText("INFORMATION");
            name.setText("Casia Fleur");
            size.setText("7");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("441092037664")){
            information.setText("INFORMATION");
            name.setText("Casia Fleur");
            size.setText("8");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("441092037681")){
            information.setText("INFORMATION");
            name.setText("Casia Fleur");
            size.setText("9");
            location.setText("3-3-N");
            done.setText("done");
        }

//      Casia Palomino

        if (barcode.equals("441092073625")){
            information.setText("INFORMATION");
            name.setText("Casia Palomino");
            size.setText("5");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("441092073636")){
            information.setText("INFORMATION");
            name.setText("Casia Palomino");
            size.setText("6");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("441092073649")){
            information.setText("INFORMATION");
            name.setText("Casia Palomino");
            size.setText("7");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("441092073664")){
            information.setText("INFORMATION");
            name.setText("Casia Palomino");
            size.setText("8");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("441092073681")){
            information.setText("INFORMATION");
            name.setText("Casia Palomino");
            size.setText("9");
            location.setText("3-3-N");
            done.setText("done");
        }

//      Casia White

        if (barcode.equals("441092065525")){
            information.setText("INFORMATION");
            name.setText("Casia White");
            size.setText("5");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("441092065536")){
            information.setText("INFORMATION");
            name.setText("Casia White");
            size.setText("6");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("441092065549")){
            information.setText("INFORMATION");
            name.setText("Casia White");
            size.setText("7");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("441092065564")){
            information.setText("INFORMATION");
            name.setText("Casia White");
            size.setText("8");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("441092065581")){
            information.setText("INFORMATION");
            name.setText("Casia White");
            size.setText("9");
            location.setText("3-3-N");
            done.setText("done");
        }

//      Caya Black

        if (barcode.equals("881964946625")){
            information.setText("INFORMATION");
            name.setText("Caya Black");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("881964946636")){
            information.setText("INFORMATION");
            name.setText("Caya Black");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("881964946649")){
            information.setText("INFORMATION");
            name.setText("Caya Black");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("881964946664")){
            information.setText("INFORMATION");
            name.setText("Caya Black");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("881964946681")){
            information.setText("INFORMATION");
            name.setText("Caya Black");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Caya Bone

        if (barcode.equals("881964957525")){
            information.setText("INFORMATION");
            name.setText("Caya Bone");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("881964957536")){
            information.setText("INFORMATION");
            name.setText("Caya Bone");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("881964957549")){
            information.setText("INFORMATION");
            name.setText("Caya Bone");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("881964957564")){
            information.setText("INFORMATION");
            name.setText("Caya Bone");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("881964957581")){
            information.setText("INFORMATION");
            name.setText("Caya Bone");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Caya Tortoise

        if (barcode.equals("881964942125")){
            information.setText("INFORMATION");
            name.setText("Caya Tortoise");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("881964942136")){
            information.setText("INFORMATION");
            name.setText("Caya Tortoise");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("881964942149")){
            information.setText("INFORMATION");
            name.setText("Caya Tortoise");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("881964942164")){
            information.setText("INFORMATION");
            name.setText("Caya Tortoise");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("881964942181")){
            information.setText("INFORMATION");
            name.setText("Caya Tortoise");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Caya White

        if (barcode.equals("881964965525")){
            information.setText("INFORMATION");
            name.setText("Caya White");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("881964965536")){
            information.setText("INFORMATION");
            name.setText("Caya White");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("881964965549")){
            information.setText("INFORMATION");
            name.setText("Caya White");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("881964965564")){
            information.setText("INFORMATION");
            name.setText("Caya White");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("881964965581")){
            information.setText("INFORMATION");
            name.setText("Caya White");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Celeste Black

        if (barcode.equals("598578246625")){
            information.setText("INFORMATION");
            name.setText("Celeste Black");
            size.setText("5");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("598578246636")){
            information.setText("INFORMATION");
            name.setText("Celeste Black");
            size.setText("6");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("598578246649")){
            information.setText("INFORMATION");
            name.setText("Celeste Black");
            size.setText("7");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("598578246664")){
            information.setText("INFORMATION");
            name.setText("Celeste Black");
            size.setText("8");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("598578246681")){
            information.setText("INFORMATION");
            name.setText("Celeste Black");
            size.setText("9");
            location.setText("3-3-N");
            done.setText("done");
        }

//      Celeste Cloud

        if (barcode.equals("598578268825")){
            information.setText("INFORMATION");
            name.setText("Celeste Cloud");
            size.setText("5");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("598578268836")){
            information.setText("INFORMATION");
            name.setText("Celeste Cloud");
            size.setText("6");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("598578268849")){
            information.setText("INFORMATION");
            name.setText("Celeste Cloud");
            size.setText("7");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("598578268864")){
            information.setText("INFORMATION");
            name.setText("Celeste Cloud");
            size.setText("8");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("598578268881")){
            information.setText("INFORMATION");
            name.setText("Celeste Cloud");
            size.setText("9");
            location.setText("3-3-N");
            done.setText("done");
        }

//      Celeste Palomino

        if (barcode.equals("598578273625")){
            information.setText("INFORMATION");
            name.setText("Celeste Palomino");
            size.setText("5");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("598578273636")){
            information.setText("INFORMATION");
            name.setText("Celeste Palomino");
            size.setText("6");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("598578273649")){
            information.setText("INFORMATION");
            name.setText("Celeste Palomino");
            size.setText("7");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("598578273664")){
            information.setText("INFORMATION");
            name.setText("Celeste Palomino");
            size.setText("8");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("598578273681")){
            information.setText("INFORMATION");
            name.setText("Celeste Palomino");
            size.setText("9");
            location.setText("3-3-N");
            done.setText("done");
        }

//      Chantal White

        if (barcode.equals("562432865525")){
            information.setText("INFORMATION");
            name.setText("Chantal White");
            size.setText("5");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("562432865536")){
            information.setText("INFORMATION");
            name.setText("Chantal White");
            size.setText("6");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("562432865549")){
            information.setText("INFORMATION");
            name.setText("Chantal White");
            size.setText("7");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("562432865564")){
            information.setText("INFORMATION");
            name.setText("Chantal White");
            size.setText("8");
            location.setText("3-3-N");
            done.setText("done");
        }

        if (barcode.equals("562432865581")){
            information.setText("INFORMATION");
            name.setText("Chantal White");
            size.setText("9");
            location.setText("3-3-N");
            done.setText("done");
        }

//      Charlotte Black

        if (barcode.equals("720462446625")){
            information.setText("INFORMATION");
            name.setText("Charlotte Black");
            size.setText("5");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("720462446636")){
            information.setText("INFORMATION");
            name.setText("Charlotte Black");
            size.setText("6");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("720462446649")){
            information.setText("INFORMATION");
            name.setText("Charlotte Black");
            size.setText("7");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("720462446664")){
            information.setText("INFORMATION");
            name.setText("Charlotte Black");
            size.setText("8");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("720462446681")){
            information.setText("INFORMATION");
            name.setText("Charlotte Black");
            size.setText("9");
            location.setText("3-3-L");
            done.setText("done");
        }

//      Charlotte Nude

        if (barcode.equals("720462445425")){
            information.setText("INFORMATION");
            name.setText("Charlotte Nude");
            size.setText("5");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("720462445436")){
            information.setText("INFORMATION");
            name.setText("Charlotte Nude");
            size.setText("6");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("720462445449")){
            information.setText("INFORMATION");
            name.setText("Charlotte Nude");
            size.setText("7");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("720462445464")){
            information.setText("INFORMATION");
            name.setText("Charlotte Nude");
            size.setText("8");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("720462445481")){
            information.setText("INFORMATION");
            name.setText("Charlotte Nude");
            size.setText("9");
            location.setText("3-3-L");
            done.setText("done");
        }

//      Charlotte Nude Leather

        if (barcode.equals("720462472825")){
            information.setText("INFORMATION");
            name.setText("Charlotte Nude Leather");
            size.setText("5");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("720462472836")){
            information.setText("INFORMATION");
            name.setText("Charlotte Nude Leather");
            size.setText("6");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("720462472849")){
            information.setText("INFORMATION");
            name.setText("Charlotte Nude Leather");
            size.setText("7");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("720462472864")){
            information.setText("INFORMATION");
            name.setText("Charlotte Nude Leather");
            size.setText("8");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("720462472881")){
            information.setText("INFORMATION");
            name.setText("Charlotte Nude Leather");
            size.setText("9");
            location.setText("3-3-L");
            done.setText("done");
        }

//      Charlotte White

        if (barcode.equals("720462465525")){
            information.setText("INFORMATION");
            name.setText("Charlotte White");
            size.setText("5");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("720462465536")){
            information.setText("INFORMATION");
            name.setText("Charlotte White");
            size.setText("6");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("720462465549")){
            information.setText("INFORMATION");
            name.setText("Charlotte White");
            size.setText("7");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("720462465564")){
            information.setText("INFORMATION");
            name.setText("Charlotte White");
            size.setText("8");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("720462465581")){
            information.setText("INFORMATION");
            name.setText("Charlotte White");
            size.setText("9");
            location.setText("3-3-L");
            done.setText("done");
        }

//      Ciera Le Blanc

        if (barcode.equals("859397482025")){
            information.setText("INFORMATION");
            name.setText("Ciera Le Blanc");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("859397482036")){
            information.setText("INFORMATION");
            name.setText("Ciera Le Blanc");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("859397482049")){
            information.setText("INFORMATION");
            name.setText("Ciera Le Blanc");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("859397482064")){
            information.setText("INFORMATION");
            name.setText("Ciera Le Blanc");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("859397482081")){
            information.setText("INFORMATION");
            name.setText("Ciera Le Blanc");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("859397482010")){
            information.setText("INFORMATION");
            name.setText("Ciera Le Blanc");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Cinzia Fleur

        if (barcode.equals("338001337625")){
            information.setText("INFORMATION");
            name.setText("Cinzia Fleur");
            size.setText("5");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("338001337636")){
            information.setText("INFORMATION");
            name.setText("Cinzia Fleur");
            size.setText("6");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("338001337649")){
            information.setText("INFORMATION");
            name.setText("Cinzia Fleur");
            size.setText("7");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("338001337664")){
            information.setText("INFORMATION");
            name.setText("Cinzia Fleur");
            size.setText("8");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("338001337681")){
            information.setText("INFORMATION");
            name.setText("Cinzia Fleur");
            size.setText("9");
            location.setText("3-3-L");
            done.setText("done");
        }

//      Cinzia Le Blanc

        if (barcode.equals("338001382025")){
            information.setText("INFORMATION");
            name.setText("Cinzia Le Blanc");
            size.setText("5");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("338001382036")){
            information.setText("INFORMATION");
            name.setText("Cinzia Le Blanc");
            size.setText("6");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("338001382049")){
            information.setText("INFORMATION");
            name.setText("Cinzia Le Blanc");
            size.setText("7");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("338001382064")){
            information.setText("INFORMATION");
            name.setText("Cinzia Le Blanc");
            size.setText("8");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("338001382081")){
            information.setText("INFORMATION");
            name.setText("Cinzia Le Blanc");
            size.setText("9");
            location.setText("3-3-L");
            done.setText("done");
        }

//      Cinzia Palomino

        if (barcode.equals("338001373625")){
            information.setText("INFORMATION");
            name.setText("Cinzia Palomino");
            size.setText("5");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("338001373636")){
            information.setText("INFORMATION");
            name.setText("Cinzia Palomino");
            size.setText("6");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("338001373649")){
            information.setText("INFORMATION");
            name.setText("Cinzia Palomino");
            size.setText("7");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("338001373664")){
            information.setText("INFORMATION");
            name.setText("Cinzia Palomino");
            size.setText("8");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("338001373681")){
            information.setText("INFORMATION");
            name.setText("Cinzia Palomino");
            size.setText("9");
            location.setText("3-3-L");
            done.setText("done");
        }

//      Cinzia Toscana

        if (barcode.equals("338001314725")){
            information.setText("INFORMATION");
            name.setText("Cinzia Toscana");
            size.setText("5");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("338001314736")){
            information.setText("INFORMATION");
            name.setText("Cinzia Toscana");
            size.setText("6");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("338001314749")){
            information.setText("INFORMATION");
            name.setText("Cinzia Toscana");
            size.setText("7");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("338001314764")){
            information.setText("INFORMATION");
            name.setText("Cinzia Toscana");
            size.setText("8");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("338001314781")){
            information.setText("INFORMATION");
            name.setText("Cinzia Toscana");
            size.setText("9");
            location.setText("3-3-L");
            done.setText("done");
        }

//      Cirila Creme

        if (barcode.equals("921213994625")){
            information.setText("INFORMATION");
            name.setText("Cirila Creme");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("921213994636")){
            information.setText("INFORMATION");
            name.setText("Cirila Creme");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("921213994649")){
            information.setText("INFORMATION");
            name.setText("Cirila Creme");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("921213994664")){
            information.setText("INFORMATION");
            name.setText("Cirila Creme");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("921213994681")){
            information.setText("INFORMATION");
            name.setText("Cirila Creme");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Cirila Naturale

        if (barcode.equals("921213930325")){
            information.setText("INFORMATION");
            name.setText("Cirila Naturale");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("921213930336")){
            information.setText("INFORMATION");
            name.setText("Cirila Naturale");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("921213930349")){
            information.setText("INFORMATION");
            name.setText("Cirila Naturale");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("921213930364")){
            information.setText("INFORMATION");
            name.setText("Cirila Naturale");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("921213930381")){
            information.setText("INFORMATION");
            name.setText("Cirila Naturale");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Citla Claro

        if (barcode.equals("692050190025")){
            information.setText("INFORMATION");
            name.setText("Citla Claro");
            size.setText("5");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050190036")){
            information.setText("INFORMATION");
            name.setText("Citla Claro");
            size.setText("6");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050190049")){
            information.setText("INFORMATION");
            name.setText("Citla Claro");
            size.setText("7");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050190064")){
            information.setText("INFORMATION");
            name.setText("Citla Claro");
            size.setText("8");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050190081")){
            information.setText("INFORMATION");
            name.setText("Citla Claro");
            size.setText("9");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050190010")){
            information.setText("INFORMATION");
            name.setText("Citla Claro");
            size.setText("10");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

//      Citla Le Blanc

        if (barcode.equals("692050182025")){
            information.setText("INFORMATION");
            name.setText("Citla Le Blanc");
            size.setText("5");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050182036")){
            information.setText("INFORMATION");
            name.setText("Citla Le Blanc");
            size.setText("6");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050182049")){
            information.setText("INFORMATION");
            name.setText("Citla Le Blanc");
            size.setText("7");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050182064")){
            information.setText("INFORMATION");
            name.setText("Citla Le Blanc");
            size.setText("8");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050182081")){
            information.setText("INFORMATION");
            name.setText("Citla Le Blanc");
            size.setText("9");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050182010")){
            information.setText("INFORMATION");
            name.setText("Citla Le Blanc");
            size.setText("10");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

//      Citla Naturale

        if (barcode.equals("692050130325")){
            information.setText("INFORMATION");
            name.setText("Citla Naturale");
            size.setText("5");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050130336")){
            information.setText("INFORMATION");
            name.setText("Citla Naturale");
            size.setText("6");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050130349")){
            information.setText("INFORMATION");
            name.setText("Citla Naturale");
            size.setText("7");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050130364")){
            information.setText("INFORMATION");
            name.setText("Citla Naturale");
            size.setText("8");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050130381")){
            information.setText("INFORMATION");
            name.setText("Citla Naturale");
            size.setText("9");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050130310")){
            information.setText("INFORMATION");
            name.setText("Citla Naturale");
            size.setText("10");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

//      Citla Sedona

        if (barcode.equals("692050151025")){
            information.setText("INFORMATION");
            name.setText("Citla Sedona");
            size.setText("5");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050151036")){
            information.setText("INFORMATION");
            name.setText("Citla Sedona");
            size.setText("6");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050151049")){
            information.setText("INFORMATION");
            name.setText("Citla Sedona");
            size.setText("7");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050151064")){
            information.setText("INFORMATION");
            name.setText("Citla Sedona");
            size.setText("8");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050151081")){
            information.setText("INFORMATION");
            name.setText("Citla Sedona");
            size.setText("9");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

        if (barcode.equals("692050151010")){
            information.setText("INFORMATION");
            name.setText("Citla Sedona");
            size.setText("10");
            location.setText("3-3-J and 3-3-H and 3-3-F");
            done.setText("done");
        }

//      Clea Naturale

        if (barcode.equals("696551130325")){
            information.setText("INFORMATION");
            name.setText("Clea Naturale");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("696551130336")){
            information.setText("INFORMATION");
            name.setText("Clea Naturale");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("696551130349")){
            information.setText("INFORMATION");
            name.setText("Clea Naturale");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("696551130364")){
            information.setText("INFORMATION");
            name.setText("Clea Naturale");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("696551130381")){
            information.setText("INFORMATION");
            name.setText("Clea Naturale");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Clea Noir

        if (barcode.equals("696551138425")){
            information.setText("INFORMATION");
            name.setText("Clea Noir");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("696551138436")){
            information.setText("INFORMATION");
            name.setText("Clea Noir");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("696551138449")){
            information.setText("INFORMATION");
            name.setText("Clea Noir");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("696551138464")){
            information.setText("INFORMATION");
            name.setText("Clea Noir");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("696551138481")){
            information.setText("INFORMATION");
            name.setText("Clea Noir");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Cleo Biscotti

        if (barcode.equals("476239821125")){
            information.setText("INFORMATION");
            name.setText("Cleo Biscotti");
            size.setText("5");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239821136")){
            information.setText("INFORMATION");
            name.setText("Cleo Biscotti");
            size.setText("6");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239821149")){
            information.setText("INFORMATION");
            name.setText("Cleo Biscotti");
            size.setText("7");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239821164")){
            information.setText("INFORMATION");
            name.setText("Cleo Biscotti");
            size.setText("8");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239821181")){
            information.setText("INFORMATION");
            name.setText("Cleo Biscotti");
            size.setText("9");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239821110")){
            information.setText("INFORMATION");
            name.setText("Cleo Biscotti");
            size.setText("10");
            location.setText("3-3-J");
            done.setText("done");
        }

//      Cleo Black

        if (barcode.equals("476239846625")){
            information.setText("INFORMATION");
            name.setText("Cleo Black");
            size.setText("5");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239846636")){
            information.setText("INFORMATION");
            name.setText("Cleo Black");
            size.setText("6");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239846649")){
            information.setText("INFORMATION");
            name.setText("Cleo Black");
            size.setText("7");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239846664")){
            information.setText("INFORMATION");
            name.setText("Cleo Black");
            size.setText("8");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239846681")){
            information.setText("INFORMATION");
            name.setText("Cleo Black");
            size.setText("9");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239846610")){
            information.setText("INFORMATION");
            name.setText("Cleo Black");
            size.setText("10");
            location.setText("3-3-J");
            done.setText("done");
        }

//      Cleo Naturale

        if (barcode.equals("476239830325")){
            information.setText("INFORMATION");
            name.setText("Cleo Naturale");
            size.setText("5");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239830336")){
            information.setText("INFORMATION");
            name.setText("Cleo Naturale");
            size.setText("6");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239830349")){
            information.setText("INFORMATION");
            name.setText("Cleo Naturale");
            size.setText("7");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239830364")){
            information.setText("INFORMATION");
            name.setText("Cleo Naturale");
            size.setText("8");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239830381")){
            information.setText("INFORMATION");
            name.setText("Cleo Naturale");
            size.setText("9");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239830310")){
            information.setText("INFORMATION");
            name.setText("Cleo Naturale");
            size.setText("10");
            location.setText("3-3-J");
            done.setText("done");
        }

//      Cleo Toscana

        if (barcode.equals("476239814725")){
            information.setText("INFORMATION");
            name.setText("Cleo Toscana");
            size.setText("5");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239814736")){
            information.setText("INFORMATION");
            name.setText("Cleo Toscana");
            size.setText("6");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239814749")){
            information.setText("INFORMATION");
            name.setText("Cleo Toscana");
            size.setText("7");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239814764")){
            information.setText("INFORMATION");
            name.setText("Cleo Toscana");
            size.setText("8");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239814781")){
            information.setText("INFORMATION");
            name.setText("Cleo Toscana");
            size.setText("9");
            location.setText("3-3-J");
            done.setText("done");
        }

        if (barcode.equals("476239814710")){
            information.setText("INFORMATION");
            name.setText("Cleo Toscana");
            size.setText("10");
            location.setText("3-3-J");
            done.setText("done");
        }

//      Cora Black Suede

        if (barcode.equals("246640284625")){
            information.setText("INFORMATION");
            name.setText("Cora Black Suede");
            size.setText("5");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("246640284636")){
            information.setText("INFORMATION");
            name.setText("Cora Black Suede");
            size.setText("6");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("246640284649")){
            information.setText("INFORMATION");
            name.setText("Cora Black Suede");
            size.setText("7");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("246640284664")){
            information.setText("INFORMATION");
            name.setText("Cora Black Suede");
            size.setText("8");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("246640284681")){
            information.setText("INFORMATION");
            name.setText("Cora Black Suede");
            size.setText("9");
            location.setText("3-3-L");
            done.setText("done");
        }

//      Cora Nude Suede

        if (barcode.equals("246640213925")){
            information.setText("INFORMATION");
            name.setText("Cora Nude Suede");
            size.setText("5");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("246640213936")){
            information.setText("INFORMATION");
            name.setText("Cora Nude Suede");
            size.setText("6");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("246640213949")){
            information.setText("INFORMATION");
            name.setText("Cora Nude Suede");
            size.setText("7");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("246640213964")){
            information.setText("INFORMATION");
            name.setText("Cora Nude Suede");
            size.setText("8");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("246640213981")){
            information.setText("INFORMATION");
            name.setText("Cora Nude Suede");
            size.setText("9");
            location.setText("3-3-L");
            done.setText("done");
        }

//      Cora Tan Suede

        if (barcode.equals("246640222025")){
            information.setText("INFORMATION");
            name.setText("Cora Tan Suede");
            size.setText("5");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("246640222036")){
            information.setText("INFORMATION");
            name.setText("Cora Tan Suede");
            size.setText("6");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("246640222049")){
            information.setText("INFORMATION");
            name.setText("Cora Tan Suede");
            size.setText("7");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("246640222064")){
            information.setText("INFORMATION");
            name.setText("Cora Tan Suede");
            size.setText("8");
            location.setText("3-3-L");
            done.setText("done");
        }

        if (barcode.equals("246640222081")){
            information.setText("INFORMATION");
            name.setText("Cora Tan Suede");
            size.setText("9");
            location.setText("3-3-L");
            done.setText("done");
        }

//      Corin Black

        if (barcode.equals("613190446625")){
            information.setText("INFORMATION");
            name.setText("Corin Black");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190446636")){
            information.setText("INFORMATION");
            name.setText("Corin Black");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190446649")){
            information.setText("INFORMATION");
            name.setText("Corin Black");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190446664")){
            information.setText("INFORMATION");
            name.setText("Corin Black");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190446681")){
            information.setText("INFORMATION");
            name.setText("Corin Black");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Corin Blanc Gray

        if (barcode.equals("613190485425")){
            information.setText("INFORMATION");
            name.setText("Corin Blanc Gray");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190485436")){
            information.setText("INFORMATION");
            name.setText("Corin Blanc Gray");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190485449")){
            information.setText("INFORMATION");
            name.setText("Corin Blanc Gray");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190485464")){
            information.setText("INFORMATION");
            name.setText("Corin Blanc Gray");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190485481")){
            information.setText("INFORMATION");
            name.setText("Corin Blanc Gray");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Corin Mauve

        if (barcode.equals("613190444225")){
            information.setText("INFORMATION");
            name.setText("Corin Mauve");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190444236")){
            information.setText("INFORMATION");
            name.setText("Corin Mauve");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190444249")){
            information.setText("INFORMATION");
            name.setText("Corin Mauve");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190444264")){
            information.setText("INFORMATION");
            name.setText("Corin Mauve");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190444281")){
            information.setText("INFORMATION");
            name.setText("Corin Mauve");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Corin Nude

        if (barcode.equals("613190445425")){
            information.setText("INFORMATION");
            name.setText("Corin Nude");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190445436")){
            information.setText("INFORMATION");
            name.setText("Corin Nude");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190445449")){
            information.setText("INFORMATION");
            name.setText("Corin Nude");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190445464")){
            information.setText("INFORMATION");
            name.setText("Corin Nude");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190445481")){
            information.setText("INFORMATION");
            name.setText("Corin Nude");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Corin Old Rose

        if (barcode.equals("613190448225")){
            information.setText("INFORMATION");
            name.setText("Corin Old Rose");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190448236")){
            information.setText("INFORMATION");
            name.setText("Corin Old Rose");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190448249")){
            information.setText("INFORMATION");
            name.setText("Corin Old Rose");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190448264")){
            information.setText("INFORMATION");
            name.setText("Corin Old Rose");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190448281")){
            information.setText("INFORMATION");
            name.setText("Corin Old Rose");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Corin Tan

        if (barcode.equals("613190481425")){
            information.setText("INFORMATION");
            name.setText("Corin Tan");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190481436")){
            information.setText("INFORMATION");
            name.setText("Corin Tan");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190481449")){
            information.setText("INFORMATION");
            name.setText("Corin Tan");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190481464")){
            information.setText("INFORMATION");
            name.setText("Corin Tan");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190481481")){
            information.setText("INFORMATION");
            name.setText("Corin Tan");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Corin White
        if (barcode.equals("613190465525")){
            information.setText("INFORMATION");
            name.setText("Corin White");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190465536")){
            information.setText("INFORMATION");
            name.setText("Corin White");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190465549")){
            information.setText("INFORMATION");
            name.setText("Corin White");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190465564")){
            information.setText("INFORMATION");
            name.setText("Corin White");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("613190465581")){
            information.setText("INFORMATION");
            name.setText("Corin White");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Initial D
//      Dakari Biscotti

        if (barcode.equals("437129821125")){
            information.setText("INFORMATION");
            name.setText("Dakari Biscotti");
            size.setText("5");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("437129821136")){
            information.setText("INFORMATION");
            name.setText("Dakari Biscotti");
            size.setText("6");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("437129821149")){
            information.setText("INFORMATION");
            name.setText("Dakari Biscotti");
            size.setText("7");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("437129821164")){
            information.setText("INFORMATION");
            name.setText("Dakari Biscotti");
            size.setText("8");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("437129821181")){
            information.setText("INFORMATION");
            name.setText("Dakari Biscotti");
            size.setText("9");
            location.setText("3-4-C");
            done.setText("done");
        }

//      Dakari Le Blanc

        if (barcode.equals("437129882025")){
            information.setText("INFORMATION");
            name.setText("Dakari Le Blanc");
            size.setText("5");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("437129882036")){
            information.setText("INFORMATION");
            name.setText("Dakari Le Blanc");
            size.setText("6");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("437129882049")){
            information.setText("INFORMATION");
            name.setText("Dakari Le Blanc");
            size.setText("7");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("437129882064")){
            information.setText("INFORMATION");
            name.setText("Dakari Le Blanc");
            size.setText("8");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("437129882081")){
            information.setText("INFORMATION");
            name.setText("Dakari Le Blanc");
            size.setText("9");
            location.setText("3-4-C");
            done.setText("done");
        }

//      Dakari Naturale

        if (barcode.equals("437129830325")){
            information.setText("INFORMATION");
            name.setText("Dakari Naturale");
            size.setText("5");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("437129830336")){
            information.setText("INFORMATION");
            name.setText("Dakari Naturale");
            size.setText("6");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("437129830349")){
            information.setText("INFORMATION");
            name.setText("Dakari Naturale");
            size.setText("7");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("437129830364")){
            information.setText("INFORMATION");
            name.setText("Dakari Naturale");
            size.setText("8");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("437129830381")){
            information.setText("INFORMATION");
            name.setText("Dakari Naturale");
            size.setText("9");
            location.setText("3-4-C");
            done.setText("done");
        }

//      Dakari Toscana

        if (barcode.equals("437129814725")){
            information.setText("INFORMATION");
            name.setText("Dakari Toscana");
            size.setText("5");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("437129814736")){
            information.setText("INFORMATION");
            name.setText("Dakari Toscana");
            size.setText("6");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("437129814749")){
            information.setText("INFORMATION");
            name.setText("Dakari Toscana");
            size.setText("7");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("437129814764")){
            information.setText("INFORMATION");
            name.setText("Dakari Toscana");
            size.setText("8");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("437129814781")){
            information.setText("INFORMATION");
            name.setText("Dakari Toscana");
            size.setText("9");
            location.setText("3-4-C");
            done.setText("done");
        }

//      Damari Biscotti

        if (barcode.equals("337976321125")){
            information.setText("INFORMATION");
            name.setText("Damari Biscotti");
            size.setText("5");
            location.setText("3-4-A");
            done.setText("done");
        }

        if (barcode.equals("337976321136")){
            information.setText("INFORMATION");
            name.setText("Damari Biscotti");
            size.setText("6");
            location.setText("3-4-A");
            done.setText("done");
        }

        if (barcode.equals("337976321149")){
            information.setText("INFORMATION");
            name.setText("Damari Biscotti");
            size.setText("7");
            location.setText("3-4-A");
            done.setText("done");
        }

        if (barcode.equals("337976321164")){
            information.setText("INFORMATION");
            name.setText("Damari Biscotti");
            size.setText("8");
            location.setText("3-4-A");
            done.setText("done");
        }

        if (barcode.equals("337976321181")){
            information.setText("INFORMATION");
            name.setText("Damari Biscotti");
            size.setText("9");
            location.setText("3-4-A");
            done.setText("done");
        }

//      Damari Palomino

        if (barcode.equals("337976373625")){
            information.setText("INFORMATION");
            name.setText("Damari Palomino");
            size.setText("5");
            location.setText("3-4-A");
            done.setText("done");
        }

        if (barcode.equals("337976373636")){
            information.setText("INFORMATION");
            name.setText("Damari Palomino");
            size.setText("6");
            location.setText("3-4-A");
            done.setText("done");
        }

        if (barcode.equals("337976373649")){
            information.setText("INFORMATION");
            name.setText("Damari Palomino");
            size.setText("7");
            location.setText("3-4-A");
            done.setText("done");
        }

        if (barcode.equals("337976373664")){
            information.setText("INFORMATION");
            name.setText("Damari Palomino");
            size.setText("8");
            location.setText("3-4-A");
            done.setText("done");
        }

        if (barcode.equals("337976373681")){
            information.setText("INFORMATION");
            name.setText("Damari Palomino");
            size.setText("9");
            location.setText("3-4-A");
            done.setText("done");
        }

//      Damari Toscana

        if (barcode.equals("337976314725")){
            information.setText("INFORMATION");
            name.setText("Damari Toscana");
            size.setText("5");
            location.setText("3-4-A");
            done.setText("done");
        }

        if (barcode.equals("337976314736")){
            information.setText("INFORMATION");
            name.setText("Damari Toscana");
            size.setText("6");
            location.setText("3-4-A");
            done.setText("done");
        }

        if (barcode.equals("337976314749")){
            information.setText("INFORMATION");
            name.setText("Damari Toscana");
            size.setText("7");
            location.setText("3-4-A");
            done.setText("done");
        }

        if (barcode.equals("337976314764")){
            information.setText("INFORMATION");
            name.setText("Damari Toscana");
            size.setText("8");
            location.setText("3-4-A");
            done.setText("done");
        }

        if (barcode.equals("337976314781")){
            information.setText("INFORMATION");
            name.setText("Damari Toscana");
            size.setText("9");
            location.setText("3-4-A");
            done.setText("done");
        }

//      Damia Le Blanc

        if (barcode.equals("513956182025")){
            information.setText("INFORMATION");
            name.setText("Damia Le Blanc");
            size.setText("5");
            location.setText("3-4-I");
            done.setText("done");
        }

        if (barcode.equals("513956182036")){
            information.setText("INFORMATION");
            name.setText("Damia Le Blanc");
            size.setText("6");
            location.setText("3-4-I");
            done.setText("done");
        }

        if (barcode.equals("513956182049")){
            information.setText("INFORMATION");
            name.setText("Damia Le Blanc");
            size.setText("7");
            location.setText("3-4-I");
            done.setText("done");
        }

        if (barcode.equals("513956182064")){
            information.setText("INFORMATION");
            name.setText("Damia Le Blanc");
            size.setText("8");
            location.setText("3-4-I");
            done.setText("done");
        }

        if (barcode.equals("513956182081")){
            information.setText("INFORMATION");
            name.setText("Damia Le Blanc");
            size.setText("9");
            location.setText("3-4-I");
            done.setText("done");
        }

//      Damia Noir

        if (barcode.equals("513956138425")){
            information.setText("INFORMATION");
            name.setText("Damia Noir");
            size.setText("5");
            location.setText("3-4-I");
            done.setText("done");
        }

        if (barcode.equals("513956138436")){
            information.setText("INFORMATION");
            name.setText("Damia Noir");
            size.setText("6");
            location.setText("3-4-I");
            done.setText("done");
        }

        if (barcode.equals("513956138449")){
            information.setText("INFORMATION");
            name.setText("Damia Noir");
            size.setText("7");
            location.setText("3-4-I");
            done.setText("done");
        }

        if (barcode.equals("513956138464")){
            information.setText("INFORMATION");
            name.setText("Damia Noir");
            size.setText("8");
            location.setText("3-4-I");
            done.setText("done");
        }

        if (barcode.equals("513956138481")){
            information.setText("INFORMATION");
            name.setText("Damia Noir");
            size.setText("9");
            location.setText("3-4-I");
            done.setText("done");
        }

//      Damia Toscana

        if (barcode.equals("513956114725")){
            information.setText("INFORMATION");
            name.setText("Damia Toscana");
            size.setText("5");
            location.setText("3-4-I");
            done.setText("done");
        }

        if (barcode.equals("513956114736")){
            information.setText("INFORMATION");
            name.setText("Damia Toscana");
            size.setText("6");
            location.setText("3-4-I");
            done.setText("done");
        }

        if (barcode.equals("513956114749")){
            information.setText("INFORMATION");
            name.setText("Damia Toscana");
            size.setText("7");
            location.setText("3-4-I");
            done.setText("done");
        }

        if (barcode.equals("513956114764")){
            information.setText("INFORMATION");
            name.setText("Damia Toscana");
            size.setText("8");
            location.setText("3-4-I");
            done.setText("done");
        }

        if (barcode.equals("513956114781")){
            information.setText("INFORMATION");
            name.setText("Damia Toscana");
            size.setText("9");
            location.setText("3-4-I");
            done.setText("done");
        }

//      Dania Ochre

        if (barcode.equals("961926911425")){
            information.setText("INFORMATION");
            name.setText("Dania Ochre");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("961926911436")){
            information.setText("INFORMATION");
            name.setText("Dania Ochre");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("961926911449")){
            information.setText("INFORMATION");
            name.setText("Dania Ochre");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("961926911464")){
            information.setText("INFORMATION");
            name.setText("Dania Ochre");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }
        if (barcode.equals("961926911481")){
            information.setText("INFORMATION");
            name.setText("Dania Ochre");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Dania Old Rose

        if (barcode.equals("961926948225")){
            information.setText("INFORMATION");
            name.setText("Dania Old Rose");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("961926948236")){
            information.setText("INFORMATION");
            name.setText("Dania Old Rose");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("961926948249")){
            information.setText("INFORMATION");
            name.setText("Dania Old Rose");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("961926948264")){
            information.setText("INFORMATION");
            name.setText("Dania Old Rose");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("961926948281")){
            information.setText("INFORMATION");
            name.setText("Dania Old Rose");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Dania White

        if (barcode.equals("961926965525")){
            information.setText("INFORMATION");
            name.setText("Dania White");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("961926965536")){
            information.setText("INFORMATION");
            name.setText("Dania White");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("961926965549")){
            information.setText("INFORMATION");
            name.setText("Dania White");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("961926965564")){
            information.setText("INFORMATION");
            name.setText("Dania White");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("961926965581")){
            information.setText("INFORMATION");
            name.setText("Dania White");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Darika Creme

        if (barcode.equals("286590494625")){
            information.setText("INFORMATION");
            name.setText("Darika Creme");
            size.setText("5");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

        if (barcode.equals("286590494636")){
            information.setText("INFORMATION");
            name.setText("Darika Creme");
            size.setText("6");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

        if (barcode.equals("286590494649")){
            information.setText("INFORMATION");
            name.setText("Darika Creme");
            size.setText("7");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

        if (barcode.equals("286590494664")){
            information.setText("INFORMATION");
            name.setText("Darika Creme");
            size.setText("8");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

        if (barcode.equals("286590494681")){
            information.setText("INFORMATION");
            name.setText("Darika Creme");
            size.setText("9");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

//      Darika Fleur

        if (barcode.equals("286590437625")){
            information.setText("INFORMATION");
            name.setText("Darika Fleur");
            size.setText("5");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

        if (barcode.equals("286590437636")){
            information.setText("INFORMATION");
            name.setText("Darika Fleur");
            size.setText("6");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

        if (barcode.equals("286590437649")){
            information.setText("INFORMATION");
            name.setText("Darika Fleur");
            size.setText("7");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

        if (barcode.equals("286590437664")){
            information.setText("INFORMATION");
            name.setText("Darika Fleur");
            size.setText("8");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

        if (barcode.equals("286590437681")){
            information.setText("INFORMATION");
            name.setText("Darika Fleur");
            size.setText("9");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

//      Darika Le Blanc

        if (barcode.equals("286590482025")){
            information.setText("INFORMATION");
            name.setText("Darika Le Blanc");
            size.setText("5");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

        if (barcode.equals("286590482036")){
            information.setText("INFORMATION");
            name.setText("Darika Le Blanc");
            size.setText("6");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

        if (barcode.equals("286590482049")){
            information.setText("INFORMATION");
            name.setText("Darika Le Blanc");
            size.setText("7");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

        if (barcode.equals("286590482064")){
            information.setText("INFORMATION");
            name.setText("Darika Le Blanc");
            size.setText("8");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

        if (barcode.equals("286590482081")){
            information.setText("INFORMATION");
            name.setText("Darika Le Blanc");
            size.setText("9");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

//      Darika Naturale

        if (barcode.equals("286590430325")){
            information.setText("INFORMATION");
            name.setText("Darika Naturale");
            size.setText("5");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

        if (barcode.equals("286590430336")){
            information.setText("INFORMATION");
            name.setText("Darika Naturale");
            size.setText("6");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

        if (barcode.equals("286590430349")){
            information.setText("INFORMATION");
            name.setText("Darika Naturale");
            size.setText("7");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

        if (barcode.equals("286590430364")){
            information.setText("INFORMATION");
            name.setText("Darika Naturale");
            size.setText("8");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

        if (barcode.equals("286590430381")){
            information.setText("INFORMATION");
            name.setText("Darika Naturale");
            size.setText("9");
            location.setText("3-4-A and 3-4-C");
            done.setText("done");
        }

//      Darinka Naturale

        if (barcode.equals("470750330325")){
            information.setText("INFORMATION");
            name.setText("Darinka Naturale");
            size.setText("5");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("470750330336")){
            information.setText("INFORMATION");
            name.setText("Darinka Naturale");
            size.setText("6");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("470750330349")){
            information.setText("INFORMATION");
            name.setText("Darinka Naturale");
            size.setText("7");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("470750330364")){
            information.setText("INFORMATION");
            name.setText("Darinka Naturale");
            size.setText("8");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("470750330381")){
            information.setText("INFORMATION");
            name.setText("Darinka Naturale");
            size.setText("9");
            location.setText("3-4-C");
            done.setText("done");
        }

//      Darinka Noir

        if (barcode.equals("470750338425")){
            information.setText("INFORMATION");
            name.setText("Darinka Noir");
            size.setText("5");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("470750338436")){
            information.setText("INFORMATION");
            name.setText("Darinka Noir");
            size.setText("6");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("470750338449")){
            information.setText("INFORMATION");
            name.setText("Darinka Noir");
            size.setText("7");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("470750338464")){
            information.setText("INFORMATION");
            name.setText("Darinka Noir");
            size.setText("8");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("470750338481")){
            information.setText("INFORMATION");
            name.setText("Darinka Noir");
            size.setText("9");
            location.setText("3-4-C");
            done.setText("done");
        }

//      Darinka Toscana

        if (barcode.equals("470750314725")){
            information.setText("INFORMATION");
            name.setText("Darinka Toscana");
            size.setText("5");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("470750314736")){
            information.setText("INFORMATION");
            name.setText("Darinka Toscana");
            size.setText("6");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("470750314749")){
            information.setText("INFORMATION");
            name.setText("Darinka Toscana");
            size.setText("7");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("470750314764")){
            information.setText("INFORMATION");
            name.setText("Darinka Toscana");
            size.setText("8");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("470750314781")){
            information.setText("INFORMATION");
            name.setText("Darinka Toscana");
            size.setText("9");
            location.setText("3-4-C");
            done.setText("done");
        }

//      Darya Citron

        if (barcode.equals("193051229125")){
            information.setText("INFORMATION");
            name.setText("Darya Citron");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("193051229136")){
            information.setText("INFORMATION");
            name.setText("Darya Citron");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("193051229149")){
            information.setText("INFORMATION");
            name.setText("Darya Citron");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("193051229164")){
            information.setText("INFORMATION");
            name.setText("Darya Citron");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("193051229181")){
            information.setText("INFORMATION");
            name.setText("Darya Citron");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Darya Nude

        if (barcode.equals("193051245425")){
            information.setText("INFORMATION");
            name.setText("Darya Nude");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("193051245436")){
            information.setText("INFORMATION");
            name.setText("Darya Nude");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("193051245449")){
            information.setText("INFORMATION");
            name.setText("Darya Nude");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("193051245464")){
            information.setText("INFORMATION");
            name.setText("Darya Nude");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("193051245481")){
            information.setText("INFORMATION");
            name.setText("Darya Nude");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Darya White

        if (barcode.equals("193051265525")){
            information.setText("INFORMATION");
            name.setText("Darya White");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("193051265536")){
            information.setText("INFORMATION");
            name.setText("Darya White");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("193051265549")){
            information.setText("INFORMATION");
            name.setText("Darya White");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("193051265564")){
            information.setText("INFORMATION");
            name.setText("Darya White");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("193051265581")){
            information.setText("INFORMATION");
            name.setText("Darya White");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Davina Naturale

        if (barcode.equals("204073430325")){
            information.setText("INFORMATION");
            name.setText("Davina Naturale");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("204073430336")){
            information.setText("INFORMATION");
            name.setText("Davina Naturale");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("204073430349")){
            information.setText("INFORMATION");
            name.setText("Davina Naturale");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("204073430364")){
            information.setText("INFORMATION");
            name.setText("Davina Naturale");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("204073430381")){
            information.setText("INFORMATION");
            name.setText("Davina Naturale");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("204073430310")){
            information.setText("INFORMATION");
            name.setText("Davina Naturale");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Davina Noir

        if (barcode.equals("204073438425")){
            information.setText("INFORMATION");
            name.setText("Davina Noir");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("204073438436")){
            information.setText("INFORMATION");
            name.setText("Davina Noir");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("204073438449")){
            information.setText("INFORMATION");
            name.setText("Davina Noir");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("204073438464")){
            information.setText("INFORMATION");
            name.setText("Davina Noir");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("204073438481")){
            information.setText("INFORMATION");
            name.setText("Davina Noir");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("204073438410")){
            information.setText("INFORMATION");
            name.setText("Davina Noir");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Dawn Biscotti

        if (barcode.equals("949683621125")){
            information.setText("INFORMATION");
            name.setText("Dawn Biscotti");
            size.setText("5");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683621136")){
            information.setText("INFORMATION");
            name.setText("Dawn Biscotti");
            size.setText("6");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683621149")){
            information.setText("INFORMATION");
            name.setText("Dawn Biscotti");
            size.setText("7");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683621164")){
            information.setText("INFORMATION");
            name.setText("Dawn Biscotti");
            size.setText("8");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683621181")){
            information.setText("INFORMATION");
            name.setText("Dawn Biscotti");
            size.setText("9");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

//      Dawn Black

        if (barcode.equals("949683646625")){
            information.setText("INFORMATION");
            name.setText("Dawn Black");
            size.setText("5");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683646636")){
            information.setText("INFORMATION");
            name.setText("Dawn Black");
            size.setText("6");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683646649")){
            information.setText("INFORMATION");
            name.setText("Dawn Black");
            size.setText("7");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683646664")){
            information.setText("INFORMATION");
            name.setText("Dawn Black");
            size.setText("8");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683646681")){
            information.setText("INFORMATION");
            name.setText("Dawn Black");
            size.setText("9");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

//      Dawn Cashew

        if (barcode.equals("949683668725")){
            information.setText("INFORMATION");
            name.setText("Dawn Cashew");
            size.setText("5");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683668736")){
            information.setText("INFORMATION");
            name.setText("Dawn Cashew");
            size.setText("6");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683668749")){
            information.setText("INFORMATION");
            name.setText("Dawn Cashew");
            size.setText("7");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683668764")){
            information.setText("INFORMATION");
            name.setText("Dawn Cashew");
            size.setText("8");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683668781")){
            information.setText("INFORMATION");
            name.setText("Dawn Cashew");
            size.setText("9");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

//      Dawn Honey

        if (barcode.equals("949683696325")){
            information.setText("INFORMATION");
            name.setText("Dawn Honey");
            size.setText("5");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683696336")){
            information.setText("INFORMATION");
            name.setText("Dawn Honey");
            size.setText("6");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683696349")){
            information.setText("INFORMATION");
            name.setText("Dawn Honey");
            size.setText("7");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683696364")){
            information.setText("INFORMATION");
            name.setText("Dawn Honey");
            size.setText("8");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683696381")){
            information.setText("INFORMATION");
            name.setText("Dawn Honey");
            size.setText("9");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

//      Dawn Tortoise

        if (barcode.equals("949683642125")){
            information.setText("INFORMATION");
            name.setText("Dawn Tortoise");
            size.setText("5");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683642136")){
            information.setText("INFORMATION");
            name.setText("Dawn Tortoise");
            size.setText("6");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683642149")){
            information.setText("INFORMATION");
            name.setText("Dawn Tortoise");
            size.setText("7");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683642164")){
            information.setText("INFORMATION");
            name.setText("Dawn Tortoise");
            size.setText("8");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683642181")){
            information.setText("INFORMATION");
            name.setText("Dawn Tortoise");
            size.setText("9");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

//      Dawn White

        if (barcode.equals("949683665525")){
            information.setText("INFORMATION");
            name.setText("Dawn White");
            size.setText("5");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683665536")){
            information.setText("INFORMATION");
            name.setText("Dawn White");
            size.setText("6");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683665549")){
            information.setText("INFORMATION");
            name.setText("Dawn White");
            size.setText("7");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683665564")){
            information.setText("INFORMATION");
            name.setText("Dawn White");
            size.setText("8");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

        if (barcode.equals("949683665581")){
            information.setText("INFORMATION");
            name.setText("Dawn White");
            size.setText("9");
            location.setText("3-4-I and 3-4-K");
            done.setText("done");
        }

//      Dayra Nude

        if (barcode.equals("404699745425")){
            information.setText("INFORMATION");
            name.setText("Dayra Nude");
            size.setText("5");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("404699745436")){
            information.setText("INFORMATION");
            name.setText("Dayra Nude");
            size.setText("6");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("404699745449")){
            information.setText("INFORMATION");
            name.setText("Dayra Nude");
            size.setText("7");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("404699745464")){
            information.setText("INFORMATION");
            name.setText("Dayra Nude");
            size.setText("8");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("404699745481")){
            information.setText("INFORMATION");
            name.setText("Dayra Nude");
            size.setText("9");
            location.setText("3-4-K");
            done.setText("done");
        }

//      Dayra Pecan

        if (barcode.equals("404699744125")){
            information.setText("INFORMATION");
            name.setText("Dayra Pecan");
            size.setText("5");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("404699744136")){
            information.setText("INFORMATION");
            name.setText("Dayra Pecan");
            size.setText("6");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("404699744149")){
            information.setText("INFORMATION");
            name.setText("Dayra Pecan");
            size.setText("7");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("404699744164")){
            information.setText("INFORMATION");
            name.setText("Dayra Pecan");
            size.setText("8");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("404699744181")){
            information.setText("INFORMATION");
            name.setText("Dayra Pecan");
            size.setText("9");
            location.setText("3-4-K");
            done.setText("done");
        }

//      Dayra White

        if (barcode.equals("404699765525")){
            information.setText("INFORMATION");
            name.setText("Dayra White");
            size.setText("5");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("404699765536")){
            information.setText("INFORMATION");
            name.setText("Dayra White");
            size.setText("6");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("404699765549")){
            information.setText("INFORMATION");
            name.setText("Dayra White");
            size.setText("7");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("404699765564")){
            information.setText("INFORMATION");
            name.setText("Dayra White");
            size.setText("8");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("404699765581")){
            information.setText("INFORMATION");
            name.setText("Dayra White");
            size.setText("9");
            location.setText("3-4-K");
            done.setText("done");
        }

//      Dazia Fleur

        if (barcode.equals("450011537625")){
            information.setText("INFORMATION");
            name.setText("Dazia Fleur");
            size.setText("5");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("450011537636")){
            information.setText("INFORMATION");
            name.setText("Dazia Fleur");
            size.setText("6");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("450011537649")){
            information.setText("INFORMATION");
            name.setText("Dazia Fleur");
            size.setText("7");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("450011537664")){
            information.setText("INFORMATION");
            name.setText("Dazia Fleur");
            size.setText("8");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("450011537681")){
            information.setText("INFORMATION");
            name.setText("Dazia Fleur");
            size.setText("9");
            location.setText("3-4-K");
            done.setText("done");
        }

//      Dazia Toast

        if (barcode.equals("450011527325")){
            information.setText("INFORMATION");
            name.setText("Dazia Toast");
            size.setText("5");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("450011527336")){
            information.setText("INFORMATION");
            name.setText("Dazia Toast");
            size.setText("6");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("450011527349")){
            information.setText("INFORMATION");
            name.setText("Dazia Toast");
            size.setText("7");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("450011527364")){
            information.setText("INFORMATION");
            name.setText("Dazia Toast");
            size.setText("8");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("450011527381")){
            information.setText("INFORMATION");
            name.setText("Dazia Toast");
            size.setText("9");
            location.setText("3-4-K");
            done.setText("done");
        }

//      Dazia White

        if (barcode.equals("450011565525")){
            information.setText("INFORMATION");
            name.setText("Dazia White");
            size.setText("5");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("450011565536")){
            information.setText("INFORMATION");
            name.setText("Dazia White");
            size.setText("6");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("450011565549")){
            information.setText("INFORMATION");
            name.setText("Dazia White");
            size.setText("7");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("450011565564")){
            information.setText("INFORMATION");
            name.setText("Dazia White");
            size.setText("8");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("450011565581")){
            information.setText("INFORMATION");
            name.setText("Dazia White");
            size.setText("9");
            location.setText("3-4-K");
            done.setText("done");
        }

//      Deja Fleur

        if (barcode.equals("187172137625")){
            information.setText("INFORMATION");
            name.setText("Deja Fleur");
            size.setText("5");
            location.setText("3-1-H and 3-1-J");
            done.setText("done");
        }

        if (barcode.equals("187172137636")){
            information.setText("INFORMATION");
            name.setText("Deja Fleur");
            size.setText("6");
            location.setText("3-1-H and 3-1-J");
            done.setText("done");
        }

        if (barcode.equals("187172137649")){
            information.setText("INFORMATION");
            name.setText("Deja Fleur");
            size.setText("7");
            location.setText("3-1-H and 3-1-J");
            done.setText("done");
        }

        if (barcode.equals("187172137664")){
            information.setText("INFORMATION");
            name.setText("Deja Fleur");
            size.setText("8");
            location.setText("3-1-H and 3-1-J");
            done.setText("done");
        }

        if (barcode.equals("187172137681")){
            information.setText("INFORMATION");
            name.setText("Deja Fleur");
            size.setText("9");
            location.setText("3-1-H and 3-1-J");
            done.setText("done");
        }

//      Deja Le Blanc

        if (barcode.equals("187172182025")){
            information.setText("INFORMATION");
            name.setText("Deja Le Blanc");
            size.setText("5");
            location.setText("3-1-H and 3-1-J");
            done.setText("done");
        }

        if (barcode.equals("187172182036")){
            information.setText("INFORMATION");
            name.setText("Deja Le Blanc");
            size.setText("6");
            location.setText("3-1-H and 3-1-J");
            done.setText("done");
        }

        if (barcode.equals("187172182049")){
            information.setText("INFORMATION");
            name.setText("Deja Le Blanc");
            size.setText("7");
            location.setText("3-1-H and 3-1-J");
            done.setText("done");
        }

        if (barcode.equals("187172182064")){
            information.setText("INFORMATION");
            name.setText("Deja Le Blanc");
            size.setText("8");
            location.setText("3-1-H and 3-1-J");
            done.setText("done");
        }

        if (barcode.equals("187172182081")){
            information.setText("INFORMATION");
            name.setText("Deja Le Blanc");
            size.setText("9");
            location.setText("3-1-H and 3-1-J");
            done.setText("done");
        }

//      Deja Sedona

        if (barcode.equals("187172151025")){
            information.setText("INFORMATION");
            name.setText("Deja Sedona");
            size.setText("5");
            location.setText("3-1-H and 3-1-J");
            done.setText("done");
        }

        if (barcode.equals("187172151036")){
            information.setText("INFORMATION");
            name.setText("Deja Sedona");
            size.setText("6");
            location.setText("3-1-H and 3-1-J");
            done.setText("done");
        }

        if (barcode.equals("187172151049")){
            information.setText("INFORMATION");
            name.setText("Deja Sedona");
            size.setText("7");
            location.setText("3-1-H and 3-1-J");
            done.setText("done");
        }

        if (barcode.equals("187172151064")){
            information.setText("INFORMATION");
            name.setText("Deja Sedona");
            size.setText("8");
            location.setText("3-1-H and 3-1-J");
            done.setText("done");
        }

        if (barcode.equals("187172151081")){
            information.setText("INFORMATION");
            name.setText("Deja Sedona");
            size.setText("9");
            location.setText("3-1-H and 3-1-J");
            done.setText("done");
        }

//      Devi Bisque

        if (barcode.equals("899458143025")){
            information.setText("INFORMATION");
            name.setText("Devi Bisque");
            size.setText("5");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458143036")){
            information.setText("INFORMATION");
            name.setText("Devi Bisque");
            size.setText("6");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458143049")){
            information.setText("INFORMATION");
            name.setText("Devi Bisque");
            size.setText("7");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458143064")){
            information.setText("INFORMATION");
            name.setText("Devi Bisque");
            size.setText("8");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458143081")){
            information.setText("INFORMATION");
            name.setText("Devi Bisque");
            size.setText("9");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458143010")){
            information.setText("INFORMATION");
            name.setText("Devi Bisque");
            size.setText("10");
            location.setText("3-4-K");
            done.setText("done");
        }

//      Devi Creme

        if (barcode.equals("899458194625")){
            information.setText("INFORMATION");
            name.setText("Devi Creme");
            size.setText("5");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458194636")){
            information.setText("INFORMATION");
            name.setText("Devi Creme");
            size.setText("6");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458194649")){
            information.setText("INFORMATION");
            name.setText("Devi Creme");
            size.setText("7");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458194664")){
            information.setText("INFORMATION");
            name.setText("Devi Creme");
            size.setText("8");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458194681")){
            information.setText("INFORMATION");
            name.setText("Devi Creme");
            size.setText("9");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458194610")){
            information.setText("INFORMATION");
            name.setText("Devi Creme");
            size.setText("10");
            location.setText("3-4-K");
            done.setText("done");
        }

//      Devi Fleur

        if (barcode.equals("899458137625")){
            information.setText("INFORMATION");
            name.setText("Devi Fleur");
            size.setText("5");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458137636")){
            information.setText("INFORMATION");
            name.setText("Devi Fleur");
            size.setText("6");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458137649")){
            information.setText("INFORMATION");
            name.setText("Devi Fleur");
            size.setText("7");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458137664")){
            information.setText("INFORMATION");
            name.setText("Devi Fleur");
            size.setText("8");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458137681")){
            information.setText("INFORMATION");
            name.setText("Devi Fleur");
            size.setText("9");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458137610")){
            information.setText("INFORMATION");
            name.setText("Devi Fleur");
            size.setText("10");
            location.setText("3-4-K");
            done.setText("done");
        }

//      Devi Le Blanc

        if (barcode.equals("899458182025")){
            information.setText("INFORMATION");
            name.setText("Devi Le Blanc");
            size.setText("5");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458182036")){
            information.setText("INFORMATION");
            name.setText("Devi Le Blanc");
            size.setText("6");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458182049")){
            information.setText("INFORMATION");
            name.setText("Devi Le Blanc");
            size.setText("7");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458182064")){
            information.setText("INFORMATION");
            name.setText("Devi Le Blanc");
            size.setText("8");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458182081")){
            information.setText("INFORMATION");
            name.setText("Devi Le Blanc");
            size.setText("9");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458182010")){
            information.setText("INFORMATION");
            name.setText("Devi Le Blanc");
            size.setText("10");
            location.setText("3-4-K");
            done.setText("done");
        }

//      Devi Naturale

        if (barcode.equals("899458130325")){
            information.setText("INFORMATION");
            name.setText("Devi Naturale");
            size.setText("5");
            location.setText("3-4-K");
            done.setText("done");
        }
        if (barcode.equals("899458130336")){
            information.setText("INFORMATION");
            name.setText("Devi Naturale");
            size.setText("6");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458130349")){
            information.setText("INFORMATION");
            name.setText("Devi Naturale");
            size.setText("7");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458130364")){
            information.setText("INFORMATION");
            name.setText("Devi Naturale");
            size.setText("8");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458130381")){
            information.setText("INFORMATION");
            name.setText("Devi Naturale");
            size.setText("9");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458130310")){
            information.setText("INFORMATION");
            name.setText("Devi Naturale");
            size.setText("10");
            location.setText("3-4-K");
            done.setText("done");
        }

//      Devi Toscana

        if (barcode.equals("899458114725")){
            information.setText("INFORMATION");
            name.setText("Devi Toscana");
            size.setText("5");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458114736")){
            information.setText("INFORMATION");
            name.setText("Devi Toscana");
            size.setText("6");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458114749")){
            information.setText("INFORMATION");
            name.setText("Devi Toscana");
            size.setText("7");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458114764")){
            information.setText("INFORMATION");
            name.setText("Devi Toscana");
            size.setText("8");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458114781")){
            information.setText("INFORMATION");
            name.setText("Devi Toscana");
            size.setText("9");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("899458114710")){
            information.setText("INFORMATION");
            name.setText("Devi Toscana");
            size.setText("10");
            location.setText("3-4-K");
            done.setText("done");
        }

//      Dimitra Le Blanc

        if (barcode.equals("301526482025")){
            information.setText("INFORMATION");
            name.setText("Dimitra Le Blanc");
            size.setText("5");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("301526482036")){
            information.setText("INFORMATION");
            name.setText("Dimitra Le Blanc");
            size.setText("6");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("301526482049")){
            information.setText("INFORMATION");
            name.setText("Dimitra Le Blanc");
            size.setText("7");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("301526482064")){
            information.setText("INFORMATION");
            name.setText("Dimitra Le Blanc");
            size.setText("8");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("301526482081")){
            information.setText("INFORMATION");
            name.setText("Dimitra Le Blanc");
            size.setText("9");
            location.setText("3-4-C");
            done.setText("done");
        }

//      Dimitra Toscana

        if (barcode.equals("301526414725")){
            information.setText("INFORMATION");
            name.setText("Dimitra Toscana");
            size.setText("5");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("301526414736")){
            information.setText("INFORMATION");
            name.setText("Dimitra Toscana");
            size.setText("6");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("301526414749")){
            information.setText("INFORMATION");
            name.setText("Dimitra Toscana");
            size.setText("7");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("301526414764")){
            information.setText("INFORMATION");
            name.setText("Dimitra Toscana");
            size.setText("8");
            location.setText("3-4-C");
            done.setText("done");
        }

        if (barcode.equals("301526414781")){
            information.setText("INFORMATION");
            name.setText("Dimitra Toscana");
            size.setText("9");
            location.setText("3-4-C");
            done.setText("done");
        }

//      Divya Biscotti

        if (barcode.equals("747607221125")){
            information.setText("INFORMATION");
            name.setText("Divya Biscotti");
            size.setText("5");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607221136")){
            information.setText("INFORMATION");
            name.setText("Divya Biscotti");
            size.setText("6");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607221149")){
            information.setText("INFORMATION");
            name.setText("Divya Biscotti");
            size.setText("7");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607221164")){
            information.setText("INFORMATION");
            name.setText("Divya Biscotti");
            size.setText("8");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607221181")){
            information.setText("INFORMATION");
            name.setText("Divya Biscotti");
            size.setText("9");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607221110")){
            information.setText("INFORMATION");
            name.setText("Divya Biscotti");
            size.setText("10");
            location.setText("3-4-K");
            done.setText("done");
        }

//      Divya Black

        if (barcode.equals("747607246625")){
            information.setText("INFORMATION");
            name.setText("Divya Black");
            size.setText("5");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607246636")){
            information.setText("INFORMATION");
            name.setText("Divya Black");
            size.setText("6");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607246649")){
            information.setText("INFORMATION");
            name.setText("Divya Black");
            size.setText("7");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607246664")){
            information.setText("INFORMATION");
            name.setText("Divya Black");
            size.setText("8");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607246681")){
            information.setText("INFORMATION");
            name.setText("Divya Black");
            size.setText("9");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607246610")){
            information.setText("INFORMATION");
            name.setText("Divya Black");
            size.setText("10");
            location.setText("3-4-K");
            done.setText("done");
        }

//      Divya Fleur

        if (barcode.equals("747607237625")){
            information.setText("INFORMATION");
            name.setText("Divya Fleur");
            size.setText("5");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607237636")){
            information.setText("INFORMATION");
            name.setText("Divya Fleur");
            size.setText("6");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607237649")){
            information.setText("INFORMATION");
            name.setText("Divya Fleur");
            size.setText("7");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607237664")){
            information.setText("INFORMATION");
            name.setText("Divya Fleur");
            size.setText("8");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607237681")){
            information.setText("INFORMATION");
            name.setText("Divya Fleur");
            size.setText("9");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607237610")){
            information.setText("INFORMATION");
            name.setText("Divya Fleur");
            size.setText("10");
            location.setText("3-4-K");
            done.setText("done");
        }

//      Divya Toscana

        if (barcode.equals("747607214725")){
            information.setText("INFORMATION");
            name.setText("Divya Toscana");
            size.setText("5");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607214736")){
            information.setText("INFORMATION");
            name.setText("Divya Toscana");
            size.setText("6");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607214749")){
            information.setText("INFORMATION");
            name.setText("Divya Toscana");
            size.setText("7");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607214764")){
            information.setText("INFORMATION");
            name.setText("Divya Toscana");
            size.setText("8");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607214781")){
            information.setText("INFORMATION");
            name.setText("Divya Toscana");
            size.setText("9");
            location.setText("3-4-K");
            done.setText("done");
        }

        if (barcode.equals("747607214710")){
            information.setText("INFORMATION");
            name.setText("Divya Toscana");
            size.setText("10");
            location.setText("3-4-K");
            done.setText("done");
        }

//      Dorca Biscotti

        if (barcode.equals("648933621125")){
            information.setText("INFORMATION");
            name.setText("Dorca Biscotti");
            size.setText("5");
            location.setText("3-4-E");
            done.setText("done");
        }

        if (barcode.equals("648933621136")){
            information.setText("INFORMATION");
            name.setText("Dorca Biscotti");
            size.setText("6");
            location.setText("3-4-E");
            done.setText("done");
        }

        if (barcode.equals("648933621149")){
            information.setText("INFORMATION");
            name.setText("Dorca Biscotti");
            size.setText("7");
            location.setText("3-4-E");
            done.setText("done");
        }

        if (barcode.equals("648933621164")){
            information.setText("INFORMATION");
            name.setText("Dorca Biscotti");
            size.setText("8");
            location.setText("3-4-E");
            done.setText("done");
        }

        if (barcode.equals("648933621181")){
            information.setText("INFORMATION");
            name.setText("Dorca Biscotti");
            size.setText("9");
            location.setText("3-4-E");
            done.setText("done");
        }

//      Dorca Le Blanc

        if (barcode.equals("648933682025")){
            information.setText("INFORMATION");
            name.setText("Dorca Le Blanc");
            size.setText("5");
            location.setText("3-4-E");
            done.setText("done");
        }

        if (barcode.equals("648933682036")){
            information.setText("INFORMATION");
            name.setText("Dorca Le Blanc");
            size.setText("6");
            location.setText("3-4-E");
            done.setText("done");
        }

        if (barcode.equals("648933682049")){
            information.setText("INFORMATION");
            name.setText("Dorca Le Blanc");
            size.setText("7");
            location.setText("3-4-E");
            done.setText("done");
        }

        if (barcode.equals("648933682064")){
            information.setText("INFORMATION");
            name.setText("Dorca Le Blanc");
            size.setText("8");
            location.setText("3-4-E");
            done.setText("done");
        }

        if (barcode.equals("648933682081")){
            information.setText("INFORMATION");
            name.setText("Dorca Le Blanc");
            size.setText("9");
            location.setText("3-4-E");
            done.setText("done");
        }

//      Dorca Toscana

        if (barcode.equals("648933614725")){
            information.setText("INFORMATION");
            name.setText("Dorca Toscana");
            size.setText("5");
            location.setText("3-4-E");
            done.setText("done");
        }

        if (barcode.equals("648933614736")){
            information.setText("INFORMATION");
            name.setText("Dorca Toscana");
            size.setText("6");
            location.setText("3-4-E");
            done.setText("done");
        }

        if (barcode.equals("648933614749")){
            information.setText("INFORMATION");
            name.setText("Dorca Toscana");
            size.setText("7");
            location.setText("3-4-E");
            done.setText("done");
        }

        if (barcode.equals("648933614764")){
            information.setText("INFORMATION");
            name.setText("Dorca Toscana");
            size.setText("8");
            location.setText("3-4-E");
            done.setText("done");
        }

        if (barcode.equals("648933614781")){
            information.setText("INFORMATION");
            name.setText("Dorca Toscana");
            size.setText("9");
            location.setText("3-4-E");
            done.setText("done");
        }

//      Dreya Le Blanc

        if (barcode.equals("724628582025")){
            information.setText("INFORMATION");
            name.setText("Dreya Le Blanc");
            size.setText("5");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628582036")){
            information.setText("INFORMATION");
            name.setText("Dreya Le Blanc");
            size.setText("6");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628582049")){
            information.setText("INFORMATION");
            name.setText("Dreya Le Blanc");
            size.setText("7");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628582064")){
            information.setText("INFORMATION");
            name.setText("Dreya Le Blanc");
            size.setText("8");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628582081")){
            information.setText("INFORMATION");
            name.setText("Dreya Le Blanc");
            size.setText("9");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628582010")){
            information.setText("INFORMATION");
            name.setText("Dreya Le Blanc");
            size.setText("10");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

//      Dreya Naturale

        if (barcode.equals("724628530325")){
            information.setText("INFORMATION");
            name.setText("Dreya Naturale");
            size.setText("5");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628530336")){
            information.setText("INFORMATION");
            name.setText("Dreya Naturale");
            size.setText("6");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628530349")){
            information.setText("INFORMATION");
            name.setText("Dreya Naturale");
            size.setText("7");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628530364")){
            information.setText("INFORMATION");
            name.setText("Dreya Naturale");
            size.setText("8");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628530381")){
            information.setText("INFORMATION");
            name.setText("Dreya Naturale");
            size.setText("9");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628530310")){
            information.setText("INFORMATION");
            name.setText("Dreya Naturale");
            size.setText("10");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

//      Dreya Noir

        if (barcode.equals("724628538425")){
            information.setText("INFORMATION");
            name.setText("Dreya Noir");
            size.setText("5");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628538436")){
            information.setText("INFORMATION");
            name.setText("Dreya Noir");
            size.setText("6");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628538449")){
            information.setText("INFORMATION");
            name.setText("Dreya Noir");
            size.setText("7");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628538464")){
            information.setText("INFORMATION");
            name.setText("Dreya Noir");
            size.setText("8");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628538481")){
            information.setText("INFORMATION");
            name.setText("Dreya Noir");
            size.setText("9");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628538410")){
            information.setText("INFORMATION");
            name.setText("Dreya Noir");
            size.setText("10");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

//      Dreya Toscana

        if (barcode.equals("724628514725")){
            information.setText("INFORMATION");
            name.setText("Dreya Toscana");
            size.setText("5");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628514736")){
            information.setText("INFORMATION");
            name.setText("Dreya Toscana");
            size.setText("6");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628514749")){
            information.setText("INFORMATION");
            name.setText("Dreya Toscana");
            size.setText("7");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628514764")){
            information.setText("INFORMATION");
            name.setText("Dreya Toscana");
            size.setText("8");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628514781")){
            information.setText("INFORMATION");
            name.setText("Dreya Toscana");
            size.setText("9");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

        if (barcode.equals("724628514710")){
            information.setText("INFORMATION");
            name.setText("Dreya Toscana");
            size.setText("10");
            location.setText("3-4-G and 3-4-E");
            done.setText("done");
        }

//      Dyani Chamois

        if (barcode.equals("793364721925")){
            information.setText("INFORMATION");
            name.setText("Dyani Chamois");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("793364721936")){
            information.setText("INFORMATION");
            name.setText("Dyani Chamois");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("793364721949")){
            information.setText("INFORMATION");
            name.setText("Dyani Chamois");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("793364721964")){
            information.setText("INFORMATION");
            name.setText("Dyani Chamois");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("793364721981")){
            information.setText("INFORMATION");
            name.setText("Dyani Chamois");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("793364721910")){
            information.setText("INFORMATION");
            name.setText("Dyani Chamois");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Dyani Le Blanc

        if (barcode.equals("793364782025")){
            information.setText("INFORMATION");
            name.setText("Dyani Le Blanc");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("793364782036")){
            information.setText("INFORMATION");
            name.setText("Dyani Le Blanc");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("793364782049")){
            information.setText("INFORMATION");
            name.setText("Dyani Le Blanc");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("793364782064")){
            information.setText("INFORMATION");
            name.setText("Dyani Le Blanc");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("793364782081")){
            information.setText("INFORMATION");
            name.setText("Dyani Le Blanc");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("793364782010")){
            information.setText("INFORMATION");
            name.setText("Dyani Le Blanc");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Dyani Noir

        if (barcode.equals("793364738425")){
            information.setText("INFORMATION");
            name.setText("Dyani Noir");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("793364738436")){
            information.setText("INFORMATION");
            name.setText("Dyani Noir");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("793364738449")){
            information.setText("INFORMATION");
            name.setText("Dyani Noir");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("793364738464")){
            information.setText("INFORMATION");
            name.setText("Dyani Noir");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("793364738481")){
            information.setText("INFORMATION");
            name.setText("Dyani Noir");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("793364738410")){
            information.setText("INFORMATION");
            name.setText("Dyani Noir");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Initial E
//      Eara Naturale

        if (barcode.equals("736112330325")){
            information.setText("INFORMATION");
            name.setText("Eara Naturale");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("736112330336")){
            information.setText("INFORMATION");
            name.setText("Eara Naturale");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("736112330349")){
            information.setText("INFORMATION");
            name.setText("Eara Naturale");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("736112330364")){
            information.setText("INFORMATION");
            name.setText("Eara Naturale");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("736112330381")){
            information.setText("INFORMATION");
            name.setText("Eara Naturale");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("736112330310")){
            information.setText("INFORMATION");
            name.setText("Eara Naturale");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Eara Noir

        if (barcode.equals("736112338425")){
            information.setText("INFORMATION");
            name.setText("Eara Noir");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("736112338436")){
            information.setText("INFORMATION");
            name.setText("Eara Naturale");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("736112338449")){
            information.setText("INFORMATION");
            name.setText("Eara Noir");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("736112338464")){
            information.setText("INFORMATION");
            name.setText("Eara Noir");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("736112338481")){
            information.setText("INFORMATION");
            name.setText("Eara Noir");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("736112338410")){
            information.setText("INFORMATION");
            name.setText("Eara Noir");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Efia Le Blanc

        if (barcode.equals("875094282025")){
            information.setText("INFORMATION");
            name.setText("Efia Le Blanc");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("875094282036")){
            information.setText("INFORMATION");
            name.setText("Efia Le Blanc");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("875094282049")){
            information.setText("INFORMATION");
            name.setText("Efia Le Blanc");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("875094282064")){
            information.setText("INFORMATION");
            name.setText("Efia Le Blanc");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("875094282081")){
            information.setText("INFORMATION");
            name.setText("Efia Le Blanc");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Efia Naturale

        if (barcode.equals("875094230325")){
            information.setText("INFORMATION");
            name.setText("Efia Naturale");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("875094230336")){
            information.setText("INFORMATION");
            name.setText("Efia Naturale");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("875094230349")){
            information.setText("INFORMATION");
            name.setText("Efia Naturale");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("875094230364")){
            information.setText("INFORMATION");
            name.setText("Efia Naturale");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("875094230381")){
            information.setText("INFORMATION");
            name.setText("Efia Naturale");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Efia Noir

        if (barcode.equals("875094238425")){
            information.setText("INFORMATION");
            name.setText("Efia Noir");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("875094238436")){
            information.setText("INFORMATION");
            name.setText("Efia Noir");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("875094238449")){
            information.setText("INFORMATION");
            name.setText("Efia Noir");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("875094238464")){
            information.setText("INFORMATION");
            name.setText("Efia Noir");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("875094238481")){
            information.setText("INFORMATION");
            name.setText("Efia Noir");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Efia Toscana

        if (barcode.equals("875094214725")){
            information.setText("INFORMATION");
            name.setText("Efia Toscana");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("875094214736")){
            information.setText("INFORMATION");
            name.setText("Efia Toscana");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("875094214749")){
            information.setText("INFORMATION");
            name.setText("Efia Toscana");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("875094214764")){
            information.setText("INFORMATION");
            name.setText("Efia Toscana");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("875094214781")){
            information.setText("INFORMATION");
            name.setText("Efia Toscana");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Eira Biscotti

        if (barcode.equals("161109621125")){
            information.setText("INFORMATION");
            name.setText("Eira Biscotti");
            size.setText("5");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("161109621136")){
            information.setText("INFORMATION");
            name.setText("Eira Biscotti");
            size.setText("6");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("161109621149")){
            information.setText("INFORMATION");
            name.setText("Eira Biscotti");
            size.setText("7");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("161109621164")){
            information.setText("INFORMATION");
            name.setText("Eira Biscotti");
            size.setText("8");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("161109621181")){
            information.setText("INFORMATION");
            name.setText("Eira Biscotti");
            size.setText("9");
            location.setText("3-3-M");
            done.setText("done");
        }

//      Eira Fleur

        if (barcode.equals("161109637625")){
            information.setText("INFORMATION");
            name.setText("Eira Fleur");
            size.setText("5");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("161109637636")){
            information.setText("INFORMATION");
            name.setText("Eira Fleur");
            size.setText("6");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("161109637649")){
            information.setText("INFORMATION");
            name.setText("Eira Fleur");
            size.setText("7");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("161109637664")){
            information.setText("INFORMATION");
            name.setText("Eira Fleur");
            size.setText("8");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("161109637681")){
            information.setText("INFORMATION");
            name.setText("Eira Fleur");
            size.setText("9");
            location.setText("3-3-M");
            done.setText("done");
        }

//      Eira Le Blanc

        if (barcode.equals("161109682025")){
            information.setText("INFORMATION");
            name.setText("Eira Le Blanc");
            size.setText("5");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("161109682036")){
            information.setText("INFORMATION");
            name.setText("Eira Le Blanc");
            size.setText("6");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("161109682049")){
            information.setText("INFORMATION");
            name.setText("Eira Le Blanc");
            size.setText("7");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("161109682064")){
            information.setText("INFORMATION");
            name.setText("Eira Le Blanc");
            size.setText("8");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("161109682081")){
            information.setText("INFORMATION");
            name.setText("Eira Le Blanc");
            size.setText("9");
            location.setText("3-3-M");
            done.setText("done");
        }

//      Eira Palomino

        if (barcode.equals("161109673625")){
            information.setText("INFORMATION");
            name.setText("Eira Palomino");
            size.setText("5");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("161109673636")){
            information.setText("INFORMATION");
            name.setText("Eira Palomino");
            size.setText("6");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("161109673649")){
            information.setText("INFORMATION");
            name.setText("Eira Palomino");
            size.setText("7");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("161109673664")){
            information.setText("INFORMATION");
            name.setText("Eira Palomino");
            size.setText("8");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("161109673681")){
            information.setText("INFORMATION");
            name.setText("Eira Palomino");
            size.setText("9");
            location.setText("3-3-M");
            done.setText("done");
        }

//      Elakshi Sandstone

        if (barcode.equals("942233381425")){
            information.setText("INFORMATION");
            name.setText("Elakshi Sandstone");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("942233381436")){
            information.setText("INFORMATION");
            name.setText("Elakshi Sandstone");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("942233381449")){
            information.setText("INFORMATION");
            name.setText("Elakshi Sandstone");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("942233381464")){
            information.setText("INFORMATION");
            name.setText("Elakshi Sandstone");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("942233381481")){
            information.setText("INFORMATION");
            name.setText("Elakshi Sandstone");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("942233381410")){
            information.setText("INFORMATION");
            name.setText("Elakshi Sandstone");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Elakshi Sierra

        if (barcode.equals("942233399225")){
            information.setText("INFORMATION");
            name.setText("Elakshi Sierra");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("942233399236")){
            information.setText("INFORMATION");
            name.setText("Elakshi Sierra");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("942233399249")){
            information.setText("INFORMATION");
            name.setText("Elakshi Sierra");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("942233399264")){
            information.setText("INFORMATION");
            name.setText("Elakshi Sierra");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("942233399281")){
            information.setText("INFORMATION");
            name.setText("Elakshi Sierra");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("942233399210")){
            information.setText("INFORMATION");
            name.setText("Elakshi Sierra");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Elakshi White

        if (barcode.equals("942233365525")){
            information.setText("INFORMATION");
            name.setText("Elakshi White");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("942233365536")){
            information.setText("INFORMATION");
            name.setText("Elakshi White");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("942233365549")){
            information.setText("INFORMATION");
            name.setText("Elakshi White");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("942233365564")){
            information.setText("INFORMATION");
            name.setText("Elakshi White");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("942233365581")){
            information.setText("INFORMATION");
            name.setText("Elakshi White");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("942233365510")){
            information.setText("INFORMATION");
            name.setText("Elakshi White");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Elayna Amber

        if (barcode.equals("588948464725")){
            information.setText("INFORMATION");
            name.setText("Elayna Amber");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("588948464736")){
            information.setText("INFORMATION");
            name.setText("Elayna Amber");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("588948464749")){
            information.setText("INFORMATION");
            name.setText("Elayna Amber");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("588948464764")){
            information.setText("INFORMATION");
            name.setText("Elayna Amber");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("588948464781")){
            information.setText("INFORMATION");
            name.setText("Elayna Amber");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Elayna Aqua

        if (barcode.equals("588948425125")){
            information.setText("INFORMATION");
            name.setText("Elayna Aqua");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("588948425136")){
            information.setText("INFORMATION");
            name.setText("Elayna Aqua");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("588948425149")){
            information.setText("INFORMATION");
            name.setText("Elayna Aqua");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("588948425164")){
            information.setText("INFORMATION");
            name.setText("Elayna Aqua");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("588948425181")){
            information.setText("INFORMATION");
            name.setText("Elayna Aqua");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Elayna Citron

        if (barcode.equals("588948429125")){
            information.setText("INFORMATION");
            name.setText("Elayna Citron");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("588948429136")){
            information.setText("INFORMATION");
            name.setText("Elayna Citron");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("588948429149")){
            information.setText("INFORMATION");
            name.setText("Elayna Citron");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("588948429164")){
            information.setText("INFORMATION");
            name.setText("Elayna Citron");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("588948429181")){
            information.setText("INFORMATION");
            name.setText("Elayna Citron");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Elayna White

        if (barcode.equals("588948465525")){
            information.setText("INFORMATION");
            name.setText("Elayna White");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("588948465536")){
            information.setText("INFORMATION");
            name.setText("Elayna White");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("588948465549")){
            information.setText("INFORMATION");
            name.setText("Elayna White");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("588948465564")){
            information.setText("INFORMATION");
            name.setText("Elayna White");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("588948465581")){
            information.setText("INFORMATION");
            name.setText("Elayna White");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Eliri Biscotti

        if (barcode.equals("443892721125")){
            information.setText("INFORMATION");
            name.setText("Eliri Biscotti");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("443892721136")){
            information.setText("INFORMATION");
            name.setText("Eliri Biscotti");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("443892721149")){
            information.setText("INFORMATION");
            name.setText("Eliri Biscotti");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("443892721164")){
            information.setText("INFORMATION");
            name.setText("Eliri Biscotti");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("443892721181")){
            information.setText("INFORMATION");
            name.setText("Eliri Biscotti");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Eliri Cashew

        if (barcode.equals("443892768725")){
            information.setText("INFORMATION");
            name.setText("Eliri Cashew");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("443892768736")){
            information.setText("INFORMATION");
            name.setText("Eliri Cashew");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("443892768749")){
            information.setText("INFORMATION");
            name.setText("Eliri Cashew");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("443892768764")){
            information.setText("INFORMATION");
            name.setText("Eliri Cashew");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("443892768781")){
            information.setText("INFORMATION");
            name.setText("Eliri Cashew");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Eliri Ecru

        if (barcode.equals("443892753425")){
            information.setText("INFORMATION");
            name.setText("Eliri Ecru");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("443892753436")){
            information.setText("INFORMATION");
            name.setText("Eliri Ecru");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("443892753449")){
            information.setText("INFORMATION");
            name.setText("Eliri Ecru");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("443892753464")){
            information.setText("INFORMATION");
            name.setText("Eliri Ecru");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("443892753481")){
            information.setText("INFORMATION");
            name.setText("Eliri Ecru");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Eliri White

        if (barcode.equals("443892765525")){
            information.setText("INFORMATION");
            name.setText("Eliri White");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("443892765536")){
            information.setText("INFORMATION");
            name.setText("Eliri White");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("443892765549")){
            information.setText("INFORMATION");
            name.setText("Eliri White");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("443892765564")){
            information.setText("INFORMATION");
            name.setText("Eliri White");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("443892765581")){
            information.setText("INFORMATION");
            name.setText("Eliri White");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Elva Le Blanc

        if (barcode.equals("283427282025")){
            information.setText("INFORMATION");
            name.setText("Elva Le Blanc");
            size.setText("5");
            location.setText("3-3-K and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("283427282036")){
            information.setText("INFORMATION");
            name.setText("Elva Le Blanc");
            size.setText("6");
            location.setText("3-3-K and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("283427282049")){
            information.setText("INFORMATION");
            name.setText("Elva Le Blanc");
            size.setText("7");
            location.setText("3-3-K and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("283427282064")){
            information.setText("INFORMATION");
            name.setText("Elva Le Blanc");
            size.setText("8");
            location.setText("3-3-K and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("283427282081")){
            information.setText("INFORMATION");
            name.setText("Elva Le Blanc");
            size.setText("9");
            location.setText("3-3-K and 3-3-M");
            done.setText("done");
        }

//      Elva Palomino

        if (barcode.equals("283427273625")){
            information.setText("INFORMATION");
            name.setText("Elva Palomino");
            size.setText("5");
            location.setText("3-3-K and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("283427273636")){
            information.setText("INFORMATION");
            name.setText("Elva Palomino");
            size.setText("6");
            location.setText("3-3-K and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("283427273649")){
            information.setText("INFORMATION");
            name.setText("Elva Palomino");
            size.setText("7");
            location.setText("3-3-K and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("283427273664")){
            information.setText("INFORMATION");
            name.setText("Elva Palomino");
            size.setText("8");
            location.setText("3-3-K and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("283427273681")){
            information.setText("INFORMATION");
            name.setText("Elva Palomino");
            size.setText("9");
            location.setText("3-3-K and 3-3-M");
            done.setText("done");
        }

//      Elva Toscana

        if (barcode.equals("283427214725")){
            information.setText("INFORMATION");
            name.setText("Elva Toscana");
            size.setText("5");
            location.setText("3-3-K and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("283427214736")){
            information.setText("INFORMATION");
            name.setText("Elva Toscana");
            size.setText("6");
            location.setText("3-3-K and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("283427214749")){
            information.setText("INFORMATION");
            name.setText("Elva Toscana");
            size.setText("7");
            location.setText("3-3-K and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("283427214764")){
            information.setText("INFORMATION");
            name.setText("Elva Toscana");
            size.setText("8");
            location.setText("3-3-K and 3-3-M");
            done.setText("done");
        }

        if (barcode.equals("283427214781")){
            information.setText("INFORMATION");
            name.setText("Elva Toscana");
            size.setText("9");
            location.setText("3-3-K and 3-3-M");
            done.setText("done");
        }

//      Emari Creme

        if (barcode.equals("456185594625")){
            information.setText("INFORMATION");
            name.setText("Emari Creme");
            size.setText("5");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("456185594636")){
            information.setText("INFORMATION");
            name.setText("Emari Creme");
            size.setText("6");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("456185594649")){
            information.setText("INFORMATION");
            name.setText("Emari Creme");
            size.setText("7");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("456185594664")){
            information.setText("INFORMATION");
            name.setText("Emari Creme");
            size.setText("8");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("456185594681")){
            information.setText("INFORMATION");
            name.setText("Emari Creme");
            size.setText("9");
            location.setText("3-3-M");
            done.setText("done");
        }

//      Emari Fleur

        if (barcode.equals("456185537625")){
            information.setText("INFORMATION");
            name.setText("Emari Fleur");
            size.setText("5");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("456185537636")){
            information.setText("INFORMATION");
            name.setText("Emari Fleur");
            size.setText("6");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("456185537649")){
            information.setText("INFORMATION");
            name.setText("Emari Fleur");
            size.setText("7");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("456185537664")){
            information.setText("INFORMATION");
            name.setText("Emari Fleur");
            size.setText("8");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("456185537681")){
            information.setText("INFORMATION");
            name.setText("Emari Fleur");
            size.setText("9");
            location.setText("3-3-M");
            done.setText("done");
        }

//      Emari Palomino

        if (barcode.equals("456185573625")){
            information.setText("INFORMATION");
            name.setText("Emari Palomino");
            size.setText("5");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("456185573636")){
            information.setText("INFORMATION");
            name.setText("Emari Palomino");
            size.setText("6");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("456185573649")){
            information.setText("INFORMATION");
            name.setText("Emari Palomino");
            size.setText("7");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("456185573664")){
            information.setText("INFORMATION");
            name.setText("Emari Palomino");
            size.setText("8");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("456185573681")){
            information.setText("INFORMATION");
            name.setText("Emari Palomino");
            size.setText("9");
            location.setText("3-3-M");
            done.setText("done");
        }

//      Emeli Biscotti

        if (barcode.equals("984980721125")){
            information.setText("INFORMATION");
            name.setText("Emeli Biscotti");
            size.setText("5");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("984980721136")){
            information.setText("INFORMATION");
            name.setText("Emeli Biscotti");
            size.setText("6");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("984980721149")){
            information.setText("INFORMATION");
            name.setText("Emeli Biscotti");
            size.setText("7");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("984980721164")){
            information.setText("INFORMATION");
            name.setText("Emeli Biscotti");
            size.setText("8");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("984980721181")){
            information.setText("INFORMATION");
            name.setText("Emeli Biscotti");
            size.setText("9");
            location.setText("3-3-M");
            done.setText("done");
        }

//      Emeli Creme

        if (barcode.equals("984980794625")){
            information.setText("INFORMATION");
            name.setText("Emeli Creme");
            size.setText("5");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("984980794636")){
            information.setText("INFORMATION");
            name.setText("Emeli Creme");
            size.setText("6");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("984980794649")){
            information.setText("INFORMATION");
            name.setText("Emeli Creme");
            size.setText("7");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("984980794664")){
            information.setText("INFORMATION");
            name.setText("Emeli Creme");
            size.setText("8");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("984980794681")){
            information.setText("INFORMATION");
            name.setText("Emeli Creme");
            size.setText("9");
            location.setText("3-3-M");
            done.setText("done");
        }

//      Emeli Toscana

        if (barcode.equals("984980714725")){
            information.setText("INFORMATION");
            name.setText("Emeli Toscana");
            size.setText("5");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("984980714736")){
            information.setText("INFORMATION");
            name.setText("Emeli Toscana");
            size.setText("6");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("984980714749")){
            information.setText("INFORMATION");
            name.setText("Emeli Toscana");
            size.setText("7");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("984980714764")){
            information.setText("INFORMATION");
            name.setText("Emeli Toscana");
            size.setText("8");
            location.setText("3-3-M");
            done.setText("done");
        }

        if (barcode.equals("984980714781")){
            information.setText("INFORMATION");
            name.setText("Emeli Toscana");
            size.setText("9");
            location.setText("3-3-M");
            done.setText("done");
        }

//      Enari Naturale

        if (barcode.equals("576117630325")){
            information.setText("INFORMATION");
            name.setText("Enari Naturale");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("576117630336")){
            information.setText("INFORMATION");
            name.setText("Enari Naturale");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("576117630349")){
            information.setText("INFORMATION");
            name.setText("Enari Naturale");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("576117630364")){
            information.setText("INFORMATION");
            name.setText("Enari Naturale");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("576117630381")){
            information.setText("INFORMATION");
            name.setText("Enari Naturale");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("576117630310")){
            information.setText("INFORMATION");
            name.setText("Enari Naturale");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Enari Noir

        if (barcode.equals("576117638425")){
            information.setText("INFORMATION");
            name.setText("Enari Noir");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("576117638436")){
            information.setText("INFORMATION");
            name.setText("Enari Noir");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("576117638449")){
            information.setText("INFORMATION");
            name.setText("Enari Noir");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("576117638464")){
            information.setText("INFORMATION");
            name.setText("Enari Noir");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("576117638481")){
            information.setText("INFORMATION");
            name.setText("Enari Noir");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("576117638410")){
            information.setText("INFORMATION");
            name.setText("Enari Noir");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Enari Rojo

        if (barcode.equals("576117625025")){
            information.setText("INFORMATION");
            name.setText("Enari Rojo");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("576117625036")){
            information.setText("INFORMATION");
            name.setText("Enari Rojo");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("576117625049")){
            information.setText("INFORMATION");
            name.setText("Enari Rojo");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("576117625064")){
            information.setText("INFORMATION");
            name.setText("Enari Rojo");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("576117625081")){
            information.setText("INFORMATION");
            name.setText("Enari Rojo");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("576117625010")){
            information.setText("INFORMATION");
            name.setText("Enari Rojo");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Ercila Bleu

        if (barcode.equals("575153084925")){
            information.setText("INFORMATION");
            name.setText("Ercila Bleu");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("575153084936")){
            information.setText("INFORMATION");
            name.setText("Ercila Bleu");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("575153084949")){
            information.setText("INFORMATION");
            name.setText("Ercila Bleu");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("575153084949")){
            information.setText("INFORMATION");
            name.setText("Ercila Bleu");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("575153084981")){
            information.setText("INFORMATION");
            name.setText("Ercila Bleu");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Ercila Fleur

        if (barcode.equals("575153037625")){
            information.setText("INFORMATION");
            name.setText("Ercila Fleur");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("575153037636")){
            information.setText("INFORMATION");
            name.setText("Ercila Fleur");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("575153037649")){
            information.setText("INFORMATION");
            name.setText("Ercila Fleur");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("575153037664")){
            information.setText("INFORMATION");
            name.setText("Ercila Fleur");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("575153037681")){
            information.setText("INFORMATION");
            name.setText("Ercila Fleur");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Ercila Le Blanc

        if (barcode.equals("575153082025")){
            information.setText("INFORMATION");
            name.setText("Ercila Le Blanc");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("575153082036")){
            information.setText("INFORMATION");
            name.setText("Ercila Le Blanc");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("575153082049")){
            information.setText("INFORMATION");
            name.setText("Ercila Le Blanc");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("575153082064")){
            information.setText("INFORMATION");
            name.setText("Ercila Le Blanc");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("575153082081")){
            information.setText("INFORMATION");
            name.setText("Ercila Le Blanc");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Erma Fleur

        if (barcode.equals("448405937625")){
            information.setText("INFORMATION");
            name.setText("Erma Fleur");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("448405937636")){
            information.setText("INFORMATION");
            name.setText("Erma Fleur");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("448405937649")){
            information.setText("INFORMATION");
            name.setText("Erma Fleur");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("448405937664")){
            information.setText("INFORMATION");
            name.setText("Erma Fleur");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("448405937681")){
            information.setText("INFORMATION");
            name.setText("Erma Fleur");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Erma Palomino

        if (barcode.equals("448405973625")){
            information.setText("INFORMATION");
            name.setText("Erma Palomino");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("448405973636")){
            information.setText("INFORMATION");
            name.setText("Erma Palomino");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("448405973649")){
            information.setText("INFORMATION");
            name.setText("Erma Palomino");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("448405973664")){
            information.setText("INFORMATION");
            name.setText("Erma Palomino");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("448405973681")){
            information.setText("INFORMATION");
            name.setText("Erma Palomino");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Erma White

        if (barcode.equals("448405965525")){
            information.setText("INFORMATION");
            name.setText("Erma White");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("448405965536")){
            information.setText("INFORMATION");
            name.setText("Erma White");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("448405965549")){
            information.setText("INFORMATION");
            name.setText("Erma White");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("448405965564")){
            information.setText("INFORMATION");
            name.setText("Erma White");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("448405965581")){
            information.setText("INFORMATION");
            name.setText("Erma White");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Eshika Calico

        if (barcode.equals("339787441225")){
            information.setText("INFORMATION");
            name.setText("Eshika Calico");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("339787441236")){
            information.setText("INFORMATION");
            name.setText("Eshika Calico");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("339787441249")){
            information.setText("INFORMATION");
            name.setText("Eshika Calico");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("339787441264")){
            information.setText("INFORMATION");
            name.setText("Eshika Calico");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("339787441281")){
            information.setText("INFORMATION");
            name.setText("Eshika Calico");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Eshika Fleur

        if (barcode.equals("339787437625")){
            information.setText("INFORMATION");
            name.setText("Eshika Fleur");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("339787437636")){
            information.setText("INFORMATION");
            name.setText("Eshika Fleur");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("339787437649")){
            information.setText("INFORMATION");
            name.setText("Eshika Fleur");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("339787437664")){
            information.setText("INFORMATION");
            name.setText("Eshika Fleur");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("339787437681")){
            information.setText("INFORMATION");
            name.setText("Eshika Fleur");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Eshika Le Blanc

        if (barcode.equals("339787482025")){
            information.setText("INFORMATION");
            name.setText("Eshika Le Blanc");
            size.setText("5");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("339787482036")){
            information.setText("INFORMATION");
            name.setText("Eshika Le Blanc");
            size.setText("6");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("339787482049")){
            information.setText("INFORMATION");
            name.setText("Eshika Le Blanc");
            size.setText("7");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("339787482064")){
            information.setText("INFORMATION");
            name.setText("Eshika Le Blanc");
            size.setText("8");
            location.setText("3-3-K");
            done.setText("done");
        }

        if (barcode.equals("339787482081")){
            information.setText("INFORMATION");
            name.setText("Eshika Le Blanc");
            size.setText("9");
            location.setText("3-3-K");
            done.setText("done");
        }

//      Eula Biscotti

        if (barcode.equals("346542121125")){
            information.setText("INFORMATION");
            name.setText("Eula Biscotti");
            size.setText("5");
            location.setText("3-4-N");
            done.setText("done");
        }

        if (barcode.equals("346542121136")){
            information.setText("INFORMATION");
            name.setText("Eula Biscotti");
            size.setText("6");
            location.setText("3-4-N");
            done.setText("done");
        }

        if (barcode.equals("346542121149")){
            information.setText("INFORMATION");
            name.setText("Eula Biscotti");
            size.setText("7");
            location.setText("3-4-N");
            done.setText("done");
        }

        if (barcode.equals("346542121164")){
            information.setText("INFORMATION");
            name.setText("Eula Biscotti");
            size.setText("8");
            location.setText("3-4-N");
            done.setText("done");
        }

        if (barcode.equals("346542121181")){
            information.setText("INFORMATION");
            name.setText("Eula Biscotti");
            size.setText("9");
            location.setText("3-4-N");
            done.setText("done");
        }

//      Eula Noir

        if (barcode.equals("346542138425")){
            information.setText("INFORMATION");
            name.setText("Eula Noir");
            size.setText("5");
            location.setText("3-4-N");
            done.setText("done");
        }

        if (barcode.equals("346542138436")){
            information.setText("INFORMATION");
            name.setText("Eula Noir");
            size.setText("6");
            location.setText("3-4-N");
            done.setText("done");
        }

        if (barcode.equals("346542138449")){
            information.setText("INFORMATION");
            name.setText("Eula Noir");
            size.setText("7");
            location.setText("3-4-N");
            done.setText("done");
        }

        if (barcode.equals("346542138464")){
            information.setText("INFORMATION");
            name.setText("Eula Noir");
            size.setText("8");
            location.setText("3-4-N");
            done.setText("done");
        }

        if (barcode.equals("346542138481")){
            information.setText("INFORMATION");
            name.setText("Eula Noir");
            size.setText("9");
            location.setText("3-4-N");
            done.setText("done");
        }

//      Eula Palomino

        if (barcode.equals("346542173625")){
            information.setText("INFORMATION");
            name.setText("Eula Palomino");
            size.setText("5");
            location.setText("3-4-N");
            done.setText("done");
        }

        if (barcode.equals("346542173636")){
            information.setText("INFORMATION");
            name.setText("Eula Palomino");
            size.setText("6");
            location.setText("3-4-N");
            done.setText("done");
        }

        if (barcode.equals("346542173649")){
            information.setText("INFORMATION");
            name.setText("Eula Palomino");
            size.setText("7");
            location.setText("3-4-N");
            done.setText("done");
        }

        if (barcode.equals("346542173664")){
            information.setText("INFORMATION");
            name.setText("Eula Palomino");
            size.setText("8");
            location.setText("3-4-N");
            done.setText("done");
        }

        if (barcode.equals("346542173681")){
            information.setText("INFORMATION");
            name.setText("Eula Palomino");
            size.setText("9");
            location.setText("3-4-N");
            done.setText("done");
        }

//      Ezra Black

        if (barcode.equals("552956446625")){
            information.setText("INFORMATION");
            name.setText("Ezra Black");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956446636")){
            information.setText("INFORMATION");
            name.setText("Ezra Black");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956446649")){
            information.setText("INFORMATION");
            name.setText("Ezra Black");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956446664")){
            information.setText("INFORMATION");
            name.setText("Ezra Black");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956446681")){
            information.setText("INFORMATION");
            name.setText("Ezra Black");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Ezra Fleur

        if (barcode.equals("552956437625")){
            information.setText("INFORMATION");
            name.setText("Ezra Fleur");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956437636")){
            information.setText("INFORMATION");
            name.setText("Ezra Fleur");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956437649")){
            information.setText("INFORMATION");
            name.setText("Ezra Fleur");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956437664")){
            information.setText("INFORMATION");
            name.setText("Ezra Fleur");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956437681")){
            information.setText("INFORMATION");
            name.setText("Ezra Fleur");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Ezra Nude

        if (barcode.equals("552956445425")){
            information.setText("INFORMATION");
            name.setText("Ezra Nude");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956445436")){
            information.setText("INFORMATION");
            name.setText("Ezra Nude");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956445449")){
            information.setText("INFORMATION");
            name.setText("Ezra Nude");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956445464")){
            information.setText("INFORMATION");
            name.setText("Ezra Nude");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956445481")){
            information.setText("INFORMATION");
            name.setText("Ezra Nude");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Ezra Palomino

        if (barcode.equals("552956473625")){
            information.setText("INFORMATION");
            name.setText("Ezra Palomino");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956473636")){
            information.setText("INFORMATION");
            name.setText("Ezra Palomino");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956473649")){
            information.setText("INFORMATION");
            name.setText("Ezra Palomino");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956473664")){
            information.setText("INFORMATION");
            name.setText("Ezra Palomino");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956473681")){
            information.setText("INFORMATION");
            name.setText("Ezra Palomino");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Ezra White

        if (barcode.equals("552956465525")){
            information.setText("INFORMATION");
            name.setText("Ezra White");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956465536")){
            information.setText("INFORMATION");
            name.setText("Ezra White");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956465549")){
            information.setText("INFORMATION");
            name.setText("Ezra White");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956465564")){
            information.setText("INFORMATION");
            name.setText("Ezra White");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("552956465581")){
            information.setText("INFORMATION");
            name.setText("Ezra White");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Initial F
//      Faiqa Fleur

        if (barcode.equals("284386737625")){
            information.setText("INFORMATION");
            name.setText("Faiqa Fleur");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("284386737636")){
            information.setText("INFORMATION");
            name.setText("Faiqa Fleur");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("284386737649")){
            information.setText("INFORMATION");
            name.setText("Faiqa Fleur");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("284386737664")){
            information.setText("INFORMATION");
            name.setText("Faiqa Fleur");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("284386737681")){
            information.setText("INFORMATION");
            name.setText("Faiqa Fleur");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Faiqa Le Blanc

        if (barcode.equals("284386782025")){
            information.setText("INFORMATION");
            name.setText("Faiqa Le Blanc");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("284386782036")){
            information.setText("INFORMATION");
            name.setText("Faiqa Le Blanc");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("284386782049")){
            information.setText("INFORMATION");
            name.setText("Faiqa Le Blanc");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("284386782064")){
            information.setText("INFORMATION");
            name.setText("Faiqa Le Blanc");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("284386782081")){
            information.setText("INFORMATION");
            name.setText("Faiqa Le Blanc");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Faiqa Majolica

        if (barcode.equals("284386749925")){
            information.setText("INFORMATION");
            name.setText("Faiqa Majolica");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("284386749936")){
            information.setText("INFORMATION");
            name.setText("Faiqa Majolica");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("284386749949")){
            information.setText("INFORMATION");
            name.setText("Faiqa Majolica");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("284386749964")){
            information.setText("INFORMATION");
            name.setText("Faiqa Majolica");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("284386749981")){
            information.setText("INFORMATION");
            name.setText("Faiqa Majolica");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Faiqa Mist

        if (barcode.equals("284386768125")){
            information.setText("INFORMATION");
            name.setText("Faiqa Mist");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("284386768136")){
            information.setText("INFORMATION");
            name.setText("Faiqa Mist");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("284386768149")){
            information.setText("INFORMATION");
            name.setText("Faiqa Mist");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("284386768164")){
            information.setText("INFORMATION");
            name.setText("Faiqa Mist");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("284386768181")){
            information.setText("INFORMATION");
            name.setText("Faiqa Mist");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Faiza Biscotti

        if (barcode.equals("484430021125")){
            information.setText("INFORMATION");
            name.setText("Faiza Biscotti");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("484430021136")){
            information.setText("INFORMATION");
            name.setText("Faiza Biscotti");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("484430021149")){
            information.setText("INFORMATION");
            name.setText("Faiza Biscotti");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("484430021164")){
            information.setText("INFORMATION");
            name.setText("Faiza Biscotti");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("484430021181")){
            information.setText("INFORMATION");
            name.setText("Faiza Biscotti");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Faiza Cappuccino

        if (barcode.equals("484430015825")){
            information.setText("INFORMATION");
            name.setText("Faiza Cappuccino");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("484430015836")){
            information.setText("INFORMATION");
            name.setText("Faiza Cappuccino");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("484430015849")){
            information.setText("INFORMATION");
            name.setText("Faiza Cappuccino");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("484430015864")){
            information.setText("INFORMATION");
            name.setText("Faiza Cappuccino");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("484430015881")){
            information.setText("INFORMATION");
            name.setText("Faiza Cappuccino");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Faiza White

        if (barcode.equals("484430065525")){
            information.setText("INFORMATION");
            name.setText("Faiza White");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("484430065536")){
            information.setText("INFORMATION");
            name.setText("Faiza White");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("484430065549")){
            information.setText("INFORMATION");
            name.setText("Faiza White");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("484430065564")){
            information.setText("INFORMATION");
            name.setText("Faiza White");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("484430065581")){
            information.setText("INFORMATION");
            name.setText("Faiza White");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Farida Le Blanc

        if (barcode.equals("115406882025")){
            information.setText("INFORMATION");
            name.setText("Farida Le Blanc");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("115406882036")){
            information.setText("INFORMATION");
            name.setText("Farida Le Blanc");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("115406882049")){
            information.setText("INFORMATION");
            name.setText("Farida Le Blanc");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("115406882064")){
            information.setText("INFORMATION");
            name.setText("Farida Le Blanc");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("115406882081")){
            information.setText("INFORMATION");
            name.setText("Farida Le Blanc");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Farida Naturale

        if (barcode.equals("115406830325")){
            information.setText("INFORMATION");
            name.setText("Farida Naturale");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("115406830336")){
            information.setText("INFORMATION");
            name.setText("Farida Naturale");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("115406830349")){
            information.setText("INFORMATION");
            name.setText("Farida Naturale");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("115406830364")){
            information.setText("INFORMATION");
            name.setText("Farida Naturale");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("115406830381")){
            information.setText("INFORMATION");
            name.setText("Farida Naturale");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Fatou Creme

        if (barcode.equals("485327794625")){
            information.setText("INFORMATION");
            name.setText("Fatou Creme");
            size.setText("5");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

        if (barcode.equals("485327794636")){
            information.setText("INFORMATION");
            name.setText("Fatou Creme");
            size.setText("6");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

        if (barcode.equals("485327794649")){
            information.setText("INFORMATION");
            name.setText("Fatou Creme");
            size.setText("7");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

        if (barcode.equals("485327794664")){
            information.setText("INFORMATION");
            name.setText("Fatou Creme");
            size.setText("8");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

        if (barcode.equals("485327794681")){
            information.setText("INFORMATION");
            name.setText("Fatou Creme");
            size.setText("9");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

//      Fatou Naturale

        if (barcode.equals("485327730325")){
            information.setText("INFORMATION");
            name.setText("Fatou Naturale");
            size.setText("5");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

        if (barcode.equals("485327730336")){
            information.setText("INFORMATION");
            name.setText("Fatou Naturale");
            size.setText("6");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

        if (barcode.equals("485327730349")){
            information.setText("INFORMATION");
            name.setText("Fatou Naturale");
            size.setText("7");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

        if (barcode.equals("485327730364")){
            information.setText("INFORMATION");
            name.setText("Fatou Naturale");
            size.setText("8");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

        if (barcode.equals("485327730381")){
            information.setText("INFORMATION");
            name.setText("Fatou Naturale");
            size.setText("9");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

//      Fatou Noir

        if (barcode.equals("485327738425")){
            information.setText("INFORMATION");
            name.setText("Fatou Noir");
            size.setText("5");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

        if (barcode.equals("485327738436")){
            information.setText("INFORMATION");
            name.setText("Fatou Noir");
            size.setText("6");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

        if (barcode.equals("485327738449")){
            information.setText("INFORMATION");
            name.setText("Fatou Noir");
            size.setText("7");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

        if (barcode.equals("485327738464")){
            information.setText("INFORMATION");
            name.setText("Fatou Noir");
            size.setText("8");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

        if (barcode.equals("485327738481")){
            information.setText("INFORMATION");
            name.setText("Fatou Noir");
            size.setText("9");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

//      Fatou Sedona

        if (barcode.equals("485327751025")){
            information.setText("INFORMATION");
            name.setText("Fatou Sedona");
            size.setText("5");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

        if (barcode.equals("485327751036")){
            information.setText("INFORMATION");
            name.setText("Fatou Sedona");
            size.setText("6");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

        if (barcode.equals("485327751049")){
            information.setText("INFORMATION");
            name.setText("Fatou Sedona");
            size.setText("7");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

        if (barcode.equals("485327751064")){
            information.setText("INFORMATION");
            name.setText("Fatou Sedona");
            size.setText("8");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

        if (barcode.equals("485327751081")){
            information.setText("INFORMATION");
            name.setText("Fatou Sedona");
            size.setText("9");
            location.setText("3-4-K and 3-4-M");
            done.setText("done");
        }

//      Fiza Le Blanc

        if (barcode.equals("119189982025")){
            information.setText("INFORMATION");
            name.setText("Fiza Le Blanc");
            size.setText("5");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("119189982036")){
            information.setText("INFORMATION");
            name.setText("Fiza Le Blanc");
            size.setText("6");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("119189982049")){
            information.setText("INFORMATION");
            name.setText("Fiza Le Blanc");
            size.setText("7");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("119189982064")){
            information.setText("INFORMATION");
            name.setText("Fiza Le Blanc");
            size.setText("8");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("119189982081")){
            information.setText("INFORMATION");
            name.setText("Fiza Le Blanc");
            size.setText("9");
            location.setText("3-4-M");
            done.setText("done");
        }

//      Fiza Naturale

        if (barcode.equals("119189930325")){
            information.setText("INFORMATION");
            name.setText("Fiza Naturale");
            size.setText("5");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("119189930336")){
            information.setText("INFORMATION");
            name.setText("Fiza Naturale");
            size.setText("6");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("119189930349")){
            information.setText("INFORMATION");
            name.setText("Fiza Naturale");
            size.setText("7");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("119189930364")){
            information.setText("INFORMATION");
            name.setText("Fiza Naturale");
            size.setText("8");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("119189930381")){
            information.setText("INFORMATION");
            name.setText("Fiza Naturale");
            size.setText("9");
            location.setText("3-4-M");
            done.setText("done");
        }

//      Florentine Bisque

        if (barcode.equals("381280443025")){
            information.setText("INFORMATION");
            name.setText("Florentine Bisque");
            size.setText("5");
            location.setText("3-2-H and 3-2-J");
            done.setText("done");
        }

        if (barcode.equals("381280443036")){
            information.setText("INFORMATION");
            name.setText("Florentine Bisque");
            size.setText("6");
            location.setText("3-2-H and 3-2-J");
            done.setText("done");
        }

        if (barcode.equals("381280443049")){
            information.setText("INFORMATION");
            name.setText("Florentine Bisque");
            size.setText("7");
            location.setText("3-2-H and 3-2-J");
            done.setText("done");
        }

        if (barcode.equals("381280443064")){
            information.setText("INFORMATION");
            name.setText("Florentine Bisque");
            size.setText("8");
            location.setText("3-2-H and 3-2-J");
            done.setText("done");
        }

        if (barcode.equals("381280443081")){
            information.setText("INFORMATION");
            name.setText("Florentine Bisque");
            size.setText("9");
            location.setText("3-2-H and 3-2-J");
            done.setText("done");
        }

        if (barcode.equals("381280443010")){
            information.setText("INFORMATION");
            name.setText("Florentine Bisque");
            size.setText("10");
            location.setText("3-2-H and 3-2-J");
            done.setText("done");
        }

//      Florentine Le Blanc

        if (barcode.equals("381280482025")){
            information.setText("INFORMATION");
            name.setText("Florentine Le Blanc");
            size.setText("5");
            location.setText("3-2-H and 3-2-J");
            done.setText("done");
        }

        if (barcode.equals("381280482036")){
            information.setText("INFORMATION");
            name.setText("Florentine Le Blanc");
            size.setText("6");
            location.setText("3-2-H and 3-2-J");
            done.setText("done");
        }

        if (barcode.equals("381280482049")){
            information.setText("INFORMATION");
            name.setText("Florentine Le Blanc");
            size.setText("7");
            location.setText("3-2-H and 3-2-J");
            done.setText("done");
        }

        if (barcode.equals("381280482064")){
            information.setText("INFORMATION");
            name.setText("Florentine Le Blanc");
            size.setText("8");
            location.setText("3-2-H and 3-2-J");
            done.setText("done");
        }

        if (barcode.equals("381280482081")){
            information.setText("INFORMATION");
            name.setText("Florentine Le Blanc");
            size.setText("9");
            location.setText("3-2-H and 3-2-J");
            done.setText("done");
        }

        if (barcode.equals("381280482010")){
            information.setText("INFORMATION");
            name.setText("Florentine Le Blanc");
            size.setText("10");
            location.setText("3-2-H and 3-2-J");
            done.setText("done");
        }

//      Fraya Creme

        if (barcode.equals("400476694625")){
            information.setText("INFORMATION");
            name.setText("Fraya Creme");
            size.setText("5");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("400476694636")){
            information.setText("INFORMATION");
            name.setText("Fraya Creme");
            size.setText("6");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("400476694649")){
            information.setText("INFORMATION");
            name.setText("Fraya Creme");
            size.setText("7");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("400476694664")){
            information.setText("INFORMATION");
            name.setText("Fraya Creme");
            size.setText("8");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("400476694681")){
            information.setText("INFORMATION");
            name.setText("Fraya Creme");
            size.setText("9");
            location.setText("3-4-M");
            done.setText("done");
        }

//      Fraya Le Blanc 1

        if (barcode.equals("400476637625")){
            information.setText("INFORMATION");
            name.setText("Fraya Le Blanc 1");
            size.setText("5");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("400476637636")){
            information.setText("INFORMATION");
            name.setText("Fraya Le Blanc 1");
            size.setText("6");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("400476637649")){
            information.setText("INFORMATION");
            name.setText("Fraya Le Blanc 1");
            size.setText("7");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("400476637664")){
            information.setText("INFORMATION");
            name.setText("Fraya Le Blanc 1");
            size.setText("8");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("400476637681")){
            information.setText("INFORMATION");
            name.setText("Fraya Le Blanc 1");
            size.setText("9");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("400476637610")){
            information.setText("INFORMATION");
            name.setText("Fraya Le Blanc 1");
            size.setText("10");
            location.setText("3-4-M");
            done.setText("done");
        }

//      Fraya Naturale 1

        if (barcode.equals("400476634425")){
            information.setText("INFORMATION");
            name.setText("Fraya Naturale 1");
            size.setText("5");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("400476634436")){
            information.setText("INFORMATION");
            name.setText("Fraya Naturale 1");
            size.setText("6");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("400476634449")){
            information.setText("INFORMATION");
            name.setText("Fraya Naturale 1");
            size.setText("7");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("400476634464")){
            information.setText("INFORMATION");
            name.setText("Fraya Naturale 1");
            size.setText("8");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("400476634481")){
            information.setText("INFORMATION");
            name.setText("Fraya Naturale 1");
            size.setText("9");
            location.setText("3-4-M");
            done.setText("done");
        }

//      Freda Black

        if (barcode.equals("998964546625")){
            information.setText("INFORMATION");
            name.setText("Freda Black");
            size.setText("5");
            location.setText("3-5-P");
            done.setText("done");
        }

        if (barcode.equals("998964546636")){
            information.setText("INFORMATION");
            name.setText("Freda Black");
            size.setText("6");
            location.setText("3-5-P");
            done.setText("done");
        }

        if (barcode.equals("998964546649")){
            information.setText("INFORMATION");
            name.setText("Freda Black");
            size.setText("7");
            location.setText("3-5-P");
            done.setText("done");
        }

        if (barcode.equals("998964546664")){
            information.setText("INFORMATION");
            name.setText("Freda Black");
            size.setText("8");
            location.setText("3-5-P");
            done.setText("done");
        }

        if (barcode.equals("998964546681")){
            information.setText("INFORMATION");
            name.setText("Freda Black");
            size.setText("9");
            location.setText("3-5-P");
            done.setText("done");
        }

//      Freda Bleu

        if (barcode.equals("998964584925")){
            information.setText("INFORMATION");
            name.setText("Freda Bleu");
            size.setText("5");
            location.setText("3-5-P");
            done.setText("done");
        }

        if (barcode.equals("998964584936")){
            information.setText("INFORMATION");
            name.setText("Freda Bleu");
            size.setText("6");
            location.setText("3-5-P");
            done.setText("done");
        }

        if (barcode.equals("998964584949")){
            information.setText("INFORMATION");
            name.setText("Freda Bleu");
            size.setText("7");
            location.setText("3-5-P");
            done.setText("done");
        }

        if (barcode.equals("998964584964")){
            information.setText("INFORMATION");
            name.setText("Freda Bleu");
            size.setText("8");
            location.setText("3-5-P");
            done.setText("done");
        }

        if (barcode.equals("998964584981")){
            information.setText("INFORMATION");
            name.setText("Freda Bleu");
            size.setText("9");
            location.setText("3-5-P");
            done.setText("done");
        }

//      Freda Daffodil

        if (barcode.equals("998964576725")){
            information.setText("INFORMATION");
            name.setText("Freda Daffodil");
            size.setText("5");
            location.setText("3-5-P");
            done.setText("done");
        }

        if (barcode.equals("998964576736")){
            information.setText("INFORMATION");
            name.setText("Freda Daffodil");
            size.setText("6");
            location.setText("3-5-P");
            done.setText("done");
        }

        if (barcode.equals("998964576749")){
            information.setText("INFORMATION");
            name.setText("Freda Daffodil");
            size.setText("7");
            location.setText("3-5-P");
            done.setText("done");
        }

        if (barcode.equals("998964576764")){
            information.setText("INFORMATION");
            name.setText("Freda Daffodil");
            size.setText("8");
            location.setText("3-5-P");
            done.setText("done");
        }

        if (barcode.equals("998964576781")){
            information.setText("INFORMATION");
            name.setText("Freda Daffodil");
            size.setText("9");
            location.setText("3-5-P");
            done.setText("done");
        }

//      Freda White

        if (barcode.equals("998964565525")){
            information.setText("INFORMATION");
            name.setText("Freda White");
            size.setText("5");
            location.setText("3-5-P");
            done.setText("done");
        }

        if (barcode.equals("998964565536")){
            information.setText("INFORMATION");
            name.setText("Freda White");
            size.setText("6");
            location.setText("3-5-P");
            done.setText("done");
        }

        if (barcode.equals("998964565549")){
            information.setText("INFORMATION");
            name.setText("Freda White");
            size.setText("7");
            location.setText("3-5-P");
            done.setText("done");
        }

        if (barcode.equals("998964565564")){
            information.setText("INFORMATION");
            name.setText("Freda White");
            size.setText("8");
            location.setText("3-5-P");
            done.setText("done");
        }

        if (barcode.equals("998964565581")){
            information.setText("INFORMATION");
            name.setText("Freda White");
            size.setText("9");
            location.setText("3-5-P");
            done.setText("done");
        }

//      Fritz Bleu

        if (barcode.equals("867648184925")){
            information.setText("INFORMATION");
            name.setText("Fritz Bleu");
            size.setText("5");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("867648184936")){
            information.setText("INFORMATION");
            name.setText("Fritz Bleu");
            size.setText("6");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("867648184949")){
            information.setText("INFORMATION");
            name.setText("Fritz Bleu");
            size.setText("7");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("867648184964")){
            information.setText("INFORMATION");
            name.setText("Fritz Bleu");
            size.setText("8");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("867648184981")){
            information.setText("INFORMATION");
            name.setText("Fritz Bleu");
            size.setText("9");
            location.setText("3-4-M");
            done.setText("done");
        }

//      Fritz Noir

        if (barcode.equals("867648138425")){
            information.setText("INFORMATION");
            name.setText("Fritz Noir");
            size.setText("5");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("867648138436")){
            information.setText("INFORMATION");
            name.setText("Fritz Noir");
            size.setText("6");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("867648138449")){
            information.setText("INFORMATION");
            name.setText("Fritz Noir");
            size.setText("7");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("867648138464")){
            information.setText("INFORMATION");
            name.setText("Fritz Noir");
            size.setText("8");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("867648138481")){
            information.setText("INFORMATION");
            name.setText("Fritz Noir");
            size.setText("9");
            location.setText("3-4-M");
            done.setText("done");
        }

//      Fritz Toscana

        if (barcode.equals("867648114725")){
            information.setText("INFORMATION");
            name.setText("Fritz Toscana");
            size.setText("5");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("867648114736")){
            information.setText("INFORMATION");
            name.setText("Fritz Toscana");
            size.setText("6");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("867648114749")){
            information.setText("INFORMATION");
            name.setText("Fritz Toscana");
            size.setText("7");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("867648114764")){
            information.setText("INFORMATION");
            name.setText("Fritz Toscana");
            size.setText("8");
            location.setText("3-4-M");
            done.setText("done");
        }

        if (barcode.equals("867648114781")){
            information.setText("INFORMATION");
            name.setText("Fritz Toscana");
            size.setText("9");
            location.setText("3-4-M");
            done.setText("done");
        }


//      Initial G
//      Gada Le Blanc

        if (barcode.equals("530270982025")){
            information.setText("INFORMATION");
            name.setText("Gada Le Blanc");
            size.setText("5");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("530270982036")){
            information.setText("INFORMATION");
            name.setText("Gada Le Blanc");
            size.setText("6");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("530270982049")){
            information.setText("INFORMATION");
            name.setText("Gada Le Blanc");
            size.setText("7");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("530270982064")){
            information.setText("INFORMATION");
            name.setText("Gada Le Blanc");
            size.setText("8");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("530270982081")){
            information.setText("INFORMATION");
            name.setText("Gada Le Blanc");
            size.setText("9");
            location.setText("3-4-F");
            done.setText("done");
        }

//      Gada Naturale

        if (barcode.equals("530270930325")){
            information.setText("INFORMATION");
            name.setText("Gada Naturale");
            size.setText("5");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("530270930336")){
            information.setText("INFORMATION");
            name.setText("Gada Naturale");
            size.setText("6");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("530270930349")){
            information.setText("INFORMATION");
            name.setText("Gada Naturale");
            size.setText("7");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("530270930364")){
            information.setText("INFORMATION");
            name.setText("Gada Naturale");
            size.setText("8");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("530270930381")){
            information.setText("INFORMATION");
            name.setText("Gada Naturale");
            size.setText("9");
            location.setText("3-4-F");
            done.setText("done");
        }

//      Gada Noir

        if (barcode.equals("530270938425")){
            information.setText("INFORMATION");
            name.setText("Gada Noir");
            size.setText("5");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("530270938436")){
            information.setText("INFORMATION");
            name.setText("Gada Noir");
            size.setText("6");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("530270938449")){
            information.setText("INFORMATION");
            name.setText("Gada Noir");
            size.setText("7");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("530270938464")){
            information.setText("INFORMATION");
            name.setText("Gada Noir");
            size.setText("8");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("530270938481")){
            information.setText("INFORMATION");
            name.setText("Gada Noir");
            size.setText("9");
            location.setText("3-4-F");
            done.setText("done");
        }

//      Gajra Biscotti

        if (barcode.equals("443798921125")){
            information.setText("INFORMATION");
            name.setText("Gajra Biscotti");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("443798921136")){
            information.setText("INFORMATION");
            name.setText("Gajra Biscotti");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("443798921149")){
            information.setText("INFORMATION");
            name.setText("Gajra Biscotti");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("443798921164")){
            information.setText("INFORMATION");
            name.setText("Gajra Biscotti");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("443798921181")){
            information.setText("INFORMATION");
            name.setText("Gajra Biscotti");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Gajra Fleur

        if (barcode.equals("443798937625")){
            information.setText("INFORMATION");
            name.setText("Gajra Fleur");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("443798937636")){
            information.setText("INFORMATION");
            name.setText("Gajra Fleur");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("443798937649")){
            information.setText("INFORMATION");
            name.setText("Gajra Fleur");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("443798937664")){
            information.setText("INFORMATION");
            name.setText("Gajra Fleur");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("443798937681")){
            information.setText("INFORMATION");
            name.setText("Gajra Fleur");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Gajra Le Blanc

        if (barcode.equals("443798982025")){
            information.setText("INFORMATION");
            name.setText("Gajra Le Blanc");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("443798982036")){
            information.setText("INFORMATION");
            name.setText("Gajra Le Blanc");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("443798982049")){
            information.setText("INFORMATION");
            name.setText("Gajra Le Blanc");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("443798982064")){
            information.setText("INFORMATION");
            name.setText("Gajra Le Blanc");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("443798982081")){
            information.setText("INFORMATION");
            name.setText("Gajra Le Blanc");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Galea Biscotti

        if (barcode.equals("686558421125")){
            information.setText("INFORMATION");
            name.setText("Galea Biscotti");
            size.setText("5");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("686558421136")){
            information.setText("INFORMATION");
            name.setText("Galea Biscotti");
            size.setText("6");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("686558421149")){
            information.setText("INFORMATION");
            name.setText("Galea Biscotti");
            size.setText("7");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("686558421164")){
            information.setText("INFORMATION");
            name.setText("Galea Biscotti");
            size.setText("8");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("686558421181")){
            information.setText("INFORMATION");
            name.setText("Galea Biscotti");
            size.setText("9");
            location.setText("3-4-F");
            done.setText("done");
        }

//      Galea Toscana

        if (barcode.equals("686558414725")){
            information.setText("INFORMATION");
            name.setText("Galea Toscana");
            size.setText("5");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("686558414736")){
            information.setText("INFORMATION");
            name.setText("Galea Toscana");
            size.setText("6");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("686558414749")){
            information.setText("INFORMATION");
            name.setText("Galea Toscana");
            size.setText("7");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("686558414764")){
            information.setText("INFORMATION");
            name.setText("Galea Toscana");
            size.setText("8");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("686558414781")){
            information.setText("INFORMATION");
            name.setText("Galea Toscana");
            size.setText("9");
            location.setText("3-4-F");
            done.setText("done");
        }

//      Galea White

        if (barcode.equals("686558465525")){
            information.setText("INFORMATION");
            name.setText("Galea White");
            size.setText("5");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("686558465536")){
            information.setText("INFORMATION");
            name.setText("Galea White");
            size.setText("6");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("686558465549")){
            information.setText("INFORMATION");
            name.setText("Galea White");
            size.setText("7");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("686558465564")){
            information.setText("INFORMATION");
            name.setText("Galea White");
            size.setText("8");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("686558465581")){
            information.setText("INFORMATION");
            name.setText("Galea White");
            size.setText("9");
            location.setText("3-4-F");
            done.setText("done");
        }

//      Gali Le Blanc

        if (barcode.equals("981010882025")){
            information.setText("INFORMATION");
            name.setText("Gali Le Blanc");
            size.setText("5");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

        if (barcode.equals("981010882036")){
            information.setText("INFORMATION");
            name.setText("Gali Le Blanc");
            size.setText("6");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

        if (barcode.equals("981010882049")){
            information.setText("INFORMATION");
            name.setText("Gali Le Blanc");
            size.setText("7");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

        if (barcode.equals("981010882064")){
            information.setText("INFORMATION");
            name.setText("Gali Le Blanc");
            size.setText("8");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

        if (barcode.equals("981010882081")){
            information.setText("INFORMATION");
            name.setText("Gali Le Blanc");
            size.setText("9");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

        if (barcode.equals("981010882010")){
            information.setText("INFORMATION");
            name.setText("Gali Le Blanc");
            size.setText("10");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

//      Gali Naturale

        if (barcode.equals("981010830325")){
            information.setText("INFORMATION");
            name.setText("Gali Naturale");
            size.setText("5");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

        if (barcode.equals("981010830336")){
            information.setText("INFORMATION");
            name.setText("Gali Naturale");
            size.setText("6");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

        if (barcode.equals("981010830349")){
            information.setText("INFORMATION");
            name.setText("Gali Naturale");
            size.setText("7");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

        if (barcode.equals("981010830364")){
            information.setText("INFORMATION");
            name.setText("Gali Naturale");
            size.setText("8");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

        if (barcode.equals("981010830381")){
            information.setText("INFORMATION");
            name.setText("Gali Naturale");
            size.setText("9");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

        if (barcode.equals("981010830310")){
            information.setText("INFORMATION");
            name.setText("Gali Naturale");
            size.setText("10");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

//      Gali Oceane

        if (barcode.equals("981010897425")){
            information.setText("INFORMATION");
            name.setText("Gali Oceane");
            size.setText("5");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

        if (barcode.equals("981010897436")){
            information.setText("INFORMATION");
            name.setText("Gali Oceane");
            size.setText("6");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

        if (barcode.equals("981010897449")){
            information.setText("INFORMATION");
            name.setText("Gali Oceane");
            size.setText("7");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

        if (barcode.equals("981010897464")){
            information.setText("INFORMATION");
            name.setText("Gali Oceane");
            size.setText("8");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

        if (barcode.equals("981010897481")){
            information.setText("INFORMATION");
            name.setText("Gali Oceane");
            size.setText("9");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

        if (barcode.equals("981010897410")){
            information.setText("INFORMATION");
            name.setText("Gali Oceane");
            size.setText("10");
            location.setText("3-6-C and 3-6-E");
            done.setText("done");
        }

//      Galia Blue Mist

        if (barcode.equals("959679056525")){
            information.setText("INFORMATION");
            name.setText("Galia Blue Mist");
            size.setText("5");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("959679056536")){
            information.setText("INFORMATION");
            name.setText("Galia Blue Mist");
            size.setText("6");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("959679056549")){
            information.setText("INFORMATION");
            name.setText("Galia Blue Mist");
            size.setText("7");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("959679056564")){
            information.setText("INFORMATION");
            name.setText("Galia Blue Mist");
            size.setText("8");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("959679056581")){
            information.setText("INFORMATION");
            name.setText("Galia Blue Mist");
            size.setText("9");
            location.setText("3-4-F");
            done.setText("done");
        }

//      Galia Periwinkle

        if (barcode.equals("959679029825")){
            information.setText("INFORMATION");
            name.setText("Galia Periwinkle");
            size.setText("5");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("959679029836")){
            information.setText("INFORMATION");
            name.setText("Galia Periwinkle");
            size.setText("6");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("959679029849")){
            information.setText("INFORMATION");
            name.setText("Galia Periwinkle");
            size.setText("7");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("959679029864")){
            information.setText("INFORMATION");
            name.setText("Galia Periwinkle");
            size.setText("8");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("959679029881")){
            information.setText("INFORMATION");
            name.setText("Galia Periwinkle");
            size.setText("9");
            location.setText("3-4-F");
            done.setText("done");
        }

//      Galia White

        if (barcode.equals("959679065525")){
            information.setText("INFORMATION");
            name.setText("Galia White");
            size.setText("5");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("959679065536")){
            information.setText("INFORMATION");
            name.setText("Galia White");
            size.setText("6");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("959679065549")){
            information.setText("INFORMATION");
            name.setText("Galia White");
            size.setText("7");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("959679065564")){
            information.setText("INFORMATION");
            name.setText("Galia White");
            size.setText("8");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("959679065581")){
            information.setText("INFORMATION");
            name.setText("Galia White");
            size.setText("9");
            location.setText("3-4-F");
            done.setText("done");
        }

//      Gauri Biscotti

        if (barcode.equals("133338921125")){
            information.setText("INFORMATION");
            name.setText("Gauri Biscotti");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338921136")){
            information.setText("INFORMATION");
            name.setText("Gauri Biscotti");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338921149")){
            information.setText("INFORMATION");
            name.setText("Gauri Biscotti");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338921164")){
            information.setText("INFORMATION");
            name.setText("Gauri Biscotti");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338921181")){
            information.setText("INFORMATION");
            name.setText("Gauri Biscotti");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Gauri Black

        if (barcode.equals("133338946625")){
            information.setText("INFORMATION");
            name.setText("Gauri Black");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338946636")){
            information.setText("INFORMATION");
            name.setText("Gauri Black");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338946649")){
            information.setText("INFORMATION");
            name.setText("Gauri Black");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338946664")){
            information.setText("INFORMATION");
            name.setText("Gauri Black");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338946681")){
            information.setText("INFORMATION");
            name.setText("Gauri Black");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Gauri Caramel

        if (barcode.equals("133338954325")){
            information.setText("INFORMATION");
            name.setText("Gauri Caramel");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338954336")){
            information.setText("INFORMATION");
            name.setText("Gauri Caramel");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338954349")){
            information.setText("INFORMATION");
            name.setText("Gauri Caramel");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338954364")){
            information.setText("INFORMATION");
            name.setText("Gauri Caramel");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338954381")){
            information.setText("INFORMATION");
            name.setText("Gauri Caramel");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Gauri Lilac

        if (barcode.equals("133338912125")){
            information.setText("INFORMATION");
            name.setText("Gauri Lilac");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338912136")){
            information.setText("INFORMATION");
            name.setText("Gauri Lilac");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338912149")){
            information.setText("INFORMATION");
            name.setText("Gauri Lilac");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338912164")){
            information.setText("INFORMATION");
            name.setText("Gauri Lilac");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338912181")){
            information.setText("INFORMATION");
            name.setText("Gauri Lilac");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Gauri Rosewater

        if (barcode.equals("133338948125")){
            information.setText("INFORMATION");
            name.setText("Gauri Rosewater");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338948136")){
            information.setText("INFORMATION");
            name.setText("Gauri Rosewater");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338948149")){
            information.setText("INFORMATION");
            name.setText("Gauri Rosewater");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338948164")){
            information.setText("INFORMATION");
            name.setText("Gauri Rosewater");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338948181")){
            information.setText("INFORMATION");
            name.setText("Gauri Rosewater");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Gauri Tangerine

        if (barcode.equals("133338927725")){
            information.setText("INFORMATION");
            name.setText("Gauri Tangerine");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338927736")){
            information.setText("INFORMATION");
            name.setText("Gauri Tangerine");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338927749")){
            information.setText("INFORMATION");
            name.setText("Gauri Tangerine");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338927764")){
            information.setText("INFORMATION");
            name.setText("Gauri Tangerine");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338927781")){
            information.setText("INFORMATION");
            name.setText("Gauri Tangerine");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Gauri White

        if (barcode.equals("133338965525")){
            information.setText("INFORMATION");
            name.setText("Gauri White");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338965536")){
            information.setText("INFORMATION");
            name.setText("Gauri White");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338965549")){
            information.setText("INFORMATION");
            name.setText("Gauri White");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338965564")){
            information.setText("INFORMATION");
            name.setText("Gauri White");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338965581")){
            information.setText("INFORMATION");
            name.setText("Gauri White");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Gauri Wine Red

        if (barcode.equals("133338934625")){
            information.setText("INFORMATION");
            name.setText("Gauri Wine Red");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338934636")){
            information.setText("INFORMATION");
            name.setText("Gauri Wine Red");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338934649")){
            information.setText("INFORMATION");
            name.setText("Gauri Wine Red");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338934664")){
            information.setText("INFORMATION");
            name.setText("Gauri Wine Red");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("133338934681")){
            information.setText("INFORMATION");
            name.setText("Gauri Wine Red");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Gayatri Le Blanc

        if (barcode.equals("169920482025")){
            information.setText("INFORMATION");
            name.setText("Gayatri Le Blanc");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("169920482036")){
            information.setText("INFORMATION");
            name.setText("Gayatri Le Blanc");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("169920482049")){
            information.setText("INFORMATION");
            name.setText("Gayatri Le Blanc");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("169920482064")){
            information.setText("INFORMATION");
            name.setText("Gayatri Le Blanc");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("169920482081")){
            information.setText("INFORMATION");
            name.setText("Gayatri Le Blanc");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("169920482010")){
            information.setText("INFORMATION");
            name.setText("Gayatri Le Blanc");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Gayatri Naturale

        if (barcode.equals("169920430325")){
            information.setText("INFORMATION");
            name.setText("Gayatri Naturale");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("169920430336")){
            information.setText("INFORMATION");
            name.setText("Gayatri Naturale");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("169920430349")){
            information.setText("INFORMATION");
            name.setText("Gayatri Naturale");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("169920430364")){
            information.setText("INFORMATION");
            name.setText("Gayatri Naturale");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("169920430381")){
            information.setText("INFORMATION");
            name.setText("Gayatri Naturale");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("169920430310")){
            information.setText("INFORMATION");
            name.setText("Gayatri Naturale");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Gayatri Toscana

        if (barcode.equals("169920414725")){
            information.setText("INFORMATION");
            name.setText("Gayatri Toscana");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("169920414736")){
            information.setText("INFORMATION");
            name.setText("Gayatri Toscana");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("169920414749")){
            information.setText("INFORMATION");
            name.setText("Gayatri Toscana");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("169920414764")){
            information.setText("INFORMATION");
            name.setText("Gayatri Toscana");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("169920414781")){
            information.setText("INFORMATION");
            name.setText("Gayatri Toscana");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("169920414710")){
            information.setText("INFORMATION");
            name.setText("Gayatri Toscana");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Georgina Nude

        if (barcode.equals("838345145425")){
            information.setText("INFORMATION");
            name.setText("Georgina Nude");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("838345145436")){
            information.setText("INFORMATION");
            name.setText("Georgina Nude");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("838345145449")){
            information.setText("INFORMATION");
            name.setText("Georgina Nude");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("838345145464")){
            information.setText("INFORMATION");
            name.setText("Georgina Nude");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("838345145481")){
            information.setText("INFORMATION");
            name.setText("Georgina Nude");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("838345145410")){
            information.setText("INFORMATION");
            name.setText("Georgina Nude");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Gerta Mist

        if (barcode.equals("150747868125")){
            information.setText("INFORMATION");
            name.setText("Gerta Mist");
            size.setText("5");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

        if (barcode.equals("150747868136")){
            information.setText("INFORMATION");
            name.setText("Gerta Mist");
            size.setText("6");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

        if (barcode.equals("150747868149")){
            information.setText("INFORMATION");
            name.setText("Gerta Mist");
            size.setText("7");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

        if (barcode.equals("150747868164")){
            information.setText("INFORMATION");
            name.setText("Gerta Mist");
            size.setText("8");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

        if (barcode.equals("150747868181")){
            information.setText("INFORMATION");
            name.setText("Gerta Mist");
            size.setText("9");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

//      Gerta Naturale

        if (barcode.equals("150747830325")){
            information.setText("INFORMATION");
            name.setText("Gerta Naturale");
            size.setText("5");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

        if (barcode.equals("150747830336")){
            information.setText("INFORMATION");
            name.setText("Gerta Naturale");
            size.setText("6");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

        if (barcode.equals("150747830349")){
            information.setText("INFORMATION");
            name.setText("Gerta Naturale");
            size.setText("7");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

        if (barcode.equals("150747830364")){
            information.setText("INFORMATION");
            name.setText("Gerta Naturale");
            size.setText("8");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

        if (barcode.equals("150747830381")){
            information.setText("INFORMATION");
            name.setText("Gerta Naturale");
            size.setText("9");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

//      Gerta Toscana

        if (barcode.equals("150747814725")){
            information.setText("INFORMATION");
            name.setText("Gerta Toscana");
            size.setText("5");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

        if (barcode.equals("150747814736")){
            information.setText("INFORMATION");
            name.setText("Gerta Toscana");
            size.setText("6");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

        if (barcode.equals("150747814749")){
            information.setText("INFORMATION");
            name.setText("Gerta Toscana");
            size.setText("7");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

        if (barcode.equals("150747814764")){
            information.setText("INFORMATION");
            name.setText("Gerta Toscana");
            size.setText("8");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

        if (barcode.equals("150747814781")){
            information.setText("INFORMATION");
            name.setText("Gerta Toscana");
            size.setText("9");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

//      Gerta White

        if (barcode.equals("150747865525")){
            information.setText("INFORMATION");
            name.setText("Gerta White");
            size.setText("5");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

        if (barcode.equals("150747865536")){
            information.setText("INFORMATION");
            name.setText("Gerta White");
            size.setText("6");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

        if (barcode.equals("150747865549")){
            information.setText("INFORMATION");
            name.setText("Gerta White");
            size.setText("7");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

        if (barcode.equals("150747865564")){
            information.setText("INFORMATION");
            name.setText("Gerta White");
            size.setText("8");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

        if (barcode.equals("150747865581")){
            information.setText("INFORMATION");
            name.setText("Gerta White");
            size.setText("9");
            location.setText("3-4-N and 3-6-P");
            done.setText("done");
        }

//      Giada Black

        if (barcode.equals("485729146625")){
            information.setText("INFORMATION");
            name.setText("Giada Black");
            size.setText("5");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

        if (barcode.equals("485729146636")){
            information.setText("INFORMATION");
            name.setText("Giada Black");
            size.setText("6");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

        if (barcode.equals("485729146649")){
            information.setText("INFORMATION");
            name.setText("Giada Black");
            size.setText("7");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

        if (barcode.equals("485729146664")){
            information.setText("INFORMATION");
            name.setText("Giada Black");
            size.setText("8");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

        if (barcode.equals("485729146681")){
            information.setText("INFORMATION");
            name.setText("Giada Black");
            size.setText("9");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

//      Giada Rosette

        if (barcode.equals("485729149325")){
            information.setText("INFORMATION");
            name.setText("Giada Rosette");
            size.setText("5");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

        if (barcode.equals("485729149336")){
            information.setText("INFORMATION");
            name.setText("Giada Rosette");
            size.setText("6");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

        if (barcode.equals("485729149349")){
            information.setText("INFORMATION");
            name.setText("Giada Rosette");
            size.setText("7");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

        if (barcode.equals("485729149364")){
            information.setText("INFORMATION");
            name.setText("Giada Rosette");
            size.setText("8");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

        if (barcode.equals("485729149381")){
            information.setText("INFORMATION");
            name.setText("Giada Rosette");
            size.setText("9");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

//      Giada Toast

        if (barcode.equals("485729127325")){
            information.setText("INFORMATION");
            name.setText("Giada Toast");
            size.setText("5");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

        if (barcode.equals("485729127336")){
            information.setText("INFORMATION");
            name.setText("Giada Toast");
            size.setText("6");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

        if (barcode.equals("485729127349")){
            information.setText("INFORMATION");
            name.setText("Giada Toast");
            size.setText("7");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

        if (barcode.equals("485729127364")){
            information.setText("INFORMATION");
            name.setText("Giada Toast");
            size.setText("8");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

        if (barcode.equals("485729127381")){
            information.setText("INFORMATION");
            name.setText("Giada Toast");
            size.setText("9");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

//      Giada White

        if (barcode.equals("485729165525")){
            information.setText("INFORMATION");
            name.setText("Giada White");
            size.setText("5");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

        if (barcode.equals("485729165536")){
            information.setText("INFORMATION");
            name.setText("Giada White");
            size.setText("6");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

        if (barcode.equals("485729165549")){
            information.setText("INFORMATION");
            name.setText("Giada White");
            size.setText("7");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

        if (barcode.equals("485729165564")){
            information.setText("INFORMATION");
            name.setText("Giada White");
            size.setText("8");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

        if (barcode.equals("485729165581")){
            information.setText("INFORMATION");
            name.setText("Giada White");
            size.setText("9");
            location.setText("3-4-H and 3-4-J and 3-6-M");
            done.setText("done");
        }

//      Giavanna Creme

        if (barcode.equals("596449194625")){
            information.setText("INFORMATION");
            name.setText("Giavanna Creme");
            size.setText("5");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("596449194636")){
            information.setText("INFORMATION");
            name.setText("Giavanna Creme");
            size.setText("6");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("596449194649")){
            information.setText("INFORMATION");
            name.setText("Giavanna Creme");
            size.setText("7");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("596449194664")){
            information.setText("INFORMATION");
            name.setText("Giavanna Creme");
            size.setText("8");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("596449194681")){
            information.setText("INFORMATION");
            name.setText("Giavanna Creme");
            size.setText("9");
            location.setText("3-4-F");
            done.setText("done");
        }

//      Giavanna Noir

        if (barcode.equals("596449138425")){
            information.setText("INFORMATION");
            name.setText("Giavanna Noir");
            size.setText("5");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("596449138436")){
            information.setText("INFORMATION");
            name.setText("Giavanna Noir");
            size.setText("6");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("596449138449")){
            information.setText("INFORMATION");
            name.setText("Giavanna Noir");
            size.setText("7");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("596449138464")){
            information.setText("INFORMATION");
            name.setText("Giavanna Noir");
            size.setText("8");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("596449138481")){
            information.setText("INFORMATION");
            name.setText("Giavanna Noir");
            size.setText("9");
            location.setText("3-4-F");
            done.setText("done");
        }

//      Giavanna Toscana

        if (barcode.equals("596449114725")){
            information.setText("INFORMATION");
            name.setText("Giavanna Toscana");
            size.setText("5");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("596449114736")){
            information.setText("INFORMATION");
            name.setText("Giavanna Toscana");
            size.setText("6");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("596449114749")){
            information.setText("INFORMATION");
            name.setText("Giavanna Toscana");
            size.setText("7");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("596449114764")){
            information.setText("INFORMATION");
            name.setText("Giavanna Toscana");
            size.setText("8");
            location.setText("3-4-F");
            done.setText("done");
        }

        if (barcode.equals("596449114781")){
            information.setText("INFORMATION");
            name.setText("Giavanna Toscana");
            size.setText("9");
            location.setText("3-4-F");
            done.setText("done");
        }

//      Gita Biscotti

        if (barcode.equals("227155821125")){
            information.setText("INFORMATION");
            name.setText("Gita Biscotti");
            size.setText("5");
            location.setText("3-4-L");
            done.setText("done");
        }

        if (barcode.equals("227155821136")){
            information.setText("INFORMATION");
            name.setText("Gita Biscotti");
            size.setText("6");
            location.setText("3-4-L");
            done.setText("done");
        }

        if (barcode.equals("227155821149")){
            information.setText("INFORMATION");
            name.setText("Gita Biscotti");
            size.setText("7");
            location.setText("3-4-L");
            done.setText("done");
        }

        if (barcode.equals("227155821164")){
            information.setText("INFORMATION");
            name.setText("Gita Biscotti");
            size.setText("8");
            location.setText("3-4-L");
            done.setText("done");
        }

        if (barcode.equals("227155821181")){
            information.setText("INFORMATION");
            name.setText("Gita Biscotti");
            size.setText("9");
            location.setText("3-4-L");
            done.setText("done");
        }

//      Gita Black

        if (barcode.equals("227155846625")){
            information.setText("INFORMATION");
            name.setText("Gita Black");
            size.setText("5");
            location.setText("3-4-L");
            done.setText("done");
        }

        if (barcode.equals("227155846636")){
            information.setText("INFORMATION");
            name.setText("Gita Black");
            size.setText("6");
            location.setText("3-4-L");
            done.setText("done");
        }

        if (barcode.equals("227155846649")){
            information.setText("INFORMATION");
            name.setText("Gita Black");
            size.setText("7");
            location.setText("3-4-L");
            done.setText("done");
        }

        if (barcode.equals("227155846664")){
            information.setText("INFORMATION");
            name.setText("Gita Black");
            size.setText("8");
            location.setText("3-4-L");
            done.setText("done");
        }

        if (barcode.equals("227155846681")){
            information.setText("INFORMATION");
            name.setText("Gita Black");
            size.setText("9");
            location.setText("3-4-L");
            done.setText("done");
        }

//      Gita Naturale

        if (barcode.equals("227155897625")){
            information.setText("INFORMATION");
            name.setText("Gita Naturale");
            size.setText("5");
            location.setText("3-4-L");
            done.setText("done");
        }

        if (barcode.equals("227155897636")){
            information.setText("INFORMATION");
            name.setText("Gita Naturale");
            size.setText("6");
            location.setText("3-4-L");
            done.setText("done");
        }

        if (barcode.equals("227155897649")){
            information.setText("INFORMATION");
            name.setText("Gita Naturale");
            size.setText("7");
            location.setText("3-4-L");
            done.setText("done");
        }

        if (barcode.equals("227155897664")){
            information.setText("INFORMATION");
            name.setText("Gita Naturale");
            size.setText("8");
            location.setText("3-4-L");
            done.setText("done");
        }

        if (barcode.equals("227155897681")){
            information.setText("INFORMATION");
            name.setText("Gita Naturale");
            size.setText("9");
            location.setText("3-4-L");
            done.setText("done");
        }

//      Gita Toscana

        if (barcode.equals("227155814725")){
            information.setText("INFORMATION");
            name.setText("Gita Toscana");
            size.setText("5");
            location.setText("3-4-L");
            done.setText("done");
        }

        if (barcode.equals("227155814736")){
            information.setText("INFORMATION");
            name.setText("Gita Toscana");
            size.setText("6");
            location.setText("3-4-L");
            done.setText("done");
        }

        if (barcode.equals("227155814749")){
            information.setText("INFORMATION");
            name.setText("Gita Toscana");
            size.setText("7");
            location.setText("3-4-L");
            done.setText("done");
        }

        if (barcode.equals("227155814764")){
            information.setText("INFORMATION");
            name.setText("Gita Toscana");
            size.setText("8");
            location.setText("3-4-L");
            done.setText("done");
        }

        if (barcode.equals("227155814781")){
            information.setText("INFORMATION");
            name.setText("Gita Toscana");
            size.setText("9");
            location.setText("3-4-L");
            done.setText("done");
        }


//      Initial H
//      Hada Biscotti

        if (barcode.equals("590313921125")){
            information.setText("INFORMATION");
            name.setText("Hada Biscotti");
            size.setText("5");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313921136")){
            information.setText("INFORMATION");
            name.setText("Hada Biscotti");
            size.setText("6");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313921149")){
            information.setText("INFORMATION");
            name.setText("Hada Biscotti");
            size.setText("7");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313921164")){
            information.setText("INFORMATION");
            name.setText("Hada Biscotti");
            size.setText("8");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313921181")){
            information.setText("INFORMATION");
            name.setText("Hada Biscotti");
            size.setText("9");
            location.setText("3-5-J");
            done.setText("done");
        }

//      Hada Cashew

        if (barcode.equals("590313968725")){
            information.setText("INFORMATION");
            name.setText("Hada Cashew");
            size.setText("5");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313968736")){
            information.setText("INFORMATION");
            name.setText("Hada Cashew");
            size.setText("6");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313968749")){
            information.setText("INFORMATION");
            name.setText("Hada Cashew");
            size.setText("7");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313968764")){
            information.setText("INFORMATION");
            name.setText("Hada Cashew");
            size.setText("8");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313968781")){
            information.setText("INFORMATION");
            name.setText("Hada Cashew");
            size.setText("9");
            location.setText("3-5-J");
            done.setText("done");
        }

//      Hada Mauve

        if (barcode.equals("590313944225")){
            information.setText("INFORMATION");
            name.setText("Hada Mauve");
            size.setText("5");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313944236")){
            information.setText("INFORMATION");
            name.setText("Hada Mauve");
            size.setText("6");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313944249")){
            information.setText("INFORMATION");
            name.setText("Hada Mauve");
            size.setText("7");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313944264")){
            information.setText("INFORMATION");
            name.setText("Hada Mauve");
            size.setText("8");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313944281")){
            information.setText("INFORMATION");
            name.setText("Hada Mauve");
            size.setText("9");
            location.setText("3-5-J");
            done.setText("done");
        }

//      Hada Nude

        if (barcode.equals("590313945425")){
            information.setText("INFORMATION");
            name.setText("Hada Nude");
            size.setText("5");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313945436")){
            information.setText("INFORMATION");
            name.setText("Hada Nude");
            size.setText("6");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313945436")){
            information.setText("INFORMATION");
            name.setText("Hada Nude");
            size.setText("7");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313945464")){
            information.setText("INFORMATION");
            name.setText("Hada Nude");
            size.setText("8");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313945481")){
            information.setText("INFORMATION");
            name.setText("Hada Nude");
            size.setText("9");
            location.setText("3-5-J");
            done.setText("done");
        }

//      Hada White

        if (barcode.equals("590313965525")){
            information.setText("INFORMATION");
            name.setText("Hada White");
            size.setText("5");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313965536")){
            information.setText("INFORMATION");
            name.setText("Hada White");
            size.setText("6");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313965549")){
            information.setText("INFORMATION");
            name.setText("Hada White");
            size.setText("7");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313965564")){
            information.setText("INFORMATION");
            name.setText("Hada White");
            size.setText("8");
            location.setText("3-5-J");
            done.setText("done");
        }

        if (barcode.equals("590313965581")){
            information.setText("INFORMATION");
            name.setText("Hada White");
            size.setText("9");
            location.setText("3-5-J");
            done.setText("done");
        }

//      Hadiya Aqua

        if (barcode.equals("274488825125")){
            information.setText("INFORMATION");
            name.setText("Hadiya Aqua");
            size.setText("5");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

        if (barcode.equals("274488825136")){
            information.setText("INFORMATION");
            name.setText("Hadiya Aqua");
            size.setText("6");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

        if (barcode.equals("274488825149")){
            information.setText("INFORMATION");
            name.setText("Hadiya Aqua");
            size.setText("7");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

        if (barcode.equals("274488825164")){
            information.setText("INFORMATION");
            name.setText("Hadiya Aqua");
            size.setText("8");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

        if (barcode.equals("274488825181")){
            information.setText("INFORMATION");
            name.setText("Hadiya Aqua");
            size.setText("9");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

//      Hadiya Cashew

        if (barcode.equals("274488868725")){
            information.setText("INFORMATION");
            name.setText("Hadiya Cashew");
            size.setText("5");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

        if (barcode.equals("274488868736")){
            information.setText("INFORMATION");
            name.setText("Hadiya Cashew");
            size.setText("6");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

        if (barcode.equals("274488868749")){
            information.setText("INFORMATION");
            name.setText("Hadiya Cashew");
            size.setText("7");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

        if (barcode.equals("274488868764")){
            information.setText("INFORMATION");
            name.setText("Hadiya Cashew");
            size.setText("8");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

        if (barcode.equals("274488868781")){
            information.setText("INFORMATION");
            name.setText("Hadiya Cashew");
            size.setText("9");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

//      Hadiya Orchid

        if (barcode.equals("274488814325")){
            information.setText("INFORMATION");
            name.setText("Hadiya Orchid");
            size.setText("5");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

        if (barcode.equals("274488814336")){
            information.setText("INFORMATION");
            name.setText("Hadiya Orchid");
            size.setText("6");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

        if (barcode.equals("274488814349")){
            information.setText("INFORMATION");
            name.setText("Hadiya Orchid");
            size.setText("7");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

        if (barcode.equals("274488814364")){
            information.setText("INFORMATION");
            name.setText("Hadiya Orchid");
            size.setText("8");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

        if (barcode.equals("274488814381")){
            information.setText("INFORMATION");
            name.setText("Hadiya Orchid");
            size.setText("9");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

//      Hadiya White

        if (barcode.equals("274488865525")){
            information.setText("INFORMATION");
            name.setText("Hadiya White");
            size.setText("5");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

        if (barcode.equals("274488865536")){
            information.setText("INFORMATION");
            name.setText("Hadiya White");
            size.setText("6");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

        if (barcode.equals("274488865549")){
            information.setText("INFORMATION");
            name.setText("Hadiya White");
            size.setText("7");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

        if (barcode.equals("274488865564")){
            information.setText("INFORMATION");
            name.setText("Hadiya White");
            size.setText("8");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

        if (barcode.equals("274488865581")){
            information.setText("INFORMATION");
            name.setText("Hadiya White");
            size.setText("9");
            location.setText("3-4-B and 3-5-B");
            done.setText("done");
        }

//      Hailey Black

        if (barcode.equals("311635446625")){
            information.setText("INFORMATION");
            name.setText("Hailey Black");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("311635446636")){
            information.setText("INFORMATION");
            name.setText("Hailey Black");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("311635446649")){
            information.setText("INFORMATION");
            name.setText("Hailey Black");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("311635446664")){
            information.setText("INFORMATION");
            name.setText("Hailey Black");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("311635446681")){
            information.setText("INFORMATION");
            name.setText("Hailey Black");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("311635446610")){
            information.setText("INFORMATION");
            name.setText("Hailey Black");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Hailey Caramel

        if (barcode.equals("311635454325")){
            information.setText("INFORMATION");
            name.setText("Hailey Caramel");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("311635454336")){
            information.setText("INFORMATION");
            name.setText("Hailey Caramel");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("311635454349")){
            information.setText("INFORMATION");
            name.setText("Hailey Caramel");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("311635454364")){
            information.setText("INFORMATION");
            name.setText("Hailey Caramel");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("311635454381")){
            information.setText("INFORMATION");
            name.setText("Hailey Caramel");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Hailey Nude

        if (barcode.equals("311635445425")){
            information.setText("INFORMATION");
            name.setText("Hailey Nude");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("311635445436")){
            information.setText("INFORMATION");
            name.setText("Hailey Nude");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("311635445449")){
            information.setText("INFORMATION");
            name.setText("Hailey Nude");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("311635445464")){
            information.setText("INFORMATION");
            name.setText("Hailey Nude");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("311635445481")){
            information.setText("INFORMATION");
            name.setText("Hailey Nude");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Hailey White

        if (barcode.equals("311635465525")){
            information.setText("INFORMATION");
            name.setText("Hailey White");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("311635465536")){
            information.setText("INFORMATION");
            name.setText("Hailey White");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("311635465549")){
            information.setText("INFORMATION");
            name.setText("Hailey White");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("311635465564")){
            information.setText("INFORMATION");
            name.setText("Hailey White");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("311635465581")){
            information.setText("INFORMATION");
            name.setText("Hailey White");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Haira Le Blanc

        if (barcode.equals("716583482025")){
            information.setText("INFORMATION");
            name.setText("Haira Le Blanc");
            size.setText("5");
            location.setText("3-6-G and 3-6-I");
            done.setText("done");
        }

        if (barcode.equals("716583482036")){
            information.setText("INFORMATION");
            name.setText("Haira Le Blanc");
            size.setText("6");
            location.setText("3-6-G and 3-6-I");
            done.setText("done");
        }

        if (barcode.equals("716583482049")){
            information.setText("INFORMATION");
            name.setText("Haira Le Blanc");
            size.setText("7");
            location.setText("3-6-G and 3-6-I");
            done.setText("done");
        }

        if (barcode.equals("716583482064")){
            information.setText("INFORMATION");
            name.setText("Haira Le Blanc");
            size.setText("8");
            location.setText("3-6-G and 3-6-I");
            done.setText("done");
        }

        if (barcode.equals("716583482081")){
            information.setText("INFORMATION");
            name.setText("Haira Le Blanc");
            size.setText("9");
            location.setText("3-6-G and 3-6-I");
            done.setText("done");
        }

        if (barcode.equals("716583482010")){
            information.setText("INFORMATION");
            name.setText("Haira Le Blanc");
            size.setText("10");
            location.setText("3-6-G and 3-6-I");
            done.setText("done");
        }

//      Haira Naturale

        if (barcode.equals("716583430325")){
            information.setText("INFORMATION");
            name.setText("Haira Naturale");
            size.setText("5");
            location.setText("3-6-G and 3-6-I");
            done.setText("done");
        }

        if (barcode.equals("716583430336")){
            information.setText("INFORMATION");
            name.setText("Haira Naturale");
            size.setText("6");
            location.setText("3-6-G and 3-6-I");
            done.setText("done");
        }

        if (barcode.equals("716583430349")){
            information.setText("INFORMATION");
            name.setText("Haira Naturale");
            size.setText("7");
            location.setText("3-6-G and 3-6-I");
            done.setText("done");
        }

        if (barcode.equals("716583430364")){
            information.setText("INFORMATION");
            name.setText("Haira Naturale");
            size.setText("8");
            location.setText("3-6-G and 3-6-I");
            done.setText("done");
        }

        if (barcode.equals("716583430381")){
            information.setText("INFORMATION");
            name.setText("Haira Naturale");
            size.setText("9");
            location.setText("3-6-G and 3-6-I");
            done.setText("done");
        }

        if (barcode.equals("716583430310")){
            information.setText("INFORMATION");
            name.setText("Haira Naturale");
            size.setText("10");
            location.setText("3-6-G and 3-6-I");
            done.setText("done");
        }

//      Hajra Biscotti

        if (barcode.equals("388543721125")){
            information.setText("INFORMATION");
            name.setText("Hajra Biscotti");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543721136")){
            information.setText("INFORMATION");
            name.setText("Hajra Biscotti");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543721149")){
            information.setText("INFORMATION");
            name.setText("Hajra Biscotti");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543721164")){
            information.setText("INFORMATION");
            name.setText("Hajra Biscotti");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543721181")){
            information.setText("INFORMATION");
            name.setText("Hajra Biscotti");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543721110")){
            information.setText("INFORMATION");
            name.setText("Hajra Biscotti");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Hajra Creme

        if (barcode.equals("388543794625")){
            information.setText("INFORMATION");
            name.setText("Hajra Creme");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543794636")){
            information.setText("INFORMATION");
            name.setText("Hajra Creme");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543794649")){
            information.setText("INFORMATION");
            name.setText("Hajra Creme");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543794664")){
            information.setText("INFORMATION");
            name.setText("Hajra Creme");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543794681")){
            information.setText("INFORMATION");
            name.setText("Hajra Creme");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }


//      Hajra Le Blanc

        if (barcode.equals("388543782025")){
            information.setText("INFORMATION");
            name.setText("Hajra Le Blanc");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543782036")){
            information.setText("INFORMATION");
            name.setText("Hajra Le Blanc");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543782049")){
            information.setText("INFORMATION");
            name.setText("Hajra Le Blanc");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543782064")){
            information.setText("INFORMATION");
            name.setText("Hajra Le Blanc");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543782081")){
            information.setText("INFORMATION");
            name.setText("Hajra Le Blanc");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543782010")){
            information.setText("INFORMATION");
            name.setText("Hajra Le Blanc");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Hajra Naturale

        if (barcode.equals("388543730325")){
            information.setText("INFORMATION");
            name.setText("Hajra Naturale");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543730336")){
            information.setText("INFORMATION");
            name.setText("Hajra Naturale");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543730349")){
            information.setText("INFORMATION");
            name.setText("Hajra Naturale");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543730364")){
            information.setText("INFORMATION");
            name.setText("Hajra Naturale");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543730381")){
            information.setText("INFORMATION");
            name.setText("Hajra Naturale");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543730310")){
            information.setText("INFORMATION");
            name.setText("Hajra Naturale");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Hajra Revera

        if (barcode.equals("388543737925")){
            information.setText("INFORMATION");
            name.setText("Hajra Revera");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543737936")){
            information.setText("INFORMATION");
            name.setText("Hajra Revera");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543737949")){
            information.setText("INFORMATION");
            name.setText("Hajra Revera");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543737964")){
            information.setText("INFORMATION");
            name.setText("Hajra Revera");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543737981")){
            information.setText("INFORMATION");
            name.setText("Hajra Revera");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543737910")){
            information.setText("INFORMATION");
            name.setText("Hajra Revera");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Hajra Toscana

        if (barcode.equals("388543714725")){
            information.setText("INFORMATION");
            name.setText("Hajra Toscana");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543714736")){
            information.setText("INFORMATION");
            name.setText("Hajra Toscana");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543714749")){
            information.setText("INFORMATION");
            name.setText("Hajra Toscana");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543714764")){
            information.setText("INFORMATION");
            name.setText("Hajra Toscana");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543714781")){
            information.setText("INFORMATION");
            name.setText("Hajra Toscana");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("388543714710")){
            information.setText("INFORMATION");
            name.setText("Hajra Toscana");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Haldis Canta

        if (barcode.equals("261224861325")){
            information.setText("INFORMATION");
            name.setText("Haldis Canta");
            size.setText("5");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224861336")){
            information.setText("INFORMATION");
            name.setText("Haldis Canta");
            size.setText("6");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224861349")){
            information.setText("INFORMATION");
            name.setText("Haldis Canta");
            size.setText("7");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224861364")){
            information.setText("INFORMATION");
            name.setText("Haldis Canta");
            size.setText("8");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224861381")){
            information.setText("INFORMATION");
            name.setText("Haldis Canta");
            size.setText("9");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224861310")){
            information.setText("INFORMATION");
            name.setText("Haldis Canta");
            size.setText("10");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

//      Haldis Dyad

        if (barcode.equals("261224872825")){
            information.setText("INFORMATION");
            name.setText("Haldis Dyad");
            size.setText("5");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224872836")){
            information.setText("INFORMATION");
            name.setText("Haldis Dyad");
            size.setText("6");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224872849")){
            information.setText("INFORMATION");
            name.setText("Haldis Dyad");
            size.setText("7");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224872864")){
            information.setText("INFORMATION");
            name.setText("Haldis Dyad");
            size.setText("8");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224872881")){
            information.setText("INFORMATION");
            name.setText("Haldis Dyad");
            size.setText("9");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224872810")){
            information.setText("INFORMATION");
            name.setText("Haldis Dyad");
            size.setText("10");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

//      Haldis Le Blanc

        if (barcode.equals("261224882025")){
            information.setText("INFORMATION");
            name.setText("Haldis Le Blanc");
            size.setText("5");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224882036")){
            information.setText("INFORMATION");
            name.setText("Haldis Le Blanc");
            size.setText("6");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224882049")){
            information.setText("INFORMATION");
            name.setText("Haldis Le Blanc");
            size.setText("7");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224882064")){
            information.setText("INFORMATION");
            name.setText("Haldis Le Blanc");
            size.setText("8");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224882081")){
            information.setText("INFORMATION");
            name.setText("Haldis Le Blanc");
            size.setText("9");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224882010")){
            information.setText("INFORMATION");
            name.setText("Haldis Le Blanc");
            size.setText("10");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

//      Haldis Naturale

        if (barcode.equals("261224830325")){
            information.setText("INFORMATION");
            name.setText("Haldis Naturale");
            size.setText("5");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224830336")){
            information.setText("INFORMATION");
            name.setText("Haldis Naturale");
            size.setText("6");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224830349")){
            information.setText("INFORMATION");
            name.setText("Haldis Naturale");
            size.setText("7");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224830364")){
            information.setText("INFORMATION");
            name.setText("Haldis Naturale");
            size.setText("8");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224830381")){
            information.setText("INFORMATION");
            name.setText("Haldis Naturale");
            size.setText("9");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224830310")){
            information.setText("INFORMATION");
            name.setText("Haldis Naturale");
            size.setText("10");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

//      Haldis Noir

        if (barcode.equals("261224838425")){
            information.setText("INFORMATION");
            name.setText("Haldis Noir");
            size.setText("5");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224838436")){
            information.setText("INFORMATION");
            name.setText("Haldis Noir");
            size.setText("6");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224838449")){
            information.setText("INFORMATION");
            name.setText("Haldis Noir");
            size.setText("7");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224838464")){
            information.setText("INFORMATION");
            name.setText("Haldis Noir");
            size.setText("8");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224838481")){
            information.setText("INFORMATION");
            name.setText("Haldis Noir");
            size.setText("9");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224838410")){
            information.setText("INFORMATION");
            name.setText("Haldis Noir");
            size.setText("10");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

//      Haldis Palmera

        if (barcode.equals("261224886625")){
            information.setText("INFORMATION");
            name.setText("Haldis Palmera");
            size.setText("5");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224886636")){
            information.setText("INFORMATION");
            name.setText("Haldis Palmera");
            size.setText("6");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224886649")){
            information.setText("INFORMATION");
            name.setText("Haldis Palmera");
            size.setText("7");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224886664")){
            information.setText("INFORMATION");
            name.setText("Haldis Palmera");
            size.setText("8");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224886681")){
            information.setText("INFORMATION");
            name.setText("Haldis Palmera");
            size.setText("9");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224886610")){
            information.setText("INFORMATION");
            name.setText("Haldis Palmera");
            size.setText("10");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

//      Haldis Rayo

        if (barcode.equals("261224899825")){
            information.setText("INFORMATION");
            name.setText("Haldis Rayo");
            size.setText("5");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224899836")){
            information.setText("INFORMATION");
            name.setText("Haldis Rayo");
            size.setText("6");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224899849")){
            information.setText("INFORMATION");
            name.setText("Haldis Rayo");
            size.setText("7");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224899864")){
            information.setText("INFORMATION");
            name.setText("Haldis Rayo");
            size.setText("8");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224899881")){
            information.setText("INFORMATION");
            name.setText("Haldis Rayo");
            size.setText("9");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224899810")){
            information.setText("INFORMATION");
            name.setText("Haldis Rayo");
            size.setText("10");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

//      Haldis Rosa

        if (barcode.equals("261224863725")){
            information.setText("INFORMATION");
            name.setText("Haldis Rosa");
            size.setText("5");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224863736")){
            information.setText("INFORMATION");
            name.setText("Haldis Rosa");
            size.setText("6");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224863749")){
            information.setText("INFORMATION");
            name.setText("Haldis Rosa");
            size.setText("7");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224863764")){
            information.setText("INFORMATION");
            name.setText("Haldis Rosa");
            size.setText("8");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224863781")){
            information.setText("INFORMATION");
            name.setText("Haldis Rosa");
            size.setText("9");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224863710")){
            information.setText("INFORMATION");
            name.setText("Haldis Rosa");
            size.setText("10");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

//      Haldis Sedona

        if (barcode.equals("261224851025")){
            information.setText("INFORMATION");
            name.setText("Haldis Sedona");
            size.setText("5");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224851036")){
            information.setText("INFORMATION");
            name.setText("Haldis Sedona");
            size.setText("6");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224851049")){
            information.setText("INFORMATION");
            name.setText("Haldis Sedona");
            size.setText("7");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224851064")){
            information.setText("INFORMATION");
            name.setText("Haldis Sedona");
            size.setText("8");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224851081")){
            information.setText("INFORMATION");
            name.setText("Haldis Sedona");
            size.setText("9");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

        if (barcode.equals("261224851010")){
            information.setText("INFORMATION");
            name.setText("Haldis Sedona");
            size.setText("10");
            location.setText("3-4-B and 3-4-D and 3-4-F and 3-5-K");
            done.setText("done");
        }

//      Halia Celadon

        if (barcode.equals("987660419225")){
            information.setText("INFORMATION");
            name.setText("Halia Celadon");
            size.setText("5");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("987660419236")){
            information.setText("INFORMATION");
            name.setText("Halia Celadon");
            size.setText("6");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("987660419249")){
            information.setText("INFORMATION");
            name.setText("Halia Celadon");
            size.setText("7");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("987660419264")){
            information.setText("INFORMATION");
            name.setText("Halia Celadon");
            size.setText("8");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("987660419281")){
            information.setText("INFORMATION");
            name.setText("Halia Celadon");
            size.setText("9");
            location.setText("3-5-H");
            done.setText("done");
        }

//      Halia Fleur

        if (barcode.equals("987660437625")){
            information.setText("INFORMATION");
            name.setText("Halia Fleur");
            size.setText("5");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("987660437636")){
            information.setText("INFORMATION");
            name.setText("Halia Fleur");
            size.setText("6");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("987660437649")){
            information.setText("INFORMATION");
            name.setText("Halia Fleur");
            size.setText("7");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("987660437664")){
            information.setText("INFORMATION");
            name.setText("Halia Fleur");
            size.setText("8");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("987660437681")){
            information.setText("INFORMATION");
            name.setText("Halia Fleur");
            size.setText("9");
            location.setText("3-5-H");
            done.setText("done");
        }

//      Halia Le Blanc

        if (barcode.equals("987660482025")){
            information.setText("INFORMATION");
            name.setText("Halia Le Blanc");
            size.setText("5");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("987660482036")){
            information.setText("INFORMATION");
            name.setText("Halia Le Blanc");
            size.setText("6");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("987660482049")){
            information.setText("INFORMATION");
            name.setText("Halia Le Blanc");
            size.setText("7");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("987660482064")){
            information.setText("INFORMATION");
            name.setText("Halia Le Blanc");
            size.setText("8");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("987660482081")){
            information.setText("INFORMATION");
            name.setText("Halia Le Blanc");
            size.setText("9");
            location.setText("3-5-H");
            done.setText("done");
        }

//      Hania Biscotti

        if (barcode.equals("892500221125")){
            information.setText("INFORMATION");
            name.setText("Hania Biscotti");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("892500221136")){
            information.setText("INFORMATION");
            name.setText("Hania Biscotti");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("892500221149")){
            information.setText("INFORMATION");
            name.setText("Hania Biscotti");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("892500221164")){
            information.setText("INFORMATION");
            name.setText("Hania Biscotti");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("892500221181")){
            information.setText("INFORMATION");
            name.setText("Hania Biscotti");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Hania Nude

        if (barcode.equals("892500245425")){
            information.setText("INFORMATION");
            name.setText("Hania Nude");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("892500245436")){
            information.setText("INFORMATION");
            name.setText("Hania Nude");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("892500245449")){
            information.setText("INFORMATION");
            name.setText("Hania Nude");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("892500245464")){
            information.setText("INFORMATION");
            name.setText("Hania Nude");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("892500245481")){
            information.setText("INFORMATION");
            name.setText("Hania Nude");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Hania White

        if (barcode.equals("892500265525")){
            information.setText("INFORMATION");
            name.setText("Hania White");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("892500265536")){
            information.setText("INFORMATION");
            name.setText("Hania White");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("892500265549")){
            information.setText("INFORMATION");
            name.setText("Hania White");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("892500265564")){
            information.setText("INFORMATION");
            name.setText("Hania White");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("892500265581")){
            information.setText("INFORMATION");
            name.setText("Hania White");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Haniya Le Blanc

        if (barcode.equals("191805082025")){
            information.setText("INFORMATION");
            name.setText("Haniya Le Blanc");
            size.setText("5");
            location.setText("3-5-B");
            done.setText("done");
        }

        if (barcode.equals("191805082036")){
            information.setText("INFORMATION");
            name.setText("Haniya Le Blanc");
            size.setText("6");
            location.setText("3-5-B");
            done.setText("done");
        }

        if (barcode.equals("191805082049")){
            information.setText("INFORMATION");
            name.setText("Haniya Le Blanc");
            size.setText("7");
            location.setText("3-5-B");
            done.setText("done");
        }

        if (barcode.equals("191805082064")){
            information.setText("INFORMATION");
            name.setText("Haniya Le Blanc");
            size.setText("8");
            location.setText("3-5-B");
            done.setText("done");
        }

        if (barcode.equals("191805082081")){
            information.setText("INFORMATION");
            name.setText("Haniya Le Blanc");
            size.setText("9");
            location.setText("3-5-B");
            done.setText("done");
        }

//      Haniya Naturale

        if (barcode.equals("191805030325")){
            information.setText("INFORMATION");
            name.setText("Haniya Naturale");
            size.setText("5");
            location.setText("3-5-B");
            done.setText("done");
        }

        if (barcode.equals("191805030336")){
            information.setText("INFORMATION");
            name.setText("Haniya Naturale");
            size.setText("6");
            location.setText("3-5-B");
            done.setText("done");
        }

        if (barcode.equals("191805030349")){
            information.setText("INFORMATION");
            name.setText("Haniya Naturale");
            size.setText("7");
            location.setText("3-5-B");
            done.setText("done");
        }

        if (barcode.equals("191805030364")){
            information.setText("INFORMATION");
            name.setText("Haniya Naturale");
            size.setText("8");
            location.setText("3-5-B");
            done.setText("done");
        }

        if (barcode.equals("191805030381")){
            information.setText("INFORMATION");
            name.setText("Haniya Naturale");
            size.setText("9");
            location.setText("3-5-B");
            done.setText("done");
        }

//      Haniya Woven

        if (barcode.equals("191805034925")){
            information.setText("INFORMATION");
            name.setText("Haniya Woven");
            size.setText("5");
            location.setText("3-5-B");
            done.setText("done");
        }

        if (barcode.equals("191805034936")){
            information.setText("INFORMATION");
            name.setText("Haniya Woven");
            size.setText("6");
            location.setText("3-5-B");
            done.setText("done");
        }

        if (barcode.equals("191805034949")){
            information.setText("INFORMATION");
            name.setText("Haniya Woven");
            size.setText("7");
            location.setText("3-5-B");
            done.setText("done");
        }

        if (barcode.equals("191805034964")){
            information.setText("INFORMATION");
            name.setText("Haniya Woven");
            size.setText("8");
            location.setText("3-5-B");
            done.setText("done");
        }

        if (barcode.equals("191805034981")){
            information.setText("INFORMATION");
            name.setText("Haniya Woven");
            size.setText("9");
            location.setText("3-5-B");
            done.setText("done");
        }

//      Hanvika Biscotti

        if (barcode.equals("938307921125")){
            information.setText("INFORMATION");
            name.setText("Hanvika Biscotti");
            size.setText("5");
            location.setText("3-5-D and 3-5-F");
            done.setText("done");
        }

        if (barcode.equals("938307921136")){
            information.setText("INFORMATION");
            name.setText("Hanvika Biscotti");
            size.setText("6");
            location.setText("3-5-D and 3-5-F");
            done.setText("done");
        }

        if (barcode.equals("938307921149")){
            information.setText("INFORMATION");
            name.setText("Hanvika Biscotti");
            size.setText("7");
            location.setText("3-5-D and 3-5-F");
            done.setText("done");
        }

        if (barcode.equals("938307921164")){
            information.setText("INFORMATION");
            name.setText("Hanvika Biscotti");
            size.setText("8");
            location.setText("3-5-D and 3-5-F");
            done.setText("done");
        }

        if (barcode.equals("938307921181")){
            information.setText("INFORMATION");
            name.setText("Hanvika Biscotti");
            size.setText("9");
            location.setText("3-5-D and 3-5-F");
            done.setText("done");
        }

//      Hanvika Le Blanc

        if (barcode.equals("938307982025")){
            information.setText("INFORMATION");
            name.setText("Hanvika Le Blanc");
            size.setText("5");
            location.setText("3-5-D and 3-5-F");
            done.setText("done");
        }

        if (barcode.equals("938307982036")){
            information.setText("INFORMATION");
            name.setText("Hanvika Le Blanc");
            size.setText("6");
            location.setText("3-5-D and 3-5-F");
            done.setText("done");
        }

        if (barcode.equals("938307982049")){
            information.setText("INFORMATION");
            name.setText("Hanvika Le Blanc");
            size.setText("7");
            location.setText("3-5-D and 3-5-F");
            done.setText("done");
        }

        if (barcode.equals("938307982064")){
            information.setText("INFORMATION");
            name.setText("Hanvika Le Blanc");
            size.setText("8");
            location.setText("3-5-D and 3-5-F");
            done.setText("done");
        }

        if (barcode.equals("938307982081")){
            information.setText("INFORMATION");
            name.setText("Hanvika Le Blanc");
            size.setText("9");
            location.setText("3-5-D and 3-5-F");
            done.setText("done");
        }

//      Hara Biscotti

        if (barcode.equals("720528021125")){
            information.setText("INFORMATION");
            name.setText("Hara Biscotti");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("720528021136")){
            information.setText("INFORMATION");
            name.setText("Hara Biscotti");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("720528021149")){
            information.setText("INFORMATION");
            name.setText("Hara Biscotti");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("720528021164")){
            information.setText("INFORMATION");
            name.setText("Hara Biscotti");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("720528021181")){
            information.setText("INFORMATION");
            name.setText("Hara Biscotti");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("720528021110")){
            information.setText("INFORMATION");
            name.setText("Hara Biscotti");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Hara Le Blanc

        if (barcode.equals("720528082025")){
            information.setText("INFORMATION");
            name.setText("Hara Le Blanc");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("720528082036")){
            information.setText("INFORMATION");
            name.setText("Hara Le Blanc");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("720528082049")){
            information.setText("INFORMATION");
            name.setText("Hara Le Blanc");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("720528082064")){
            information.setText("INFORMATION");
            name.setText("Hara Le Blanc");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("720528082081")){
            information.setText("INFORMATION");
            name.setText("Hara Le Blanc");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("720528082010")){
            information.setText("INFORMATION");
            name.setText("Hara Le Blanc");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Hara Naturale

        if (barcode.equals("720528030325")){
            information.setText("INFORMATION");
            name.setText("Hara Naturale");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("720528030336")){
            information.setText("INFORMATION");
            name.setText("Hara Naturale");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("720528030349")){
            information.setText("INFORMATION");
            name.setText("Hara Naturale");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("720528030364")){
            information.setText("INFORMATION");
            name.setText("Hara Naturale");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("720528030381")){
            information.setText("INFORMATION");
            name.setText("Hara Naturale");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("720528030310")){
            information.setText("INFORMATION");
            name.setText("Hara Naturale");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Harini Le Blanc

        if (barcode.equals("506161582025")){
            information.setText("INFORMATION");
            name.setText("Harini Le Blanc");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("506161582036")){
            information.setText("INFORMATION");
            name.setText("Harini Le Blanc");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("506161582049")){
            information.setText("INFORMATION");
            name.setText("Harini Le Blanc");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("506161582064")){
            information.setText("INFORMATION");
            name.setText("Harini Le Blanc");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("506161582081")){
            information.setText("INFORMATION");
            name.setText("Harini Le Blanc");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Harini Naturale

        if (barcode.equals("506161530325")){
            information.setText("INFORMATION");
            name.setText("Harini Naturale");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("506161530336")){
            information.setText("INFORMATION");
            name.setText("Harini Naturale");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("506161530349")){
            information.setText("INFORMATION");
            name.setText("Harini Naturale");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("506161530364")){
            information.setText("INFORMATION");
            name.setText("Harini Naturale");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("506161530381")){
            information.setText("INFORMATION");
            name.setText("Harini Naturale");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Harini Noir

        if (barcode.equals("506161538425")){
            information.setText("INFORMATION");
            name.setText("Harini Noir");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("506161538436")){
            information.setText("INFORMATION");
            name.setText("Harini Noir");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("506161538449")){
            information.setText("INFORMATION");
            name.setText("Harini Noir");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("506161538464")){
            information.setText("INFORMATION");
            name.setText("Harini Noir");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("506161538481")){
            information.setText("INFORMATION");
            name.setText("Harini Noir");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

//      Harri Le Blanc

        if (barcode.equals("624993082025")){
            information.setText("INFORMATION");
            name.setText("Harri Le Blanc");
            size.setText("5");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("624993082036")){
            information.setText("INFORMATION");
            name.setText("Harri Le Blanc");
            size.setText("6");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("624993082049")){
            information.setText("INFORMATION");
            name.setText("Harri Le Blanc");
            size.setText("7");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("624993082064")){
            information.setText("INFORMATION");
            name.setText("Harri Le Blanc");
            size.setText("8");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("624993082081")){
            information.setText("INFORMATION");
            name.setText("Harri Le Blanc");
            size.setText("9");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("624993082010")){
            information.setText("INFORMATION");
            name.setText("Harri Le Blanc");
            size.setText("10");
            location.setText("3-5-F");
            done.setText("done");
        }

//      Harri Noir

        if (barcode.equals("624993038425")){
            information.setText("INFORMATION");
            name.setText("Harri Noir");
            size.setText("5");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("624993038436")){
            information.setText("INFORMATION");
            name.setText("Harri Noir");
            size.setText("6");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("624993038449")){
            information.setText("INFORMATION");
            name.setText("Harri Noir");
            size.setText("7");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("624993038464")){
            information.setText("INFORMATION");
            name.setText("Harri Noir");
            size.setText("8");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("624993038481")){
            information.setText("INFORMATION");
            name.setText("Harri Noir");
            size.setText("9");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("624993038410")){
            information.setText("INFORMATION");
            name.setText("Harri Noir");
            size.setText("10");
            location.setText("3-5-F");
            done.setText("done");
        }

//      Havika Le Blanc

        if (barcode.equals("783788482025")){
            information.setText("INFORMATION");
            name.setText("Havika Le Blanc");
            size.setText("5");
            location.setText("3-5-D");
            done.setText("done");
        }

        if (barcode.equals("783788482036")){
            information.setText("INFORMATION");
            name.setText("Havika Le Blanc");
            size.setText("6");
            location.setText("3-5-D");
            done.setText("done");
        }

        if (barcode.equals("783788482049")){
            information.setText("INFORMATION");
            name.setText("Havika Le Blanc");
            size.setText("7");
            location.setText("3-5-D");
            done.setText("done");
        }

        if (barcode.equals("783788482064")){
            information.setText("INFORMATION");
            name.setText("Havika Le Blanc");
            size.setText("8");
            location.setText("3-5-D");
            done.setText("done");
        }

        if (barcode.equals("783788482081")){
            information.setText("INFORMATION");
            name.setText("Havika Le Blanc");
            size.setText("9");
            location.setText("3-5-D");
            done.setText("done");
        }

//      Havika Noir

        if (barcode.equals("783788438425")){
            information.setText("INFORMATION");
            name.setText("Havika Noir");
            size.setText("5");
            location.setText("3-5-D");
            done.setText("done");
        }

        if (barcode.equals("783788438436")){
            information.setText("INFORMATION");
            name.setText("Havika Noir");
            size.setText("6");
            location.setText("3-5-D");
            done.setText("done");
        }

        if (barcode.equals("783788438449")){
            information.setText("INFORMATION");
            name.setText("Havika Noir");
            size.setText("7");
            location.setText("3-5-D");
            done.setText("done");
        }

        if (barcode.equals("783788438464")){
            information.setText("INFORMATION");
            name.setText("Havika Noir");
            size.setText("8");
            location.setText("3-5-D");
            done.setText("done");
        }

        if (barcode.equals("783788438481")){
            information.setText("INFORMATION");
            name.setText("Havika Noir");
            size.setText("9");
            location.setText("3-5-D");
            done.setText("done");
        }

//      Havika Toscana

        if (barcode.equals("783788414725")){
            information.setText("INFORMATION");
            name.setText("Havika Toscana");
            size.setText("5");
            location.setText("3-5-D");
            done.setText("done");
        }

        if (barcode.equals("783788414736")){
            information.setText("INFORMATION");
            name.setText("Havika Toscana");
            size.setText("6");
            location.setText("3-5-D");
            done.setText("done");
        }

        if (barcode.equals("783788414749")){
            information.setText("INFORMATION");
            name.setText("Havika Toscana");
            size.setText("7");
            location.setText("3-5-D");
            done.setText("done");
        }

        if (barcode.equals("783788414764")){
            information.setText("INFORMATION");
            name.setText("Havika Toscana");
            size.setText("8");
            location.setText("3-5-D");
            done.setText("done");
        }

        if (barcode.equals("783788414781")){
            information.setText("INFORMATION");
            name.setText("Havika Toscana");
            size.setText("9");
            location.setText("3-5-D");
            done.setText("done");
        }

//      Haya Biscotti

        if (barcode.equals("133065821125")){
            information.setText("INFORMATION");
            name.setText("Haya Biscotti");
            size.setText("5");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065821136")){
            information.setText("INFORMATION");
            name.setText("Haya Biscotti");
            size.setText("6");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065821149")){
            information.setText("INFORMATION");
            name.setText("Haya Biscotti");
            size.setText("7");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065821164")){
            information.setText("INFORMATION");
            name.setText("Haya Biscotti");
            size.setText("8");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065821181")){
            information.setText("INFORMATION");
            name.setText("Haya Biscotti");
            size.setText("9");
            location.setText("3-5-H");
            done.setText("done");
        }

//      Haya Black

        if (barcode.equals("133065846625")){
            information.setText("INFORMATION");
            name.setText("Haya Black");
            size.setText("5");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065846636")){
            information.setText("INFORMATION");
            name.setText("Haya Black");
            size.setText("6");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065846649")){
            information.setText("INFORMATION");
            name.setText("Haya Black");
            size.setText("7");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065846664")){
            information.setText("INFORMATION");
            name.setText("Haya Black");
            size.setText("8");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065846681")){
            information.setText("INFORMATION");
            name.setText("Haya Black");
            size.setText("9");
            location.setText("3-5-H");
            done.setText("done");
        }

//      Haya Cashew

        if (barcode.equals("133065868725")){
            information.setText("INFORMATION");
            name.setText("Haya Cashew");
            size.setText("5");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065868736")){
            information.setText("INFORMATION");
            name.setText("Haya Cashew");
            size.setText("6");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065868749")){
            information.setText("INFORMATION");
            name.setText("Haya Cashew");
            size.setText("7");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065868764")){
            information.setText("INFORMATION");
            name.setText("Haya Cashew");
            size.setText("8");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065868781")){
            information.setText("INFORMATION");
            name.setText("Haya Cashew");
            size.setText("9");
            location.setText("3-5-H");
            done.setText("done");
        }

//      Haya Nude

        if (barcode.equals("133065845425")){
            information.setText("INFORMATION");
            name.setText("Haya Nude");
            size.setText("5");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065845436")){
            information.setText("INFORMATION");
            name.setText("Haya Nude");
            size.setText("6");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065845449")){
            information.setText("INFORMATION");
            name.setText("Haya Nude");
            size.setText("7");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065845464")){
            information.setText("INFORMATION");
            name.setText("Haya Nude");
            size.setText("8");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065845481")){
            information.setText("INFORMATION");
            name.setText("Haya Nude");
            size.setText("9");
            location.setText("3-5-H");
            done.setText("done");
        }

//      Haya White

        if (barcode.equals("133065865525")){
            information.setText("INFORMATION");
            name.setText("Haya White");
            size.setText("5");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065865536")){
            information.setText("INFORMATION");
            name.setText("Haya White");
            size.setText("6");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065865549")){
            information.setText("INFORMATION");
            name.setText("Haya White");
            size.setText("7");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065865564")){
            information.setText("INFORMATION");
            name.setText("Haya White");
            size.setText("8");
            location.setText("3-5-H");
            done.setText("done");
        }

        if (barcode.equals("133065865581")){
            information.setText("INFORMATION");
            name.setText("Haya White");
            size.setText("9");
            location.setText("3-5-H");
            done.setText("done");
        }

//      Henika Chamois

        if (barcode.equals("196128621925")){
            information.setText("INFORMATION");
            name.setText("Henika Chamois");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("196128621936")){
            information.setText("INFORMATION");
            name.setText("Henika Chamois");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("196128621949")){
            information.setText("INFORMATION");
            name.setText("Henika Chamois");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("196128621964")){
            information.setText("INFORMATION");
            name.setText("Henika Chamois");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("196128621981")){
            information.setText("INFORMATION");
            name.setText("Henika Chamois");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("196128621910")){
            information.setText("INFORMATION");
            name.setText("Henika Chamois");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Henika Noir

        if (barcode.equals("196128638425")){
            information.setText("INFORMATION");
            name.setText("Henika Noir");
            size.setText("5");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("196128638436")){
            information.setText("INFORMATION");
            name.setText("Henika Noir");
            size.setText("6");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("196128638449")){
            information.setText("INFORMATION");
            name.setText("Henika Noir");
            size.setText("7");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("196128638464")){
            information.setText("INFORMATION");
            name.setText("Henika Noir");
            size.setText("8");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("196128638481")){
            information.setText("INFORMATION");
            name.setText("Henika Noir");
            size.setText("9");
            location.setText("N/A");
            done.setText("done");
        }

        if (barcode.equals("196128638410")){
            information.setText("INFORMATION");
            name.setText("Henika Noir");
            size.setText("10");
            location.setText("N/A");
            done.setText("done");
        }

//      Huda Biscotti

        if (barcode.equals("861828521125")){
            information.setText("INFORMATION");
            name.setText("Huda Biscotti");
            size.setText("5");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("861828521136")){
            information.setText("INFORMATION");
            name.setText("Huda Biscotti");
            size.setText("6");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("861828521149")){
            information.setText("INFORMATION");
            name.setText("Huda Biscotti");
            size.setText("7");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("861828521164")){
            information.setText("INFORMATION");
            name.setText("Huda Biscotti");
            size.setText("8");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("861828521181")){
            information.setText("INFORMATION");
            name.setText("Huda Biscotti");
            size.setText("9");
            location.setText("3-5-F");
            done.setText("done");
        }

//      Huda Fleur

        if (barcode.equals("861828537625")){
            information.setText("INFORMATION");
            name.setText("Huda Fleur");
            size.setText("5");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("861828537636")){
            information.setText("INFORMATION");
            name.setText("Huda Fleur");
            size.setText("6");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("861828537649")){
            information.setText("INFORMATION");
            name.setText("Huda Fleur");
            size.setText("7");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("861828537664")){
            information.setText("INFORMATION");
            name.setText("Huda Fleur");
            size.setText("8");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("861828537681")){
            information.setText("INFORMATION");
            name.setText("Huda Fleur");
            size.setText("9");
            location.setText("3-5-F");
            done.setText("done");
        }

//      Huda White

        if (barcode.equals("861828565525")){
            information.setText("INFORMATION");
            name.setText("Huda White");
            size.setText("5");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("861828565536")){
            information.setText("INFORMATION");
            name.setText("Huda White");
            size.setText("6");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("861828565549")){
            information.setText("INFORMATION");
            name.setText("Huda White");
            size.setText("7");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("861828565564")){
            information.setText("INFORMATION");
            name.setText("Huda White");
            size.setText("8");
            location.setText("3-5-F");
            done.setText("done");
        }

        if (barcode.equals("861828565581")){
            information.setText("INFORMATION");
            name.setText("Huda White");
            size.setText("9");
            location.setText("3-5-F");
            done.setText("done");
        }

//      Functions for Done button
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

}