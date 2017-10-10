package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        RectF oval = new RectF(200, 100, 400, 300);
        canvas.drawArc(oval, 180, 90, false, paint);

        paint.setStyle(Paint.Style.FILL);
        oval = new RectF(400, 100, 600, 300);
        canvas.drawArc(oval, 250, 110, true, paint);

        paint.setStyle(Paint.Style.FILL);
        oval = new RectF(200, 300, 400, 500);
        canvas.drawArc(oval, 60, 60, false, paint);
    }
}
