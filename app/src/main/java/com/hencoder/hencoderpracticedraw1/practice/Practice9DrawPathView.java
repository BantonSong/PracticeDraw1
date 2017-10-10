package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        RectF oval = new RectF(200, 100, 400, 300);

        Path path = new Path();
        path.addArc(oval, 150, 210);
        oval = new RectF(400, 100, 600, 300);
//        path.addArc(oval, 180, 210);

        path.arcTo(oval, -180, 210, false);

//        path.moveTo(250, 200 + 100 * (float) Math.cos(Math.PI / 6));
//        path.lineTo(400, 200);
//        path.lineTo(550, 200 + 100 * (float) Math.cos(Math.PI / 6));
        path.lineTo(400, 450);

        path.close();


        canvas.drawPath(path, paint);
    }
}
