package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by lichaohui on 2017/5/8.
 */

public class Circle extends View {
    public Circle(Context context) {
        super(context);
    }

    public Circle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        Paint paint=new Paint();
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        canvas.drawCircle(width/2,height/2,width/2,paint);
    }
}
