package com.example.piko.calculus.databinding;
import com.example.piko.calculus.R;
import com.example.piko.calculus.BR;
import android.view.View;
public class ActivityMainBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.displayOutput, 1);
        sViewsWithIds.put(R.id.editableDisplay, 2);
        sViewsWithIds.put(R.id.button2, 3);
        sViewsWithIds.put(R.id.button3, 4);
        sViewsWithIds.put(R.id.button5, 5);
        sViewsWithIds.put(R.id.button6, 6);
        sViewsWithIds.put(R.id.button8, 7);
        sViewsWithIds.put(R.id.button9, 8);
        sViewsWithIds.put(R.id.button4, 9);
        sViewsWithIds.put(R.id.button7, 10);
        sViewsWithIds.put(R.id.button1, 11);
        sViewsWithIds.put(R.id.buttonDivide, 12);
        sViewsWithIds.put(R.id.buttonMultiply, 13);
        sViewsWithIds.put(R.id.buttonDot, 14);
        sViewsWithIds.put(R.id.button0, 15);
        sViewsWithIds.put(R.id.buttonEqual, 16);
        sViewsWithIds.put(R.id.buttonSubstract, 17);
        sViewsWithIds.put(R.id.buttonAdd, 18);
        sViewsWithIds.put(R.id.buttonClear, 19);
    }
    // views
    public final android.widget.RelativeLayout activityMain;
    public final android.widget.Button button0;
    public final android.widget.Button button1;
    public final android.widget.Button button2;
    public final android.widget.Button button3;
    public final android.widget.Button button4;
    public final android.widget.Button button5;
    public final android.widget.Button button6;
    public final android.widget.Button button7;
    public final android.widget.Button button8;
    public final android.widget.Button button9;
    public final android.widget.Button buttonAdd;
    public final android.widget.Button buttonClear;
    public final android.widget.Button buttonDivide;
    public final android.widget.Button buttonDot;
    public final android.widget.Button buttonEqual;
    public final android.widget.Button buttonMultiply;
    public final android.widget.Button buttonSubstract;
    public final android.widget.TextView displayOutput;
    public final android.widget.EditText editableDisplay;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds);
        this.activityMain = (android.widget.RelativeLayout) bindings[0];
        this.activityMain.setTag(null);
        this.button0 = (android.widget.Button) bindings[15];
        this.button1 = (android.widget.Button) bindings[11];
        this.button2 = (android.widget.Button) bindings[3];
        this.button3 = (android.widget.Button) bindings[4];
        this.button4 = (android.widget.Button) bindings[9];
        this.button5 = (android.widget.Button) bindings[5];
        this.button6 = (android.widget.Button) bindings[6];
        this.button7 = (android.widget.Button) bindings[10];
        this.button8 = (android.widget.Button) bindings[7];
        this.button9 = (android.widget.Button) bindings[8];
        this.buttonAdd = (android.widget.Button) bindings[18];
        this.buttonClear = (android.widget.Button) bindings[19];
        this.buttonDivide = (android.widget.Button) bindings[12];
        this.buttonDot = (android.widget.Button) bindings[14];
        this.buttonEqual = (android.widget.Button) bindings[16];
        this.buttonMultiply = (android.widget.Button) bindings[13];
        this.buttonSubstract = (android.widget.Button) bindings[17];
        this.displayOutput = (android.widget.TextView) bindings[1];
        this.editableDisplay = (android.widget.EditText) bindings[2];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
        }
        return false;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.example.piko.calculus.R.layout.activity_main, root, attachToRoot, bindingComponent);
    }
    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.piko.calculus.R.layout.activity_main, null, false), bindingComponent);
    }
    public static ActivityMainBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMainBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}