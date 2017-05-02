package com.lijiankun24.databindingpractice.common.base;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.lijiankun24.databindingpractice.R;
import com.lijiankun24.databindingpractice.about.AboutActivity;

/**
 * BaseActivity, getLayoutId and initControls is important.
 * <p>
 * Created by lijiankun on 17/4/18.
 */
public abstract class BaseActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getLayoutId() != 0) {
            ViewDataBinding mBinding = DataBindingUtil.setContentView(this, getLayoutId());
            if (mBinding != null) {
                initControls(mBinding);
            }

        }
    }

    protected abstract int getLayoutId();

    protected abstract void initControls(ViewDataBinding binding);

    protected void initToolbar(Toolbar toolbar, boolean setDisplayHomeAsUpEnabled, int resId) {

        setSupportActionBar(toolbar);
        toolbar.setOnMenuItemClickListener(this);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(setDisplayHomeAsUpEnabled);
            getSupportActionBar().setTitle(resId);
        }
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_main_about:
                startActivity(new Intent(BaseActivity.this, AboutActivity.class));
                break;
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this instanceof AboutActivity) {
            return super.onCreateOptionsMenu(menu);
        }
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                BaseActivity.this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
