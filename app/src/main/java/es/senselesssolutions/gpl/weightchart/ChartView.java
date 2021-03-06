/*
 * Copyright (C) 2011 Senseless Solutions 
 *
 * Licensed under the GNU General Public License, Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 *
 *      http://www.gnu.org/licenses/gpl-3.0.html
 *
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 * 
 * Weight Chart is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * Modified Source code: http://code.google.com/p/weight-chart/
 * Original Source code: http://fredrik.jemla.eu/weightchart
 */

package es.senselesssolutions.gpl.weightchart;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class ChartView extends View {
    private ChartDraw mDraw;

    public ChartView(Context context, AttributeSet attrs) {
	super(context, attrs);
    }

    public void setChartDraw(ChartDraw chartDraw) {
	mDraw = chartDraw;
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
	if (mDraw != null) {
	    mDraw.setSize(w, h);
	}
    }

    @Override
    public void onDraw(Canvas canvas) {
	if (mDraw != null) {
	    mDraw.draw(canvas);
	}
    }
}
