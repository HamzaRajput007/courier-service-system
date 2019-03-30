package com.example.m.hadiservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class PickUpRequestForm extends AppCompatActivity {

    MaterialBetterSpinner OrderTypeSpinner;
    MaterialBetterSpinner BookingTypeSpinner;
    MaterialBetterSpinner ServiceTypeSpinner;


    /*--------------------------
    Customer Infromation Fields
    ----------------------------*/
    android.support.design.widget.TextInputEditText name;
    android.support.design.widget.TextInputEditText address;
    android.support.design.widget.TextInputEditText city;
    android.support.design.widget.TextInputEditText state;
    android.support.design.widget.TextInputEditText postalCode;
    android.support.design.widget.TextInputEditText telePhone;
    android.support.design.widget.TextInputEditText mobile;
    android.support.design.widget.TextInputEditText email;
    android.support.design.widget.TextInputEditText shipmentWeight;
    android.support.design.widget.TextInputEditText origion;
    android.support.design.widget.TextInputEditText destination;
    android.support.design.widget.TextInputEditText shipmentDate;

    // Spinners (Combo Boxes) contents as Required)
    String[] OrderTypesContent = {"Express Distribution - Air [Surface] Rail"};
    String[] BookingTypesContent = {"Premimu (Next Day Delivery)" , "Premium Plus (12 Hours Delivery)" , "Express (Assured Delivery Date)" , "Express Plus (Delivery At its Fastes)" , "Flexilite (Via Air. Rs 60 / kg**" , "Laabh (Via Surface. Rs 440 for 20kg**" , "Secure Box (Via Air. Rs 440 for 10kg**"};
    String[] ServiceTypesContent = {"Documents" , "Non Documents"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_up_request_form);

        /*--------------------------
        Customer Infromation Fields
        ----------------------------*/
        name = findViewById(R.id.pickUpReqNameId);
        address = findViewById(R.id.PickUpReqAddressId);
        city = findViewById(R.id.PickUpReqCityId);
        state = findViewById(R.id.PickUpReqStateId);
        postalCode = findViewById(R.id.PickUpReqPostalCodeId);
        telePhone = findViewById(R.id.PickUpReqTelePhoneId);
        mobile = findViewById(R.id.PickUpReqMobileId);
        email = findViewById(R.id.PickUpReqEmailId);
        shipmentWeight = findViewById(R.id.PickUpReqShipmentWeighId);
        origion = findViewById(R.id.PickUpReqOrigionId);
        destination = findViewById(R.id.PickUpReqDestinationId);
        shipmentDate = findViewById(R.id.PickUpReqShipmentDateId);

        OrderTypeSpinner = findViewById(R.id.pickUpOrderTypeId);
        BookingTypeSpinner = findViewById(R.id.pickUpReqBookingTypeId);
        ServiceTypeSpinner = findViewById(R.id.pickUpServiceTypeId);

        ArrayAdapter<String> OrderTypesContentAdapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,OrderTypesContent);
        ArrayAdapter<String> BookingTypesContentAdapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,BookingTypesContent);
        ArrayAdapter<String> ServiceTypesContentAdapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,ServiceTypesContent);

        OrderTypeSpinner.setAdapter(OrderTypesContentAdapter);
        BookingTypeSpinner.setAdapter(BookingTypesContentAdapter);
        ServiceTypeSpinner.setAdapter(ServiceTypesContentAdapter);

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
                Intent toSignUpForm = new Intent(PickUpRequestForm.this , Sign_Up_Form_Activity.class);
                startActivity(toSignUpForm);
                finish();
                return true;*/
            case R.id.pickUpReqFormMenuItemId:
                Intent toPickUpRequestForm = new Intent(PickUpRequestForm.this , PickUpRequestForm.class);
                startActivity(toPickUpRequestForm);
                finish();
                return true;

            case R.id.courierServiceBookingFormMenuItemId:
                Intent toCourierServicBookingForm = new Intent(PickUpRequestForm.this , CourierServiceBokingForm.class);
                startActivity(toCourierServicBookingForm);
                finish();
                return true;

            case R.id.courierServiceStatusUpdateFormMenuItemId:
                Intent toCourierServicStatusUpdateForm = new Intent(PickUpRequestForm.this , CourierServiceStatusUpdateForm.class);
                startActivity(toCourierServicStatusUpdateForm);
                finish();
                return true;

            case R.id.educationalAndJobServicesFormMenuItemId:
                Intent toeducationalAndJobServicesForm = new Intent(PickUpRequestForm.this , EducatinoalAndJobServicesForm.class);
                startActivity(toeducationalAndJobServicesForm);
                finish();
                return true;


            case R.id.travelToursServicesFormMenuItemId:
                Intent toTravelToursServicesForm = new Intent(PickUpRequestForm.this , TravelAndToursServicesForm.class);
                startActivity(toTravelToursServicesForm);
                finish();
                return true;


            case R.id.cashUpdateFormMenuItemId:
                Intent toCashUpdateFormMenuItemId = new Intent(PickUpRequestForm.this , CashUpdateForm.class);
                startActivity(toCashUpdateFormMenuItemId);
                finish();
                return true;


            case R.id.courierServiceFinalStatusMenuItemId:
                Intent toCourierServiceFinalStatusForm = new Intent(PickUpRequestForm.this, CourierServiceFinalStatusForm.class);
                startActivity(toCourierServiceFinalStatusForm);
                finish();
                return true;



            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
