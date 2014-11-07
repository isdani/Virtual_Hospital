package com.example.swapview;

import com.example.swapview.R;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.ActionBar.Tab;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class SplashScreen extends FragmentActivity implements ActionBar.TabListener {
	
	ActionBar actionbar; 
	ViewPager viewpager;
	FragmentPageAdapter ft;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); 
        
        viewpager = (ViewPager) findViewById(R.id.pager);
        ft =new FragmentPageAdapter(getSupportFragmentManager());
        actionbar=getActionBar();
        
        viewpager.setAdapter(ft);
        actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionbar.addTab(actionbar.newTab().setText("Emergency").setTabListener(this));
        actionbar.addTab(actionbar.newTab().setText("Appointment").setTabListener(this));
        actionbar.addTab(actionbar.newTab().setText("Search").setTabListener(this));
      
        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int arg0) {
				// TODO Auto-generated method stub
				actionbar.setSelectedNavigationItem(arg0);
				
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub
				
			}
		});
         
    }
	
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		viewpager.setCurrentItem(tab.getPosition());
		
	}


	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	 @Override
	    protected void onDestroy() {
	         
	        super.onDestroy();
	         
	    }

}
