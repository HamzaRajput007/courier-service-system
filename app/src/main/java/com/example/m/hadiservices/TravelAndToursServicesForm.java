package com.example.m.hadiservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class TravelAndToursServicesForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_and_tours_services_form);
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
                Intent toSignUpForm = new Intent(TravelAndToursServicesForm.this , Sign_Up_Form_Activity.class);
                startActivity(toSignUpForm);
                finish();
                return true;*/
            case R.id.pickUpReqFormMenuItemId:
                Intent toPickUpRequestForm = new Intent(TravelAndToursServicesForm.this , PickUpRequestForm.class);
                startActivity(toPickUpRequestForm);
                finish();
                return true;

            case R.id.courierServiceBookingFormMenuItemId:
                Intent toCourierServicBookingForm = new Intent(TravelAndToursServicesForm.this , CourierServiceBokingForm.class);
                startActivity(toCourierServicBookingForm);
                finish();
                return true;

            case R.id.courierServiceStatusUpdateFormMenuItemId:
                Intent toCourierServicStatusUpdateForm = new Intent(TravelAndToursServicesForm.this , CourierServiceStatusUpdateForm.class);
                startActivity(toCourierServicStatusUpdateForm);
                finish();
                return true;

            case R.id.educationalAndJobServicesFormMenuItemId:
                Intent toeducationalAndJobServicesForm = new Intent(TravelAndToursServicesForm.this , EducatinoalAndJobServicesForm.class);
                startActivity(toeducationalAndJobServicesForm);
                finish();
                return true;


            case R.id.travelToursServicesFormMenuItemId:
                Intent toTravelToursServicesForm = new Intent(TravelAndToursServicesForm.this , TravelAndToursServicesForm.class);
                startActivity(toTravelToursServicesForm);
                finish();
                return true;


            case R.id.cashUpdateFormMenuItemId:
                Intent toCashUpdateFormMenuItemId = new Intent(TravelAndToursServicesForm.this , CashUpdateForm.class);
                startActivity(toCashUpdateFormMenuItemId);
                finish();
                return true;


            case R.id.courierServiceFinalStatusMenuItemId:
                Intent toCourierServiceFinalStatusForm = new Intent(TravelAndToursServicesForm.this, CourierServiceFinalStatusForm.class);
                startActivity(toCourierServiceFinalStatusForm);
                finish();
                return true;



            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
