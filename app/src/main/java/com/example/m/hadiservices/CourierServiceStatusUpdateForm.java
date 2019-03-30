package com.example.m.hadiservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class CourierServiceStatusUpdateForm extends AppCompatActivity {


    android.support.design.widget.TextInputEditText consignmentNumber;
    android.support.design.widget.TextInputEditText dateAndTime;
    android.support.design.widget.TextInputEditText currentProcedure;
    android.support.design.widget.TextInputEditText location;

    Button updateServiceStatusBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courier_service_status_update_form);

        consignmentNumber = findViewById(R.id.courierServiceUpdateConsignmentNumberId);
        dateAndTime = findViewById(R.id.courierServiceUpdateDateAndTimeId);
        currentProcedure = findViewById(R.id.courierServiceUpdateCurrentProcedurerId);
        location = findViewById(R.id.courierServiceUpdateLocationId);

        updateServiceStatusBtn = findViewById(R.id.courierServiceUpdateBtnId);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
            /*case R.id.signUpFormMenuItemId:
                Intent toSignUpForm = new Intent(CourierServiceStatusUpdateForm.this , Sign_Up_Form_Activity.class);
                startActivity(toSignUpForm);
                finish();
                return true;*/
            case R.id.pickUpReqFormMenuItemId:
                Intent toPickUpRequestForm = new Intent(CourierServiceStatusUpdateForm.this , PickUpRequestForm.class);
                startActivity(toPickUpRequestForm);
                finish();
                return true;

            case R.id.courierServiceBookingFormMenuItemId:
                Intent toCourierServicBookingForm = new Intent(CourierServiceStatusUpdateForm.this , CourierServiceBokingForm.class);
                startActivity(toCourierServicBookingForm);
                finish();
                return true;

            case R.id.courierServiceStatusUpdateFormMenuItemId:
                Intent toCourierServicStatusUpdateForm = new Intent(CourierServiceStatusUpdateForm.this , CourierServiceStatusUpdateForm.class);
                startActivity(toCourierServicStatusUpdateForm);
                finish();
                return true;

            case R.id.educationalAndJobServicesFormMenuItemId:
                Intent toeducationalAndJobServicesForm = new Intent(CourierServiceStatusUpdateForm.this , EducatinoalAndJobServicesForm.class);
                startActivity(toeducationalAndJobServicesForm);
                finish();
                return true;


            case R.id.travelToursServicesFormMenuItemId:
                Intent toTravelToursServicesForm = new Intent(CourierServiceStatusUpdateForm.this , TravelAndToursServicesForm.class);
                startActivity(toTravelToursServicesForm);
                finish();
                return true;


            case R.id.cashUpdateFormMenuItemId:
                Intent toCashUpdateFormMenuItemId = new Intent(CourierServiceStatusUpdateForm.this , CashUpdateForm.class);
                startActivity(toCashUpdateFormMenuItemId);
                finish();
                return true;

            case R.id.courierServiceFinalStatusMenuItemId:
                Intent toCourierServiceFinalStatusForm = new Intent(CourierServiceStatusUpdateForm.this, CourierServiceFinalStatusForm.class);
                startActivity(toCourierServiceFinalStatusForm);
                finish();
                return true;




            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
