package com.intel.distml.api;

import com.intel.distml.util.Matrix;

/**
 * Created by yunlong on 3/28/15.
 */
public class DParam extends DMatrix {

    Matrix update;

    public DParam(int rows) {
        super(DMatrix.TYPE_PARAM, rows);
    }

    public void setUpdate(Matrix update) {
        this.update = update;
    }

}
