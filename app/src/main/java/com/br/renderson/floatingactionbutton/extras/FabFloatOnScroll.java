package com.br.renderson.floatingactionbutton.extras;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;

/**
 * Created by renderson.silva on 28/02/2018.
 */

public class FabFloatOnScroll extends FloatingActionButton.Behavior {

    public FabFloatOnScroll(Context context, AttributeSet attrs){
        super();
    }

    @Override
    public void onNestedScroll (CoordinatorLayout coordinatorLayout, FloatingActionButton child, View target, int dxConsumed, int dyConsumed, int dxUnConsumed, int dyUnConsumed){
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed,dyConsumed, dxUnConsumed, dyUnConsumed);

        //Child Floating Action Button
        if ( dyConsumed > 0 ){
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) child.getLayoutParams();
            int fab_bottomMargin = layoutParams.bottomMargin;
            child.animate().translationY(child.getHeight() + fab_bottomMargin).setInterpolator(new LinearInterpolator()).start();
        }else if (dyConsumed < 0){
            child.animate().translationY(0).setInterpolator(new LinearInterpolator()).start();
        }
    }

    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, FloatingActionButton child, View directTargetChild, View target, int nestedScrollAxes){
        return nestedScrollAxes == ViewCompat.SCROLL_AXIS_VERTICAL;
    }
}
