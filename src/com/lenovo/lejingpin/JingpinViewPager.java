/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lenovo.lejingpin;


import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.content.Context;
import android.view.MotionEvent;

public class JingpinViewPager extends ViewPager {
    public JingpinViewPager(Context context) {
        super(context);
    }

    public JingpinViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {

        Log.e("FragmentActivity","ViewPager ClassicFragmentActivity onInterceptTouchEvent");
        return false;

    }


    /**
     * ViewPager inherits ViewGroup's default behavior of delayed clicks
     * on its children, but in order to make the dialpad more responsive we
     * disable that here. The Call Log and Favorites tabs are both
     * ListViews which delay their children anyway, as desired to prevent
     * seeing pressed states flashing while scrolling lists
     */
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
