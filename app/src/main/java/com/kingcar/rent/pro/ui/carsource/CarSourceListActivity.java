/**
 * Software License Declaration.
 * <p>
 * wandaph.com, Co,. Ltd.
 * Copyright ? 2017 All Rights Reserved.
 * <p>
 * Copyright Notice
 * This documents is provided to wandaph contracting agent or authorized programmer only.
 * This source code is written and edited by wandaph Co,.Ltd Inc specially for financial
 * business contracting agent or authorized cooperative company, in order to help them to
 * install, programme or central control in certain project by themselves independently.
 * <p>
 * Disclaimer
 * If this source code is needed by the one neither contracting agent nor authorized programmer
 * during the use of the code, should contact to wandaph Co,. Ltd Inc, and get the confirmation
 * and agreement of three departments managers  - Research Department, Marketing Department and
 * Production Department.Otherwise wandaph will charge the fee according to the programme itself.
 * <p>
 * Any one,including contracting agent and authorized programmer,cannot share this code to
 * the third party without the agreement of wandaph. If Any problem cannot be solved in the
 * procedure of programming should be feedback to wandaph Co,. Ltd Inc in time, Thank you!
 */
package com.kingcar.rent.pro.ui.carsource;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import butterknife.Bind;
import butterknife.ButterKnife;
import com.kingcar.rent.pro.R;
import com.kingcar.rent.pro.adapter.base.RecyBaseAdapter;
import com.kingcar.rent.pro.base.ToolBarActivity;

/**
 * @author chenweiji
 * @version Id: CarSourceListActivity.java, v 0.1 2019/1/3 16:40 chenweiji Exp $$
 */
public class CarSourceListActivity extends ToolBarActivity {
    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected int getLayoutResId() {
        return R.layout.act_car_source_list;
    }

    @Override
    protected void init() {
        initTitleAndCanBack("奥迪A6");
    }

    class CarSourceListAdapter extends RecyBaseAdapter {

        public CarSourceListAdapter(Context context) {
            super(context);
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        }
    }

}