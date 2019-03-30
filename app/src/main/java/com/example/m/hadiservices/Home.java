package com.example.m.hadiservices;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //Display Cardviews
//    CardView TravelAndTour  ;
    CardView BookCourService  ;
    CardView CashUpdate  ;
    CardView CourSerFinalStatus  ;
    CardView UpdateCourSerStatus  ;
    CardView EducationAndJobService  ;
    CardView RequestPickUp  ;

    //Navigations Drawer
    DrawerLayout drawerLayout ;
    NavigationView navigationView;

    Toolbar toolbar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        toolbar = findViewById(R.id.toolBarId);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.mipmap.menu);

        drawerLayout = findViewById(R.id.drawerLayoutId);
        drawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View view, float v) {

            }

            @Override
            public void onDrawerOpened(@NonNull View view) {

            }

            @Override
            public void onDrawerClosed(@NonNull View view) {

            }

            @Override
            public void onDrawerStateChanged(int i) {

            }
        });

        navigationView = findViewById(R.id.navigationViewId);
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

//        TravelAndTour = findViewById(R.id.travelAndTourCardViewId);
        BookCourService = findViewById(R.id.bookCorSerCardViewId);
        CashUpdate = findViewById(R.id.cashUpdateCardViewId);
        CourSerFinalStatus = findViewById(R.id.courSerFinalStatusCardViewId);
        UpdateCourSerStatus = findViewById(R.id.updateCorSerStatusCardViewId);
        EducationAndJobService = findViewById(R.id.eduAndJobServiceCardViewId);
        RequestPickUp = findViewById(R.id.requestPickCardViewId);



//        CARD VIEW OnClicks
        /*TravelAndTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toClickedForm = new Intent(Home.this,TravelAndToursServicesForm.class);
                startActivity(toClickedForm);
            }
        });*/
        BookCourService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toClickedForm = new Intent(Home.this,CourierServiceBokingForm.class);
                startActivity(toClickedForm);
            }
        });
        CashUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toClickedForm = new Intent(Home.this,CashUpdateForm.class);
                startActivity(toClickedForm);
            }
        });
        CourSerFinalStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toClickedForm = new Intent(Home.this,CourierServiceFinalStatusForm.class);
                startActivity(toClickedForm);
            }
        });
        UpdateCourSerStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toClickedForm = new Intent(Home.this,CourierServiceStatusUpdateForm.class);
                startActivity(toClickedForm);
            }
        });
        EducationAndJobService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toClickedForm = new Intent(Home.this,EducatinoalAndJobServicesForm.class);
                startActivity(toClickedForm);
            }
        });
        RequestPickUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toClickedForm = new Intent(Home.this,PickUpRequestForm.class);
                startActivity(toClickedForm);
            }
        });


    }

//    Extra comments
         /*@Override
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                break;
            case R.id.signUpFormMenuItemId:
                Intent toSignUpForm = new Intent(Home.this, Sign_Up_Form_Activity.class);
                startActivity(toSignUpForm);
                finish();
                break;
            case R.id.pickUpReqFormMenuItemId:
                Intent toPickUpRequestForm = new Intent(Home.this, PickUpRequestForm.class);
                startActivity(toPickUpRequestForm);
                finish();
                break;

            case R.id.courierServiceBookingFormMenuItemId:
                Intent toCourierServicBookingForm = new Intent(Home.this, CourierServiceBokingForm.class);
                startActivity(toCourierServicBookingForm);
                finish();
                break;

            case R.id.courierServiceStatusUpdateFormMenuItemId:
                Intent toCourierServicStatusUpdateForm = new Intent(Home.this, CourierServiceStatusUpdateForm.class);
                startActivity(toCourierServicStatusUpdateForm);
                finish();
                break;

            case R.id.educationalAndJobServicesFormMenuItemId:
                Intent toeducationalAndJobServicesForm = new Intent(Home.this, EducatinoalAndJobServicesForm.class);
                startActivity(toeducationalAndJobServicesForm);
                finish();
                break;


            case R.id.travelToursServicesFormMenuItemId:
                Intent toTravelToursServicesForm = new Intent(Home.this, TravelAndToursServicesForm.class);
                startActivity(toTravelToursServicesForm);
                finish();
                break;


            case R.id.cashUpdateFormMenuItemId:
                Intent toCashUpdateFormMenuItemId = new Intent(Home.this, CashUpdateForm.class);
                startActivity(toCashUpdateFormMenuItemId);
                finish();
                break;


            case R.id.courierServiceFinalStatusMenuItemId:
                Intent toCourierServiceFinalStatusForm = new Intent(Home.this, CourierServiceFinalStatusForm.class);
                startActivity(toCourierServiceFinalStatusForm);
                finish();
                break;



            default:
                return super.onOptionsItemSelected(item);
        }
*/
       /* switch (item.getItemId()) {
            case R.id.signUpFormMenuItemId:
                Intent toSignUpForm = new Intent(Home.this, Sign_Up_Form_Activity.class);
                startActivity(toSignUpForm);
                finish();
                break;
            case R.id.pickUpReqFormMenuItemId:
                Intent toPickUpRequestForm = new Intent(Home.this, PickUpRequestForm.class);
                startActivity(toPickUpRequestForm);
                finish();
                break;

            case R.id.courierServiceBookingFormMenuItemId:
                Intent toCourierServicBookingForm = new Intent(Home.this, CourierServiceBokingForm.class);
                startActivity(toCourierServicBookingForm);
                finish();
                break;

            case R.id.courierServiceStatusUpdateFormMenuItemId:
                Intent toCourierServicStatusUpdateForm = new Intent(Home.this, CourierServiceStatusUpdateForm.class);
                startActivity(toCourierServicStatusUpdateForm);
                finish();
                break;

            case R.id.educationalAndJobServicesFormMenuItemId:
                Intent toeducationalAndJobServicesForm = new Intent(Home.this, EducatinoalAndJobServicesForm.class);
                startActivity(toeducationalAndJobServicesForm);
                finish();
                break;


            case R.id.travelToursServicesFormMenuItemId:
                Intent toTravelToursServicesForm = new Intent(Home.this, TravelAndToursServicesForm.class);
                startActivity(toTravelToursServicesForm);
                finish();
                break;


            case R.id.cashUpdateFormMenuItemId:
                Intent toCashUpdateFormMenuItemId = new Intent(Home.this, CashUpdateForm.class);
                startActivity(toCashUpdateFormMenuItemId);
                finish();
                break;


            case R.id.courierServiceFinalStatusMenuItemId:
                Intent toCourierServiceFinalStatusForm = new Intent(MainActivity.this, CourierServiceFinalStatusForm.class);
                startActivity(toCourierServiceFinalStatusForm);
                finish();
                break;



            default:
                return super.onOptionsItemSelected(item);
        }
    }

*/
    @Override
    public void onBackPressed() {

        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Toast.makeText(this, "One Drawer item clicked", Toast.LENGTH_SHORT).show();

        switch (menuItem.getItemId()) {

          /*  case R.id.signUpFormMenuItemId:
                Intent toSignUpForm = new Intent(Home.this, Sign_Up_Form_Activity.class);
                startActivity(toSignUpForm);
                break;*/
            case R.id.pickUpReqFormMenuItemId:
                Intent toPickUpRequestForm = new Intent(Home.this, PickUpRequestForm.class);
                startActivity(toPickUpRequestForm);
                break;

            case R.id.courierServiceBookingFormMenuItemId:
                Intent toCourierServicBookingForm = new Intent(Home.this, CourierServiceBokingForm.class);
                startActivity(toCourierServicBookingForm);
                break;

            case R.id.courierServiceStatusUpdateFormMenuItemId:
                Intent toCourierServicStatusUpdateForm = new Intent(Home.this, CourierServiceStatusUpdateForm.class);
                startActivity(toCourierServicStatusUpdateForm);
                break;

            case R.id.educationalAndJobServicesFormMenuItemId:
                Intent toeducationalAndJobServicesForm = new Intent(Home.this, EducatinoalAndJobServicesForm.class);
                startActivity(toeducationalAndJobServicesForm);
                break;


            case R.id.travelToursServicesFormMenuItemId:
                Intent toTravelToursServicesForm = new Intent(Home.this, TravelAndToursServicesForm.class);
                startActivity(toTravelToursServicesForm);
                break;


            case R.id.cashUpdateFormMenuItemId:
                Intent toCashUpdateFormMenuItemId = new Intent(Home.this, CashUpdateForm.class);
                startActivity(toCashUpdateFormMenuItemId);
                break;


            case R.id.courierServiceFinalStatusMenuItemId:
                Intent toCourierServiceFinalStatusForm = new Intent(Home.this, CourierServiceFinalStatusForm.class);
                startActivity(toCourierServiceFinalStatusForm);
                break;



            default:
                return super.onOptionsItemSelected(menuItem);
        }
        drawerLayout.closeDrawer(GravityCompat.START);

        return true;


    }
}
