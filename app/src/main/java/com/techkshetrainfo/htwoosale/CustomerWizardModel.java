package com.techkshetrainfo.htwoosale;

import android.content.Context;

import com.techkshetrainfo.htwoosale.model.AbstractWizardModel;
import com.techkshetrainfo.htwoosale.model.BranchPage;
import com.techkshetrainfo.htwoosale.model.PageList;
import com.techkshetrainfo.htwoosale.pages.CustomerInfoPage;

/**
 * Created by tps on 12/7/2017.
 */

public class CustomerWizardModel extends AbstractWizardModel {
    public CustomerWizardModel(Context context) {
        super(context);
    }

    @Override
    protected PageList onNewRootPageList() {
        return new PageList(new BranchPage(this, "Sales type")
                .addBranch(
                        "Route Sales",
                        new CustomerInfoPage(this, "Customer 1").setRequired(true),
                        new CustomerInfoPage(this, "Customer 2").setRequired(true),
                        new CustomerInfoPage(this, "Customer 3").setRequired(true),
                        new CustomerInfoPage(this, "Customer 4").setRequired(true),
                        new CustomerInfoPage(this, "Customer 5").setRequired(true),
                        new CustomerInfoPage(this, "Customer 6").setRequired(true))
                .addBranch(
                        "Direct Sales",
                        new CustomerInfoPage(this, "Customer 1").setRequired(true),
                        new CustomerInfoPage(this, "Customer 2").setRequired(true),
                        new CustomerInfoPage(this, "Customer 3").setRequired(true),
                        new CustomerInfoPage(this, "Customer 4").setRequired(true)));

    }
}


