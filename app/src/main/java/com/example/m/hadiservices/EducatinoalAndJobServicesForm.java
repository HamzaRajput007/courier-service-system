package com.example.m.hadiservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class EducatinoalAndJobServicesForm extends AppCompatActivity {

    Button submitButton;

    /*--------------------------
   Customer Infromation Fields
   ----------------------------*/
    android.support.design.widget.TextInputEditText invoiceNumber;
    android.support.design.widget.TextInputEditText bookingDate;
    android.support.design.widget.TextInputEditText reference;
    android.support.design.widget.TextInputEditText accountNumber; //This is the account number of our app .. not Bank Account Number
    android.support.design.widget.TextInputEditText subjectDetails;

    CheckBox jobsMatters;
    CheckBox educationMatters;


    /*--------------------------
   Educational Matters CheckBoxes
   ----------------------------*/

    CheckBox registraion;
    CheckBox registrationCancel;
    CheckBox admission;
    CheckBox degreeVerification;
    CheckBox duplicateDegree;
    CheckBox NOC;


    /*--------------------------
   Educational Matters CheckBoxes
   ----------------------------*/

    CheckBox PPSC;
    CheckBox FPSC;
    CheckBox NTS;
    CheckBox UTS;
    CheckBox OTS;
    CheckBox PTS;

     /*--------------------------
   Board / University / Department RadioButtons
   ----------------------------*/

    RadioButton biseSargodha;
    RadioButton biseGujrawal;
    RadioButton biseRawalpindi;
    RadioButton sargodhaUniversity;
    RadioButton punjabUniversity;
    RadioButton gujratUniversity;
    RadioButton aiouIslmabad;
    RadioButton otherBoard;

     /*--------------------------
   Program RadioButtons
   ----------------------------*/

    RadioButton matric;
    RadioButton inter;
    RadioButton graduation;
    RadioButton master;
    RadioButton higher;
    RadioButton otherProgram;


      /*--------------------------
   Part Or Semester RadioButtons
   ----------------------------*/

    RadioButton part1;
    RadioButton part2;
    RadioButton Semester1;
    RadioButton Semester2;
    RadioButton Semester3;
    RadioButton Semester4;
    RadioButton Semester5;
    RadioButton Semester6;
    RadioButton Semester7;
    RadioButton Semester8;
    RadioButton otherSemester;

    /*--------------------------
   Charges Details Fields
   ----------------------------*/

    android.support.design.widget.TextInputEditText registrationFee;
    android.support.design.widget.TextInputEditText registrationCancelFee;
    android.support.design.widget.TextInputEditText admissionFee;
    android.support.design.widget.TextInputEditText nocFee;
    android.support.design.widget.TextInputEditText verificationFee;
    android.support.design.widget.TextInputEditText duplicateResultFee;
    android.support.design.widget.TextInputEditText cardOrDegreeFee;
    android.support.design.widget.TextInputEditText otherFee;
    android.support.design.widget.TextInputEditText totalFee;
    android.support.design.widget.TextInputEditText paidFee;
    android.support.design.widget.TextInputEditText pendingAmount;

    RadioButton paid;
    RadioButton pending;

    /*--------------------------
   Bank Details Fields
   ----------------------------*/

    android.support.design.widget.TextInputEditText challanNumber;
    android.support.design.widget.TextInputEditText paidDate;
    android.support.design.widget.TextInputEditText paidAmount;

    /*--------------------------
   Co Partner Details Fields
   ----------------------------*/

    android.support.design.widget.TextInputEditText bussinessName;
    android.support.design.widget.TextInputEditText dateCoPartner;
    android.support.design.widget.TextInputEditText chargesCoPartner;

     /*--------------------------
   Final Status
   ----------------------------*/

    RadioButton pendingStatus;
    RadioButton completedStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educatinoal_and_job_services_form);

        /*--------------------------
       Submit Button
       ----------------------------*/
        submitButton = findViewById(R.id.educationAndJobsServiceSubmitBtnId);

         /*--------------------------
       Customer Infromation Fields
       ----------------------------*/
        invoiceNumber = findViewById(R.id.eduAndJobInvoiceNumberId);
        bookingDate = findViewById(R.id.eduAndJobBookingDateId);
        reference = findViewById(R.id.eduAndJobReferenceId);
        accountNumber = findViewById(R.id.eduAndJobAccountNumId);
        subjectDetails = findViewById(R.id.eduAndJobSubjectsDetailId);

        jobsMatters = findViewById(R.id.eduAndJobJobsMattersCheckBoxId);
        educationMatters = findViewById(R.id.eduAndJobEducationalMattersCheckBoxId);

        /*--------------------------
       Educational Matters CheckBoxes
       ----------------------------*/

        registraion = findViewById(R.id.eduAndJobRegistrationCheckBoxId);
        registrationCancel = findViewById(R.id.eduAndJobRegistrationCancelCheckBoxId);
        admission = findViewById(R.id.eduAndJobAdmissionCheckBoxId);
        degreeVerification = findViewById(R.id.eduAndJobDegreeVerificationCheckBoxId);
        duplicateDegree = findViewById(R.id.eduAndJobDuplicateDegreeCheckBoxId);
        NOC = findViewById(R.id.eduAndJobNOCCheckBoxId);

        /*--------------------------
       Educational Matters CheckBoxes
       ----------------------------*/

        PPSC = findViewById(R.id.eduAndJobPPSCCheckBoxId);
        FPSC = findViewById(R.id.eduAndJobFPSCCheckBoxId);
        NTS = findViewById(R.id.eduAndJobNTSCheckBoxId);
        UTS = findViewById(R.id.eduAndJobUTSCheckBoxId);
        OTS = findViewById(R.id.eduAndJobOTSCheckBoxId);
        PTS = findViewById(R.id.eduAndJobPTSCheckBoxId);

        /*--------------------------
       Board / University / Department RadioButtons
       ----------------------------*/

        biseSargodha = findViewById(R.id.eduAndJobBISESARGODHAId);
        biseGujrawal = findViewById(R.id.eduAndJobBISEGUJRANWALAId);
        biseRawalpindi = findViewById(R.id.eduAndJobBISERAWALPINDIId);
        sargodhaUniversity = findViewById(R.id.eduAndJobSARGODHAUNIVERSITYId);
        punjabUniversity = findViewById(R.id.eduAndJobPUNJABUNIVERSITYId);
        gujratUniversity = findViewById(R.id.eduAndJobGUJRATUNIVERSITYId);
        aiouIslmabad = findViewById(R.id.eduAndJobAIOUISLAMABADId);
        otherBoard = findViewById(R.id.eduAndJobOtherBaordUniDepId);

        /*--------------------------
       Program RadioButtons
       ----------------------------*/

        matric = findViewById(R.id.eduAndJobMatricId);
        inter = findViewById(R.id.eduAndJobInterId);
        graduation = findViewById(R.id.eduAndJobGraduationId);
        master = findViewById(R.id.eduAndJobMasterId);
        higher = findViewById(R.id.eduAndJobHigherId);
        otherProgram = findViewById(R.id.eduAndJobOtherProgramId);

        /*--------------------------
       Part Or Semester RadioButtons
       ----------------------------*/

        part1 = findViewById(R.id.eduAndJobPart1Id);
        part2 = findViewById(R.id.eduAndJobPart2Id);
        Semester1 = findViewById(R.id.eduAndJobSemeter1Id);
        Semester2 = findViewById(R.id.eduAndJobSemeter2Id);
        Semester3 = findViewById(R.id.eduAndJobSemeter3Id);
        Semester4 = findViewById(R.id.eduAndJobSemeter4Id);
        Semester5 = findViewById(R.id.eduAndJobSemeter5Id);
        Semester6 = findViewById(R.id.eduAndJobSemeter6Id);
        Semester7 = findViewById(R.id.eduAndJobSemeter7Id);
        Semester8 = findViewById(R.id.eduAndJobSemeter8Id);
        otherSemester = findViewById(R.id.eduAndJobOtherPartSemId);

        /*--------------------------
       Charges Details Fields
       ----------------------------*/

        registrationFee = findViewById(R.id.eduAndJobRegistrationFeeId);
        registrationCancelFee = findViewById(R.id.eduAndJobRegistrationCancelFeeId);
        admissionFee = findViewById(R.id.eduAndJobAdmissionFeeId);
        nocFee = findViewById(R.id.eduAndJobNOCFeeId);
        verificationFee = findViewById(R.id.eduAndJobVerificationFeeId);
        duplicateResultFee = findViewById(R.id.eduAndJobDuplicateResultId);
        cardOrDegreeFee = findViewById(R.id.eduAndJobCardOrDegreeFeeId);
        otherFee = findViewById(R.id.eduAndJobOtherFeeId);
        totalFee = findViewById(R.id.eduAndJobTotalFeeId);
        paidFee = findViewById(R.id.eduAndJobPaidFeeId);
        pendingAmount = findViewById(R.id.eduAndJobPendingAmountId);

        paid = findViewById(R.id.eduAndJobPaidId);
        pending = findViewById(R.id.eduAndJobPendingId);

        /*--------------------------
       Bank Details Fields
       ----------------------------*/

        challanNumber = findViewById(R.id.eduAndJobChallanNumberId);
        paidDate = findViewById(R.id.eduAndJobPaidDateId);
        paidAmount = findViewById(R.id.cashUpdatePaidAmountId);

      /*--------------------------
       Co Partner Details Fields
       ----------------------------*/

        bussinessName = findViewById(R.id.eduAndJobBusinessNameId);
        dateCoPartner = findViewById(R.id.eduAndJobDateId);
        chargesCoPartner = findViewById(R.id.eduAndJobChargesId);

        /*--------------------------
       Final Status
       ----------------------------*/

        pendingStatus = findViewById(R.id.eduAndJobPendingFinalStatusId);
        completedStatus = findViewById(R.id.eduAndJobCompletedFinalStatusId);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true/*super.onCreateOptionsMenu(menu)*/;
    }


    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
           /* case R.id.signUpFormMenuItemId:
                Intent toSignUpForm = new Intent(EducatinoalAndJobServicesForm.this , Sign_Up_Form_Activity.class);
                startActivity(toSignUpForm);
                finish();
                return true;*/
            case R.id.pickUpReqFormMenuItemId:
                Intent toPickUpRequestForm = new Intent(EducatinoalAndJobServicesForm.this, PickUpRequestForm.class);
                startActivity(toPickUpRequestForm);
                finish();
                return true;

            case R.id.courierServiceBookingFormMenuItemId:
                Intent toCourierServicBookingForm = new Intent(EducatinoalAndJobServicesForm.this, CourierServiceBokingForm.class);
                startActivity(toCourierServicBookingForm);
                finish();
                return true;

            case R.id.courierServiceStatusUpdateFormMenuItemId:
                Intent toCourierServicStatusUpdateForm = new Intent(EducatinoalAndJobServicesForm.this, CourierServiceStatusUpdateForm.class);
                startActivity(toCourierServicStatusUpdateForm);
                finish();
                return true;

            case R.id.educationalAndJobServicesFormMenuItemId:
                Intent toeducationalAndJobServicesForm = new Intent(EducatinoalAndJobServicesForm.this, EducatinoalAndJobServicesForm.class);
                startActivity(toeducationalAndJobServicesForm);
                finish();
                return true;


            case R.id.travelToursServicesFormMenuItemId:
                Intent toTravelToursServicesForm = new Intent(EducatinoalAndJobServicesForm.this, TravelAndToursServicesForm.class);
                startActivity(toTravelToursServicesForm);
                finish();
                return true;


            case R.id.cashUpdateFormMenuItemId:
                Intent toCashUpdateFormMenuItemId = new Intent(EducatinoalAndJobServicesForm.this, CashUpdateForm.class);
                startActivity(toCashUpdateFormMenuItemId);
                finish();
                return true;


            case R.id.courierServiceFinalStatusMenuItemId:
                Intent toCourierServiceFinalStatusForm = new Intent(EducatinoalAndJobServicesForm.this, CourierServiceFinalStatusForm.class);
                startActivity(toCourierServiceFinalStatusForm);
                finish();
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
