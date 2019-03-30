package com.example.m.hadiservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class CashUpdateForm extends AppCompatActivity {






    android.support.design.widget.TextInputEditText invoiceNumber;
    android.support.design.widget.TextInputEditText dateAndTime;
    android.support.design.widget.TextInputEditText paidAmount;
    android.support.design.widget.TextInputEditText remarks;

    Button updateButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_update_form);

        invoiceNumber = findViewById(R.id.cashUpdateInvoiceNumberId);
        dateAndTime = findViewById(R.id.cashUpdateDateAndTimeId);
        paidAmount = findViewById(R.id.cashUpdatePaidAmountId);
        remarks = findViewById(R.id.cashUpdateRemarksId);

        updateButton = findViewById(R.id.cashUpdateSaveBtnId);

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
                Intent toSignUpForm = new Intent(CashUpdateForm.this , Sign_Up_Form_Activity.class);
                startActivity(toSignUpForm);
                finish();
                return true;*/
            case R.id.pickUpReqFormMenuItemId:
                Intent toPickUpRequestForm = new Intent(CashUpdateForm.this , PickUpRequestForm.class);
                startActivity(toPickUpRequestForm);
                finish();
                return true;

            case R.id.courierServiceBookingFormMenuItemId:
                Intent toCourierServicBookingForm = new Intent(CashUpdateForm.this , CourierServiceBokingForm.class);
                startActivity(toCourierServicBookingForm);
                finish();
                return true;

            case R.id.courierServiceStatusUpdateFormMenuItemId:
                Intent toCourierServicStatusUpdateForm = new Intent(CashUpdateForm.this , CourierServiceStatusUpdateForm.class);
                startActivity(toCourierServicStatusUpdateForm);
                finish();
                return true;

            case R.id.educationalAndJobServicesFormMenuItemId:
                Intent toeducationalAndJobServicesForm = new Intent(CashUpdateForm.this , EducatinoalAndJobServicesForm.class);
                startActivity(toeducationalAndJobServicesForm);
                finish();
                return true;


            case R.id.travelToursServicesFormMenuItemId:
                Intent toTravelToursServicesForm = new Intent(CashUpdateForm.this , TravelAndToursServicesForm.class);
                startActivity(toTravelToursServicesForm);
                finish();
                return true;


            case R.id.cashUpdateFormMenuItemId:
                Intent toCashUpdateFormMenuItemId = new Intent(CashUpdateForm.this , CashUpdateForm.class);
                startActivity(toCashUpdateFormMenuItemId);
                finish();
                return true;

            case R.id.courierServiceFinalStatusMenuItemId:
                Intent toCourierServiceFinalStatusForm = new Intent(CashUpdateForm.this, CourierServiceFinalStatusForm.class);
                startActivity(toCourierServiceFinalStatusForm);
                finish();
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
