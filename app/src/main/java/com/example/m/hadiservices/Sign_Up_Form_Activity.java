package com.example.m.hadiservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.lang.reflect.Array;
import java.util.List;

public class Sign_Up_Form_Activity extends AppCompatActivity {

    MaterialBetterSpinner ShipmentFreqDDLV;
    Button RequestAccountBtn ;
    String[] ShipmentFreqContent = { "Please Choose" , "Daily" , "Weekly" , "Monthly" , "One Off-Shipment"};

    android.support.design.widget.TextInputEditText firstName;
    android.support.design.widget.TextInputEditText lastName;
    android.support.design.widget.TextInputEditText email;
    android.support.design.widget.TextInputEditText password;
    android.support.design.widget.TextInputEditText reEnterPassword;
    android.support.design.widget.TextInputEditText phoneNumber;
    android.support.design.widget.TextInputEditText company;
    android.support.design.widget.TextInputEditText address;
    android.support.design.widget.TextInputEditText postalCode;
    android.support.design.widget.TextInputEditText city;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up__form_);



        firstName = findViewById(R.id.signUpFNameId);
        lastName = findViewById(R.id.signUpLNameId);
        email = findViewById(R.id.signUpEmailId);
        password = findViewById(R.id.signUpPasswordId);
        reEnterPassword = findViewById(R.id.signUpReTypePasswordId);
        phoneNumber = findViewById(R.id.signUpPhoneId);
        company = findViewById(R.id.signUpCompanyId);
        address = findViewById(R.id.signUpAddressId);
        postalCode = findViewById(R.id.signUPosCodeTbId);
        city = findViewById(R.id.signUpCityTbId);


        ShipmentFreqDDLV =  findViewById(R.id.shipmentFreqDDLV);
        ArrayAdapter<String> ShipmentFreqAdapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,ShipmentFreqContent);
        ShipmentFreqDDLV.setAdapter(ShipmentFreqAdapter);

        RequestAccountBtn = findViewById(R.id.requestAccountBtnId);
        RequestAccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fromSignUpToPickUpReqForm = new Intent(Sign_Up_Form_Activity.this, PickUpRequestForm.class);
                startActivity(fromSignUpToPickUpReqForm);
                finish();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return  true/*super.onCreateOptionsMenu(menu)*/;
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
            /*case R.id.signUpFormMenuItemId:
                Intent toSignUpForm = new Intent(Sign_Up_Form_Activity.this, Sign_Up_Form_Activity.class);
                startActivity(toSignUpForm);
                finish();
                return true;*/
            case R.id.pickUpReqFormMenuItemId:
                Intent toPickUpRequestForm = new Intent(Sign_Up_Form_Activity.this, PickUpRequestForm.class);
                startActivity(toPickUpRequestForm);
                finish();
                return true;

            case R.id.courierServiceBookingFormMenuItemId:
                Intent toCourierServicBookingForm = new Intent(Sign_Up_Form_Activity.this, CourierServiceBokingForm.class);
                startActivity(toCourierServicBookingForm);
                finish();
                return true;

            case R.id.courierServiceStatusUpdateFormMenuItemId:
                Intent toCourierServicStatusUpdateForm = new Intent(Sign_Up_Form_Activity.this, CourierServiceStatusUpdateForm.class);
                startActivity(toCourierServicStatusUpdateForm);
                finish();
                return true;

            case R.id.educationalAndJobServicesFormMenuItemId:
                Intent toeducationalAndJobServicesForm = new Intent(Sign_Up_Form_Activity.this, EducatinoalAndJobServicesForm.class);
                startActivity(toeducationalAndJobServicesForm);
                finish();
                return true;


            case R.id.travelToursServicesFormMenuItemId:
                Intent toTravelToursServicesForm = new Intent(Sign_Up_Form_Activity.this, TravelAndToursServicesForm.class);
                startActivity(toTravelToursServicesForm);
                finish();
                return true;


            case R.id.cashUpdateFormMenuItemId:
                Intent toCashUpdateFormMenuItemId = new Intent(Sign_Up_Form_Activity.this, CashUpdateForm.class);
                startActivity(toCashUpdateFormMenuItemId);
                finish();
                return true;



            case R.id.courierServiceFinalStatusMenuItemId:
                Intent toCourierServiceFinalStatusForm = new Intent(Sign_Up_Form_Activity.this, CourierServiceFinalStatusForm.class);
                startActivity(toCourierServiceFinalStatusForm);
                finish();
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
