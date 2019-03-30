package com.example.m.hadiservices;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Toast;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class CourierServiceFinalStatusForm extends AppCompatActivity {

    MaterialBetterSpinner CurrentStatusSpinner;
    String[] CurrentStatusContent = {"DELIVERD" , "UN DELIVERD" , "WRONG ADDRESS" , "RTO" , "REJECT TO RECIEVE"};

    android.support.design.widget.TextInputEditText deliveryRider;
    android.support.design.widget.TextInputEditText dateAndTime;
    android.support.design.widget.TextInputEditText remarks;

    //TODO add references to SignPic and Parcel Pic ImageViews
    ImageView SignpicImageView ;


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if(resultCode == RESULT_OK) {
                Bitmap bmp;

                byte[] byteArray = data.getByteArrayExtra("image");
                bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

                SignpicImageView.setImageBitmap(bmp);
                Toast.makeText(this, "Successfully loaded the image", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courier_service_final_status_form);

        deliveryRider = findViewById(R.id.courierServiceFinalStatusDeliveryRiderId);
        dateAndTime = findViewById(R.id.courierServiceFinalStatusDateAndTimeId);
        remarks = findViewById(R.id.courierServiceFinalStatusRemarksId);

        SignpicImageView = findViewById(R.id.signPicImageViewId);
        SignpicImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toGetSignActivity = new Intent(CourierServiceFinalStatusForm.this,GetSignature.class);
                startActivityForResult(toGetSignActivity , 1);
//                finish();
            }
        });

       /* Intent fromGetSignature = getIntent();
        if(fromGetSignature != null){
            Bitmap bmp;

            byte[] byteArray = getIntent().getByteArrayExtra("image");
            bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

            SignpicImageView.setImageBitmap(bmp);
        }*/

        CurrentStatusSpinner = findViewById(R.id.courierServiceFinalStatusCurrenStatusId);
        ArrayAdapter<String> CurrentStatusAdapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,CurrentStatusContent);
        CurrentStatusSpinner.setAdapter(CurrentStatusAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return  true/*super.onCreateOptionsMenu(menu)*/;
    }
    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
           /* case R.id.signUpFormMenuItemId:
                Intent toSignUpForm = new Intent(CourierServiceFinalStatusForm.this, Sign_Up_Form_Activity.class);
                startActivity(toSignUpForm);
                finish();
                return true;*/
            case R.id.pickUpReqFormMenuItemId:
                Intent toPickUpRequestForm = new Intent(CourierServiceFinalStatusForm.this, PickUpRequestForm.class);
                startActivity(toPickUpRequestForm);
                finish();
                return true;

            case R.id.courierServiceBookingFormMenuItemId:
                Intent toCourierServicBookingForm = new Intent(CourierServiceFinalStatusForm.this, CourierServiceBokingForm.class);
                startActivity(toCourierServicBookingForm);
                finish();
                return true;

            case R.id.courierServiceStatusUpdateFormMenuItemId:
                Intent toCourierServicStatusUpdateForm = new Intent(CourierServiceFinalStatusForm.this, CourierServiceStatusUpdateForm.class);
                startActivity(toCourierServicStatusUpdateForm);
                finish();
                return true;

            case R.id.educationalAndJobServicesFormMenuItemId:
                Intent toeducationalAndJobServicesForm = new Intent(CourierServiceFinalStatusForm.this, EducatinoalAndJobServicesForm.class);
                startActivity(toeducationalAndJobServicesForm);
                finish();
                return true;


            case R.id.travelToursServicesFormMenuItemId:
                Intent toTravelToursServicesForm = new Intent(CourierServiceFinalStatusForm.this, TravelAndToursServicesForm.class);
                startActivity(toTravelToursServicesForm);
                finish();
                return true;


            case R.id.cashUpdateFormMenuItemId:
                Intent toCashUpdateFormMenuItemId = new Intent(CourierServiceFinalStatusForm.this, CashUpdateForm.class);
                startActivity(toCashUpdateFormMenuItemId);
                finish();
                return true;

            case R.id.courierServiceFinalStatusMenuItemId:
                Intent toCourierServiceFinalStatusForm = new Intent(CourierServiceFinalStatusForm.this, CourierServiceFinalStatusForm.class);
                startActivity(toCourierServiceFinalStatusForm);
                finish();
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
