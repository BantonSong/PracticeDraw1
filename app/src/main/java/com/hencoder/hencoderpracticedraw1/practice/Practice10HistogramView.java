package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(5);
        paint.setTextSize(30);
        paint.setColor(Color.WHITE);

        canvas.drawLine(100, 100, 100, 600, paint);
        canvas.drawLine(100, 600, 1000, 600, paint);

        canvas.drawText("Froyo", 120, 630, paint);
        canvas.drawText("GB", 230, 630, paint);
        canvas.drawText("ICS", 340, 630, paint);
        canvas.drawText("JB", 450, 630, paint);
        canvas.drawText("KitKat", 560, 630, paint);
        canvas.drawText("L", 670, 630, paint);
        canvas.drawText("M", 780, 630, paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(110, 590, 200, 600, paint);
        canvas.drawRect(220, 560, 300, 600, paint);
        canvas.drawRect(330, 500, 420, 600, paint);
        canvas.drawRect(440, 300, 530, 600, paint);
        canvas.drawRect(550, 200, 640, 600, paint);
        canvas.drawRect(660, 250, 750, 600, paint);
        canvas.drawRect(770, 450, 860, 600, paint);
    }
}
