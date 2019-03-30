package com.example.m.hadiservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class CourierServiceBokingForm extends AppCompatActivity {


//    From Spinner Instances
//    MaterialBetterSpinner VolumatricWeightSpinner;


    /*--------------------------
    Customer Infromation Fields
    ----------------------------*/
    android.support.design.widget.TextInputEditText consignmentNumber;
    android.support.design.widget.TextInputEditText bookingDate;
    android.support.design.widget.TextInputEditText reference;
    android.support.design.widget.TextInputEditText accountNumber;
    android.support.design.widget.TextInputEditText origionCountry;
    android.support.design.widget.TextInputEditText origionPostalCode;
    android.support.design.widget.TextInputEditText origionCity;
    android.support.design.widget.TextInputEditText destinationCountry;
    android.support.design.widget.TextInputEditText destinationPostalCode;
    android.support.design.widget.TextInputEditText destinationCity;
    android.support.design.widget.TextInputEditText zone;
    android.support.design.widget.TextInputEditText length;
    android.support.design.widget.TextInputEditText width;
    android.support.design.widget.TextInputEditText height;
    android.support.design.widget.TextInputEditText weight;
    android.support.design.widget.TextInputEditText pieces;
    android.support.design.widget.TextInputEditText bookingDescription;

    MaterialBetterSpinner OrderTypeSpinner;
    MaterialBetterSpinner BookingTypeSpinner;
    MaterialBetterSpinner OvernightSpinner;

    /*--------------------------
    Sender Infromation Fields
    ----------------------------*/

    android.support.design.widget.TextInputEditText senderName;
    android.support.design.widget.TextInputEditText senderAddress;
    android.support.design.widget.TextInputEditText senderContact;

    /*--------------------------
  Reciever Infromation Fields
  ----------------------------*/

    android.support.design.widget.TextInputEditText recieverName;
    android.support.design.widget.TextInputEditText reciverAddress;
    android.support.design.widget.TextInputEditText recieverPostalCode;
    android.support.design.widget.TextInputEditText recieverCity;
    android.support.design.widget.TextInputEditText recieverCountry;
    android.support.design.widget.TextInputEditText recieverContact1;
    android.support.design.widget.TextInputEditText recieverContact2;

    /*--------------------------
      Charges Details Fields
      ----------------------------*/

    android.support.design.widget.TextInputEditText remoteAreaCharges;
    android.support.design.widget.TextInputEditText insuranceCharges;
    android.support.design.widget.TextInputEditText basicCharges;
    android.support.design.widget.TextInputEditText grandCharges;
    android.support.design.widget.TextInputEditText discount;
    android.support.design.widget.TextInputEditText discountedAmount;
    android.support.design.widget.TextInputEditText payableAmount;

    MaterialBetterSpinner FinalCashStatusSpinner;

     /*--------------------------
      COD Details Fields
      ----------------------------*/

    android.support.design.widget.TextInputEditText codClientName;
    android.support.design.widget.TextInputEditText codBussinessName;
    android.support.design.widget.TextInputEditText codPartyReference;
    android.support.design.widget.TextInputEditText itemDescription;
    android.support.design.widget.TextInputEditText codAmount;

    /*--------------------------
    Co Partner Information Fields
    ----------------------------*/
    android.support.design.widget.TextInputEditText deliveredBy;
    android.support.design.widget.TextInputEditText coPartenerDate;
    android.support.design.widget.TextInputEditText trackingNumber;
    android.support.design.widget.TextInputEditText coPartnerCharges;

    /*--------------------------
    Final Status Fields
    ----------------------------*/

    android.support.design.widget.TextInputEditText deliveryRider;
    android.support.design.widget.TextInputEditText recivedBy;
    android.support.design.widget.TextInputEditText remarks;
    android.support.design.widget.TextInputEditText sendSms;

    MaterialBetterSpinner CurrentStatusSpinner;

    /*---------------------------------------------------------------------------------------------------------------------*/
    /*----------------------------------------------------------------------------------------------------------*/
    /*----------------------------------------------------------------------------------------------------------*/


    //    Form Spinner contents
//    String[] VolumatricWeightContent = {"Length" , "Width" , "Height"};
    String[] OrderTypeSpinnerContent = {"--Select--", "Domestic", "Interantional"};  // Another domestic could be added later
    String[] OvernightContent = {"--Select--", "2nd Day", "72 Hours", "4-5 W DAYS", "5-7 W Days", "7-10 W Days", "10-15 W Days"};
    String[] BookingTypeContent = {"--Select--", "Document", "Non Document", "Parcel", "Hand Cary", "COD"};
    String[] FinalCashStatusContent = {"--Select--", "Paid", "Pending"};
    String[] CurrentStatusContent = {"--Select--", "ON ROUTE"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courier_service_boking_form);

        /*--------------------------
        Customer Infromation Fields
        ----------------------------*/

        consignmentNumber = findViewById(R.id.bookCorSerConsignmentNumId);
        bookingDate = findViewById(R.id.bookCorSerBookingDateId);
        reference = findViewById(R.id.bookCorSerReferenceId);
        accountNumber = findViewById(R.id.bookCorSerAccountNumId);
        origionCountry = findViewById(R.id.bookCorSerOrigionCountryId);
        origionPostalCode = findViewById(R.id.bookCorSerOrigionPostalCodeId);
        origionCity = findViewById(R.id.bookCorSerOrigionCityId);
        destinationCountry = findViewById(R.id.bookCorSerDestinationCountryId);
        destinationPostalCode = findViewById(R.id.bookCorSerRecieverPostalCodeId);
        destinationCity = findViewById(R.id.bookCorSerDestCityId);
        zone = findViewById(R.id.bookCorSerZoneId);

        length = findViewById(R.id.bookCorSerLengthId);
        width = findViewById(R.id.bookCorSerWidthId);
        height = findViewById(R.id.bookCorSerHeightId);

        weight = findViewById(R.id.bookCorSerWeightTotalId);

        pieces = findViewById(R.id.bookCorSerPiecesId);
        bookingDescription = findViewById(R.id.bookCorSerBookingDesctionId);

        height.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (length.getText().toString().trim() != "" && width.getText().toString().trim() != "" && height.getText().toString().trim() != "" && length.getText().toString().trim() != null && width.getText().toString().trim() != null && height.getText().toString().trim() != null) {
                    String calculatedVolumatricWeight = calculateVolumatrictWeight(length.getText().toString().trim(), width.getText().toString().trim(), height.getText().toString().trim());
                    if (calculatedVolumatricWeight != "0")
                        weight.setText(calculatedVolumatricWeight);
                }
            }
        });

       /* width.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (length.getText().toString().trim() != "" && width.getText().toString().trim() != "" && height.getText().toString().trim() != "" && length.getText().toString().trim() != null && width.getText().toString().trim() != null && height.getText().toString().trim() != null) {
                    String calculatedVolumatricWeight = calculateVolumatrictWeight(length.getText().toString().trim(), width.getText().toString().trim(), height.getText().toString().trim());
                    if (calculatedVolumatricWeight != "0")
                        weight.setText(calculatedVolumatricWeight);
                }
            }
        });

        length.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (length.getText().toString().trim() != "" && width.getText().toString().trim() != "" && height.getText().toString().trim() != "" && length.getText().toString().trim() != null && width.getText().toString().trim() != null && height.getText().toString().trim() != null) {
                    String calculatedVolumatricWeight = calculateVolumatrictWeight(length.getText().toString().trim(), width.getText().toString().trim(), height.getText().toString().trim());
                    if (calculatedVolumatricWeight != "0")
                        weight.setText(calculatedVolumatricWeight);
                }
            }
        });*/

        /*--------------------------
        Sender Infromation Fields
        ----------------------------*/

        senderName = findViewById(R.id.bookCorSerSenderNameId);
        senderAddress = findViewById(R.id.bookCorSerSenderAddressId);
        senderContact = findViewById(R.id.bookCorSerSenderContactId);

        /*--------------------------
          Reciever Infromation Fields
          ----------------------------*/
        recieverName = findViewById(R.id.bookCorSerRecieverNameId);
        reciverAddress = findViewById(R.id.bookCorSerRecieverAddressId);
        recieverPostalCode = findViewById(R.id.bookCorSerRecieverPostalCodeId);
        recieverCity = findViewById(R.id.bookCorSerRecieverCityId);
        recieverCountry = findViewById(R.id.bookCorSerRecieverCountyId);
        recieverContact1 = findViewById(R.id.bookCorSerRecieverContact1Id);
        recieverContact2 = findViewById(R.id.bookCorSerRecieverContact2Id);

        /*--------------------------
      Charges Details Fields
      ----------------------------*/
        remoteAreaCharges = findViewById(R.id.bookCorSerRemoteAreaChargesId);
        insuranceCharges = findViewById(R.id.bookCorSerInsuraceChargesId);
        basicCharges = findViewById(R.id.bookCorSerBasicChargesId);
        grandCharges = findViewById(R.id.bookCorSerGrandTotalId);
        discount = findViewById(R.id.bookCorSerDiscountId);
        discountedAmount = findViewById(R.id.bookCorSerDiscountedAmountId);
        payableAmount = findViewById(R.id.bookCorSerPayableAmountId);

        FinalCashStatusSpinner = findViewById(R.id.bookCorSerFinalCashStatusId);


        /*--------------------------
      COD Details Fields
      ----------------------------*/
        codClientName = findViewById(R.id.bookCorSerCodClientNameId);
        codBussinessName = findViewById(R.id.bookCorSerCodBusinessNameId);
        codPartyReference = findViewById(R.id.bookCorSerCodPartyReferenceId);
        itemDescription = findViewById(R.id.bookCorSerItemDescriptionId);
        codAmount = findViewById(R.id.bookCorSerCodAmountId);


    /*--------------------------
    Co Partner Information Fields
    ----------------------------*/
        deliveredBy = findViewById(R.id.bookCorSerDeliveredById);
        coPartenerDate = findViewById(R.id.bookCorSerDateId);
        trackingNumber = findViewById(R.id.bookCorSerTrackingNumId);
        coPartnerCharges = findViewById(R.id.bookCorSerChargesId);

    /*--------------------------
    Final Status Fields
    ----------------------------*/
        deliveryRider = findViewById(R.id.bookCorSerDeliveredById);
        recivedBy = findViewById(R.id.bookCorReceivedById);
        remarks = findViewById(R.id.bookCorSerRemarksId);
        sendSms = findViewById(R.id.bookCorSerSendSMSId);

//    From Spinner Views
//        VolumatricWeightSpinner = findViewById(R.id.bookCorSerVolumatricWeightId);
        OrderTypeSpinner = findViewById(R.id.bookCorSerOrderTypeId);
        BookingTypeSpinner = findViewById(R.id.bookCorSerBookingTypeId);
        OvernightSpinner = findViewById(R.id.bookCorSerOvernightId);
        FinalCashStatusSpinner = findViewById(R.id.bookCorSerFinalCashStatusId);
        CurrentStatusSpinner = findViewById(R.id.bookCorSerCurrentStatusId);

        //    From Spinner Adapters
//        ArrayAdapter<String> VolumatricWeightAdapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item ,VolumatricWeightContent);
        ArrayAdapter<String> OrderTypetAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, OrderTypeSpinnerContent);
        ArrayAdapter<String> BookingTypeAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, BookingTypeContent);
        ArrayAdapter<String> OvernightAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, OvernightContent);
        ArrayAdapter<String> FinalCashStatusAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, FinalCashStatusContent);
        ArrayAdapter<String> CurrentStatusAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, CurrentStatusContent);

//        Set Form Spinner Adapters
//        VolumatricWeightSpinner.setAdapter(VolumatricWeightAdapter);
        OrderTypeSpinner.setAdapter(OrderTypetAdapter);
        BookingTypeSpinner.setAdapter(BookingTypeAdapter);
        OvernightSpinner.setAdapter(OvernightAdapter);
        FinalCashStatusSpinner.setAdapter(FinalCashStatusAdapter);
        CurrentStatusSpinner.setAdapter(CurrentStatusAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true/*super.onCreateOptionsMenu(menu)*/;
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
            /*case R.id.signUpFormMenuItemId:
                Intent toSignUpForm = new Intent(CourierServiceBokingForm.this , Sign_Up_Form_Activity.class);
                startActivity(toSignUpForm);
                finish();
                return true;*/
            case R.id.pickUpReqFormMenuItemId:
                Intent toPickUpRequestForm = new Intent(CourierServiceBokingForm.this, PickUpRequestForm.class);
                startActivity(toPickUpRequestForm);
                finish();
                return true;

            case R.id.courierServiceBookingFormMenuItemId:
                Intent toCourierServicBookingForm = new Intent(CourierServiceBokingForm.this, CourierServiceBokingForm.class);
                startActivity(toCourierServicBookingForm);
                finish();
                return true;

            case R.id.courierServiceStatusUpdateFormMenuItemId:
                Intent toCourierServicStatusUpdateForm = new Intent(CourierServiceBokingForm.this, CourierServiceStatusUpdateForm.class);
                startActivity(toCourierServicStatusUpdateForm);
                finish();
                return true;

            case R.id.educationalAndJobServicesFormMenuItemId:
                Intent toeducationalAndJobServicesForm = new Intent(CourierServiceBokingForm.this, EducatinoalAndJobServicesForm.class);
                startActivity(toeducationalAndJobServicesForm);
                finish();
                return true;


            case R.id.travelToursServicesFormMenuItemId:
                Intent toTravelToursServicesForm = new Intent(CourierServiceBokingForm.this, TravelAndToursServicesForm.class);
                startActivity(toTravelToursServicesForm);
                finish();
                return true;


            case R.id.cashUpdateFormMenuItemId:
                Intent toCashUpdateFormMenuItemId = new Intent(CourierServiceBokingForm.this, CashUpdateForm.class);
                startActivity(toCashUpdateFormMenuItemId);
                finish();
                return true;

            case R.id.courierServiceFinalStatusMenuItemId:
                Intent toCourierServiceFinalStatusForm = new Intent(CourierServiceBokingForm.this, CourierServiceFinalStatusForm.class);
                startActivity(toCourierServiceFinalStatusForm);
                finish();
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public String calculateVolumatrictWeight(String length, String width, String height) {

        float chargeableWeight = 0;
        if (length != "" && width != "" && height != "" && length != null && width != null && height != null) {
            float l = Float.valueOf(length);
            float w = Float.valueOf(width);
            float h = Float.valueOf(height);

            chargeableWeight = (l * w * h) / 5000;
        }
        return String.valueOf(chargeableWeight);

    }

}
