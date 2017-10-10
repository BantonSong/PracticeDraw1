package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        RectF oval = new RectF(200, 100, 800, 700);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(oval, -60, 60, true, paint);

        // 保存之前画布的位置、旋转、缩放等相对关系
        canvas.save();
        paint.setColor(Color.RED);
        canvas.translate(-15, -15);
        canvas.drawArc(oval, 180, 120, true, paint);
        // 恢复之前画布的位置、旋转、缩放等相对关系，和save一一对应
        canvas.restore();

        paint.setColor(Color.WHITE);
        canvas.drawArc(oval, 5, 10, true, paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(oval, 18, 5, true, paint);
        paint.setColor(Color.GREEN);
        canvas.drawArc(oval, 25, 55, true, paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(oval, 83, 90, true, paint);

        paint.setColor(Color.GRAY);
        paint.setTextSize(30);
        canvas.drawText("Froyo", 10, 200, paint);
        canvas.drawText("L", 950, 250, paint);
        canvas.drawText("GB", 950, 430, paint);
        canvas.drawText("ICS", 950, 480, paint);
        canvas.drawText("JB", 950, 560, paint);
        canvas.drawText("KitKat", 950, 670, paint);
        canvas.drawText("M", 150, 700, paint);
    }
}
